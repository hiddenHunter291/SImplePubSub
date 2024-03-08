package com.pubsub;

import com.pubsub.message.IMessage;
import com.pubsub.queue.IQueue;

public class Producer {
    private IQueue queue;

    public void setQueue(IQueue queue) {
        this.queue = queue;
    }

    public void putMessage(IMessage<?> msg) {
        System.out.println("[info] " + msg.getBody() + " pushed to queue...");
        this.queue.push(msg);
    }
}
