/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.model;


import java.util.Date;
public class Grade {
    private int gradeId;
    private int enrollmentId;
    private double attendanceScore;
    private double midtermScore;
    private double finalScore;
    private double totalScore;
    private String letterGrade;
    private Date enteredDate;
    
    public Grade() {}
    // contructor
    public Grade(int enrollmentId, double attendanceScore, 
                double midtermScore, double finalScore) {
        this.enrollmentId = enrollmentId;
        this.attendanceScore = attendanceScore;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
        calculateTotalScore();
        calculateLetterGrade();
        this.enteredDate = new Date();
    }
    
    private void calculateTotalScore() {
        this.totalScore = attendanceScore * 0.1 + 
                         midtermScore * 0.3 + 
                         finalScore * 0.6;
    }
     // công thức tính điểm chuyển về điểm chư cái
    private void calculateLetterGrade() {
        if (totalScore >= 8.5) {
            letterGrade = "A";
        } else if (totalScore >= 7.0) {
            letterGrade = "B";
        } else if (totalScore >= 5.5) {
            letterGrade = "C";
        } else if (totalScore >= 4.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
    }
    
    // Getters and Setters
    public int getGradeId() { return gradeId; }
    public void setGradeId(int gradeId) { this.gradeId = gradeId; }
    
    public int getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(int enrollmentId) { this.enrollmentId = enrollmentId; }
    
    public double getAttendanceScore()
    { return attendanceScore; }
    public void setAttendanceScore(double attendanceScore) 
    { 
        this.attendanceScore = attendanceScore;
        calculateTotalScore();
        calculateLetterGrade();
    }
    
    public double getMidtermScore()
    { return midtermScore; }
    public void setMidtermScore(double midtermScore) 
    { 
        this.midtermScore = midtermScore;
        calculateTotalScore();
        calculateLetterGrade();
    }
    
    public double getFinalScore() { return finalScore; }
    public void setFinalScore(double finalScore) { 
        this.finalScore = finalScore;
        calculateTotalScore();
        calculateLetterGrade();
    }
    
    public double getTotalScore() { return totalScore; }
    
    public String getLetterGrade() { return letterGrade; }
    
    public Date getEnteredDate() { return enteredDate; }
    public void setEnteredDate(Date enteredDate) { this.enteredDate = enteredDate; }
    
    @Override
    public String toString() {
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Ma diem: %-51d ║%n" +
            "║ Ma đang ky: %-49d ║%n" +
            "║ Điem chuyen can: %-44.2f ║%n" +
            "║ Điem giua ky: %-47.2f ║%n" +
            "║ Điem cuoi ky: %-48.2f ║%n" +
            "║ Điem tong ket: %-47.2f ║%n" +
            "║ Điem chu: %-52s ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            gradeId, enrollmentId, attendanceScore, midtermScore, 
            finalScore, totalScore, letterGrade
        );
    } 
}
