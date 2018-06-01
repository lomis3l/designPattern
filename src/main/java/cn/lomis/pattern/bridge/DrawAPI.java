package cn.lomis.pattern.bridge;

/**
 * 绘制API
 * @author lomis
 *
 */
public interface DrawAPI {
	/**
	 * 
	 * @param radius 半径
	 * @param x		x坐标
	 * @param y		y坐标
	 */
	public void drawCircle(int radius, int x, int y);
}