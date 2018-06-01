package cn.lomis.pattern.visitor;

import cn.lomis.pattern.visitor.impl.Computer;
import cn.lomis.pattern.visitor.impl.Keyboard;
import cn.lomis.pattern.visitor.impl.Monitor;
import cn.lomis.pattern.visitor.impl.Mouse;

public interface ComputerPartVisitor {
	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);
}