import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InitParamServlet")
public class InitParamServlet extends HttpServlet {

    private  String initParm=null;

    public  void  init(ServletConfig config) throws ServletException{
        super.init(config);
        this.initParm=config.getInitParameter("ref");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("初始化参数："+this.initParm);

        ServletContext app=super.getServletContext();
        System.out.println("真实路径:"+app.getRealPath("/"));

    }
}
