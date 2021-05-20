package homeworkjava;

public class Student extends User {

   int studentNumber;

public int getStudentNumber() {
	return studentNumber;
}

public void setStudentNumber(int studentNumber) {
	this.studentNumber = studentNumber;
}

public Student(int id, String firstName, String lastName, String email, int studentNumber) {
	super(id, firstName, lastName, email);
	this.studentNumber = studentNumber;
}

	
}
