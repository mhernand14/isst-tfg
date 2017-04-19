package es.upm.dit.isst.tfg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.ObjectifyService;

import es.upm.dit.isst.tfg.dao.TFGDAO;
import es.upm.dit.isst.tfg.dao.TFGDAOImpl;
import es.upm.dit.isst.tfg.model.TFG;

public class ISST_TFG_Servlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		ObjectifyService.register(TFG.class);
	}
	
	public void deGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException {
		TFGDAO dao = TFGDAOImpl.getInstancia();
		for (TFG tfg: dao.read()){
			resp.getWriter().println(tfg);
		}
	}
}
