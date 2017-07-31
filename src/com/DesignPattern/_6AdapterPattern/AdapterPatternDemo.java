package com.DesignPattern._6AdapterPattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {

		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.paly("mp3", "beyong the horizon.mp3");
		
		audioPlayer.paly("mp4", "alone.mp4");
		audioPlayer.paly("vlc", "far far away.vlc");
		audioPlayer.paly("avi", "mind me.av");
		
	}

}
