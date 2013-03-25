package struts.estudo.teste;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class BuscaContatoPorIdTeste {
	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		Contato contato = dao.buscaPorId(3L);
		
		if(contato != null) {
			System.out.println(contato);
		} else {
			System.out.println("Contato não cadastrado.");
		}
	}
}
