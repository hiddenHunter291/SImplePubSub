package com.pubsub;

import com.pubsub.message.IMessage;
import com.pubsub.message.ObjectMessage;
import com.pubsub.queue.IQueue;
import com.pubsub.queue.QueueImpl;


public class test {
    public static void main(String[] args) {
        IQueue queue = new QueueImpl();

        Consumer c1 = new Consumer();
        c1.setQueue(queue);

        Producer p1 = new Producer();
        p1.setQueue(queue);

        IMessage<Object> msg1 = new ObjectMessage();
        msg1.setBody(new String("first Message"));

        IMessage<Object> msg2 = new ObjectMessage();
        msg2.setBody(Integer.valueOf(12));

        p1.putMessage(msg1);
        p1.putMessage(msg2);

        c1.readMessage();
        c1.readMessage();
    }
}
