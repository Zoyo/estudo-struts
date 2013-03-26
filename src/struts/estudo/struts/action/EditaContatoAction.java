package struts.estudo.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;
import struts.estudo.struts.form.EditaForm;

public class EditaContatoAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Tentando editar um contato");
		
		Long id = Long.parseLong(request.getParameter("idContato"));
		
		
		if(id != null) {
			ContatoDAO dao = new ContatoDAO();
			EditaForm formulario = (EditaForm) form;
			Contato contatoAlterado = formulario.getContato();
			
			Contato contatoOriginal = dao.buscaPorId(id);
			contatoOriginal.setNome(contatoAlterado.getNome());
			contatoOriginal.setEndereco(contatoAlterado.getEmail());
			contatoOriginal.setEmail(contatoAlterado.getEmail());
			
			dao.altera(contatoOriginal);
		}
		
		return mapping.findForward("ok");
	}
}
