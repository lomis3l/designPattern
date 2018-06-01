package cn.lomis.pattern.builder.impl;

import cn.lomis.pattern.builder.Packing;

/**
 * 打包器
 * @author lomis
 *
 */
public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}

}
