package info.freeit;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class WelcomeServlet extends HttpServlet {

    private String welcomePageCode = "<html>\n" +
            "<body>\n" +
            "<marquee><h1>Hello %s</h1></marquee>\n" +
            "</body>\n" +
            "</html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        final String name = request.getParameter("name");
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.entrySet().forEach(System.out::println);
        System.out.println(parameterMap);
        String result = String.format(welcomePageCode, !StringUtils.isEmpty(name) ? name : "USER!");
        PrintWriter out = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        out.println(result);
        out.close();

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("login");
        requestDispatcher.forward(request, response);
//        requestDispatcher.include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<marquee><h1>ПРивет из WelcomeServlet, method doPost()</h1></marquee>");
        out.close();
    }
}
