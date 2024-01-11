package com.pcx.session;



import io.netty.channel.Channel;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GroupSession {
    Group createGroup(String name, Set<String > members);
    Group joinMember(String name,String member);

    Group removerMember(String name,String member);
    Group removerGroup(String name);
    Set<String> getMembers(String name);
    List<Channel> getMembersChannel(String name);
    public Map<String, Group> getGroupMap();

}
