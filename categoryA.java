public  class categoryA implements salarycal{
	double baseSalary;
	double ot;

	public categoryA(double base, double overtime){
		baseSalary = base;
		ot = overtime;
	}

	public double getSalary(){
		return baseSalary + ot ;
	}	

}
