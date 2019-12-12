package SearchEngine;

import DataClass.*;
import DataStructureClass.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Database {

    public MyList<StudentRegistration> registerList = new MyArrayList<>();
    public MyList<Student> studentList = new MyArrayList<>();
    public MyList<Admin> adminList = new MyArrayList<>();

    public Database() {
        addStudentData();
        addAdminData();
    }

    private void addStudentData() {
        Calendar date = Calendar.getInstance();
        Student s1 = new Student("Kuek", "Yong Boon", "940526105481", "Foundation", "0124542725", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r1 = new StudentRegistration(date.getTime(), "approved", s1);
        s1.setCgpa(4.0);
        registerList.add(r1);
        studentList.add(s1);
        
        date.set(2019, 10, 10);
        Student s2 = new Student("Kuek", "Yong Tat", "940526105482", "Foundation");
        StudentRegistration r2 = new StudentRegistration(date.getTime(), "pending", s2);
        s2.setCgpa(4.00);
        registerList.add(r2);
        date.set(2019, 9, 10);
        Student s3 = new Student("Ong", "Yong Tat", "940526105482", "Foundation");
        StudentRegistration r3 = new StudentRegistration(date.getTime(), "rejected", s3);
        s3.setCgpa(4.00);
        registerList.add(r3);
        date.set(2019, 9, 10);
        Student s4 = new Student("Chia", "Yong Tat", "940526105482", "Foundation");
        StudentRegistration r4 = new StudentRegistration(date.getTime(), "pending", s4);
        s4.setCgpa(3.10);
        registerList.add(r4);
        date.set(2019, 8, 10);
        Student s5 = new Student("Wong", "Chia Zhen", "961226025845", "Foundation", "0124542725", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r5 = new StudentRegistration(date.getTime(), "approved", s5);
        s5.setCgpa(3.70);
        registerList.add(r5);
        studentList.add(s5);
        
        //--------------------------------------------------------------
        date.set(2019, 8, 12);
        Student s6 = new Student("Wong", "Ching Ling", "961226032846", "A-Level", "0124542723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r6 = new StudentRegistration(date.getTime(), "approved", s6);
        s6.setCgpa(3.82);
        registerList.add(r6);
        studentList.add(s6);
        
        date.set(2019, 8, 20);
        Student s7 = new Student("Tan", "Zhia Yi", "961224032846", "A-Level", "0124543723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r7 = new StudentRegistration(date.getTime(), "approved", s7);
        s7.setCgpa(4.00);
        registerList.add(r7);
        studentList.add(s7);
        
        date.set(2019, 8, 12);
        Student s81 = new Student("Yeoh", "Ming Lin", "961326032846", "Diploma", "0134542723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r81 = new StudentRegistration(date.getTime(), "approved", s81);
        s81.setCgpa(4.00);
        registerList.add(r81);
        studentList.add(s81);
       
        
        date.set(2019, 8, 12);
        Student s18 = new Student("Tan", "Min Jie", "931326032846", "Form 6", "0164542723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r18 = new StudentRegistration(date.getTime(), "approved", s18);
        s18.setCgpa(1.54);
        registerList.add(r18);
        studentList.add(s18);
        
        date.set(2019, 8, 1);
        Student s111= new Student("Wong", "Kar Hor", "921224032846", "Form 6", "0194543723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
        StudentRegistration r111= new StudentRegistration(date.getTime(), "approved", s111);
        s111.setCgpa(2.11);
        registerList.add(r111);
        studentList.add(s111);
        //-----------------------------------------------------------------------------
        
        
        
        for (int i = 1 ; i < 6; i++) {
            date.set(2018, 10, i);
            String firstName = randomFirstName(3);
            String lastName = randomLastName(3);
            String randomIC = randomIC();
            
            Student s = new Student(firstName, lastName +" "+ lastName, randomIC, "Foundation", "0194543723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
            StudentRegistration r = new StudentRegistration(date.getTime(), "approved", s);
            //s.setStudyStatus("probation");
            s.setCgpa(Double.parseDouble(randomCgpa(2)));
            registerList.add(r);
            studentList.add(s);
        }
        
        for (int i = 6 ; i < 10; i++) {
            date.set(2018, 12, i);
            String firstName = randomFirstName(3);
            String lastName = randomLastName(4);
            String randomIC = randomIC();
            
            Student s = new Student(firstName, lastName +" "+ lastName, randomIC, "Foundation", "0194543723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
            StudentRegistration r = new StudentRegistration(date.getTime(), "approved", s);
            //s.setStudyStatus("probation");
            s.setCgpa(Double.parseDouble(randomCgpa(1)));
            registerList.add(r);
            studentList.add(s);
        }
        
        for (int i = 17 ; i < 30; i++) {
            date.set(2018, 9, i);
            String firstName = randomFirstName(3);
            String lastName = randomLastName(4);
            String randomIC = randomIC();
            Student s = new Student(firstName, lastName +" "+ lastName, randomIC, "Foundation", "0194543723", "5, Taman Setali Jaya", "06660", "Bayang", "Johor");
            StudentRegistration r = new StudentRegistration(date.getTime(), "approved", s);
            //s.setStudyStatus("warning");
            s.setCgpa(Double.parseDouble(randomCgpa(0)));
            registerList.add(r);
            studentList.add(s);
        }
        
        
        
        
        for (int i = 6 ; i < 20; i++) {
            date.set(2019, 9, i);
            String firstName = randomFirstName(4);
            String randomIC = randomIC();
            Student s = new Student(firstName, "Yong Tat", randomIC, "Foundation");
            StudentRegistration r = new StudentRegistration(date.getTime(), "pending", s);
            registerList.add(r);
        }
    }

    private void addAdminData() {
        Admin a1 = new Admin("Ms", "LIM YI EN", "admin", "admin");
        Admin a2 = new Admin("Mr", "SEE E JET", "admin01", "admin01");
        adminList.add(a1);
        adminList.add(a2);
    }
    
    private String randomFirstName(int limit) {
        String str = "";

        Random rnd = new Random();
        for (int i = 0; i < limit; i++) {
            if (i == 0) {
                str += (char) (rnd.nextInt(26) + 'A');
            } 
            else {
                str += (char) (rnd.nextInt(26) + 'a');
            }
            
        }
        
        return str;
    }
    
    private String randomLastName(int limit) {
        String str = "";
        Random rnd = new Random();
        for (int i = 0; i < limit; i++) {
            if (i == 0) {
                str += (char) (rnd.nextInt(26) + 'A');
            } 
            else {
                str += (char) (rnd.nextInt(26) + 'a');
            }
        }
        
        return str;
    }
    
    private String randomCgpa(int number) {
        String str = number + ".";
        Random rnd = new Random();
        for (int i = 0; i < 2; i++) {
            str += rnd.nextInt(10);
        }
        
        return str;
    }

    private String randomIC() {
        String ic = "94052610";
        
        for (int i = 0; i < 4; i++) {
            ic += new Random().nextInt(10);
        }
        
        return ic;
    }
}
