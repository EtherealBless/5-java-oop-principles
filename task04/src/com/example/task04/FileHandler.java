package com.example.task04;

public class FileHandler implements Handler {
    private String filename;
    public FileHandler(String filename) {
        if (filename == null || filename.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.filename = filename;
    }
    public FileHandler() {
        this("log.txt");
    }
    @Override
    public void print(String msg) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter(filename, true);
            writer.write(msg);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
