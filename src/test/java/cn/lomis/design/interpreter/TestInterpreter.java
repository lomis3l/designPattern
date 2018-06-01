package cn.lomis.design.interpreter;

import org.junit.Test;

import cn.lomis.pattern.interpreter.Expression;
import cn.lomis.pattern.interpreter.impl.AndExpression;
import cn.lomis.pattern.interpreter.impl.OrExpression;
import cn.lomis.pattern.interpreter.impl.TerminalExpression;

public class TestInterpreter {

	// 规则：Robert 和 John 是男性
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// 规则：Julie 是一个已婚的女性
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

	@Test
	public void test01() {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();

		System.out.println("John is male? " + isMale.interpret("John"));
		System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
	}

}
