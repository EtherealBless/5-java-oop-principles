package com.example.task04;

import java.util.List;

public class MemoryHandler implements Handler {

    private Handler handler;
    private long memorySize;
    private long currentMemory;
    private List<String> memoryList = new java.util.ArrayList<>();

    public MemoryHandler(Handler handler, long memorySize) {
        if (memorySize <= 0 || handler == null) {
            throw new IllegalArgumentException();
        }
        this.handler = handler;
        this.memorySize = memorySize;
        this.currentMemory = 0;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public long getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(long memorySize) {
        this.memorySize = memorySize;
        if (currentMemory > memorySize) {
            flush();
        }
    }

    public void flush() {
        for (String s : memoryList) {
            handler.print(s);
        }
        memoryList.clear();
        currentMemory = 0;
    }

    @Override
    public void print(String msg) {
        if (currentMemory <= memorySize) {
            memoryList.add(msg);
            currentMemory += msg.length();
        } else {
            flush();
        }
    }
}
