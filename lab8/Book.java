package lab8;

import java.util.*;
public class Book {
	private static Map<String, Book> bookstore	// armazenamento: responsabilidade extra
	= new HashMap<String, Book>();
	private String isbn;	// responsabilidade central:
	private String title;	// variaveis de instancia de book
	private String author;
	public Collection<Book> findAllBooks() {	// mais armazenamento
		return bookstore.values();	// responsabilidade extra
	}
	public Book findBookByIsbn(String isbn) {	// mais armazenamento
		return bookstore.get(isbn);
	}
	public void create() {
		bookstore.put(isbn, this);
	}
	public void delete() {	// ainda mais armazenamento
		bookstore.remove(isbn);
	}
	public void update() {	// permanence em armazenamento
			// sem operacoes – para base de dados em memoria,
			// atualiza automaticamente em tempo real
	}
	// getters e setters omitidos
}
