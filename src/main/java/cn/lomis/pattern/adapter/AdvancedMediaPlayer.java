package cn.lomis.pattern.adapter;

/**
 * 高级播放器
 * @author lomis
 *
 */
public interface AdvancedMediaPlayer {
	
	/**
	 * 播放vlc
	 * @param fileName
	 */
	public void playVlc(String fileName);

	/**
	 * 播放mp4
	 * @param fileName
	 */
	public void playMp4(String fileName);
}