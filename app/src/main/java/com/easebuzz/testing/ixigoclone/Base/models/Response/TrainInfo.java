package com.easebuzz.testing.ixigoclone.Base.models.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrainInfo {

    @SerializedName("ShowBlaBlaAd")
    private boolean showBlaBlaAd;

    @SerializedName("ShowCab")
    private boolean showCab;

    @SerializedName("Ads")
    private List<Object> ads;

    @SerializedName("WebsiteEvents")
    private List<String> websiteEvents;

    @SerializedName("PnrAlternativeAdPosition")
    private int pnrAlternativeAdPosition;

    @SerializedName("WebsiteAds")
    private Object websiteAds;

    @SerializedName("SponsoredButtons")
    private List<Object> sponsoredButtons;

    @SerializedName("Pnr")
    private String pnr;

    @SerializedName("TrainNo")
    private String trainNo;

    @SerializedName("TrainName")
    private String trainName;

    @SerializedName("InformationMessage")
    private String informationMessage;

    @SerializedName("Doj")
    private String doj;

    @SerializedName("BookingDate")
    private String bookingDate;

    @SerializedName("Quota")
    private String quota;

    @SerializedName("DestinationDoj")
    private String destinationDoj;

    @SerializedName("SourceDoj")
    private String sourceDoj;

    @SerializedName("From")
    private String from;

    @SerializedName("To")
    private String to;

    @SerializedName("ReservationUpto")
    private String reservationUpto;

    @SerializedName("BoardingPoint")
    private String boardingPoint;

    @SerializedName("Class")
    private String travelClass;

    @SerializedName("ChartPrepared")
    private boolean chartPrepared;

    @SerializedName("BoardingStationName")
    private String boardingStationName;

    @SerializedName("TrainStatus")
    private String trainStatus;

    @SerializedName("TrainCancelledFlag")
    private boolean trainCancelledFlag;

    @SerializedName("ReservationUptoName")
    private String reservationUptoName;

    @SerializedName("PassengerCount")
    private int passengerCount;

    @SerializedName("PassengerStatus")
    private List<PassengerStatus> passengerStatusList;

    @SerializedName("CacheTime")
    private String cacheTime;

    @SerializedName("Error")
    private Object error;

    @SerializedName("ErrorCode")
    private int errorCode;

    @SerializedName("DepartureTime")
    private String departureTime;

    @SerializedName("ArrivalTime")
    private String arrivalTime;

    @SerializedName("ExpectedPlatformNo")
    private String expectedPlatformNo;

    @SerializedName("BookingFare")
    private String bookingFare;

    @SerializedName("TicketFare")
    private String ticketFare;

    @SerializedName("CoachPosition")
    private String coachPosition;

    @SerializedName("Rating")
    private double rating;

    @SerializedName("FoodRating")
    private double foodRating;

    @SerializedName("PunctualityRating")
    private double punctualityRating;

    @SerializedName("CleanlinessRating")
    private double cleanlinessRating;

    @SerializedName("SourceName")
    private String sourceName;

    @SerializedName("DestinationName")
    private String destinationName;

    @SerializedName("Duration")
    private String duration;

    @SerializedName("RatingCount")
    private int ratingCount;

    @SerializedName("HasPantry")
    private boolean hasPantry;

    @SerializedName("BookedInConfirmtkt")
    private boolean bookedInConfirmTkt;

    @SerializedName("BookedByUser")
    private boolean bookedByUser;

    @SerializedName("BookingId")
    private String bookingId;

    @SerializedName("GroupingId")
    private Object groupingId;

    @SerializedName("OptVikalp")
    private boolean optVikalp;

    @SerializedName("VikalpData")
    private String vikalpData;

    @SerializedName("VikalpTransferred")
    private boolean vikalpTransferred;

    @SerializedName("VikalpTransferredMessage")
    private String vikalpTransferredMessage;

    @SerializedName("FlightBannerUrl")
    private String flightBannerUrl;

    // Getters and setters
    // ... (You can generate getters and setters for these fields)

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

    public List<Object> getAds() {
        return ads;
    }

    public void setAds(List<Object> ads) {
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

    public Object getWebsiteAds() {
        return websiteAds;
    }

    public void setWebsiteAds(Object websiteAds) {
        this.websiteAds = websiteAds;
    }

    public List<Object> getSponsoredButtons() {
        return sponsoredButtons;
    }

    public void setSponsoredButtons(List<Object> sponsoredButtons) {
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

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
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

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
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

    public boolean isBookedInConfirmTkt() {
        return bookedInConfirmTkt;
    }

    public void setBookedInConfirmTkt(boolean bookedInConfirmTkt) {
        this.bookedInConfirmTkt = bookedInConfirmTkt;
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

    public Object getGroupingId() {
        return groupingId;
    }

    public void setGroupingId(Object groupingId) {
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

    // PassengerStatus class
    public static class PassengerStatus {
        @SerializedName("ReferenceId")
        private Object referenceId;

        @SerializedName("Pnr")
        private Object pnr;

        @SerializedName("Number")
        private int number;

        @SerializedName("Prediction")
        private Object prediction;

        @SerializedName("PredictionPercentage")
        private Object predictionPercentage;

        @SerializedName("ConfirmTktStatus")
        private Object confirmTktStatus;

        @SerializedName("Coach")
        private String coach;

        @SerializedName("Berth")
        private int berth;

        @SerializedName("BookingStatus")
        private String bookingStatus;

        @SerializedName("CurrentStatus")
        private String currentStatus;

        @SerializedName("CoachPosition")
        private String coachPosition;

        @SerializedName("BookingBerthNo")
        private String bookingBerthNo;

        @SerializedName("BookingCoachId")
        private String bookingCoachId;

        @SerializedName("BookingStatusNew")
        private String bookingStatusNew;

        @SerializedName("BookingStatusIndex")
        private String bookingStatusIndex;

        @SerializedName("CurrentBerthNo")
        private String currentBerthNo;

        @SerializedName("CurrentCoachId")
        private String currentCoachId;

        @SerializedName("BookingBerthCode")
        private Object bookingBerthCode;

        @SerializedName("CurrentBerthCode")
        private Object currentBerthCode;

        @SerializedName("CurrentStatusNew")
        private String currentStatusNew;

        @SerializedName("CurrentStatusIndex")
        private String currentStatusIndex;

        // Getters and setters
        // ... (You can generate getters and setters for these fields)

        public Object getReferenceId() {
            return referenceId;
        }

        public void setReferenceId(Object referenceId) {
            this.referenceId = referenceId;
        }

        public Object getPnr() {
            return pnr;
        }

        public void setPnr(Object pnr) {
            this.pnr = pnr;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public Object getPrediction() {
            return prediction;
        }

        public void setPrediction(Object prediction) {
            this.prediction = prediction;
        }

        public Object getPredictionPercentage() {
            return predictionPercentage;
        }

        public void setPredictionPercentage(Object predictionPercentage) {
            this.predictionPercentage = predictionPercentage;
        }

        public Object getConfirmTktStatus() {
            return confirmTktStatus;
        }

        public void setConfirmTktStatus(Object confirmTktStatus) {
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

        public Object getBookingBerthCode() {
            return bookingBerthCode;
        }

        public void setBookingBerthCode(Object bookingBerthCode) {
            this.bookingBerthCode = bookingBerthCode;
        }

        public Object getCurrentBerthCode() {
            return currentBerthCode;
        }

        public void setCurrentBerthCode(Object currentBerthCode) {
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
}

