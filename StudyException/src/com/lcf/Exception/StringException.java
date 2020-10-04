package com.lcf.Exception;

public class StringException extends Exception {
    String message;
    public StringException () {
        message = "WARNING: 您输入的是字符串类型！";
    }
    public String warnMess() {
        return message;
    }
}
