package cn.lomis.pattern.adapter;

/**
 * 播放器
 * @author lomis
 *
 */
public interface MediaPlayer {
	/**
	 * 播放
	 * @param audioType 类型
	 * @param fileName  名称
	 */
	public void play(String audioType, String fileName);
}