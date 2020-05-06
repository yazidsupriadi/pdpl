public  class categoryB implements salarycal{
	double salesamt;
	double baseSalary;
	final static double commission = 0.02;

	public categoryB(double base, double sa){
		baseSalary = base;
		salesamt  = sa;
	}

	public double getSalary(){
		return (baseSalary + (commission * salesamt));
	}	

}
