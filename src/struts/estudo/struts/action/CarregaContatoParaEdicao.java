package struts.estudo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class CarregaContatoParaEdicao extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long id = Long.parseLong(request.getParameter("id"));
		
		if(id == null) {
			return mapping.findForward("sem-contato");
		}
		
		Contato contato = new ContatoDAO().buscaPorId(id);
		request.setAttribute("contato", contato);
		
		return mapping.findForward("ok");
	}
}
