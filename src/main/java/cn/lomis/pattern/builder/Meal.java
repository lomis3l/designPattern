package cn.lomis.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 套餐
 * @author lomis
 *
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();

	/**
	 * 增加菜单
	 * @param item
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/**
	 * 获取价格
	 * @return
	 */
	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	/**
	 * 展示菜单
	 */
	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}