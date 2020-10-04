package com.lcf.Exception;

public class NullException extends Throwable {
    String message;
    public NullException () {
        message = "WARNING: 输入的字符为空！";
    }
    public String warnMess() {
        return message;
    }
}
