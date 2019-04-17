package practise_set_01_basic;

/* This class serve as practise
 * Object cloning is bad in design purpose
 * NEVER DO THIS
 */
public class ObjectCloning {
	public static final void main(String[] args) {
		ObjectCloning obj = new ObjectCloning();
		obj.run();
	}
	
	private void run() {
		SimpleClass obj1 = new SimpleClass(1, "Apurba");
		SimpleClass obj2 = new SimpleClass(2, "Monami");
		
		System.out.println("OBJ 1 : " + obj1);
		System.out.println("OBJ 2 : " + obj2);
		
		SimpleClass copyObj1 = new SimpleClass(obj1);
		obj1 = obj2;
		
		System.out.println("\nState Of Objects");
		
		System.out.println("COPY OBJ 1 : " + copyObj1);
		System.out.println("OBJ 1 : " + obj1);
		System.out.println("OBJ 2 : " + obj2);
	}
}


class SimpleClass{
	private int id;
	private String name;
	
	// constructor 1
	public SimpleClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// constructor 2
	public SimpleClass(SimpleClass obj) {
		this.id = obj.id;
		this.name = obj.name;
	}
	
	public String toString() {
		return id + " = " + name;
	}
}
