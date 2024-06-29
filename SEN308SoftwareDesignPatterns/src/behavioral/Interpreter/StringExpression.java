package behavioral.Interpreter;

public class StringExpression implements Expression {

	protected int number;

	public StringExpression(String number) {
		this.number = Integer.valueOf(number);
	}

	@Override
	public int interpret(Context context) {
		return number;
	}

}
