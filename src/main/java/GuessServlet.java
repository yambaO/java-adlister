import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Random random = new Random();
        int randomNumber = random.nextInt(3) + 1;

        int guess = Integer.parseInt(request.getParameter("guess"));

        String destination;
        if(guess > 3 || guess < 1) destination = "/guess";
        else if(guess == randomNumber) destination = "/correct";
        else destination = "/incorrect";

        response.sendRedirect(destination);
    }

}
