package struts.estudo.struts.form;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class RemoveContatoAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Removendo o contato");
		
		long id = Long.parseLong(request.getParameter("id"));
		
		Contato contato = new Contato();
		
		contato.setId(id);
		
		new ContatoDAO().remove(contato);
		
		return mapping.findForward("ok");
	}
}
