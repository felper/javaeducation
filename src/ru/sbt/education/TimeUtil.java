package ru.sbt.education;

import java.time.LocalTime;

public class TimeUtil {
    public static SUPPORTED_PERIODS getPeriod(){
        LocalTime currentTime = LocalTime.now();
        for (SUPPORTED_PERIODS period : SUPPORTED_PERIODS.values()){
            LocalTime startTime = LocalTime.parse(period.getStart());
            LocalTime endTime = LocalTime.parse(period.getEnd());

            if (currentTime.isAfter(startTime) && currentTime.isBefore(endTime)) {
                return period;
            }
        }
        return null;
    }
}
