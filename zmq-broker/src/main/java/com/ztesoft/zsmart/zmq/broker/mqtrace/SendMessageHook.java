package com.ztesoft.zsmart.zmq.broker.mqtrace;

public interface SendMessageHook {
    public String hookName();


    public void sendMessageBefore(final SendMessageContext context);


    public void sendMessageAfter(final SendMessageContext context);
}
