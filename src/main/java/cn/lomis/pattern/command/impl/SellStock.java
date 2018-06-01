package cn.lomis.pattern.command.impl;

import cn.lomis.pattern.command.Order;
import cn.lomis.pattern.command.Stock;

public class SellStock implements Order {
	private Stock abcStock;

	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.sell();
	}
}