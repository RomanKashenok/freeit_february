package info.freeit;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(urlPatterns = {"/welcome", "/index", "/main"})
public class WelcomeServlet extends HttpServlet {

    private String welcomePageCode = "<html>\n" +
            "<body>\n" +
            "<marquee><h1>Hello %s</h1></marquee>\n" +
            "</body>\n" +
            "</html>";

    @Override
    public void init() throws ServletException {
        System.out.println("************************************ init");
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("************************************ doGet");
        request.getServletContext().getInitParameter("test");

        final String name = request.getParameter("name");
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.entrySet().forEach(System.out::println);
        System.out.println(parameterMap);
        String result = String.format(welcomePageCode, !StringUtils.isEmpty(name) ? name : "USER!");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("************************************ doPost");

        PrintWriter out = response.getWriter();
        out.println("<marquee><h1>ПРивет из WelcomeServlet, method doPost()</h1></marquee>");
        out.close();
    }

    @Override
    public void destroy() {
        System.out.println("************************************* destroy");
        super.destroy();
    }
}
