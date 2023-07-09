package com.example.CvdData;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CvdDataModel {

    @Id
    @GeneratedValue
    private Integer id;
    private String effective_date;
    private Integer infections_published_daily;
    private Integer app_downloads_cumulated;
    private Integer app_downloads_android_cumulated;
    private Integer app_downloads_ios_cumulated;
    private Integer app_downloads_daily;
    private Integer app_downloads_android_daily;
    private Integer app_downloads_ios_daily;
    private Integer app_downloads_7days_avg;
    private Integer app_downloads_android_7days_avg;
    private Integer app_downloads_ios_7days_avg;
    private Integer app_downloads_7days_sum;
    private Integer app_downloads_android_7days_sum;
    private Integer app_downloads_ios_7days_sum;


    public CvdDataModel(Integer id, String date, Integer infections_published_daily, Integer app_downloads_cumulated, Integer app_downloads_android_cumulated, Integer app_downloads_ios_cumulated, Integer app_downloads_daily, Integer app_downloads_android_daily, Integer app_downloads_ios_daily, Integer app_downloads_7days_avg, Integer app_downloads_android_7days_avg, Integer app_downloads_ios_7days_avg, Integer app_downloads_7days_sum, Integer app_downloads_android_7days_sum, Integer app_downloads_ios_7days_sum) {
        this.id = id;
        this.effective_date = date;
        this.infections_published_daily = infections_published_daily;
        this.app_downloads_cumulated = app_downloads_cumulated;
        this.app_downloads_android_cumulated = app_downloads_android_cumulated;
        this.app_downloads_ios_cumulated = app_downloads_ios_cumulated;
        this.app_downloads_daily = app_downloads_daily;
        this.app_downloads_android_daily = app_downloads_android_daily;
        this.app_downloads_ios_daily = app_downloads_ios_daily;
        this.app_downloads_7days_avg = app_downloads_7days_avg;
        this.app_downloads_android_7days_avg = app_downloads_android_7days_avg;
        this.app_downloads_ios_7days_avg = app_downloads_ios_7days_avg;
        this.app_downloads_7days_sum = app_downloads_7days_sum;
        this.app_downloads_android_7days_sum = app_downloads_android_7days_sum;
        this.app_downloads_ios_7days_sum = app_downloads_ios_7days_sum;
    }

    public CvdDataModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return effective_date;
    }

    public void setDate(String date) {
        this.effective_date = date;
    }

    public Integer getinfections_published_daily() {
        return infections_published_daily;
    }

    public void setinfections_published_daily(Integer infections_published_daily) {
        this.infections_published_daily = infections_published_daily;
    }

    public Integer getApp_downloads_cumulated() {
        return app_downloads_cumulated;
    }

    public void setApp_downloads_cumulated(Integer app_downloads_cumulated) {
        this.app_downloads_cumulated = app_downloads_cumulated;
    }

    public Integer getApp_downloads_android_cumulated() {
        return app_downloads_android_cumulated;
    }

    public void setApp_downloads_android_cumulated(Integer app_downloads_android_cumulated) {
        this.app_downloads_android_cumulated = app_downloads_android_cumulated;
    }

    public Integer getApp_downloads_ios_cumulated() {
        return app_downloads_ios_cumulated;
    }

    public void setApp_downloads_ios_cumulated(Integer app_downloads_ios_cumulated) {
        this.app_downloads_ios_cumulated = app_downloads_ios_cumulated;
    }

    public Integer getApp_downloads_daily() {
        return app_downloads_daily;
    }

    public void setApp_downloads_daily(Integer app_downloads_daily) {
        this.app_downloads_daily = app_downloads_daily;
    }

    public Integer getApp_downloads_android_daily() {
        return app_downloads_android_daily;
    }

    public void setApp_downloads_android_daily(Integer app_downloads_android_daily) {
        this.app_downloads_android_daily = app_downloads_android_daily;
    }

    public Integer getApp_downloads_ios_daily() {
        return app_downloads_ios_daily;
    }

    public void setApp_downloads_ios_daily(Integer app_downloads_ios_daily) {
        this.app_downloads_ios_daily = app_downloads_ios_daily;
    }

    public Integer getApp_downloads_7days_avg() {
        return app_downloads_7days_avg;
    }

    public void setApp_downloads_7days_avg(Integer app_downloads_7days_avg) {
        this.app_downloads_7days_avg = app_downloads_7days_avg;
    }

    public Integer getApp_downloads_android_7days_avg() {
        return app_downloads_android_7days_avg;
    }

    public void setApp_downloads_android_7days_avg(Integer app_downloads_android_7days_avg) {
        this.app_downloads_android_7days_avg = app_downloads_android_7days_avg;
    }

    public Integer getApp_downloads_ios_7days_avg() {
        return app_downloads_ios_7days_avg;
    }

    public void setApp_downloads_ios_7days_avg(Integer app_downloads_ios_7days_avg) {
        this.app_downloads_ios_7days_avg = app_downloads_ios_7days_avg;
    }

    public Integer getApp_downloads_7days_sum() {
        return app_downloads_7days_sum;
    }

    public void setApp_downloads_7days_sum(Integer app_downloads_7days_sum) {
        this.app_downloads_7days_sum = app_downloads_7days_sum;
    }

    public Integer getApp_downloads_android_7days_sum() {
        return app_downloads_android_7days_sum;
    }

    public void setApp_downloads_android_7days_sum(Integer app_downloads_android_7days_sum) {
        this.app_downloads_android_7days_sum = app_downloads_android_7days_sum;
    }

    public Integer getApp_downloads_ios_7days_sum() {
        return app_downloads_ios_7days_sum;
    }

    public void setApp_downloads_ios_7days_sum(Integer app_downloads_ios_7days_sum) {
        this.app_downloads_ios_7days_sum = app_downloads_ios_7days_sum;
    }
}
