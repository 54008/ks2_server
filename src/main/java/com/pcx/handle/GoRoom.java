package com.pcx.handle;

import com.pcx.factory.GroupSessionFactory;
import com.pcx.message.GoRoomRequestMessage;
import com.pcx.message.GoRoomResponseMessage;
import com.pcx.message.RoomChessMoveRequestMessage;
import com.pcx.session.Group;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

@ChannelHandler.Sharable
public class GoRoom extends SimpleChannelInboundHandler<GoRoomRequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, GoRoomRequestMessage goRoomRequestMessage) throws Exception {
        Group group = GroupSessionFactory.getGroupSession().joinMember(goRoomRequestMessage.getToname(), goRoomRequestMessage.getSrcname());

        if (group !=null){
            channelHandlerContext.writeAndFlush(new GoRoomResponseMessage(true,"加入成功"));
            List<Channel> membersChannel = GroupSessionFactory.getGroupSession().getMembersChannel(goRoomRequestMessage.getToname());
            for (Channel channel : membersChannel) {
                RoomChessMoveRequestMessage roomChessMoveRequestMessage = new RoomChessMoveRequestMessage();
                roomChessMoveRequestMessage.setTypetwo(3);
                channel.writeAndFlush(roomChessMoveRequestMessage);
            }

        }else {
            channelHandlerContext.writeAndFlush(new GoRoomResponseMessage(false,"加入失败"));

        }
    }
}
