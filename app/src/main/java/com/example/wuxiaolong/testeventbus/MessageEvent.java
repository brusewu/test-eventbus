package com.example.wuxiaolong.testeventbus;

/**
 * Created by wuxiaolong on 2018/4/7.
 */

public class MessageEvent {

    private String message;

    public MessageEvent(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
