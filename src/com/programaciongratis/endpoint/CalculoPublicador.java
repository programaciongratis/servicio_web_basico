package com.programaciongratis.endpoint;

import javax.xml.ws.Endpoint;

import com.programaciongratis.serviciosweb.AdicionImpl;

/**Esta clase solo publica nuestra implementacion
 * de la interface adicion que suma dos variables.
 * 
 * @author lnoria
 *
 */
public class CalculoPublicador {
	
	public static void main(String[] args) {
		
		String url = "http://localhost:7778/ws/adicion";
		
		//aqui publicamos nuestro servicio calculo a la siguiente direccion
		//tambien pasamos la implementacion de nuestra clase adicion
		Endpoint.publish(url, new AdicionImpl());
		
		System.out.println("Nuestro servicio a sido publicado"
				+ " a la siguiente direccion: " + url);
	}

}
