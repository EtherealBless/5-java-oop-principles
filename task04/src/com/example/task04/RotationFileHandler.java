package com.example.task04;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.IllegalFormatException;

public class RotationFileHandler extends FileHandler {

    private final String DEFAULT_BASE_FILENAME = "log%d.txt";

    private long TIME_DIFFERENCE;
    private ChronoUnit TIME_UNIT;

    private String baseFilename = "log%d.txt";
    private String currentFilename = "";
    private int currentFile = 0;
    private LocalDateTime lastModified = LocalDateTime.now();

    public RotationFileHandler() {
        this.baseFilename = DEFAULT_BASE_FILENAME;
        this.TIME_DIFFERENCE = 1;
        this.TIME_UNIT = ChronoUnit.HOURS;
    }

    /**
     * Create new RotationFileHandler with specified base filename and time unit settings.
     *
     * @param baseFilename    format string for the log file name. It should contain "%d" substring which will be replaced with integer number.
     * @param TIME_DIFFERENCE time difference in specified time unit after which the log file will be rotated.
     * @param TIME_UNIT       time unit of the time difference. It can be any of the following: SECONDS, MINUTES, HOURS, DAYS.
     */
    public RotationFileHandler(String baseFilename, long TIME_DIFFERENCE, ChronoUnit TIME_UNIT) {
        this.baseFilename = baseFilename;
        this.TIME_DIFFERENCE = TIME_DIFFERENCE;
        this.TIME_UNIT = TIME_UNIT;
        setCurrentFilename();
    }

    public void setBaseFilename(String baseFilename) {
        this.baseFilename = baseFilename;
        setCurrentFilename();
    }

    private void setCurrentFilename() {
        try {
            currentFilename = String.format(baseFilename, currentFile);
        } catch (IllegalFormatException e) {
            System.out.println("Wrong format string. Note: It should contain \"%d\" substring which will be replaced " +
                    "with integer number. Setting default value: \"" + DEFAULT_BASE_FILENAME + "\"");
            baseFilename = DEFAULT_BASE_FILENAME;
        }
    }

    @Override
    public void print(String msg) {

        LocalDateTime now = LocalDateTime.now();
        if (TIME_UNIT.between(lastModified, now) >= TIME_DIFFERENCE) {
            currentFile++;
            lastModified = now;
            setCurrentFilename();
        }
        try {
            java.io.FileWriter writer = new java.io.FileWriter(currentFilename, true);
            writer.write(msg);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}