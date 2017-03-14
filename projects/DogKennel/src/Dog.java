
public class Dog {

	
	private String name;
	private int age;
	private final int DOG_AGE_MULTIPLIER = 7;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String toString() {
		return "Dog [Name: " + name + ", Age: " + age + ", Age In Dog Years: " + age * DOG_AGE_MULTIPLIER + "]";
	}

	
}