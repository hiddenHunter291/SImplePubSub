package com.pubsub.message;

public class ObjectMessage implements IMessage<Object> {

    private Object body;
    @Override
    public Object getBody() {
        return this.body;
    }

    @Override
    public void setBody(Object body) {
        this.body = body;
    }
    
}
