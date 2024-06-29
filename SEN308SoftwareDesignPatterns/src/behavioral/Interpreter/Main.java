package behavioral.Interpreter;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		context.setVariable("a", 4);
		context.setVariable("b", 5);
		context.setVariable("c", 2);
		Expression expression1 = new AddExpression(new NumberExpression(4),
				new MultiplicationExpression(new NumberExpression(4), new NumberExpression(4)));
		Expression expression2 = new DivisionExpression(expression1, new StringExpression("4"));
		Expression expression3 = new AddExpression(new NumberExpression(context.getVariable("a")),
				new NumberExpression(context.getVariable("b")));
		int result1 = expression1.interpret(context);
		int result2 = expression2.interpret(context);
		int result3 = expression3.interpret(context);
		System.out.println("Result: " + result1);
		System.out.println("Result: " + result2);
		System.out.println("Result: " + result3);
	}

}
