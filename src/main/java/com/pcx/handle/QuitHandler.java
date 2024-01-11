package com.pcx.handle;

import com.pcx.factory.GroupSessionFactory;
import com.pcx.factory.SessionFactory;
import com.pcx.message.RoomChessMoveRequestMessage;
import com.pcx.session.Group;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Map;
import java.util.Set;

@ChannelHandler.Sharable
public class QuitHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        String username = SessionFactory.getSession().getUsername(ctx.channel());
        boolean isfind = false;
        Map<String, Group> groupMap = GroupSessionFactory.getGroupSession().getGroupMap();
        Set<Map.Entry<String, Group>> entries = groupMap.entrySet();
        System.out.println("Inactiveuser : "+username);
        System.out.println("channl : "+ctx.channel());
        System.out.println("group count :"+entries.size());

        for (Map.Entry<String, Group> entry : entries) {
            Group value = entry.getValue();
            String groupname = entry.getKey();
            System.out.println("groupname : "+groupname);
            Set<String> members = value.getMembers();
            for (String member : members) {
                if (member.equals(username)){

                    isfind =true;
                }
                System.out.println(" "+member);
                RoomChessMoveRequestMessage roomChessMoveRequestMessage = new RoomChessMoveRequestMessage();
                roomChessMoveRequestMessage.setTypetwo(100);
                Channel channel = SessionFactory.getSession().getChannel(member);
                if (channel != null){
                    channel.writeAndFlush(roomChessMoveRequestMessage);
                }
                if (isfind){
                    GroupSessionFactory.getGroupSession().removerGroup(groupname);
                }
            }

        }

            SessionFactory.getSession().unbind(ctx.channel());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        String username = SessionFactory.getSession().getUsername(ctx.channel());
        boolean isfind = false;
        Map<String, Group> groupMap = GroupSessionFactory.getGroupSession().getGroupMap();
        Set<Map.Entry<String, Group>> entries = groupMap.entrySet();
        System.out.println("ExInactiveuser : "+username);
        System.out.println("channl : "+ctx.channel());
        System.out.println("group count :"+entries.size());

        for (Map.Entry<String, Group> entry : entries) {
            Group value = entry.getValue();
            String groupname = entry.getKey();
            System.out.println("groupname : "+groupname);
            Set<String> members = value.getMembers();
            for (String member : members) {
                if (member.equals(username)){

                    isfind =true;
                }
                System.out.println(" "+member);
                RoomChessMoveRequestMessage roomChessMoveRequestMessage = new RoomChessMoveRequestMessage();
                roomChessMoveRequestMessage.setTypetwo(100);
                Channel channel = SessionFactory.getSession().getChannel(member);
                if (channel != null){
                    channel.writeAndFlush(roomChessMoveRequestMessage);
                }
                if (isfind){
                    GroupSessionFactory.getGroupSession().removerGroup(groupname);
                }
            }

        }

        SessionFactory.getSession().unbind(ctx.channel());
    }
}
