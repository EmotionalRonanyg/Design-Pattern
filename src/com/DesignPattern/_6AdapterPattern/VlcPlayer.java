package com.DesignPattern._6AdapterPattern;

public class VlcPlayer implements IAdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

		System.out.println("playing Vlc file.Name :"+fileName);
	}

	@Override
	public void PlayMp4(String fileName) {
		//  do nothing
	}

}
