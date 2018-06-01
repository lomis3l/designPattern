package cn.lomis.design.abstractfactory;

import org.junit.Test;

import cn.lomis.pattern.abstractfactory.AbstractFactory;
import cn.lomis.pattern.abstractfactory.Color;
import cn.lomis.pattern.abstractfactory.FactoryProducer;
import cn.lomis.pattern.abstractfactory.Shape;

public class TestAbstractFactory {
	
	@Test
	public void test01() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color = colorFactory.getColor("RED");
		color.fill();
	}

}
