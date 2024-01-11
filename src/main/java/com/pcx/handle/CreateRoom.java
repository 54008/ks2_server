package com.pcx.handle;

import com.pcx.factory.GroupSessionFactory;
import com.pcx.factory.SessionFactory;
import com.pcx.message.CreateRoomMessage;
import com.pcx.message.CreateRoomResponse;
import com.pcx.session.Group;
import com.pcx.session.GroupSession;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.HashSet;
import java.util.Set;
@ChannelHandler.Sharable
public class CreateRoom extends SimpleChannelInboundHandler<CreateRoomMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, CreateRoomMessage createRoomMessage) throws Exception {
        String groupname = createRoomMessage.getUsername();
        Set<String> members = new HashSet<>();
        members.add(groupname);
        // 群管理器
        GroupSession groupSession = GroupSessionFactory.getGroupSession();

        Group group = groupSession.createGroup(groupname, members);
        System.out.println("---------group--------");
        System.out.println("create:  "+groupname);
        if (group == null){
            channelHandlerContext.writeAndFlush(new CreateRoomResponse(true,"创建成功"));

        }else {
            channelHandlerContext.writeAndFlush(new CreateRoomResponse(false,"创建失败"));

        }
    }
}
