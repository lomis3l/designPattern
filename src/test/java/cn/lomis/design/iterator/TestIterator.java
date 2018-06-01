package cn.lomis.design.iterator;

import org.junit.Test;

import cn.lomis.pattern.iterator.Iterator;
import cn.lomis.pattern.iterator.impl.NameRepository;

public class TestIterator {

	@Test
	public void test01() {
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}

}
