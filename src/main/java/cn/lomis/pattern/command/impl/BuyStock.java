package cn.lomis.pattern.command.impl;

import cn.lomis.pattern.command.Order;
import cn.lomis.pattern.command.Stock;

public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}
}