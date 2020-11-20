package lab8.DAO;

import java.util.*;
public class InMemoryBookDao {
	private static Map<String, Book> bookstore	// armazenamento:
	= new HashMap<String, Book>();		// responsabilidade central
	public Collection<Book> findAllBooks() {
		return bookstore.values();
	}
	public Book findBookByIsbn(Book book) {
		return bookstore.get(book.getIsbn());
	}
	public void create(Book book) {
		bookstore.put(book.getIsbn(), book);
	}
	public void delete(Book book) {
		bookstore.remove(book.getIsbn());
	}
	public void update(Book book) {
		// sem operacoes – para um banco de dados em memoria
		// a atualizacao acontece automaticamente em tempo real
	}
}
