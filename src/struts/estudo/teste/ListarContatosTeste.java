
package struts.estudo.teste;

import java.util.List;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class ListarContatosTeste {
	public static void main(String[] args) {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.listaContatos();
		for (Contato contato : contatos) {
			System.out.println(contato);
			System.out.println("--------------------");
		}
	}
}
