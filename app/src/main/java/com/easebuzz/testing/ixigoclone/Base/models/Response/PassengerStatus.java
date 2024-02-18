package com.easebuzz.testing.ixigoclone.Base.models.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerStatus {

    @JsonProperty("ReferenceId")
    private String referenceId;

    @JsonProperty("Pnr")
    private String pnr;

    @JsonProperty("Number")
    private int number;

    @JsonProperty("Prediction")
    private String prediction;

    @JsonProperty("PredictionPercentage")
    private String predictionPercentage;

    @JsonProperty("ConfirmTktStatus")
    private String confirmTktStatus;

    @JsonProperty("Coach")
    private String coach;

    @JsonProperty("Berth")
    private int berth;

    @JsonProperty("BookingStatus")
    private String bookingStatus;

    @JsonProperty("CurrentStatus")
    private String currentStatus;

    @JsonProperty("CoachPosition")
    private String coachPosition;

    @JsonProperty("BookingBerthNo")
    private String bookingBerthNo;

    @JsonProperty("BookingCoachId")
    private String bookingCoachId;

    @JsonProperty("BookingStatusNew")
    private String bookingStatusNew;

    @JsonProperty("BookingStatusIndex")
    private String bookingStatusIndex;

    @JsonProperty("CurrentBerthNo")
    private String currentBerthNo;

    @JsonProperty("CurrentCoachId")
    private String currentCoachId;

    @JsonProperty("BookingBerthCode")
    private String bookingBerthCode;

    @JsonProperty("CurrentBerthCode")
    private String currentBerthCode;

    @JsonProperty("CurrentStatusNew")
    private String currentStatusNew;

    @JsonProperty("CurrentStatusIndex")
    private String currentStatusIndex;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public String getPredictionPercentage() {
        return predictionPercentage;
    }

    public void setPredictionPercentage(String predictionPercentage) {
        this.predictionPercentage = predictionPercentage;
    }

    public String getConfirmTktStatus() {
        return confirmTktStatus;
    }

    public void setConfirmTktStatus(String confirmTktStatus) {
        this.confirmTktStatus = confirmTktStatus;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getBerth() {
        return berth;
    }

    public void setBerth(int berth) {
        this.berth = berth;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getCoachPosition() {
        return coachPosition;
    }

    public void setCoachPosition(String coachPosition) {
        this.coachPosition = coachPosition;
    }

    public String getBookingBerthNo() {
        return bookingBerthNo;
    }

    public void setBookingBerthNo(String bookingBerthNo) {
        this.bookingBerthNo = bookingBerthNo;
    }

    public String getBookingCoachId() {
        return bookingCoachId;
    }

    public void setBookingCoachId(String bookingCoachId) {
        this.bookingCoachId = bookingCoachId;
    }

    public String getBookingStatusNew() {
        return bookingStatusNew;
    }

    public void setBookingStatusNew(String bookingStatusNew) {
        this.bookingStatusNew = bookingStatusNew;
    }

    public String getBookingStatusIndex() {
        return bookingStatusIndex;
    }

    public void setBookingStatusIndex(String bookingStatusIndex) {
        this.bookingStatusIndex = bookingStatusIndex;
    }

    public String getCurrentBerthNo() {
        return currentBerthNo;
    }

    public void setCurrentBerthNo(String currentBerthNo) {
        this.currentBerthNo = currentBerthNo;
    }

    public String getCurrentCoachId() {
        return currentCoachId;
    }

    public void setCurrentCoachId(String currentCoachId) {
        this.currentCoachId = currentCoachId;
    }

    public String getBookingBerthCode() {
        return bookingBerthCode;
    }

    public void setBookingBerthCode(String bookingBerthCode) {
        this.bookingBerthCode = bookingBerthCode;
    }

    public String getCurrentBerthCode() {
        return currentBerthCode;
    }

    public void setCurrentBerthCode(String currentBerthCode) {
        this.currentBerthCode = currentBerthCode;
    }

    public String getCurrentStatusNew() {
        return currentStatusNew;
    }

    public void setCurrentStatusNew(String currentStatusNew) {
        this.currentStatusNew = currentStatusNew;
    }

    public String getCurrentStatusIndex() {
        return currentStatusIndex;
    }

    public void setCurrentStatusIndex(String currentStatusIndex) {
        this.currentStatusIndex = currentStatusIndex;
    }
}
