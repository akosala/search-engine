package searchengine.servlets;
import com.infoshareacademy.searchengine.Main;
import searchengine.dao.UsersRepositoryDaoBean;
import searchengine.domain.User;

import  javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/hello-servlet")
public class HelloServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("Adam");
/*

        UsersRepositoryDaoBean dao = new UsersRepositoryDaoBean();
        List<User> list = dao.getUsersList();

        for (int i = 0; i < list.size(); i++) {
            writer.println(list.get(i).getId());
            writer.println(list.get(i).getName());
            writer.println(list.get(i).getSurname());
            writer.println(list.get(i).getAge());
            writer.println(list.get(i).getLogin());
            writer.println("______________________");

        }
*/

    }
}
