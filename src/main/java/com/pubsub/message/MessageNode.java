package com.pubsub.message;

public class MessageNode{
    private IMessage<?> msg;
    public MessageNode next;

    public void setMsg(IMessage<?> msg) {
        this.msg = msg;
    }

    public IMessage<?> getMsg() {
        return this.msg;
    }
}

