/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.controller;

 import main.java.com.qlsv.service.StudentService;
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    public void addStudent() {
        studentService.addStudent();
    }
    
    public void updateStudent() {
        studentService.updateStudent();
    }
    
    public void deleteStudent() {
        studentService.deleteStudent();
    }
    
    //public void searchStudent() {
    //    studentService.searchStudent();
    //}
    
    //public void viewAllStudents() {
    //    studentService.viewAllStudents();
    //}
    
    
    
}
