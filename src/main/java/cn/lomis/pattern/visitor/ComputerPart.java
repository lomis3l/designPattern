package cn.lomis.pattern.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}