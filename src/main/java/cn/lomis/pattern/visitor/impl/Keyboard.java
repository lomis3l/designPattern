package cn.lomis.pattern.visitor.impl;

import cn.lomis.pattern.visitor.ComputerPart;
import cn.lomis.pattern.visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}