package com.DesignPattern._6AdapterPattern;

public class MediaAdapter implements IMediaPlayer {

	IAdvancedMediaPlayer advancedMusicPlayer;
	
	
	public MediaAdapter(String audioType) {
		
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}


	@Override
	public void paly(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.PlayMp4(fileName);
		}
		
	}

}
