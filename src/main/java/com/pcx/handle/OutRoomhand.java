package com.pcx.handle;

import com.pcx.factory.GroupSessionFactory;
import com.pcx.factory.SessionFactory;
import com.pcx.message.OutRoomRequestMessage;
import com.pcx.message.RoomChessMoveRequestMessage;
import com.pcx.session.Group;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Map;
import java.util.Set;
@ChannelHandler.Sharable
public class OutRoomhand extends SimpleChannelInboundHandler<OutRoomRequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, OutRoomRequestMessage outRoomRequestMessage) throws Exception {
        GroupSessionFactory.getGroupSession().removerGroup(outRoomRequestMessage.getUsername());


    }
}
