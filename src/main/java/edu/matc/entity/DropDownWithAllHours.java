package edu.matc.entity;

import org.apache.log4j.Logger;

/**
 * The type Drop down with all hours.
 */
public class DropDownWithAllHours {

    /**
     * The The whole list.
     */
    StringBuilder theWholeList;
    private final Logger logger = Logger.getLogger(this.getClass());


    /**
     * Drop down list with hours string builder.
     *
     * @return the string builder
     */
    public StringBuilder dropDownListWithHours() {
        theWholeList = new StringBuilder();
        int hourAM = 0;
        int hourPM = 1;

        while (hourAM < 13) {
            theWholeList.append("<option value=\"");
            theWholeList.append(hourAM);
            if(hourAM == 10) {
                theWholeList.append(":00 AM\" selected=\"selected\">");
            } else {
                theWholeList.append(":00 AM\">");
            }
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

        theWholeList.append("<option>None</option>");
        return theWholeList;
    }
}
