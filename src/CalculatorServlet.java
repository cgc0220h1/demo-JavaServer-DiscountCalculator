import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * @project demo-JavaServer-DiscountCalculator
 * @author Duc on 5/13/2020
 */
@WebServlet(name = "ABC", urlPatterns = "/result")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String productName = request.getParameter("name");
        Double input = Double.parseDouble(request.getParameter("input"));
        Double rate = Double.parseDouble(request.getParameter("rate"));

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<p>Giá discount cho sản phẩm: " + productName + " là</p>");
        printWriter.println(input * rate / 100);
        printWriter.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
