import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crust = req.getParameter("crust-type");
        String sauce = req.getParameter("sauce-type");
        String size = req.getParameter("size");
        String [] toppings = req.getParameterValues("topping");
        String address = req.getParameter("address");

        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(size);
        for(String topping : toppings){
            System.out.println(topping);
        }
        System.out.println(address);

    }
}
