package basic.ch19;

public class ClassroomTest {

	public static void main(String[] args) {
		
		Classroom classroomA = new Classroom("C4");
		Student student1 = new Student("나비",20);
		Student student2 = new Student("벌",24);
		
		classroomA.addStudent(student1);
		classroomA.addStudent(student2);
		classroomA.showStudents();
		
	}// end of class
	
}// end of class
