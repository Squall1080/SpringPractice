package com.spring.soundsys;

import org.springframework.stereotype.Component;
//Se declara la clase como un componente
//Si no se propociona un ID, el default es el nombre de la clase en minusculas.
@Component("BlackAlbum")
public class BlackAlbum implements CompactDisc {
	String title = "Black Album";
	String artist = "Metallica";
	
	//@Override
	public void play() {
		System.out.println("Now playing " + title + " by " + artist);
	}

}
