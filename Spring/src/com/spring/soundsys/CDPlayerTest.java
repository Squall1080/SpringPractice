package com.spring.soundsys;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
//import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.contrib.java.lang.system.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //crea una instancia del SpringApplicationContext
//@ContextConfiguration(classes=CDPlayerConfig.class) //Carga la configuracion de la clase especificada
@ContextConfiguration("CDPlayerConfig.xml")
public class CDPlayerTest {
	//deprecated
	//@Rule
	//public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	//standard from junit 4.x
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	//nota que se instancian solo las interfaces.
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		assertNotNull(cd);
		cd.play();
	}
	
	@Test
	public void play(){
		player.play();
		//deprecated
		//assertEquals("Now playing Black Album by Metallica", log.getLog());
		//linux uses \n, on windows is \r\n
		assertEquals("Now playing El Camino by The Black Keys\r\n", systemOutRule.getLog());
	}
}
