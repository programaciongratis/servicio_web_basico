package com.programaciongratis.clientes;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.programaciongratis.serviciosweb.Adicion;

public class ClienteCalculo {
	
	public static void main (String[] args ) throws MalformedURLException {
		// no olvides de agregar "?wsdl" al final!
		URL url = new URL("http://localhost:7778/ws/adicion?wsdl");
		 
	    //1er argumento es el URI de nuestro servicio
		//2do argumento es el nombre de nuestro servicio
	    QName qname = new QName("http://serviciosweb.programaciongratis.com/", "AdicionImplService");

	    Service servicio = Service.create(url, qname);

	    Adicion adicion = servicio.getPort(Adicion.class);

	    System.out.println(adicion.sumar(new BigDecimal("1.5"), new BigDecimal("1.2")));

	}
}
