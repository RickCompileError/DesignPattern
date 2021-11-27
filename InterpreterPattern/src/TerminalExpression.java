
public class TerminalExpression implements Expression {

	private String data;
	
	public TerminalExpression(String data) {
		this.data = data;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if (context=="") return false;
		
		String[] splitContext = context.trim().split(" ");
		boolean result = false;
		
		for (String text: splitContext) {
			result = result || data.contains(text);
		}
		return result;
	}

}
