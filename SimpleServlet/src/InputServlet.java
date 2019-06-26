import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "InputServlet")
public class InputServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("处理Post请求。。。。。");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("处理Get请求。。。。。");
        String info=request.getParameter("info");
        PrintWriter out=response.getWriter();
        out.println("<html>");
        out.println("<head><title>JackChen</title></head>");
        out.println("<body>");
        out.println("<h1>"+info+"</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
