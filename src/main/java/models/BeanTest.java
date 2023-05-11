package models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) throws JsonProcessingException {
        Album album1 = new Album(1L,"AC/DC", "Black in Black", 1980, 294.00, "Hard rock" );
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(album1));


        Author author1 = new Author("Winston ", "Churchill");
        Author author2 = new Author("Philip", "Sidney");
        Author author3 = new Author("Walt", "Disney");


        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(authors));
        Quote quote1 = new Quote(1,"If you're going through hell, keep going", author1);
        Quote quote2 = new Quote(2,"Either I will find a way, or I will make one.",author2);
        Quote quote3 = new Quote(2,"All our dreams can come true, if we have the courage to pursue them.",author3);

        ArrayList<Quote> quotes = new ArrayList<>(Arrays.asList(quote1, quote2, quote3));
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(quotes));



    }
}
