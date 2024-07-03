package Day3;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
     Student s1 = new Student();
     s1.setSid(102);
     s1.setSname("jack");
     s1.setCity("Tortuga");
    // System.out.println("Student id:"+s1.sid);
     //System.out.println("Student name:"+s1.sname);  
    // System.out.println("Student city:"+s1.city);
		System.out.println(s1);
		  Student s2 = new Student();
		     s2.setSid(103);
		     s2.setSname("William");
		     s2.setCity("London");
		     System.out.println(s2);
		     Student s3 = new Student();
		     s3.setSid(104);
		     s3.setSname("Davyjones");
		     s3.setCity("Carebbean");
		     System.out.println(s3);
	}

}
