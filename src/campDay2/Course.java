package campDay2;

public class Course {
	
   public Course () {
	   
	   System.out.println(" Constructor Class �al��t�!");
	   
	   } 
   
   public Course(int id, String course, String instructor, int rate, String image ) {
	   this();
	   this.id = id;
	   this.courseName = course;
	   this.instructorName = instructor;
	   this.completionRate = rate;
	   this.course�mage = image;
   }
   
   int id;
   String courseName;
   String instructorName;
   int completionRate;
   String course�mage; 
   //Resimler veri taban�nda saklan�r. Oradan �a��r�l�r. �rnek i�in kullan�lm��t�r.
   //Buras� �zellik nesnesidir.
}
