package behavioral.Interpreter;

public class NumberExpression implements Expression {

	protected int number;

	public NumberExpression(int number) {
		this.number = number;
	}

	@Override
	public int interpret(Context context) {
		return number;
	}

}
