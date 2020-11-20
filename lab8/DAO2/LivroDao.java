package lab8.DAO2;

import java.util.*;
public interface LivroDao {
	Collection<Livro> findAllLivros();
	Livro findLivroByIsbn(Livro livro);
	void create(Livro livro);
	void delete(Livro livro);
	void update(Livro livro);
}
