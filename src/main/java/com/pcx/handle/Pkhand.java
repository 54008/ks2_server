package com.pcx.handle;

import com.pcx.factory.UserstatsMybatisFactory;
import com.pcx.message.PKMessage;
import com.pcx.model.Userstats;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.math.BigDecimal;
import java.util.List;
@ChannelHandler.Sharable
public class Pkhand extends SimpleChannelInboundHandler<PKMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, PKMessage pkMessage) throws Exception {
        if (pkMessage.isWin()) {
            List<Userstats> userstats = UserstatsMybatisFactory.get().queryUserstats(Userstats.Build().id(pkMessage.getUsername()).build());
            Userstats userstats1 = userstats.get(0);
            userstats1.setScore(userstats1.getScore() +10);
            userstats1.setVictories(userstats1.getVictories() +1);
            BigDecimal bigDecimal =new BigDecimal(userstats1.getVictories().doubleValue()/
                    (userstats1.getDefeats().doubleValue() + userstats1.getVictories().doubleValue()));

              userstats1.setWin_rate(bigDecimal);
              UserstatsMybatisFactory.get().updateUserstats(userstats1);
        }else {
            List<Userstats> userstats = UserstatsMybatisFactory.get().queryUserstats(Userstats.Build().id(pkMessage.getUsername()).build());
            Userstats userstats1 = userstats.get(0);
            userstats1.setScore(userstats1.getScore() -10);
           userstats1.setDefeats(userstats1.getDefeats() +1);
            BigDecimal bigDecimal =new BigDecimal(userstats1.getVictories().doubleValue()/
                    (userstats1.getDefeats().doubleValue() + userstats1.getVictories().doubleValue()));

            userstats1.setWin_rate(bigDecimal);
            UserstatsMybatisFactory.get().updateUserstats(userstats1);
        }

    }
}
