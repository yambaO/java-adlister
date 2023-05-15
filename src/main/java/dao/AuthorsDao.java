package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Author;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorsDao implements Authors {

    private Connection connection;

    public AuthorsDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException sqlx){
            throw new RuntimeException("Error connecting to db", sqlx);
        }
    }

    @Override
    public List<Author> all() {
        List<Author> authors = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM authors");
            while (resultSet.next()) {
                Author author = new Author(
                        resultSet.getLong("id"),
                        resultSet.getString("name")
                );
                authors.add(author);
            }
        } catch (SQLException sqlx){
            throw new RuntimeException("error connecting to db", sqlx);
        }
        return authors;
    }

    @Override
    public Author getOneAuthor(int id) {
        return null;
    }


    @Override
    public void insert(Author author) {

    }
}
