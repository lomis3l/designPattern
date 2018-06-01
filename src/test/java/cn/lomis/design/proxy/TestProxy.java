package cn.lomis.design.proxy;

import org.junit.Test;

import cn.lomis.pattern.proxy.Image;
import cn.lomis.pattern.proxy.impl.ProxyImage;

public class TestProxy {

	@Test
	public void test01() {
		Image image = new ProxyImage("test_10mb.jpg");

		// 图像将从磁盘加载
		image.display();
		System.out.println("");
		// 图像将无法从磁盘加载
		image.display();
	}

}
