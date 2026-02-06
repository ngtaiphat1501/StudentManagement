
package main.java.com.qlsv.service;
import main.java.com.qlsv.Main;
import main.java.com.qlsv.model.Student;
import main.java.com.qlsv.util.ValidationUtil;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    private Map<String,Student> students = new HashMap<>();
    private int studentCounter =1;
    private Scanner scanner = Main.getScanner();

    public StudentService() {
    }
       private String generateStudentId() {
        return String.format("SV%03d", studentCounter++);
    }
        private boolean isEmailExists(String email) {
        return students.values().stream()
            .anyMatch(s -> s.getEmail().equalsIgnoreCase(email));
    }
    public void addStudent(){
        System.out.println("\n=====THEM SINH VIEN MOI=====");
        String studentId = generateStudentId();
        System.out.println("\nNHAP ID SINH VIEN "+studentId);
        System.out.println("NHAP HO VA TEN ");
        String fullName = scanner.nextLine();
        Date birthDate = null;
          while (birthDate == null) {
            System.out.print("Ngay sinh (dd/MM/yyyy): ");
            String birthDateStr = scanner.nextLine();
            birthDate = ValidationUtil.parseDate(birthDateStr);
            if (birthDate == null) {
                System.out.println("Ngay sinh khong hop le! Vui long nhap lai.");
            } else if (!ValidationUtil.isValidAge(birthDate)) {
                System.out.println("Sinh vien phai tu 18 tuoi trở len!");
                birthDate = null;
            }
    }
        System.out.print("Gioi tinh (NAM/NU/KHAC): ");
        String gender = scanner.nextLine();
        String phone ="";
        while (!ValidationUtil.isValidPhone(phone)){
            System.out.println("Nhap So Dien Thoai\n");
            phone = scanner.nextLine();
            if(!ValidationUtil.isValidPhone(phone)){
                System.out.println("So Dien Thoai Khong Hop Le ! Vui Long Thu Lai ");
            }
        }
        String email ="";
        while (!ValidationUtil.isValidEmail(email)){
            System.out.println("Nhap Email\n");
            email = scanner.nextLine();
            if(!ValidationUtil.isValidEmail(email)){
                System.out.println("Email dinh dang khong hop le! Vui long thu lai");
            }
            else if (isEmailExists(email)) {
                System.out.println("Email da ton tai");
                email="";
            }
        }
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        
        System.out.println("Nhap ma lop");
        String classId = scanner.nextLine();
        // tao ra tk sv vua moi tao 
        Student st = new Student(studentId, fullName, birthDate, gender, 
                phone, email, address, classId);
       students.put(studentId,st);
       System.out.println("Them sinh vien thanh cong ");
       System.out.println(st);
       
       }
    //module 1.2 Sua thong tin sinh vien 
    public void updateStudent(){
            System.out.println("\n=====SUA THONG TIN SINH VIEN=====");
            System.out.println("Nhap ma sinh vien can sua");
            String studentId =scanner.nextLine();
            Student st =students.get(studentId);
            
            // find student
            if(st==null || st.isIsDeleted()){
                System.out.println("Khong tim thay ma sinh vien "+studentId);
                return ;
                
            }
            System.out.println("\n thong tin hien tai:");
            System.out.println(st);
            System.out.println("Nhap thong tin moi (bo trong neu khong thay doi ");
            
            // fullname
            System.out.println("Ho va ten ["+st.getFullName()+"]");
            String fullName= scanner.nextLine();
            if(!fullName.trim().isEmpty()){
                st.setFullName(fullName);
            }
            //phone
            System.out.println("So dien thoa [" + st.getPhone()+"]");
            String phone = scanner.nextLine();
            if(!phone.trim().isEmpty()){
                while(!ValidationUtil.isValidPhone(phone)){
                System.out.println("so dien thoai khong hop le ! vui long nhap lai ");
                System.out.println("so dien thoai : ");
                phone = scanner.nextLine();
                
            }
             st.setPhone(phone);
          }
            
            // email
            System.out.println("Dia chi Email ["+st.getEmail()+"]");
            String email = scanner.nextLine();
            while(!ValidationUtil.isValidEmail(email)){
                System.out.println("Email khong hop le ! Vui long nhap lai");
               }  
                if(!email.equals(st.getEmail()) && isEmailExists(email))
                    {
                    System.out.println("Email da ton tai trong he thong !");
                    }else{
                         st.setEmail(email);
                         }
                // address
            System.out.println("Dia chi ["+ st.getAddress()+"]");
            String address = scanner.nextLine();
            if(!address.trim().isEmpty()){
                st.setAddress(address);
            }
            // class
            System.out.println("Lop ["+st.getClassId()+"]");
            String classId = scanner.nextLine();
            if(!classId.trim().isEmpty()){
                st.setClassId(classId);
            }
            // status
            System.out.println("Trang thai ["+st.getStatus()+"]");
            String status = scanner.nextLine();
            if(!status.trim().isEmpty()){
                st.setStatus(status);
            }
            // in ra sau khi update
            System.out.println("Cap nhat thong tin thanh cong ");
            System.out.println(st);
            
            
    }
    public void deleteStudent(){
        
    }
    
    
    
    
}