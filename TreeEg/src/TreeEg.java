import java.util.Iterator;
import java.util.TreeSet;

public class TreeEg {
  public static void main(String[] args) {
	
	  
	  
	  Students s1=new Students(1,"Sarang",25,"Female");
	  Students s2=new Students(4,"Anya",26,"Male");
	  Students s3=new Students(5,"Parya",24,"Male");
	  Students s4=new Students(6,"Shubhya",24,"Male");
	  Students s5=new Students(8,"Akkya",22,"Male");
	  Students s6=new Students(10,"Saurya",26,"Male");
	  Students s7=new Students(15,"Adya",25,"Male");
		 
	  
	  
	  TreeSet<Students> stud=new TreeSet<Students>();
	  System.out.println("Container is ready....!");
	  
	  stud.add(s1);
	  stud.add(s2);
	  stud.add(s3);
	  stud.add(s4);
	  stud.add(s5);
	  stud.add(s6); 
	  stud.add(s7);
	  
	  Iterator<Students> studIterator=stud.iterator();
	  
	  while(studIterator.hasNext()) {
		  Students studs = studIterator.next();
		  System.out.println(studs);
	  }
	  
}
}
