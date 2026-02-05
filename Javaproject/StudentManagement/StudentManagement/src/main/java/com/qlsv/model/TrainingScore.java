/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.model;

import java.util.Date;
public class TrainingScore {
    private int scoreId;
    private String studentId;
    private String academicYear;
    private int semester;
    private double totalScore;
    private String ranking;
    private Date calculatedAt;
    
    public TrainingScore() {}
    
    public TrainingScore(String studentId, String academicYear, 
                        int semester, double totalScore) {
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.semester = semester;
        this.totalScore = totalScore;
        classifyRanking();
        this.calculatedAt = new Date();
    }
    
    private void classifyRanking() {
        if (totalScore >= 90) {
            ranking = "XUẤT SẮC";
        } else if (totalScore >= 80) {
            ranking = "TỐT";
        } else if (totalScore >= 65) {
            ranking = "KHÁ";
        } else if (totalScore >= 50) {
            ranking = "TRUNG BÌNH";
        } else {
            ranking = "YẾU";
        }
    }
    
    // Getters and Setters
    public int getScoreId() { return scoreId; }
    public void setScoreId(int scoreId) { this.scoreId = scoreId; }
    
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }
    
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
    
    public double getTotalScore() { return totalScore; }
    public void setTotalScore(double totalScore) { 
        this.totalScore = totalScore;
        classifyRanking();
    }
    
    public String getRanking() { return ranking; }
    
    public Date getCalculatedAt() { return calculatedAt; }
    public void setCalculatedAt(Date calculatedAt) { this.calculatedAt = calculatedAt; }
    
    @Override
    public String toString() {
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Ma điem RL: %-48d ║%n" +
            "║ Ma SV: %-54s ║%n" +
            "║ Nam hoc: %-52s ║%n" +
            "║ Hoc ky: %-53d ║%n" +
            "║ Tong điem: %-50.2f ║%n" +
            "║ Xep loai: %-51s ║%n" +
            "║ Ngay tinh: %-50s ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            scoreId, studentId, academicYear, semester, totalScore, ranking, calculatedAt
        );
    }
}
