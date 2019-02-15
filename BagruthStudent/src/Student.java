
public class Student {
	private String name;
	private Birth birthDay;

	public Student(String name_, Birth birthDay_) {
		setBirthDay(birthDay_);
		setName(name_);
	}

	public String getName() {
		return this.name;
	}

	public Birth getBirthDay() {
		return this.birthDay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDay(Birth birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return name;
	}

}
