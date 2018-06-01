package cn.lomis.pattern.factory;

import cn.lomis.pattern.factory.impl.Circle;
import cn.lomis.pattern.factory.impl.Rectangle;

/**
 * 图形工厂
 * @author lomis
 *
 */
public class ShapeFactory {

	/**
	 * 获取工厂
	 * @param type 类型
	 * @return
	 */
	 public Shape getShape(String type){
		 if(type == null){
	         return null;
	      }        
	      if(type.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(type.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } 
	      return null;
	 }
}
