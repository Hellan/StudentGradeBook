import java.util.ArrayList;
import java.util.Scanner;

public class StudentRepository {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		ArrayList<Student> studentsRepo = new ArrayList<Student>();
		System.out.println("How many students you want to add? ");
		int countStudentsInClass = sc.nextInt();

		for (int i = 0; i < countStudentsInClass; i++) {
			try {
				System.out.println("Name: ");
				String nameS = sc.next();
				System.out.println("Age: ");
				int ageS = sc.nextInt();
				System.out.println("Name of the course: ");
				String courseName = sc.next();
				System.out.println("Grade: ");
				Double gradeC = sc.nextDouble();
				studentsRepo.add(new Student(nameS, ageS));
				studentsRepo.get(i).addCourse(courseName);
				studentsRepo.get(i).addGrade(courseName, gradeC);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println("Welcome to student's repo: ");
		for (Student student : studentsRepo) {
			System.out.printf("\n\nStudent name: %s\r\n\t", student.getName());
			for (String courseName : student.getCourses()) {
				System.out.printf("\n%s -> %s\r\n", courseName,
						student.getGrades(courseName));
			}
		}

		System.out.println();
	}
}
