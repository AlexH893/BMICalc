/**
 * This is an instantiable class
 * 
 * @author Alex
 *
 */
public class Person {
	
	private String name;
	private int age;
	private char gender;
	
	//constructor doesn't have a return type, not even void
	//a constructor is a special method called with the 'new' keyword
	//constructors name is the same as the class name
	//constructors are used to initialize an object in to a valid state
	/**
	 * Constructor using default values
	 */
	public Person() {
		name = "none";
		age = 0;
		gender = 'u';
	}
	
/**
 * Constructor using fields	
 * @param name
 * @param age
 * @param gender
 */
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
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
	public void setAge(int a) {
		this.age = a;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		if (isValidGender(gender)) {
		this.gender = gender;
		}
		else
		{
			throw new RuntimeException("Invalid gender, enter 'm' or 'f'.");
			//System.out.println("Invalid gender, enter 'm' or 'f'.");
		}
	}
	static boolean isValidGender(char gender) {
		return (Character.toUpperCase(gender) == ('M') || (Character.toUpperCase(gender) == ('F')));
	}

	/**
	 * Convert the object values into a string.
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public boolean equals(Person secondPerson) {
		
		return name.equals(secondPerson.getName());
	}
	/**
	 * Creates a formatted record - name is 25 spaces, age 3, and gender 1
	 * @return
	 */
	public String toRecord() { //s for string, d for integers
		String record = String.format("%-25s", name) + String.format("%3d", age) + gender;
				
		return record;
		
		
	}


	
}
