
package main.java.com.qlsv.model;


public class Course {
    private String courseId;
    private String courseName;
    private int credits;
    private String departmentId;
    private int semester;
    
    public Course() {}
    
    public Course(String courseId, String courseName, int credits, 
                 String departmentId, int semester) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.departmentId = departmentId;
        this.semester = semester;
    }
    
    // Getters and Setters
    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }
    
    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }
    
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
    
    public int getSemester() { return semester; }
    public void setSemester(int semester) { this.semester = semester; }
    
    @Override
    public String toString() {
        return String.format(
            "╔════════════════════════════════════════════════════════════════╗%n" +
            "║ Ma mon: %-53s ║%n" +
            "║ Ten mon: %-52s ║%n" +
            "║ So tin chi: %-49d ║%n" +
            "║ Khoa: %-55s ║%n" +
            "║ Hoc ky: %-53d ║%n" +
            "╚════════════════════════════════════════════════════════════════╝",
            courseId, courseName, credits, departmentId, semester
        );
    }
}
