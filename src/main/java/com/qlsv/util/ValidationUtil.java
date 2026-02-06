/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.com.qlsv.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;
public class ValidationUtil {
     private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
    
    private static final Pattern PHONE_PATTERN = 
        Pattern.compile("^(0|\\+84)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-5]|9[0-9])[0-9]{7}$");
    
    private static final Pattern STUDENT_ID_PATTERN = 
        Pattern.compile("^SV\\d{3}$");
    
    public static Date parseDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
        }
    
    public static boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static boolean isValidPhone(String phone) {
        if (phone == null || phone.trim().isEmpty()) {
            return false;
        }
        return PHONE_PATTERN.matcher(phone).matches();
    }
    
    public static boolean isValidStudentId(String studentId) {
        if (studentId == null || studentId.trim().isEmpty()) {
            return false;
        }
        return STUDENT_ID_PATTERN.matcher(studentId).matches();
    }
    
    public static boolean isValidAge(Date birthDate) {
        if (birthDate == null) {
            return false;
        }
        
        Calendar birth = Calendar.getInstance();
        birth.setTime(birthDate);
        
        Calendar now = Calendar.getInstance();
        
        int age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        
        if (now.get(Calendar.MONTH) < birth.get(Calendar.MONTH) ||
            (now.get(Calendar.MONTH) == birth.get(Calendar.MONTH) && 
             now.get(Calendar.DAY_OF_MONTH) < birth.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }
        
        return age >= 18;
    }
    
    public static boolean isValidScore(double score) {
        return score >= 0 && score <= 10;
    }
    
    public static String formatDate(Date date) {
        if (date == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
    public static String formatDateTime(Date date) {
        if (date == null) return "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }

}
