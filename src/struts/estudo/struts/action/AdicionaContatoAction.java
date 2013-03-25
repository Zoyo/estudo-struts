
package struts.estudo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;
import struts.estudo.struts.form.ContatoForm;

public class AdicionaContatoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Tentando criar um contato");
		
		ContatoForm formulario = (ContatoForm) form;
		Contato contato = formulario.getContato();
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.adiciona(contato);
		return mapping.findForward("ok");
	}
}
