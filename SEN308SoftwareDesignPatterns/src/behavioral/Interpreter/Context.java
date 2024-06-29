package behavioral.Interpreter;

import java.util.HashMap;

import java.util.Map;

public class Context {

	private Map<String, Integer> variables;

	public Context() {

		variables = new HashMap<String, Integer>();

	}

	public void setVariable(String name, int value) {

		variables.put(name, value);

	}

	public boolean hasVariable(String name) {
		if (variables.containsKey(name)) {
			return true;
		} else {
			return false;
		}

	}

	public int getVariable(String name) {
		if (variables.containsKey(name)) {
			return variables.get(name);
		} else {
			return 0;
		}

	}

}