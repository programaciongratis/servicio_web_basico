package com.programaciongratis.serviciosweb;

import java.math.BigDecimal;

import javax.jws.WebService;

/**Esta implementacion de la interface
 * Adicion va implementar el metodo sumar.
 * 
 * @author lnoria
 *
 */
@WebService(endpointInterface = "com.programaciongratis.serviciosweb.Adicion")
public class AdicionImpl implements Adicion {

	@Override
	public BigDecimal sumar(BigDecimal variable1, BigDecimal variable2) {
		
		if (variable1 != null && variable2 != null) {
			return variable1.add(variable2);
		}
		
		return null;
	}

}
