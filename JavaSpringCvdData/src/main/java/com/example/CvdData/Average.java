package com.example.CvdData;

public class Average {

    private double average;
    private String month;
    private String year;
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public Average(double average, int monthNumber, String year){
        this.average = average;
        this.month = months[monthNumber];
        this.year = year;
    }

    public Average(double average, String year) {
        this.average = average;
        this.year = year;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
