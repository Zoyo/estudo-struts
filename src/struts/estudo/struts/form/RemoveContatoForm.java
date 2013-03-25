
package struts.estudo.struts.form;

import org.apache.struts.action.ActionForm;

import struts.estudo.modelo.Contato;

public class RemoveContatoForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private Contato contato = new Contato();

	public Contato getContato() {
		return contato;
	}
}
