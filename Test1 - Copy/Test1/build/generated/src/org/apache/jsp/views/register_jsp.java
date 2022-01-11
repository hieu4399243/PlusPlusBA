package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Register!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"alert alert-success col\">\n");
      out.write("                        <h1>\n");
      out.write("                            DANG KY\n");
      out.write("                        </h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <section class=\"row\">\n");
      out.write("                <div class=\"col-7\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\">\n");
      out.write("                            <form action=\"RegisterSevlet\" method=\"post\">\n");
      out.write("                                <div class=\"from-group\">\n");
      out.write("                                    <label for=\"username\">\n");
      out.write("                                        Ten Dang Nhap: \n");
      out.write("                                    </label>  \n");
      out.write("                                    <input type=\"text\" id=\"username\" name=\"username\" class=\"form-control\" />\n");
      out.write("                                </div>        \n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"password\">\n");
      out.write("                                        Mat Khau: \n");
      out.write("                                    </label> \n");
      out.write("                                    <input type=\"text\" id=\"password\" class=\"form-control\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"gender\">\n");
      out.write("                                        Gioi Tinh: \n");
      out.write("                                    </label> \n");
      out.write("                                    <div class=\"form-check from-check-inline\">\n");
      out.write("                                        <input type=\"radio\" class=\"form-check-input\" id=\"genderM\" name=\"gender\" />\n");
      out.write("                                        <label for=\"genderM\">Nam</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check from-check-inline\">\n");
      out.write("                                        <input type=\"radio\" class=\"form-check-input\" id=\"genderF\" name=\"gender\" />\n");
      out.write("                                        <label for=\"genderF\">Nu</label>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"form-check\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" id=\"married\" name=\"married\" />\n");
      out.write("                                        <label for=\"married\"> Da co gia dinh chua</label>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"nationality\">\n");
      out.write("                                        Quoc Tich: \n");
      out.write("                                    </label>\n");
      out.write("                                    <select name=\"nationality\" id=\"nationality\" class=\"form-control\">\n");
      out.write("                                        <option value=\"vi\">Viet Nam</option>\n");
      out.write("                                        <option value=\"us\">My</option>\n");
      out.write("                                        <option value=\"jp\">Nhat Ban</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"favorites\">\n");
      out.write("                                        So Thich: \n");
      out.write("                                    </label>\n");
      out.write("                                    <div class=\"form-check from-check-inline\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" id=\"favorites\" name=\"favorites\" />\n");
      out.write("                                        <label for=\"favorites\">Doc Sach</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check from-check-inline\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" id=\"favorites\" name=\"favorites\" />\n");
      out.write("                                        <label for=\"favorites\">Am Nhac</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check from-check-inline\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" id=\"favorites\" name=\"favorites\" />\n");
      out.write("                                        <label for=\"favorites\">Du lich</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-check from-check-inline\">\n");
      out.write("                                        <input type=\"checkbox\" class=\"form-check-input\" id=\"favorites\" name=\"favorites\" />\n");
      out.write("                                        <label for=\"favorites\">Khac</label>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"note\">\n");
      out.write("                                        Ghi Chu\n");
      out.write("                                    </label>\n");
      out.write("                                    <textarea name=\"note\" id=\"note\" rows=\"3\" class=\"form-control\"></textarea>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <hr/>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\">Dang Ky</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-5\">\n");
      out.write("                    <h3> Thong tin da duoc dang ky </h3>   \n");
      out.write("                    <ul>\n");
      out.write("                        <li>Ten Dang Nhap: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("                       \n");
      out.write("                        <li>So thich: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${favorities}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript; choose one of the two! -->\n");
      out.write("\n");
      out.write("        <!-- Option 1: Bootstrap Bundle with Popper -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
