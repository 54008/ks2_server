package com.pcx.handle;

import com.pcx.factory.GroupSessionFactory;
import com.pcx.message.FindRoomRequestMessage;
import com.pcx.message.FindRoomResponseMessage;
import com.pcx.session.Group;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@ChannelHandler.Sharable
public class FindRoomRequestMessageHandler extends SimpleChannelInboundHandler<FindRoomRequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FindRoomRequestMessage findRoomRequestMessage) throws Exception {
        Map<String, Group> groupMap = GroupSessionFactory.getGroupSession().getGroupMap();
        Map<String,Integer> res = new HashMap<>();
        Set<Map.Entry<String, Group>> entries = groupMap.entrySet();
        for (Map.Entry<String,  Group>entry:entries){
            Group value = entry.getValue();
            String key = entry.getKey();
           if (value.getMembers().size() < 2){
               res.put(key,Integer.valueOf(value.getMembers().size()));
           }
        }
        channelHandlerContext.writeAndFlush(new FindRoomResponseMessage(true,"查询成功",res));
    }
}
