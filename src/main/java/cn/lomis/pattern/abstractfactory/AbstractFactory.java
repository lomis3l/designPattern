package cn.lomis.pattern.abstractfactory;

/**
 * 抽象工厂
 * @author lomis
 *
 */
public abstract class AbstractFactory {
	/**
	 * 获取形状工厂
	 * @param shape
	 * @return
	 */
	public abstract Shape getShape(String shape);
	
	/**
	 * 获取颜色工厂
	 * @param color
	 * @return
	 */
	public abstract Color getColor(String color);
}
