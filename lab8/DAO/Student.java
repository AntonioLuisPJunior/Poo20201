package lab8.DAO;

public class Student {
    public static void main(String[] args) {
        InMemoryBookDao dao = new InMemoryBookDao(); // dao
        Book book = new Book();
        // chamada dos setters
        dao.create(book); // dao - armazenamento
        book.setTitle("Updated");
        dao.update(book); // dao - armazenamento
        dao.delete(book); // dao - armazenamento
    }
}
