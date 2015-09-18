import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student extends Human {

	private Map<String, ArrayList<Double>> grades;

	public Student(String name, int age) {
		super(name, age);
		this.grades = new HashMap<String, ArrayList<Double>>();
	}

	public void addCourse(String name) {
		this.grades.put(name, new ArrayList<Double>());
	}

	public void addGrade(String course, Double grade) throws Exception {
		if (this.grades.containsKey(course)) {
			this.grades.get(course).add(grade);
		} else {
			throw new Exception("Course not found");
		}
	}

	public Iterable<Double> getGrades(String course) {
		return this.grades.get(course);
	}

	public Iterable<String> getCourses() {
		return this.grades.keySet();
	}

}
