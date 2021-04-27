package campDay2;

public class Course {
	
   public Course () {
	   
	   System.out.println(" Constructor Class çalýþtý!");
	   
	   } 
   
   public Course(int id, String course, String instructor, int rate, String image ) {
	   this();
	   this.id = id;
	   this.courseName = course;
	   this.instructorName = instructor;
	   this.completionRate = rate;
	   this.courseÝmage = image;
   }
   
   int id;
   String courseName;
   String instructorName;
   int completionRate;
   String courseÝmage; 
   //Resimler veri tabanýnda saklanýr. Oradan çaðýrýlýr. Örnek için kullanýlmýþtýr.
   //Burasý özellik nesnesidir.
}
