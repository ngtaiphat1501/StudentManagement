/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv;

import main.java.com.qlsv.controller.*;
import main.java.com.qlsv.service.*;
import java.util.Scanner;
public class Main {
     private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();

    
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("  HỆ THỐNG QUẢN LÝ SINH VIÊN");
        System.out.println("  Phiên bản: 1.0.0");
        System.out.println("==========================================");
        
        // Khởi tạo dữ liệu mẫu
       // initializeSampleData();
        
        // Hiển thị menu chính
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        int index = Integer.parseInt(sc.nextLine());
        while (running) {
            displayMainMenu();
           
            
            switch (index) {
                case 1:
                    // Module 1: Quản lý sinh viên
                    handleStudentManagement();
                    break;

                case 0:
                    System.out.println("Thoát chương trình...");
                   
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        
        System.out.println("Cảm ơn đã sử dụng hệ thống!");
    }
    
    private static void displayMainMenu() {
        System.out.println("\n===== MENU CHÍNH =====");
        System.out.println("1. Quản lý sinh viên (Phúc)");
        System.out.println("2. Quản lý học tập (Khánh)");
        System.out.println("3. Điểm rèn luyện (Khoa)");
        System.out.println("4. Thống kê báo cáo (Nhân)");
        System.out.println("5. Quản lý file (Tài)");
        System.out.println("0. Thoát");
        System.out.println("======================");
    }
    
    private static void handleStudentManagement() {
        boolean back = false;
        while (!back) {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Xem tất cả sinh viên");
            System.out.println("0. Quay lại");
            System.out.println("=============================");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            
            switch (choice) {
                case 1:
                    studentService.addStudent();
                    break;
                case 2:
                    studentService.updateStudent();
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                
                case 0:
                    back = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
    
   
 
    public static Scanner getScanner() {
        return scanner;
    }
}
