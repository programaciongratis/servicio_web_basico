package com.programaciongratis.serviciosweb;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


/**Esta interface va reflejar las funciones 
 * o metodos que nuestro servicio adicion
 * va realizar. Es bueno trabajar siempre
 * con interfaces en vez de implementaciones
 * porque asi podemos combiar las 
 * implementaciones sin perjudicar a los
 * clientes que usan las interfaces.
 * 
 * @author lnoria
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface Adicion {
	
	/**Este metodo va realizar la adicion
	 * de las variables pasadas como
	 * argumentos.
	 * 
	 * @param variable1 BigDecimal
	 * @param variable2 BigDecimal
	 * @return BigDecimal : variable1 + variable2
	 */
	@WebMethod
	BigDecimal sumar(BigDecimal variable1, BigDecimal variable2);
	
	//TODO como practica ustedes pueden
	//hacer mas metodos que realicen otros
	//tipos de calculos.
}
