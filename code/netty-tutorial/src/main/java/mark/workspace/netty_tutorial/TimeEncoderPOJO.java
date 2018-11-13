package mark.workspace.netty_tutorial;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class TimeEncoderPOJO extends MessageToByteEncoder<Time> {
	@Override
	protected void encode(ChannelHandlerContext ctx,Time msg,ByteBuf out) throws Exception{
		out.writeInt((int)msg.value());
	}

}
