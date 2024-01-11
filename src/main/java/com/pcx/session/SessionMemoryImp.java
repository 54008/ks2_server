package com.pcx.session;

import io.netty.channel.Channel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SessionMemoryImp implements  Session{
    private  final Map<String,Channel> usernameChannel = new ConcurrentHashMap<>();
    private final Map<Channel,String> channelStringMap = new ConcurrentHashMap<>();
    private final  Map<Channel,Map<String,Object>> channelAttributesMap = new ConcurrentHashMap<>();

    @Override
    public void bind(Channel channel, String username) {
        System.out.println("-----bind-----");
        System.out.println(username);
        System.out.println(channel);
        usernameChannel.put(username,channel);
        channelStringMap.put(channel,username);
        channelAttributesMap.put(channel, new ConcurrentHashMap<>());

    }

    @Override
    public void unbind(Channel channel) {
        String username = channelStringMap.remove(channel);
        System.out.println("--------unbind-------");
        System.out.println(username);
        System.out.println(channel);
        if (username !=null){
            usernameChannel.remove(username);
        }

        channelAttributesMap.remove(channel);
    }

    @Override
    public Object getAttribute(Channel channel, String name) {
        return channelAttributesMap.get(channel).get(name);
    }

    @Override
    public void setAttribute(Channel channel, String name, Object value) {
        channelAttributesMap.get(channel).put(name, value);
    }

    @Override
    public Channel getChannel(String username) {
        return usernameChannel.get(username);
    }

    @Override
    public String getUsername(Channel channel) {
        return channelStringMap.get(channel);
    }

    @Override
    public String toString() {
        return usernameChannel.toString();
    }

}
