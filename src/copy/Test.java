package copy;

public class Test {
	

	//浅复制（浅克隆）: 浅复制仅仅复制所考虑的对象，而不复制它所引用的对象。
	//深复制（深克隆）：深复制把要复制的对象所引用的对象都复制了一遍。
	//
	//Java中对象的克隆,为了获取对象的一份拷贝，我们可以利用Object类的clone()方法。必须要遵循下面三点
	//1.在派生类中覆盖基类的clone()方法，并声明为public【Object类中的clone()方法为protected的】。
	//2.在派生类的clone()方法中，调用super.clone()。
	//3.在派生类中实现Cloneable接口。

	//<SPAN style="COLOR: red">Object类里的clone方法是浅复制（浅克隆）</SPAN>public class CloneTest {

		public static void main(String[] args) throws Exception{
			//teacher对象将被clone出来的Student对象共享.
			Teacher teacher = new Teacher();
			teacher.setAge(40);
			teacher.setName("Teacher zhang");
			
			Student0 student1 = new Student0();
			student1.setAge(20);
			student1.setName("zhangsan");
			student1.setTeacher(teacher);
			
			//复制出来一个对象student2
			Student0 student2 = (Student0)student1.clone();
			System.out.println(student2.getAge());
			System.out.println(student2.getName());
			
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(student1.getTeacher().getAge());
			System.out.println(student1.getTeacher().getName());
			
			
			//修改student2的引用对象
			student2.getTeacher().setAge(50);
			student2.getTeacher().setName("Teacher Li");
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(student1.getTeacher().getAge());
			System.out.println(student1.getTeacher().getName());
		}
	}

	class Teacher {
		public int age;
		public String name;
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		
	}

	class Student0 implements Cloneable{
		
		public int age ;
		public String name;
		public Teacher teacher;
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Teacher getTeacher() {
			return teacher;
		}
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}
		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
		
		
	}
	
	
	
	
	

