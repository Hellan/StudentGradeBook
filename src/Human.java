public class Human {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException("Name should not be empty");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
}
