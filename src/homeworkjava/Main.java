package homeworkjava;

public class Main {

	public static void main(String[] args) {
		 
		

		Instructor �nstructor1 = new Instructor(1,"Hatice"," S�nmez"," hatice123@gmail.com",187965);
		Student student1 = new Student(1," Kader"," Koca"," kader45@gmail.com",145867);
		
		UserManager userManager = new UserManager();
		userManager.add(�nstructor1);
		userManager.add(student1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.start(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.start(�nstructor1);
		 
	}
 
}
