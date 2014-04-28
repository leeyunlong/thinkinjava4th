package copy;

class Professor implements Cloneable{
	public String name;
	public int age;

	public Professor(Professor p) {
		/* 拷贝构造函数 */
		this.name = p.name;
		this.age = p.age;
	}

	public Professor(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Professor() {
		// TODO Auto-generated constructor stub
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}

class Student implements Cloneable {
	public String grade;
	public String name;
	public Professor p;

	public Student() {
	}

	public Student(Student s) {
		this.grade = s.grade;
		this.name = s.name;
		this.p = s.p;
	}

	public Student(String grade, String name, Professor p) {
		this.grade = grade;
		this.name = name;
		this.p = p;
	}

	public Object clone() throws CloneNotSupportedException {
		/*浅复制只复制所考虑的对象，并不复制它所引用的对象，浅复制中对象中的引用被公用*/
		return super.clone();
	}
}

public class ShallowCopy {
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Professor p = new Professor();
		Student s1 = new Student();
		s1.p = p;
		s1.name ="wushan";
		s1.grade = "yansan";
		s1.p.name = "lijie";
		s1.p.age = 26;
		System.out.println(" before copy "+s1.grade+" "+ s1.name+" "+s1.p.age+" "+s1.p.name);
		System.out.println(s1);
		System.out.println(s1.p);
		Student s2 = (Student) s1.clone();
		s2.name ="lydia";
		s2.grade = "staff";
		s2.p.age = 27;
		s2.p.name = "leeyunlong";
		System.out.println(" after copy "+s1.grade+" "+ s1.name+" "+s1.p.age+" "+s1.p.name);
		System.out.println(" after copy "+s2.grade+" "+ s2.name+" "+s2.p.age+" "+s2.p.name);
		System.out.println(s2);
		System.out.println(s2.p);
	}
}
