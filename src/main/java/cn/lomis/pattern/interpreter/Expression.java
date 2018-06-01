package cn.lomis.pattern.interpreter;

public interface Expression {
	public boolean interpret(String context);
}