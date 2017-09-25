package edu.matc.entity;

import org.apache.log4j.Logger;

public class dropDownWithAllHours {

    StringBuilder theWholeList;
    private final Logger logger = Logger.getLogger(this.getClass());


    public StringBuilder dropDownListWithHours() {
        theWholeList = new StringBuilder();
        int hourAM = 0;
        int hourPM = 1;

        while (hourAM < 13) {
            theWholeList.append("<option value=\"");
            theWholeList.append(hourAM);
            theWholeList.append(":00 AM\">");
            theWholeList.append(hourAM);
            if (hourAM == 12) {
                theWholeList.append(":00 PM</option>");
            } else {
                theWholeList.append(":00 AM</option>");
            }
            hourAM += 1;
        }

        while (hourPM < 12) {
            theWholeList.append("<option value=\"");
            theWholeList.append(hourPM);
            theWholeList.append(":00 PM\">");
            theWholeList.append(hourPM);
            theWholeList.append(":00 PM</option>");
            hourPM += 1;
        }

        logger.info(theWholeList);
        return theWholeList;
    }
}
