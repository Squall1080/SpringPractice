package com.spring.soundsys;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //declara la clase como de configuracion
//escanea por componentes en el mismo paquete
@ComponentScan //("soundsys") || (basePackages="soundsys) || (basePackages={"soundsys", "video"}|| (basePackagesClasses = CDPlayer.class, DVDPlayer.class) <- asi se declara el nombre del paquete a escanear por componentes
//NOTA: En el caso de basePackagesClasses, cualquiera que sea el paquete en el que se encuentran las clases, será el paquete base para el escaneo de componentes.
public class CDPlayerConfig {
}
