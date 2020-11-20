package lab8.DAO2;

import java.util.Collection;

public interface IBDLivros {

	Collection<Livro> localizarTodosLivros();
	Livro localizarLivroPorIsbn(Livro livro);
	public void adicionar(Livro livro);
	public void remover(Livro livro);
	public void atualizar(Livro livro);
	
}
