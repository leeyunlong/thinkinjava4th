package copy;

class Student2 implements Cloneable {
	public String grade;
	public String name;
	public Professor p;

	public Student2() {
	}

	public Student2(Student s) {
		this.grade = s.grade;
		this.name = s.name;
		this.p = s.p;
	}

	public Student2(String grade, String name, Professor p) {
		this.grade = grade;
		this.name = name;
		this.p = p;
	}

	public Object clone() throws CloneNotSupportedException {
		/*深复制把所引用的对象都复制了一遍，深复制中所引用的对象不被共享*/
		Student2 s = (Student2) super.clone();
		s.p = (Professor) p.clone();
		return s;
	}
}
public class DeepCopy {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Professor p = new Professor();
		Student2 s1 = new Student2();
		s1.p = p;
		s1.name ="wushan";
		s1.grade = "yansan";
		s1.p.name = "lijie";
		s1.p.age = 26;
		System.out.println(" before copy "+s1.grade+" "+ s1.name+" "+s1.p.age+" "+s1.p.name);
		System.out.println(s1);
		System.out.println(s1.p);
		Student2 s2 = (Student2) s1.clone();
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
