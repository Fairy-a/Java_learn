package com.lcf.Exception;

public class MaxException extends Exception {
    String message;
    public MaxException () {
        message = "WARNING: 输入的数值过大！";
    }
    public String warnMess() {
        return message;
    }
}
