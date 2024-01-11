package com.pcx.handle;

import com.pcx.factory.SessionFactory;
import com.pcx.factory.UserInfoMybatisFactory;
import com.pcx.factory.UserMybatisFactory;

import com.pcx.factory.UserstatsMybatisFactory;
import com.pcx.message.RegisterRequestMessage;
import com.pcx.message.StatsMessage;
import com.pcx.model.User;
import com.pcx.message.LoginRequestMessage;
import com.pcx.message.LoginResponseMessage;
import com.pcx.model.Userinfo;
import com.pcx.model.Userstats;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;
@ChannelHandler.Sharable
public class LoginRequestMessageHandler extends SimpleChannelInboundHandler<LoginRequestMessage> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, LoginRequestMessage loginRequestMessage) throws Exception {
        String  username = loginRequestMessage.getUsername();
        String  password = loginRequestMessage.getPassword();

        LoginResponseMessage messager = null;
        List<User> users = UserMybatisFactory.get().queryUser(User.Build().id(username).password_hash(password).build());
        if (loginRequestMessage.getRepass() == null){
        if (users.size() == 0 )
        {
            messager = new LoginResponseMessage(false, "用户名或密码不正确");
            channelHandlerContext.writeAndFlush(messager);
            System.out.println(username + "login faile");
        }else {
            List<Userstats> userstats = UserstatsMybatisFactory.get().queryUserstats(Userstats.Build().id(username).build());
            Userstats userstats1 = userstats.get(0);
            StatsMessage statsMessage = new StatsMessage();
            statsMessage.setLos(userstats1.getDefeats());
            statsMessage.setVic(userstats1.getVictories());
            statsMessage.setScore(userstats1.getScore());
            statsMessage.setWin_rate((int) (userstats1.getWin_rate().doubleValue() * 100.0));
            channelHandlerContext.writeAndFlush(statsMessage);
            SessionFactory.getSession().bind(channelHandlerContext.channel(), username);
            List<Userinfo> userinfos = UserInfoMybatisFactory.get().queryUserinfo(Userinfo.Build().id(loginRequestMessage.getUsername()).build());
            for (Userinfo userinfo : userinfos) {
                channelHandlerContext.writeAndFlush(new RegisterRequestMessage(
                        userinfo.getId(),
                        userinfo.getPassword_hash(),
                        userinfo.getNickname(),
                        userinfo.getGender(),
                        userinfo.getBirthdate().toString(),
                        userinfo.getProvince_id()

                ));
                break;
            }
        }
        }else{
                if (users.size() >0){
                    User user = users.get(0);
                    user.setPassword_hash(loginRequestMessage.getRepass());
                    UserMybatisFactory.get().updateUser(user);
                    channelHandlerContext.writeAndFlush(new LoginResponseMessage(true,"success"));

                }else {
                    channelHandlerContext.writeAndFlush(new LoginResponseMessage(false,"success"));

                }
            }


            System.out.println(username + "login succwss");

        }


    }


