import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class FirstServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        HttpSession ses = request.getSession();
        
        ses.setAttribute("user", user);
        ses.setAttribute("pass", pass);
        //        request.setAttribute("user", user);
        //        request.setAttribute("pass", pass);
        //
        //        RequestDispatcher rd = request.getRequestDispatcher("/SecondServlet");
        //        rd.forward(request, response);
        
        response.sendRedirect("SecondServlet");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
