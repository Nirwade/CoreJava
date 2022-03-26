package OOPS;

public class InterfaceChildExample implements InterfaceExample,InterfaceExample1 {

	//we use implement keyword instead of extend to extend child classes//
	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BankName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddAmmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		
	}

	public void display() {
		//in child class we can also add non abstract methods//
		
		System.out.println("Non abstract menthods");
}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}