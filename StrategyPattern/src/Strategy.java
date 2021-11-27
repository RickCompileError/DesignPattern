
public class Strategy {

	private Operation operation = null;
	
	public Strategy(Operation operation) {
		this.operation = operation;
	}
	
	public Strategy() {
		this.operation = new AddOperation();
	}
	
	public void changeStrategy(Operation operation) {
		this.operation = operation;
	}
	
	public int executeStrategy(int num1,int num2) {
		return operation.doOperation(num1,num2);
	}
	
}
