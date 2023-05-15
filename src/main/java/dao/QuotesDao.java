package dao;

import com.mysql.cj.jdbc.Driver;
import config.Config;
import models.Author;
import models.Quote;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuotesDao implements Quotes {

    private Connection connection;

    public QuotesDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Quote> all() {
        // Get a reference to the authors Data Access Object
        // so I can retrieve the list of authors
        Authors authorsDao = new AuthorsDao();
        // retrieve all the authors in the database
        // Store the list in a List called authors
        List<Author> authors = authorsDao.all();
        // Then I create a list to store the quotes
        List<Quote> quotes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // retrieve all the quotes from the database
            ResultSet resultSet = statement.executeQuery("SELECT * FROM quotes");
            // I start looping over the quotes I retrieved from the db
            while (resultSet.next()){
                // For each quote, I get the author id
                int author_id = resultSet.getInt("author_id");
                // I create a an Author object that will hold the author information corresponding to the author id
                Author quoteAuthor = null;
                // I loop over the list of all the authors
                for (Author author : authors){
                    // If I find a match between the author ids, I set the value of the author object
                    if (author.getId() == author_id){
                        quoteAuthor = author;
                    }
                }
                // In the constructor, I add the Author object
                Quote quote = new Quote(
                        resultSet.getLong("id"),
                        resultSet.getString("content"),
                        quoteAuthor
                );
                quotes.add(quote);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return quotes;
    }

    @Override
    public void insert(Quote quote) {

    }
}
