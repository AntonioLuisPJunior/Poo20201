// package lab8.DAO2;

// import java.util.*;
// public class DAOLivroEmMemoria {
// 	private static Map<String, Livro> livroStore	// armazenamento:
// 	= new HashMap<String, Livro>();		// responsabilidade central
// 	public Collection<Livro> findAllLivros() {
// 		return livroStore.values();
// 	}
// 	public Livro findLivroByIsbn(Livro livro) {
// 		return livroStore.get(Livro.getIsbn());
// 	}
// 	public void create(Livro livro) {
// 		livroStore.put(Livro.getIsbn(), livro);
// 	}
// 	public void delete(Livro livro) {
// 		livroStore.remove(Livro.getIsbn());
// 	}
// 	public void update(Livro livro) {
// 		// sem operacoes – para um banco de dados em memoria
// 		// a atualizacao acontece automaticamente em tempo real
// 	}
// }
