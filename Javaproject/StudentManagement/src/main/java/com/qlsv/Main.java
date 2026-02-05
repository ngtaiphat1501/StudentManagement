/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.java.com.qlsv.model.Course;
import main.java.com.qlsv.model.CourseManager;
import main.java.com.qlsv.model.Grade;





public class Main {
    
    
    
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             CourseManager c = new CourseManager();
        
             
        while (true) {

            c.registerCourse();
            
            
            
          // Nhập điểm môn
            Grade g = new Grade();
            
            g.enterGrade(sc);

            System.out.println(g);
             
            break;  
            
        }

       
    }
}
