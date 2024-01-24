package practiceproblems;

public class AgeJUnit {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean checkAge() {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

}
