package com.jam3iat;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


public class Jam3iya extends RealmObject {
    @PrimaryKey
    private String jam3iyaID;
    private Integer calendarType;
    private String name;
    private Integer numberOfMonths;
    private String share;
    private String startingMonth;
    private Integer status;

    public String getJam3iyaID() {
        return jam3iyaID;
    }

    public void setJam3iyaID(String jam3iyaID) {
        this.jam3iyaID = jam3iyaID;
    }

    public Integer getCalendarType() {
        return calendarType;
    }

    public void setCalendarType(Integer calendarType) {
        this.calendarType = calendarType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(Integer numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getStartingMonth() {
        return startingMonth;
    }

    public void setStartingMonth(String startingMonth) {
        this.startingMonth = startingMonth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
