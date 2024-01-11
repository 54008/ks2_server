package com.pcx.server;

import com.pcx.config.Config;
import com.pcx.config.MyBatisConfig;
import com.pcx.decode.MessageCodecSharable;
import com.pcx.factory.SqlSessionFactory;
import com.pcx.handle.*;
import com.pcx.message.PKMessage;
import com.pcx.protocol.ProcotolFrameDecode;
import io.netty.bootstrap.ServerBootstrap;

import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Serverchess {
    public static void main(String[] args) throws InterruptedException {

        SqlSessionFactory.Init(MyBatisConfig.getSqlSessionFactory());


        NioEventLoopGroup boss = new NioEventLoopGroup();
        NioEventLoopGroup work = new NioEventLoopGroup();
        MessageCodecSharable messageCodecSharable = new MessageCodecSharable();
        LoginRequestMessageHandler LOGINHANDLE = new LoginRequestMessageHandler();
        RegisterRequestMessageHandler registerRequestMessageHandler = new RegisterRequestMessageHandler();
        QuitHandler quitHandler = new QuitHandler();
        CreateRoom createRoom = new CreateRoom();
        GoRoom goRoom = new GoRoom();
        ChessRmote chessRmote = new ChessRmote();
        OutRoomhand outRoomhand = new OutRoomhand();
        FindRoomRequestMessageHandler findRoomRequestMessageHandler = new FindRoomRequestMessageHandler();
        Pkhand pkhand = new Pkhand();
        try {
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.channel(NioServerSocketChannel.class);
            serverBootstrap.group(boss,work);

            serverBootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel socketChannel) throws Exception {
                    socketChannel.pipeline().addLast(new ProcotolFrameDecode());
                    socketChannel.pipeline().addLast(messageCodecSharable);
                    socketChannel.pipeline().addLast(registerRequestMessageHandler);
                    socketChannel.pipeline().addLast(LOGINHANDLE);
                    socketChannel.pipeline().addLast(createRoom);
                    socketChannel.pipeline().addLast(findRoomRequestMessageHandler);
                    socketChannel.pipeline().addLast(quitHandler);
                    socketChannel.pipeline().addLast(goRoom);
                    socketChannel.pipeline().addLast(chessRmote);
                    socketChannel.pipeline().addLast(outRoomhand);
                    socketChannel.pipeline().addLast(pkhand);
                }
            });
            Channel channel = serverBootstrap.bind(Config.getServerPort()).sync().channel();
            channel.closeFuture().sync();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }

    }



}
