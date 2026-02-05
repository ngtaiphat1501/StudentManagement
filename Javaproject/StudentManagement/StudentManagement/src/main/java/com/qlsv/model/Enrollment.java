/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.model;


import java.util.Date;
public class Enrollment {
    private int enrollmentId;
    private String studentId;
    private String courseId;
    private String semester;
    private String academicYear;
    private String status;
    private Date registrationDate;
    
    public Enrollment() {}
    
    public Enrollment(String studentId, String courseId, 
                     String semester, String academicYear) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.semester = semester;
        this.academicYear = academicYear;
        this.status = "PENDING";
        this.registrationDate = new Date();
    }
    
    // Getters and Setters
    public int getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(int enrollmentId) { this.enrollmentId = enrollmentId; }
    
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }
    
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    
    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    public Date getRegistrationDate() { return registrationDate; }
    public void setRegistrationDate(Date registrationDate) { this.registrationDate = registrationDate; }
    
    @Override
    public String toString() {
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Ma dang ki: %-49d ║%n" +
            "║ Ma SV: %-54s ║%n" +
            "║ Ma mon: %-53s ║%n" +
            "║ Hoc ky: %-53s ║%n" +
            "║ Nam hoc: %-52s ║%n" +
            "║ Trang thai: %-50s ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            enrollmentId, studentId, courseId, semester, academicYear, status
        );
    }
}
