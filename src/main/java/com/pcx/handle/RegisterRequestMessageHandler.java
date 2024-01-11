package com.pcx.handle;

import com.pcx.factory.UserInfoMybatisFactory;
import com.pcx.factory.UserMybatisFactory;
import com.pcx.factory.UserstatsMybatisFactory;
import com.pcx.message.RegisterRequestMessage;
import com.pcx.message.RegisterResponseMessage;
import com.pcx.model.User;
import com.pcx.model.Userinfo;
import com.pcx.model.Userstats;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
@ChannelHandler.Sharable
public class RegisterRequestMessageHandler extends SimpleChannelInboundHandler<RegisterRequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, RegisterRequestMessage registerRequestMessage) throws Exception {

        List<User> users = UserMybatisFactory.get().queryUser(User.Build().id(registerRequestMessage.getUserid()).build());
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(registerRequestMessage.getData(), fmt);
        System.out.println("register : "+registerRequestMessage.getUserid());
        if (users.size() == 0){
            int i = UserMybatisFactory.get().insertUser(User.Build().id(registerRequestMessage.getUserid()).password_hash(registerRequestMessage.getPassword()).build());
            System.out.println("insert userpass success : "+i);
            i = UserInfoMybatisFactory.get().insertUserinfo(
                    Userinfo.Build().
                            id(registerRequestMessage
            .getUserid()).
                            password_hash(registerRequestMessage.getPassword()).
                            gender(registerRequestMessage.getSex()).
                            province_id(Integer.valueOf(registerRequestMessage.getProvince_id())).
                            nickname(registerRequestMessage.getNickname()).
                            birthdate(date).build());
            System.out.println("insert userinfo success : "+i);
            i = UserstatsMybatisFactory.get().insertUserstats(Userstats.Build().
                    id(registerRequestMessage.getUserid()).
                    user_rank("无名小卒").
                    defeats(Integer.valueOf(0)).
                    victories(Integer.valueOf(0)).
                    win_rate(BigDecimal.valueOf(0)).
                    score(0).build());
            System.out.println("insert stats success : "+i);
            channelHandlerContext.writeAndFlush(new RegisterResponseMessage(true,"注册成功"));
        }else {
            channelHandlerContext.writeAndFlush(new RegisterResponseMessage(false,"用户名存在"));

        }

    }
}
