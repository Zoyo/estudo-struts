package struts.estudo.teste;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class ExcluirContatoTeste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(3L);
		
		ContatoDAO dao = new ContatoDAO();
		dao.remove(contato);
		
		System.out.println("Removido");
	}
}
