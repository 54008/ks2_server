package com.pcx.factory;

import com.pcx.session.GroupSession;
import com.pcx.session.GroupSessionMemoryImp;

public abstract class GroupSessionFactory {
    private static GroupSession session = new GroupSessionMemoryImp();

    public static GroupSession getGroupSession() {
        return session;
    }

}
