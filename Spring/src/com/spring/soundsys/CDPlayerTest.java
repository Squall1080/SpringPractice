package com.spring.soundsys;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //crea una instancia del SpringApplicationContext
@ContextConfiguration(classes=CDPlayerConfig.class) //Carga la configuracion de la clase especificada
public class CDPlayerTest {
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
		cd.play();
	}

}
