package campDay2;


public class Main {
      public static void main(String[] args) {
    	  
    	  Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", 0, "resim1" );
    	  
    	  Course course2 = new Course();
    	  course2.id = 2;
    	  course2.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT) ";
    	  course2.instructorName = "Engin Demiroð";
    	  course2.completionRate = 0;
    	  course2.courseÝmage = "resim2";
    	  
    	  // completionRate kullanýcýnýn etkileþimine göre deðiþen dinamik bir yapýdýr. Baþlangýç deðeri 0'dýr.
    	  
    	  Course course3 = new Course();
    	  course3.id = 3;
    	  course3.courseName = "Programlamaya Giriþ için Temel Kurs";
    	  course3.instructorName = "Engin Demiroð";
    	  course3.completionRate = 0;
    	  course3.courseÝmage = "resim3";

    	  
    	  Course[] courses = {course1,course2,course3}; 
    	    
    		for (Course course : courses) {
    			System.out.println(course.courseName);
    			
    		} 
    	 
    		CourseManager courseManager = new CourseManager();
    		courseManager.startTheLesson(course1);
    		courseManager.skipToNextLesson(course2);
    		
    		
    		
    		
    		Account account1 = new Account(1,"Sedef Kaþýk","sdfkasik@gmail.com", "sifre","sifre");
    		Account account2 = new Account(1,"Selen Kaþýk","slnkasik@gmail.com", "sifre","sifre");
    		
    		Account[] accounts = {account1,account2};
    		
    		for (Account account : accounts) {
				System.out.println(account.fullName);
			}
    		
    		AccountManager accountManager = new AccountManager();
    		accountManager.createAccount(account1);
    		accountManager.createAccount(account2);
    		accountManager.sendMail(account1);
    		accountManager.sendMail(account2);
      }
}
