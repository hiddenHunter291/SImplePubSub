package com.pubsub.message;

public interface IMessage<K>{
    public K getBody();
    public void setBody(K msg);
}
