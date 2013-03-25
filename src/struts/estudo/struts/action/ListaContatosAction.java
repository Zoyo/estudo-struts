package struts.estudo.struts.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class ListaContatosAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Contato> contatos = new ContatoDAO().listaContatos();
//		contatos.clear(); // simula uma banco de dados vazio
		if(contatos.size() > 0) {
			request.setAttribute("contatos", contatos);
			return mapping.findForward("lista");			
		} else {
			return mapping.findForward("vazia");			
		}
	}
}
