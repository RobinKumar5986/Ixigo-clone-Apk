package com.easebuzz.testing.ixigoclone.Base.models;

import com.easebuzz.testing.ixigoclone.Base.models.Response.PassengerStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BaseModel {

    @JsonProperty("ShowBlaBlaAd")
    private boolean showBlaBlaAd;

    @JsonProperty("ShowCab")
    private boolean showCab;

    @JsonProperty("Ads")
    private List<String> ads;

    @JsonProperty("WebsiteEvents")
    private List<String> websiteEvents;

    @JsonProperty("PnrAlternativeAdPosition")
    private int pnrAlternativeAdPosition;

    @JsonProperty("WebsiteAds")
    private String websiteAds;

    @JsonProperty("SponsoredButtons")
    private List<String> sponsoredButtons;

    @JsonProperty("Pnr")
    private String pnr;

    @JsonProperty("TrainNo")
    private String trainNo;

    @JsonProperty("TrainName")
    private String trainName;

    @JsonProperty("InformationMessage")
    private String informationMessage;

    @JsonProperty("Doj")
    private String doj;

    @JsonProperty("BookingDate")
    private String bookingDate;

    @JsonProperty("Quota")
    private String quota;

    @JsonProperty("DestinationDoj")
    private String destinationDoj;

    @JsonProperty("SourceDoj")
    private String sourceDoj;

    @JsonProperty("From")
    private String from;

    @JsonProperty("To")
    private String to;

    @JsonProperty("ReservationUpto")
    private String reservationUpto;

    @JsonProperty("BoardingPoint")
    private String boardingPoint;

    @JsonProperty("Class")
    private String trainClass;

    @JsonProperty("ChartPrepared")
    private boolean chartPrepared;

    @JsonProperty("BoardingStationName")
    private String boardingStationName;

    @JsonProperty("TrainStatus")
    private String trainStatus;

    @JsonProperty("TrainCancelledFlag")
    private boolean trainCancelledFlag;

    @JsonProperty("ReservationUptoName")
    private String reservationUptoName;

    @JsonProperty("PassengerCount")
    private int passengerCount;

    @JsonProperty("PassengerStatus")
    private List<PassengerStatus> passengerStatusList;

    @JsonProperty("CacheTime")
    private String cacheTime;

    @JsonProperty("Error")
    private String error;

    @JsonProperty("ErrorCode")
    private int errorCode;

    @JsonProperty("DepartureTime")
    private String departureTime;

    @JsonProperty("ArrivalTime")
    private String arrivalTime;

    @JsonProperty("ExpectedPlatformNo")
    private String expectedPlatformNo;

    @JsonProperty("BookingFare")
    private String bookingFare;

    @JsonProperty("TicketFare")
    private String ticketFare;

    @JsonProperty("CoachPosition")
    private String coachPosition;

    @JsonProperty("Rating")
    private double rating;

    @JsonProperty("FoodRating")
    private double foodRating;

    @JsonProperty("PunctualityRating")
    private double punctualityRating;

    @JsonProperty("CleanlinessRating")
    private double cleanlinessRating;

    @JsonProperty("SourceName")
    private String sourceName;

    @JsonProperty("DestinationName")
    private String destinationName;

    @JsonProperty("Duration")
    private String duration;

    @JsonProperty("RatingCount")
    private int ratingCount;

    @JsonProperty("HasPantry")
    private boolean hasPantry;

    @JsonProperty("BookedInConfirmtkt")
    private boolean bookedInConfirmtkt;

    @JsonProperty("BookedByUser")
    private boolean bookedByUser;

    @JsonProperty("BookingId")
    private String bookingId;

    @JsonProperty("GroupingId")
    private String groupingId;

    public boolean isShowBlaBlaAd() {
        return showBlaBlaAd;
    }

    public void setShowBlaBlaAd(boolean showBlaBlaAd) {
        this.showBlaBlaAd = showBlaBlaAd;
    }

    public boolean isShowCab() {
        return showCab;
    }

    public void setShowCab(boolean showCab) {
        this.showCab = showCab;
    }

    public List<String> getAds() {
        return ads;
    }

    public void setAds(List<String> ads) {
        this.ads = ads;
    }

    public List<String> getWebsiteEvents() {
        return websiteEvents;
    }

    public void setWebsiteEvents(List<String> websiteEvents) {
        this.websiteEvents = websiteEvents;
    }

    public int getPnrAlternativeAdPosition() {
        return pnrAlternativeAdPosition;
    }

    public void setPnrAlternativeAdPosition(int pnrAlternativeAdPosition) {
        this.pnrAlternativeAdPosition = pnrAlternativeAdPosition;
    }

    public String getWebsiteAds() {
        return websiteAds;
    }

    public void setWebsiteAds(String websiteAds) {
        this.websiteAds = websiteAds;
    }

    public List<String> getSponsoredButtons() {
        return sponsoredButtons;
    }

    public void setSponsoredButtons(List<String> sponsoredButtons) {
        this.sponsoredButtons = sponsoredButtons;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getInformationMessage() {
        return informationMessage;
    }

    public void setInformationMessage(String informationMessage) {
        this.informationMessage = informationMessage;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getDestinationDoj() {
        return destinationDoj;
    }

    public void setDestinationDoj(String destinationDoj) {
        this.destinationDoj = destinationDoj;
    }

    public String getSourceDoj() {
        return sourceDoj;
    }

    public void setSourceDoj(String sourceDoj) {
        this.sourceDoj = sourceDoj;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getReservationUpto() {
        return reservationUpto;
    }

    public void setReservationUpto(String reservationUpto) {
        this.reservationUpto = reservationUpto;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    public String getTrainClass() {
        return trainClass;
    }

    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }

    public boolean isChartPrepared() {
        return chartPrepared;
    }

    public void setChartPrepared(boolean chartPrepared) {
        this.chartPrepared = chartPrepared;
    }

    public String getBoardingStationName() {
        return boardingStationName;
    }

    public void setBoardingStationName(String boardingStationName) {
        this.boardingStationName = boardingStationName;
    }

    public String getTrainStatus() {
        return trainStatus;
    }

    public void setTrainStatus(String trainStatus) {
        this.trainStatus = trainStatus;
    }

    public boolean isTrainCancelledFlag() {
        return trainCancelledFlag;
    }

    public void setTrainCancelledFlag(boolean trainCancelledFlag) {
        this.trainCancelledFlag = trainCancelledFlag;
    }

    public String getReservationUptoName() {
        return reservationUptoName;
    }

    public void setReservationUptoName(String reservationUptoName) {
        this.reservationUptoName = reservationUptoName;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public List<PassengerStatus> getPassengerStatusList() {
        return passengerStatusList;
    }

    public void setPassengerStatusList(List<PassengerStatus> passengerStatusList) {
        this.passengerStatusList = passengerStatusList;
    }

    public String getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(String cacheTime) {
        this.cacheTime = cacheTime;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getExpectedPlatformNo() {
        return expectedPlatformNo;
    }

    public void setExpectedPlatformNo(String expectedPlatformNo) {
        this.expectedPlatformNo = expectedPlatformNo;
    }

    public String getBookingFare() {
        return bookingFare;
    }

    public void setBookingFare(String bookingFare) {
        this.bookingFare = bookingFare;
    }

    public String getTicketFare() {
        return ticketFare;
    }

    public void setTicketFare(String ticketFare) {
        this.ticketFare = ticketFare;
    }

    public String getCoachPosition() {
        return coachPosition;
    }

    public void setCoachPosition(String coachPosition) {
        this.coachPosition = coachPosition;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getFoodRating() {
        return foodRating;
    }

    public void setFoodRating(double foodRating) {
        this.foodRating = foodRating;
    }

    public double getPunctualityRating() {
        return punctualityRating;
    }

    public void setPunctualityRating(double punctualityRating) {
        this.punctualityRating = punctualityRating;
    }

    public double getCleanlinessRating() {
        return cleanlinessRating;
    }

    public void setCleanlinessRating(double cleanlinessRating) {
        this.cleanlinessRating = cleanlinessRating;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }

    public boolean isHasPantry() {
        return hasPantry;
    }

    public void setHasPantry(boolean hasPantry) {
        this.hasPantry = hasPantry;
    }

    public boolean isBookedInConfirmtkt() {
        return bookedInConfirmtkt;
    }

    public void setBookedInConfirmtkt(boolean bookedInConfirmtkt) {
        this.bookedInConfirmtkt = bookedInConfirmtkt;
    }

    public boolean isBookedByUser() {
        return bookedByUser;
    }

    public void setBookedByUser(boolean bookedByUser) {
        this.bookedByUser = bookedByUser;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getGroupingId() {
        return groupingId;
    }

    public void setGroupingId(String groupingId) {
        this.groupingId = groupingId;
    }

    public boolean isOptVikalp() {
        return optVikalp;
    }

    public void setOptVikalp(boolean optVikalp) {
        this.optVikalp = optVikalp;
    }

    public String getVikalpData() {
        return vikalpData;
    }

    public void setVikalpData(String vikalpData) {
        this.vikalpData = vikalpData;
    }

    public boolean isVikalpTransferred() {
        return vikalpTransferred;
    }

    public void setVikalpTransferred(boolean vikalpTransferred) {
        this.vikalpTransferred = vikalpTransferred;
    }

    public String getVikalpTransferredMessage() {
        return vikalpTransferredMessage;
    }

    public void setVikalpTransferredMessage(String vikalpTransferredMessage) {
        this.vikalpTransferredMessage = vikalpTransferredMessage;
    }

    public String getFlightBannerUrl() {
        return flightBannerUrl;
    }

    public void setFlightBannerUrl(String flightBannerUrl) {
        this.flightBannerUrl = flightBannerUrl;
    }

    @JsonProperty("OptVikalp")
    private boolean optVikalp;

    @JsonProperty("VikalpData")
    private String vikalpData;

    @JsonProperty("VikalpTransferred")
    private boolean vikalpTransferred;

    @JsonProperty("VikalpTransferredMessage")
    private String vikalpTransferredMessage;

    @JsonProperty("FlightBannerUrl")
    private String flightBannerUrl;

}

