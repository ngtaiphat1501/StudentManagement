
package main.java.com.qlsv.model;


public class Class {
     private String classId;
    private String className;
    private String departmentId;
    private String academicYear;
    private String advisor;
    private int totalStudents;
    
    public Class() {}
    
    public Class(String classId, String className, String departmentId, 
                String academicYear, String advisor) {
        this.classId = classId;
        this.className = className;
        this.departmentId = departmentId;
        this.academicYear = academicYear;
        this.advisor = advisor;
        this.totalStudents = 0;
    }
    
    // Getters and Setters
    public String getClassId() { return classId; }
    public void setClassId(String classId) { this.classId = classId; }
    
    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }
    
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
    
    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }
    
    public String getAdvisor() { return advisor; }
    public void setAdvisor(String advisor) { this.advisor = advisor; }
    
    public int getTotalStudents() { return totalStudents; }
    public void setTotalStudents(int totalStudents) { this.totalStudents = totalStudents; }
    
    @Override
    public String toString() {
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Mã lớp: %-53s ║%n" +
            "║ Tên lớp: %-52s ║%n" +
            "║ Khoa: %-55s ║%n" +
            "║ Năm học: %-52s ║%n" +
            "║ GV chủ nhiệm: %-47s ║%n" +
            "║ Sĩ số: %-53d ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            classId, className, departmentId, academicYear, advisor, totalStudents
        );
    }
}
