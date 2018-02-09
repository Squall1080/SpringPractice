package com.spring.soundsys;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration //declara la clase como de configuracion
//escanea por componentes en el mismo paquete
//@ComponentScan 
//declaracion del nombre del paquete a escanear por componentes
//("soundsys") || 
//(basePackages="soundsys) || 
//(basePackages={"soundsys", "video"}|| 
//(basePackagesClasses = CDPlayer.class, DVDPlayer.class)
//NOTA: En el caso de basePackagesClasses, 
//cualquiera que sea el paquete en el que se encuentran las clases, 
//será el paquete base para el escaneo de componentes.
public class CDPlayerConfig {
	/*
	//returns an object that should be registered as a bean on spring application context
	@Bean //(name="BlackAlbum") el nombre del bean sería por default el nombre del metodo en minusculas
	public CompactDisc blackAlbum(){
		return new BlackAlbum();
	}
	
	@Bean
	//cdplayer bean depends on CompactDisc
	//public CDPlayer cdPlayer(){
	public CDPlayer cdPlayer(CompactDisc compactDisc){
		//return new CDPlayer(blackAlbum());//se manda la referencia del bean adecuado
		return new CDPlayer(compactDisc);
	}
	*/
}
