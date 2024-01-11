package com.pcx.factory;

import com.pcx.session.Session;
import com.pcx.session.SessionMemoryImp;

public  abstract   class  SessionFactory {
    private static Session session = new SessionMemoryImp();

    public static  Session getSession(){
        return  session;
    }
}
