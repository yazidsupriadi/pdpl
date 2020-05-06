
public class employee{

	salarycal empType;
	String name;

	public employee(String s ,salarycal c){
		name = s;
		empType = c;
	}

	public void display(){
		System.out.println("name " + name);
		System.out.println("salary " + empType.getSalary());	
	}
}