package com.pcx.handle;

import com.pcx.factory.GroupSessionFactory;
import com.pcx.message.RoomChessMoveRequestMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;
import java.util.Set;

@ChannelHandler.Sharable
public class ChessRmote extends SimpleChannelInboundHandler<RoomChessMoveRequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, RoomChessMoveRequestMessage roomChessMoveRequestMessage) throws Exception {

        System.out.println("hand once----------------");
        String group = roomChessMoveRequestMessage.getGroup();
        List<Channel> membersChannel = GroupSessionFactory.getGroupSession().getMembersChannel(group);
        for (Channel channel : membersChannel) {
            channel.writeAndFlush(roomChessMoveRequestMessage);

            System.out.println(channel.toString()+roomChessMoveRequestMessage.toString());
        }
        if (roomChessMoveRequestMessage.getTypetwo() == 51){
            GroupSessionFactory.getGroupSession().removerGroup(roomChessMoveRequestMessage.getGroup());
        }

    }
}
