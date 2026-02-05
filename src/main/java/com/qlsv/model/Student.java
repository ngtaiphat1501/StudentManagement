
package main.java.com.qlsv.model;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    // Tài tạo các thuộc tính của sinh viên ;
    private String studentId;
    private String fullName;
    private Date birthDate;
    private String gender;
    private String phone;
    private String email;
    private String address;
    private String classId;
    private Date enrollmentDate;
    private String status;
    private double gpa;
    private double trainingScore;
    private boolean isDeleted;

    public Student() {
    }

    public Student(String studentId, String fullName, Date birthDate, String gender, 
            String phone, String email, String address, String classId, Date enrollmentDate,
            String status, double gpa, double trainingScore, boolean isDeleted) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.classId = classId;
        this.enrollmentDate = new Date();
        this.status = "ACTIVE";
        this.gpa = 0.0;
        this.trainingScore = 0.0;
        this.isDeleted = false;
    }
// get va set cho date private 
    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getClassId() {
        return classId;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    public double getGpa() {
        return gpa;
    }

    public double getTrainingScore() {
        return trainingScore;
    }

    public boolean isIsDeleted() {
        return isDeleted;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setTrainingScore(double trainingScore) {
        this.trainingScore = trainingScore;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
     public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Mã SV: %-54s ║%n" +
            "║ Họ tên: %-54s ║%n" +
            "║ Ngày sinh: %-50s ║%n" +
            "║ Giới tính: %-50s ║%n" +
            "║ Điện thoại: %-49s ║%n" +
            "║ Email: %-54s ║%n" +
            "║ Địa chỉ: %-53s ║%n" +
            "║ Lớp: %-56s ║%n" +
            "║ Ngày nhập học: %-46s ║%n" +
            "║ GPA: %-55.2f ║%n" +
            "║ Điểm RL: %-52.2f ║%n" +
            "║ Trạng thái: %-50s ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            studentId, fullName, sdf.format(birthDate), gender, phone, 
            email, address, classId, sdf.format(enrollmentDate), 
            gpa, trainingScore, status
        );
    }
    
    public String toTableRow() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("│ %-8s │ %-20s │ %-12s │ %-6s │ %-12s │ %-10s │ %-8s │",
            studentId, fullName, sdf.format(birthDate), gender, 
            classId, String.format("%.2f", gpa), String.format("%.2f", trainingScore));
    }
    
    
    
    
    
}
