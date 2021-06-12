package info.freeit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet(name = "login", value = "/login")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("System.out.println: Wew are on login servlet!!!!");
        PrintWriter out = response.getWriter();
        out.println("Wew are on login servlet!!!!");

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("name");
        int age = (int) session.getAttribute("age");

        out.println(username);
        out.println(age);

        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));
        HttpSession session = request.getSession();
        session.setAttribute("name", username);
        session.setAttribute("age", age);

        request.setAttribute("username", username);

        request.getRequestDispatcher("/userinfo.jsp").forward(request, response);
    }
}

