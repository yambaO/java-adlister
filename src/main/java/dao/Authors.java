package dao;

import java.util.List;
import models.Author;

public interface Authors {
    List<Author> all();
    Author getOneAuthor(int id);
    void insert(Author author);
}
