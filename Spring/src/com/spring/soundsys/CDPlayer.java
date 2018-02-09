package com.spring.soundsys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	/*Spring puede instanciar un bean por medio de la anotación @Autowired
	 * ya sea por medio del constructor o por medio del metodo set
	 * */
	
	private CompactDisc cd;
	@Autowired
	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}
	@Autowired
	public void setCompactDisc(CompactDisc cd){
		this.cd = cd;
	}
	
	@Override
	public void play() {
		cd.play();
	}
	//@Inject es una opcion valida para suplir autowired
	@Autowired //(required = false) permite beans 'unwired' - Cuidado con los NullPointerExceptions
	public void insertDisc(CompactDisc cd) {
		this.cd = cd;
	}

}
