package uk.co.aegon.aipdoc.dao;

import java.util.List;

import uk.co.aegon.aipdoc.model.Book;

public interface BookDao {
	long save(Book book);

	Book get(long id);

	List<Book> list();

	void update(long id, Book book);

	void delete(long id);
}
