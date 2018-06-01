package cn.lomis.design.adapter;

import org.junit.Test;

import cn.lomis.pattern.adapter.impl.AudioPlayer;

public class TestAdapter {

	@Test
	public void test01() {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
