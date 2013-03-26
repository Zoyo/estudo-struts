package struts.estudo.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import struts.estudo.modelo.Contato;

public class EditaForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private Contato contato = new Contato();

	public Contato getContato() {
		return contato;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors erros = new ActionErrors();
		
		if(contato.getNome() == null || contato.getNome().isEmpty()) {
			erros.add("nome", new ActionMessage("erro.campoNome"));
		}
		
		if(contato.getEndereco() == null || contato.getEndereco().isEmpty()) {
			erros.add("endereco", new ActionMessage("erro.campoEndereco"));			
		}
		
		if(contato.getEmail() == null || contato.getEmail().isEmpty()) {
			erros.add("email", new ActionMessage("erro.campoEmail"));			
		}
				
		return erros;
	}
}
