package cn.lomis.design.command;

import org.junit.Test;

import cn.lomis.pattern.command.Broker;
import cn.lomis.pattern.command.Stock;
import cn.lomis.pattern.command.impl.BuyStock;
import cn.lomis.pattern.command.impl.SellStock;

public class TestCommand {

	@Test
	public void test01() {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}

}
