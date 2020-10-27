package com.thoughtworks.capability.gtb.entrancequiz.utils;

import java.util.ArrayList;
import java.util.List;

public class Resp<T> {
    private Integer code;
    private List<String> messages = new ArrayList<>();
    private T data;

    public void setCode(Integer code){
        this.code = code;
    }
    public Integer getCode(){
        return this.code;
    }
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return this.data;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    public Resp(Integer code, String message, T data) {
        this.code = code;
        this.messages.add(message);
        this.data = data;
    }

    public Resp(T data) {
        this(2000, "操作成功", data);
    }
    public Resp(String message, T data) {
        this(2000, message, data);
    }
    public Resp() {
    }

    public void addMessage(String message) {
        this.messages.add(message);
    }
}
