package copy;

public class Test {
	

	//ǳ���ƣ�ǳ��¡��: ǳ���ƽ������������ǵĶ��󣬶��������������õĶ���
	//��ƣ����¡������ư�Ҫ���ƵĶ��������õĶ��󶼸�����һ�顣
	//
	//Java�ж���Ŀ�¡,Ϊ�˻�ȡ�����һ�ݿ��������ǿ�������Object���clone()����������Ҫ��ѭ��������
	//1.���������и��ǻ����clone()������������Ϊpublic��Object���е�clone()����Ϊprotected�ġ���
	//2.���������clone()�����У�����super.clone()��
	//3.����������ʵ��Cloneable�ӿڡ�

	//<SPAN style="COLOR: red">Object�����clone������ǳ���ƣ�ǳ��¡��</SPAN>public class CloneTest {

		public static void main(String[] args) throws Exception{
			//teacher���󽫱�clone������Student������.
			Teacher teacher = new Teacher();
			teacher.setAge(40);
			teacher.setName("Teacher zhang");
			
			Student0 student1 = new Student0();
			student1.setAge(20);
			student1.setName("zhangsan");
			student1.setTeacher(teacher);
			
			//���Ƴ���һ������student2
			Student0 student2 = (Student0)student1.clone();
			System.out.println(student2.getAge());
			System.out.println(student2.getName());
			
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(student1.getTeacher().getAge());
			System.out.println(student1.getTeacher().getName());
			
			
			//�޸�student2�����ö���
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
	
	
	
	
	

