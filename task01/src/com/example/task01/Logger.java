package com.example.task01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class Logger {

    public enum Level {
        ERROR, WARN, INFO, DEBUG
    }

    private String name;
    private Level level = Level.INFO;
    private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");

    private static Map<String, Logger> loggers = new java.util.HashMap<>();

    public static Logger getLogger(String name) {
        Logger logger = loggers.computeIfAbsent(name, k -> new Logger(name));
        return logger;
    }

    private Logger(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void log(Level level, String msg) {
        if (level.ordinal() <= this.level.ordinal()) {
            String str = String.format("[%s] %s %s - %s",
                    level,
                    LocalDateTime.now().format(dateFormat),
                    name,
                    msg);
            System.out.println(str);
        }
    }

    public void log(Level level, String format, Object... args) {
        log(level, String.format(format, args));
    }

    public void debug(String msg) {
        log(Level.DEBUG, msg);
    }

    public void debug(String format, Object... args) {
        log(Level.DEBUG, format, args);
    }

    public void info(String msg) {
        log(Level.INFO, msg);
    }

    public void info(String format, Object... args) {
        log(Level.INFO, format, args);
    }

    public void warning(String msg) {
        log(Level.WARN, msg);
    }

    public void warning(String format, Object... args) {
        log(Level.WARN, format, args);
    }

    public void error(String msg) {
        log(Level.ERROR, msg);
    }

    public void error(String format, Object... args) {
        log(Level.ERROR, format, args);
    }
}