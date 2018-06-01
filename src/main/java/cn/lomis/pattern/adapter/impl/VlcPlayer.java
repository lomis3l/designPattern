package cn.lomis.pattern.adapter.impl;

import cn.lomis.pattern.adapter.AdvancedMediaPlayer;

/**
 * vlc播放器实现
 * @author lomis
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}
}