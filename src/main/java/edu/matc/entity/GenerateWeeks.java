package edu.matc.entity;


import org.apache.log4j.Logger;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.temporal.TemporalAdjusters.nextOrSame;
import static java.time.temporal.TemporalAdjusters.previousOrSame;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.SATURDAY;


public class GenerateWeeks {

    private final Logger logger = Logger.getLogger(this.getClass());


    public void currentWeekStartAndEnd() {

        LocalDate today = LocalDate.now();

        LocalDate sunday = today.with(previousOrSame(DayOfWeek.of(SATURDAY)));
        LocalDate saturday = today.with(nextOrSame(DayOfWeek.of(FRIDAY)));

        logger.info(sunday);
        logger.info(saturday);
    }

}
