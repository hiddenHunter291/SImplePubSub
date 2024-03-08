package com.pubsub.queue;

import com.pubsub.message.IMessage;

public interface IQueue {
    void push(IMessage<?> msg);
    IMessage<?> front() throws Exception;
    void pop() throws Exception;
    boolean isEmpty();
}
