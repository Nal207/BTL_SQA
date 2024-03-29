package org.apache.jsp.img;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giaNuoc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("<title>Bootstrap Table with Add and Delete Row Feature</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body {\n");
      out.write("    color: #404E67;\n");
      out.write("    background: #F5F7FA;\n");
      out.write("    font-family: 'Open Sans', sans-serif;\n");
      out.write("}\n");
      out.write(".table-wrapper {\n");
      out.write("    width: 700px;\n");
      out.write("    margin: 30px auto;\n");
      out.write("    background: #fff;\n");
      out.write("    padding: 20px;\t\n");
      out.write("    box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("}\n");
      out.write(".table-title {\n");
      out.write("    padding-bottom: 10px;\n");
      out.write("    margin: 0 0 10px;\n");
      out.write("}\n");
      out.write(".table-title h2 {\n");
      out.write("    margin: 6px 0 0;\n");
      out.write("    font-size: 22px;\n");
      out.write("}\n");
      out.write(".table-title .add-new {\n");
      out.write("    float: right;\n");
      out.write("    height: 30px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 12px;\n");
      out.write("    text-shadow: none;\n");
      out.write("    min-width: 100px;\n");
      out.write("    border-radius: 50px;\n");
      out.write("    line-height: 13px;\n");
      out.write("}\n");
      out.write(".table-title .add-new i {\n");
      out.write("    margin-right: 4px;\n");
      out.write("}\n");
      out.write("table.table {\n");
      out.write("    table-layout: fixed;\n");
      out.write("}\n");
      out.write("table.table tr th, table.table tr td {\n");
      out.write("    border-color: #e9e9e9;\n");
      out.write("}\n");
      out.write("table.table th i {\n");
      out.write("    font-size: 13px;\n");
      out.write("    margin: 0 5px;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("table.table th:last-child {\n");
      out.write("    width: 100px;\n");
      out.write("}\n");
      out.write("table.table td a {\n");
      out.write("    cursor: pointer;\n");
      out.write("    display: inline-block;\n");
      out.write("    margin: 0 5px;\n");
      out.write("    min-width: 24px;\n");
      out.write("}    \n");
      out.write("table.table td a.add {\n");
      out.write("    color: #27C46B;\n");
      out.write("}\n");
      out.write("table.table td a.edit {\n");
      out.write("    color: #FFC107;\n");
      out.write("}\n");
      out.write("table.table td  a.delete {\n");
      out.write("    color: #E34724;\n");
      out.write("}\n");
      out.write("table.table td i {\n");
      out.write("    font-size: 19px;\n");
      out.write("}\n");
      out.write("table.table td a.add i {\n");
      out.write("    font-size: 24px;\n");
      out.write("    margin-right: -1px;\n");
      out.write("    position: relative;\n");
      out.write("    top: 3px;\n");
      out.write("}    \n");
      out.write("table.table .form-control {\n");
      out.write("    height: 32px;\n");
      out.write("    line-height: 32px;\n");
      out.write("    box-shadow: none;\n");
      out.write("    border-radius: 2px;\n");
      out.write("}\n");
      out.write("table.table .form-control.error {\n");
      out.write("    border-color: #f50000;\n");
      out.write("}\n");
      out.write("table.table td .add {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("\t$('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\tvar actions = $(\"table td:last-child\").html();\n");
      out.write("\t// Append table with add row form on add new button click\n");
      out.write("    $(\".add-new\").click(function(){\n");
      out.write("\t\t$(this).attr(\"disabled\", \"disabled\");\n");
      out.write("\t\tvar index = $(\"table tbody tr:last-child\").index();\n");
      out.write("        var row = '<tr>' +\n");
      out.write("            '<td><input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\"></td>' +\n");
      out.write("            '<td><input type=\"text\" class=\"form-control\" name=\"department\" id=\"department\"></td>' +\n");
      out.write("            '<td><input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\"></td>' +\n");
      out.write("\t\t\t'<td>' + actions + '</td>' +\n");
      out.write("        '</tr>';\n");
      out.write("    \t$(\"table\").append(row);\t\t\n");
      out.write("\t\t$(\"table tbody tr\").eq(index + 1).find(\".add, .edit\").toggle();\n");
      out.write("        $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("    });\n");
      out.write("\t// Add row on add button click\n");
      out.write("\t$(document).on(\"click\", \".add\", function(){\n");
      out.write("\t\tvar empty = false;\n");
      out.write("\t\tvar input = $(this).parents(\"tr\").find('input[type=\"text\"]');\n");
      out.write("        input.each(function(){\n");
      out.write("\t\t\tif(!$(this).val()){\n");
      out.write("\t\t\t\t$(this).addClass(\"error\");\n");
      out.write("\t\t\t\tempty = true;\n");
      out.write("\t\t\t} else{\n");
      out.write("                $(this).removeClass(\"error\");\n");
      out.write("            }\n");
      out.write("\t\t});\n");
      out.write("\t\t$(this).parents(\"tr\").find(\".error\").first().focus();\n");
      out.write("\t\tif(!empty){\n");
      out.write("\t\t\tinput.each(function(){\n");
      out.write("\t\t\t\t$(this).parent(\"td\").html($(this).val());\n");
      out.write("\t\t\t});\t\t\t\n");
      out.write("\t\t\t$(this).parents(\"tr\").find(\".add, .edit\").toggle();\n");
      out.write("\t\t\t$(\".add-new\").removeAttr(\"disabled\");\n");
      out.write("\t\t}\t\t\n");
      out.write("    });\n");
      out.write("\t// Edit row on edit button click\n");
      out.write("\t$(document).on(\"click\", \".edit\", function(){\t\t\n");
      out.write("        $(this).parents(\"tr\").find(\"td:not(:last-child)\").each(function(){\n");
      out.write("\t\t\t$(this).html('<input type=\"text\" class=\"form-control\" value=\"' + $(this).text() + '\">');\n");
      out.write("\t\t});\t\t\n");
      out.write("\t\t$(this).parents(\"tr\").find(\".add, .edit\").toggle();\n");
      out.write("\t\t$(\".add-new\").attr(\"disabled\", \"disabled\");\n");
      out.write("    });\n");
      out.write("\t// Delete row on delete button click\n");
      out.write("\t$(document).on(\"click\", \".delete\", function(){\n");
      out.write("        $(this).parents(\"tr\").remove();\n");
      out.write("\t\t$(\".add-new\").removeAttr(\"disabled\");\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container-lg\">\n");
      out.write("    <div class=\"table-responsive\">\n");
      out.write("        <div class=\"table-wrapper\">\n");
      out.write("            <div class=\"table-title\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-8\"><h2>Employee <b>Details</b></h2></div>\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-info add-new\"><i class=\"fa fa-plus\"></i> Add New</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>Department</th>\n");
      out.write("                        <th>Phone</th>\n");
      out.write("                        <th>Actions</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>John Doe</td>\n");
      out.write("                        <td>Administration</td>\n");
      out.write("                        <td>(171) 555-2222</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\n");
      out.write("                            <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                            <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Peter Parker</td>\n");
      out.write("                        <td>Customer Service</td>\n");
      out.write("                        <td>(313) 555-5735</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\n");
      out.write("                            <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                            <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Fran Wilson</td>\n");
      out.write("                        <td>Human Resources</td>\n");
      out.write("                        <td>(503) 555-9931</td>\n");
      out.write("                        <td>\n");
      out.write("                            <a class=\"add\" title=\"Add\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE03B;</i></a>\n");
      out.write("                            <a class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE254;</i></a>\n");
      out.write("                            <a class=\"delete\" title=\"Delete\" data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>      \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>     \n");
      out.write("</body>\n");
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
