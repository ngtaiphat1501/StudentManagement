/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.model;

import java.util.Date;
public class Activity {
    private int activityId;
    private String activityName;
    private String activityType;
    private String organization;
    private Date startDate;
    private Date endDate;
    private int hoursSpent;
    private double pointsEarned;
    private String status;
    
    public Activity() {}
    
    public Activity(String activityName, String activityType, 
                   String organization, Date startDate, Date endDate,
                   int hoursSpent) {
        this.activityName = activityName;
        this.activityType = activityType;
        this.organization = organization;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hoursSpent = hoursSpent;
        calculatePoints();
        this.status = "REGISTERED";
    }
    
    private void calculatePoints() {
        switch (activityType.toUpperCase()) {
            case "ACADEMIC":
                this.pointsEarned = hoursSpent * 2.0;
                break;
            case "SPORTS":
                this.pointsEarned = hoursSpent * 1.5;
                break;
            case "VOLUNTEER":
            case "ART":
                this.pointsEarned = hoursSpent * 1.0;
                break;
            default:
                this.pointsEarned = hoursSpent * 1.0;
        }
        
        // Giới hạn tối đa 100 điểm
        if (this.pointsEarned > 100) {
            this.pointsEarned = 100;
        }
    }
    
    // Getters and Setters
    public int getActivityId() { return activityId; }
    public void setActivityId(int activityId) { this.activityId = activityId; }
    
    public String getActivityName() { return activityName; }
    public void setActivityName(String activityName) { 
        this.activityName = activityName; 
    }
    
    public String getActivityType() { return activityType; }
    public void setActivityType(String activityType) { 
        this.activityType = activityType;
        calculatePoints();
    }
    
    public String getOrganization() { return organization; }
    public void setOrganization(String organization) { this.organization = organization; }
    
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    
    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
    
    public int getHoursSpent() { return hoursSpent; }
    public void setHoursSpent(int hoursSpent) { 
        this.hoursSpent = hoursSpent;
        calculatePoints();
    }
    
    public double getPointsEarned() { return pointsEarned; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    @Override
    public String toString() {
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Ma hoat dong: %-47d ║%n" +
            "║ Ten hoat dong: %-46s ║%n" +
            "║ Loai hoat dong: %-45s ║%n" +
            "║ To chuc: %-52s ║%n" +
            "║ Thoi gian: %-50s ║%n" +
            "║ So gio: %-52d ║%n" +
            "║ Điem cong: %-49.2f ║%n" +
            "║ Trang thai: %-50s ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            activityId, activityName, activityType, organization,
            startDate + " - " + endDate, hoursSpent, pointsEarned, status
        );
    }
}
