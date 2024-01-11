package com.pcx.decode;

import com.pcx.config.Config;
import com.pcx.protocol.Serializer;
import com.pcx.message.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;

import java.util.List;
@ChannelHandler.Sharable
public class MessageCodecSharable extends MessageToMessageCodec<ByteBuf, Message> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Message message, List<Object> list) throws Exception {
        ByteBuf out = channelHandlerContext.alloc().buffer();
        out.writeBytes(new byte[]{2,0,2,3});
        out.writeByte(1);
        out.writeByte(Config.getSerializerAlgorithm().ordinal());
        out.writeByte(message.getMessageType());
        out.writeInt(message.getSequenceId());
        out.writeByte(0xff);
        byte[] bytes = Config.getSerializerAlgorithm().serialize(message);
        out.writeInt(bytes.length);
        out.writeBytes(bytes);
        list.add(out);

    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int magicNum = byteBuf.readInt();


        byte version = byteBuf.readByte();

        byte serializer = byteBuf.readByte();

        //serialize 版本；
        byte messageType = byteBuf.readByte();

        int sequenceId = byteBuf.readInt();
        byteBuf.readByte();
        int length = byteBuf.readInt();
        byte[] bytes = new byte[length];
        byteBuf.readBytes(bytes,0,length);
        Serializer.Algorithm algorithm = Serializer.Algorithm.values()[serializer];
        Class<? extends  Message> messageClass = Message.getMessageClass(messageType);
        Message message = algorithm.deserialize(messageClass,bytes);
        list.add(message);





    }
}
