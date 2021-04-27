package campDay2;


public class Main {
      public static void main(String[] args) {
    	  
    	  Course course1 = new Course(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", 0, "resim1" );
    	  
    	  Course course2 = new Course();
    	  course2.id = 2;
    	  course2.courseName = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT) ";
    	  course2.instructorName = "Engin Demiro�";
    	  course2.completionRate = 0;
    	  course2.course�mage = "resim2";
    	  
    	  // completionRate kullan�c�n�n etkile�imine g�re de�i�en dinamik bir yap�d�r. Ba�lang�� de�eri 0'd�r.
    	  
    	  Course course3 = new Course();
    	  course3.id = 3;
    	  course3.courseName = "Programlamaya Giri� i�in Temel Kurs";
    	  course3.instructorName = "Engin Demiro�";
    	  course3.completionRate = 0;
    	  course3.course�mage = "resim3";

    	  
    	  Course[] courses = {course1,course2,course3}; 
    	    
    		for (Course course : courses) {
    			System.out.println(course.courseName);
    			
    		} 
    	 
    		CourseManager courseManager = new CourseManager();
    		courseManager.startTheLesson(course1);
    		courseManager.skipToNextLesson(course2);
    		
    		
    		
    		
    		Account account1 = new Account(1,"Sedef Ka��k","sdfkasik@gmail.com", "sifre","sifre");
    		Account account2 = new Account(1,"Selen Ka��k","slnkasik@gmail.com", "sifre","sifre");
    		
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
