/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class CourseManager {
    private List<Course> courses = new ArrayList<>();
        
        public CourseManager(){
            ListCourse();
        }
        
        private void ListCourse(){
        
         courses.add(new Course("pro192", "PRO", 1, "TEST1", 2));
         courses.add(new Course("nwc00", "NWC", 1, "TEST1", 2));
         courses.add(new Course("osg202", "OSG", 1, "TEST1", 2));
    }
       
    public void registerCourse(){
        Scanner sc = new Scanner(System.in);
       
        
        for (Course c : courses){
            System.out.println(c);
        }
       
        System.out.println("Nhập mã môn");
        String id = sc.nextLine();
        
        Course found = null;
        
         for (Course c : courses){
            if(c.getCourseId().equalsIgnoreCase(id)){
                    found = c;
                    break;
            }
        }
           if(found != null) {
        System.out.println("✅ Bạn đã chọn: " + found);
    } else {
        System.out.println("❌ Không tìm thấy môn!");
    }
        
    }
}
