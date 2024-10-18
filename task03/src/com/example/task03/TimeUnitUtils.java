package com.example.task03;

/**
 * Класс, в котором собраны методы для работы с {@link TimeUnit}
 */
public class TimeUnitUtils {

    /**
     * Конвертирует интервал в секундах в интервал в миллисекундах
     *
     * @param seconds интервал в секундах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Seconds seconds) {
        // создаем новый объект Milliseconds, используя метод toMillis() из Seconds
        return new Milliseconds(seconds.toMillis());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в секундах
     *
     * @param millis интервал в миллисекундах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(Milliseconds millis) {
        // создаем новый объект Seconds, используя метод toSeconds() из Milliseconds
        return new Seconds(millis.toSeconds());
    }

    /**
     * Конвертирует интервал в минутах в интервал в миллисекундах
     *
     * @param minutes интервал в минутах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Minutes minutes){
        // создаем новый объект Milliseconds, используя метод toMillis() из Minutes
        return new Milliseconds(minutes.toMillis());
    }

    /**
     * Конвертирует интервал в часах в интервал в миллисекундах
     *
     * @param hours интервал в часах
     * @return интервал в миллисекундах
     */
    public static Milliseconds toMillis(Hours hours){
        // создаем новый объект Milliseconds, используя метод toMillis() из Hours
        return new Milliseconds(hours.toMillis());
    }

    /**
     * Конвертирует интервал в минутах в интервал в секундах
     *
     * @param minutes интервал в минутах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(Minutes minutes){
        // создаем новый объект Seconds, используя метод toSeconds() из Minutes
        return new Seconds(minutes.toSeconds());
    }

    /**
     * Конвертирует интервал в часах в интервал в секундах
     *
     * @param hours интервал в часах
     * @return интервал в секундах
     */
    public static Seconds toSeconds(Hours hours){
        // создаем новый объект Seconds, используя метод toSeconds() из Hours
        return new Seconds(hours.toSeconds());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в минутах
     *
     * @param milliseconds интервал в миллисекундах
     * @return интервал в минутах
     */
    public static Minutes toMinutes(Milliseconds milliseconds){
        // создаем новый объект Minutes, используя метод toMinutes() из Milliseconds
        return new Minutes(milliseconds.toMinutes());
    }

    /**
     * Конвертирует интервал в секундах в интервал в минутах
     *
     * @param seconds интервал в секундах
     * @return интервал в минутах
     */
    public static Minutes toMinutes(Seconds seconds){
        // создаем новый объект Minutes, используя метод toMinutes() из Seconds
        return new Minutes(seconds.toMinutes());
    }

    /**
     * Конвертирует интервал в часах в интервал в минутах
     *
     * @param hours интервал в часах
     * @return интервал в минутах
     */
    public static Minutes toMinutes(Hours hours){
        // создаем новый объект Minutes, используя метод toMinutes() из Hours
        return new Minutes(hours.toMinutes());
    }

    /**
     * Конвертирует интервал в миллисекундах в интервал в часах
     *
     * @param milliseconds интервал в миллисекундах
     * @return интервал в часах
     */
    public static Hours toHours(Milliseconds milliseconds){
        // создаем новый объект Hours, используя метод toHours() из Milliseconds
        return new Hours(milliseconds.toHours());
    }

    /**
     * Конвертирует интервал в секундах в интервал в часах
     *
     * @param seconds интервал в секундах
     * @return интервал в часах
     */
    public static Hours toHours(Seconds seconds){
        // создаем новый объект Hours, используя метод toHours() из Seconds
        return new Hours(seconds.toHours());
    }

    /**
     * Конвертирует интервал в минутах в интервал в часах
     *
     * @param minutes интервал в минутах
     * @return интервал в часах
     */
    public static Hours toHours(Minutes minutes){
        // создаем новый объект Hours, используя метод toHours() из Minutes
        return new Hours(minutes.toHours());
    }
}