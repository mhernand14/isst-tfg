package es.upm.dit.isst.tfg.dao;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class TFGDAOImpl implements TFGDAO {
	private static TFGDAOImpl instancia;
	private TFGDAOImpl(){
		
	}
	
	public static TFGDAOImpl getInstancia(){
		if (instancia == null)
				instancia = new TFGDAOImpl();
		return instancia;
		
		
	}
	
}
