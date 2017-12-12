import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
//        String user = (String)request.getAttribute("user");
//        String pass = (String)request.getAttribute("pass");
//        
        HttpSession  hs = request.getSession();
        String user = (String)hs.getAttribute("user");
        String pass = (String)hs.getAttribute("pass");
        PrintWriter pw = response.getWriter();
        pw.println(user+" : "+pass);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }
}
