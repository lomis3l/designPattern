package cn.lomis.pattern.adapter.impl;

import cn.lomis.pattern.adapter.AdvancedMediaPlayer;

/**
 * mp4播放器实现
 * @author lomis
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// 什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}
}