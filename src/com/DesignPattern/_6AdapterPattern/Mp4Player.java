package com.DesignPattern._6AdapterPattern;

public class Mp4Player implements IAdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		//  do nothing
	}

	@Override
	public void PlayMp4(String fileName) {
		
		System.out.println("playing Mp4 file.Name :"+fileName);
	}

}
