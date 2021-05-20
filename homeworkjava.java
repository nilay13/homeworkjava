package homeworkjava;

public class Instructor extends User {

	int instructorNumber;

	public Instructor(int id, String firstName, String lastName, String email, int instructorNumber) {
		super(id, firstName, lastName, email);
		this.instructorNumber = instructorNumber;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
}
