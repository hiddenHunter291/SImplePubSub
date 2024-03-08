
package com.pubsub.queue;

import com.pubsub.message.IMessage;
import com.pubsub.message.MessageNode;

public class QueueImpl implements IQueue {
    private MessageNode head;
    private MessageNode tail;

    public QueueImpl() {
        head = null;
        tail = null;
    }

    @Override
    public void push(IMessage<?> msg) {
        MessageNode newNode = new MessageNode();
        newNode.setMsg(msg);
        if(isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return;
    }

    @Override
    public IMessage<?> front() throws Exception {
        if(isEmpty()) {
            throw new Exception("queue is empty");
        }
        return head.getMsg();
    }

    @Override
    public void pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("queue is empty");
        }
        if(head == tail) {
            tail = tail.next;
        }
        head = head.next;
        return;
    }

    @Override
    public boolean isEmpty() {
        return ((head == null) && (tail == null));
    }
    
}