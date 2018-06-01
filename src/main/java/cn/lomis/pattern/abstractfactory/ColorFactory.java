package cn.lomis.pattern.abstractfactory;

import cn.lomis.pattern.abstractfactory.impl.Green;
import cn.lomis.pattern.abstractfactory.impl.Red;

/**
 * 颜色工厂
 * @author lomis
 *
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		if (color != null && !"".equals(color)) {
			if (color.equalsIgnoreCase("RED")) {
				return new Red();
			} else if (color.equalsIgnoreCase("GREEN")) {
				return new Green();
			}
		}
		return null;
	}

}
