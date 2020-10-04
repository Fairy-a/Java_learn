package com.lcf.Exception;

public class RangeException extends Exception {
    String message;
    public RangeException () {
        message = "WARNING: 输入的字符为空！";
    }
    public String warnMess() {
        return message;
    }
}
