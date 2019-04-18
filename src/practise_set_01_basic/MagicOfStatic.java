package practise_set_01_basic;

public class MagicOfStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MagicOfStatic obj = new MagicOfStatic();
		obj.run();
	}
	
	
	private void run() {
		Student s1 = new Student(101, "Apurba");
		Student s2 = new Student(102, "Ratul");
		Student s3 = new Student(103, "Pronob");
		Student s4 = new Student(104, "Mahin");
		Student s5 = new Student(105, "Masum");
		Student s6 = new Student(106, "Sharif");
		
		System.out.println("Num of Student : " + Student.getCount());
	}

}


class Student{
	private static int numOfStudent = 0;
	
	private int id;
	private String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		Student.numOfStudent++;
	}
	
	public static int getCount() {
		return Student.numOfStudent;
	}
}