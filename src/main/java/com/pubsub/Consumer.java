package com.pubsub;

import com.pubsub.message.IMessage;
import com.pubsub.queue.IQueue;

public class Consumer {
    private IQueue queue;

    public void setQueue(IQueue queue) {
        this.queue = queue;
    }

    public IMessage<?> readMessage() {
        IMessage<?> msg = null;
        try {
            msg = this.queue.front();
            this.queue.pop();
        } catch (Exception e) {
            System.out.println("Exception Message : " + e.getMessage());
        }
        System.out.println("[info] " + msg.getBody() + " read from queue...");
        return msg;
    }
}
