package searchengine.servlets;

import searchengine.dao.UsersRepositoryDao;
import searchengine.dao.UsersRepositoryDaoBean;
import searchengine.domain.User;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/find-user-by-id")
public class FindUserByIdServlet extends  HelloServlet  {
    @EJB UsersRepositoryDao dao;// zamiast new
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("id")==null){ resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);return;}
        //UsersRepositoryDao dao =new UsersRepositoryDaoBean();


        List<User> list =dao.getUsersList();

        PrintWriter writer = resp.getWriter();
        String id = req.getParameter("id");
        User user = dao.getUserById(Integer.valueOf(id));


        if(user==null){ resp.setStatus(HttpServletResponse.SC_NOT_FOUND);return;}
        resp.setContentType("text/html;charset=UTF-8");
        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("Imie z bazy dla numeru :   " +id+"    "+ user.getName() + "   "+user.getSurname()+"  "+ user.getLogin()+"<br/>");
        writer.println("</body>");
        writer.println("</html>");


    }

}
