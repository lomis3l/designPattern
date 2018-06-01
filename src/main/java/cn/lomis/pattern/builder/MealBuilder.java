package cn.lomis.pattern.builder;

import cn.lomis.pattern.builder.child.ChickenBurger;
import cn.lomis.pattern.builder.child.Coke;
import cn.lomis.pattern.builder.child.Pepsi;
import cn.lomis.pattern.builder.child.VegBurger;

/**
 * 套餐建造者
 * @author lomis
 *
 */
public class MealBuilder {

	/**
	 * 准备素食餐
	 * @return
	 */
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	/**
	 * 准备非素食套餐
	 * @return
	 */
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}