package cn.lomis.pattern.abstractfactory;

import cn.lomis.pattern.abstractfactory.impl.Circle;
import cn.lomis.pattern.abstractfactory.impl.Rectangle;

/**
 * 形状工厂
 * @author lomis
 *
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		return null;
	}
}