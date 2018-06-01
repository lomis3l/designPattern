package cn.lomis.pattern.builder;

/**
 * 物品列表
 * @author lomis
 *
 */
public interface Item {
	public String name();		// 物品
	public Packing packing();	// 包装
	public float price();		// 价钱
}
