package cn.lomis.design.visitor;

import org.junit.Test;

import cn.lomis.pattern.visitor.ComputerPart;
import cn.lomis.pattern.visitor.impl.Computer;
import cn.lomis.pattern.visitor.impl.ComputerPartDisplayVisitor;

public class TestVisitor {

	@Test
	public void test01() {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
