package com.salesianostriana.dam.ethfechas.servicios;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.ethfechas.model.Alumno;
import com.salesianostriana.dam.ethfechas.repositorios.AlumnoRepository;
import com.salesianostriana.dam.ethfechas.servicios.base.BaseService;


/** Podéis ver la explicación del servicio base en las clases de Luismi
 * Por resumirlo aquí, la idea es que como los servicios CRUD siempre suelen ser lo mismo, 
 * es buena idea crear un servicio base que haga esto, 
 * y dejar nuestro servicio "concreto" en otro sitio. 
 * Esta sería nuestra clase de servicio concreta (para las cosas propias de nuestra aplicación) que,
 * en este caso, al no tener una lógica de negocio más allá de los CRUD está vacía, 
 * solo extiende al servicio base*/

@Service
public class AlumnoServicio extends BaseService<Alumno, Long, AlumnoRepository>{

}