/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Koji
 */
import javax.servlet.*;
import java.util.Date;

public class DateHeaderFooterServletContext implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //time initialization
        ServletContext context = sce.getServletContext();
        Date timeNow = new Date();
        context.setAttribute("timeNow", timeNow);
        
        //header and footer initialization
        context.setAttribute("header", "header.jsp");
        context.setAttribute("footer", "footer.jsp");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
