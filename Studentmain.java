package day1;

public class Studentmain {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.setStudentId(100);
		s1.setName("anusha");
		s1.setAge(21);
		System.out.println("studentId :"+s1.getStudentId()+" name :"+s1.getName()+" age: "+s1.getAge());
		s2.setStudentId(101);
		s2.setName("shubha");
		s2.setAge(21);
		System.out.println("studentId :"+s2.getStudentId()+" name :"+s2.getName()+" age: "+s2.getAge());
		s3.setStudentId(102);
		s3.setName("vaishu");
		s3.setAge(21);
		System.out.println("studentId :"+s3.getStudentId()+" name :"+s3.getName()+" age: "+s3.getAge());
	}

}
