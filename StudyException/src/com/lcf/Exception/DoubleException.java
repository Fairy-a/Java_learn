package com.lcf.Exception;

public class DoubleException extends Exception {
    String message;
    public DoubleException () {
        message = "WARNING: 您输入的是Double类型！";
    }
    public String warnMess() {
        return message;
    }
}
