/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2023-08-30 07:58:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/D:/springworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/wave-books/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/admin/goods/../include/aside.jsp", Long.valueOf(1692867924206L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1689218882561L));
    _jspx_dependants.put("/WEB-INF/views/admin/goods/../include/footer.jsp", Long.valueOf(1693374183467L));
    _jspx_dependants.put("/WEB-INF/views/admin/goods/../include/nav.jsp", Long.valueOf(1692690541439L));
    _jspx_dependants.put("/WEB-INF/views/admin/goods/../include/header.jsp", Long.valueOf(1693381842627L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Wave_Books Admin</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"/resources/ckeditor/ckeditor.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	div#asideandcontent { display: flex; }\r\n");
      out.write("	\r\n");
      out.write("	div#container_box { width: 850px; margin: 10px 30px 0 30px; }\r\n");
      out.write("	div#container_box h2 { padding: 10px; }\r\n");
      out.write("	div.inputArea { margin: 10px; }\r\n");
      out.write("	div.inputArea label { padding-right: 10px; }\r\n");
      out.write("	div.inputArea label#firstCategory { margin-right: 7px; }\r\n");
      out.write("	div.inputArea label#secondCategory { margin-left: 15px; }\r\n");
      out.write("	div.inputArea label#input_gdsName { margin-right: 15px; }\r\n");
      out.write("	\r\n");
      out.write("	.select_img { margin: 10px 0; }\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div id=\"root\">\r\n");
      out.write("		<header id=\"header\">\r\n");
      out.write("			<div id=\"header_box\">\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("    <meta name=\"description\" content=\"\" />\r\n");
      out.write("    <meta name=\"author\" content=\"\" />\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/jquery/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("     <!-- Favicon-->\r\n");
      out.write("     <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("	<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("    <link href=\"/resources/css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("	<link href=\"/resources/bootstrap/sb-admin-2.css\" rel=\"stylesheet\" /> \r\n");
      out.write("    <link href=\"/resources/bootstrap/sb-admin-2.min.css\" rel=\"stylesheet\" /> \r\n");
      out.write("    \r\n");
      out.write("    <link href=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("	<!-- Header - set the background image for the header in the line below-->\r\n");
      out.write("	<header class=\"py-5 bg-image-full\" style=\"background-image: url('/resources/images/img5.jpg'); width:2000px, 1000px;\">\r\n");
      out.write("		<div class=\"text-center my-5\">\r\n");
      out.write("            <img class=\"img-fluid rounded-circle mb-4\" src=\"/resources/images/logo5.JPG\" style=\"width:270px;\" alt=\"...\" />\r\n");
      out.write("            <h1 class=\"text-white fs-3 fw-bolder title\"><a href=\"/\">Wave-Books</a></h1>\r\n");
      out.write("            <p class=\"text-white-50 mb-0\">Landing Page Template</p>\r\n");
      out.write("            \r\n");
      out.write("				<!-- 검색창 -->  				\r\n");
      out.write("				          \r\n");
      out.write("            	<div id=\"search_box\" class=\"container-fluid\">\r\n");
      out.write("					<form name=\"search-form\" autocomplete=\"off\" \r\n");
      out.write("					class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<select name=type class=\" form-control bg-light border-0 small\" style=\"width: 60px!important;\">\r\n");
      out.write("								<option selected value=\"gdsName\">제목</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							\r\n");
      out.write("							<input type=\"text\" name=\"keyword\" value=\"\" \r\n");
      out.write("							class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\r\n");
      out.write("					              aria-label=\"Search\" aria-describedby=\"basic-addon2\" style=\"width: 190px!important;\"/>\r\n");
      out.write("				         \r\n");
      out.write("				             \r\n");
      out.write("					        <div class=\"input-group-append\">      \r\n");
      out.write("							<input type=\"button\" onClick=\"getSearchList()\" class=\"btn btn-primary\" value=\"검색\" />\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>	\r\n");
      out.write("						\r\n");
      out.write("						<script>\r\n");
      out.write("							function getSearchList(){\r\n");
      out.write("								\r\n");
      out.write("								$('#searchResult').css({\r\n");
      out.write("									\"display\": \"block\"\r\n");
      out.write("								}); \r\n");
      out.write("								\r\n");
      out.write("								$.ajax({\r\n");
      out.write("									type: 'GET',\r\n");
      out.write("									url : \"/shop/getSearchList\",\r\n");
      out.write("									data : $(\"form[name=search-form]\").serialize(),\r\n");
      out.write("									success : function(result){\r\n");
      out.write("										console.log(result);\r\n");
      out.write("										//테이블 초기화\r\n");
      out.write("										$('#boardtable > tbody').empty();\r\n");
      out.write("										if(result.length>=1){\r\n");
      out.write("											result.forEach(function(item){\r\n");
      out.write("												str='<tr>'\r\n");
      out.write("												str += \"<td>\" + item.gdsNum + \"</td>\";\r\n");
      out.write("												str+=\"<td>\" + item.gdsName + \"</td>\";\r\n");
      out.write("												str+=\"<td>\" + item.gdsPrice + \"원\" + \"</td>\";\r\n");
      out.write("												str+=\"<td>\" + item.gdsStock + \"개\" + \"</td>\";\r\n");
      out.write("												str+=\"</tr>\"\r\n");
      out.write("												$('#boardtable').append(str);\r\n");
      out.write("							        		})				 \r\n");
      out.write("										}\r\n");
      out.write("									}\r\n");
      out.write("								})\r\n");
      out.write("							}\r\n");
      out.write("						</script>\r\n");
      out.write("						\r\n");
      out.write("					</form>\r\n");
      out.write("					\r\n");
      out.write("					<div id=\"searchResult\" class=\"card shadow mb-4\" style=\"margin: 20px auto; \r\n");
      out.write("							max-width: 600px; display: none;\">\r\n");
      out.write("						<div class=\"card-header py-3\">\r\n");
      out.write("							<h6 class=\"m-0 font-weight-bold text-primary\"> 검색 내역</h6>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"table-responsive\">\r\n");
      out.write("					\r\n");
      out.write("								<table id=\"boardtable\" class=\"table table-bordered\" style=\"width:100%; cellspacing: 0;\">\r\n");
      out.write("								\r\n");
      out.write("								</table>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>	                      \r\n");
      out.write("        </div>\r\n");
      out.write("    </header>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap core JavaScript -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core plugin JavaScript -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom scripts for all pages -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level plugins -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level custom scripts -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("        <!-- Page level plugins -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level custom scripts -->\r\n");
      out.write("    <script src=\"/resources/startbootstrap-sb-admin-2-gh-pages/js/demo/datatables-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>				\r\n");
      out.write("		</header>\r\n");
      out.write("		\r\n");
      out.write("		<nav id=\"nav\">\r\n");
      out.write("			<div id=\"nav_box\">\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- Responsive navbar-->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"/\">Wave_Books</a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("                    \r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("                        \r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("       </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		\r\n");
      out.write("		<div id=\"asideandcontent\">\r\n");
      out.write("			<aside>\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("	 <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("	 \r\n");
      out.write("	 	<div class=\"sidebar-brand-text mx-3\">\r\n");
      out.write("    		<h3 style=\"padding: 20px 0; color: #fff; text-align: center;\">Category AD</h3>\r\n");
      out.write("    	</div>\r\n");
      out.write("    	\r\n");
      out.write("    	<!-- Divider -->\r\n");
      out.write("        <hr class=\"sidebar-divider\" >\r\n");
      out.write("	 \r\n");
      out.write("		<li class=\"nav-item\">\r\n");
      out.write("			<a class=\"nav-link\" href=\"/admin/goods/register\">\r\n");
      out.write("				<span style=\"padding-left: 50px; font-size: 18px;\">상품 등록</span>\r\n");
      out.write("			</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("		<!-- Divider -->\r\n");
      out.write("       	<hr class=\"sidebar-divider\">\r\n");
      out.write("		\r\n");
      out.write("		<li class=\"nav-item\">\r\n");
      out.write("			<a class=\"nav-link\" href=\"/admin/goods/list\">\r\n");
      out.write("				<span style=\"padding-left: 50px; font-size: 18px;\">상품 목록</span>\r\n");
      out.write("			</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("		<!-- Divider -->\r\n");
      out.write("        <hr class=\"sidebar-divider\">\r\n");
      out.write("		\r\n");
      out.write("		<li class=\"nav-item\">\r\n");
      out.write("			<a class=\"nav-link\" href=\"/admin/shop/orderList\">\r\n");
      out.write("				<span style=\"padding-left: 50px; font-size: 18px;\">주문 목록</span>\r\n");
      out.write("			</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("		<!-- Divider -->\r\n");
      out.write("        <hr class=\"sidebar-divider\">\r\n");
      out.write("		\r\n");
      out.write("		<li class=\"nav-item\">\r\n");
      out.write("			<a class=\"nav-link\" href=\"/admin/shop/allReply\">\r\n");
      out.write("				<span style=\"padding-left: 50px; font-size: 18px;\">상품 소감</span>\r\n");
      out.write("			</a>\r\n");
      out.write("		</li>\r\n");
      out.write("		\r\n");
      out.write("	 </ul>\r\n");
      out.write("\r\n");
      out.write("			</aside>\r\n");
      out.write("			\r\n");
      out.write("			<div id=\"container_box\">\r\n");
      out.write("				<h2>상품 등록</h2>\r\n");
      out.write("				\r\n");
      out.write("				<form role=\"form\" method=\"post\" autocomplete=\"off\" enctype=\"multipart/form-data\">\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<label id=\"firstCategory\">1차분류</label>\r\n");
      out.write("					<select class=\"category1\">\r\n");
      out.write("						<option value=\"\">전체</option>\r\n");
      out.write("					</select>\r\n");
      out.write("					\r\n");
      out.write("					<label id=\"secondCategory\">2차분류</label>\r\n");
      out.write("					<select class=\"category2\" name=\"cateCode\">\r\n");
      out.write("						<option value=\"\">전체</option>\r\n");
      out.write("					</select>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<label for=\"gdsName\" id=\"input_gdsName\">상품명</label>\r\n");
      out.write("					<input type=\"text\" id=\"gdsName\" name=\"gdsName\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<label for=\"gdsPrice\">상품가격</label>\r\n");
      out.write("					<input type=\"text\" id=\"gdsPrice\" name=\"gdsPrice\" />\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<label for=\"gdsStock\">상품수량</label>\r\n");
      out.write("					<input type=\"text\" id=\"gdsStock\" name=\"gdsStock\" />\r\n");
      out.write("				</div>				\r\n");
      out.write("\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<label for=\"gdsDes\">상품소개</label>\r\n");
      out.write("					<textarea rows=\"5\" cols=\"50\" id=\"gdsDes\" name=\"gdsDes\"></textarea>\r\n");
      out.write("					\r\n");
      out.write("					<script>\r\n");
      out.write("					   var ckeditor_config = {\r\n");
      out.write("					     resize_enaleb : false,\r\n");
      out.write("					     enterMode : CKEDITOR.ENTER_BR,\r\n");
      out.write("					     shiftEnterMode : CKEDITOR.ENTER_P,\r\n");
      out.write("					     filebrowserUploadUrl : \"/admin/goods/ckUpload\"\r\n");
      out.write("					   };\r\n");
      out.write("					   \r\n");
      out.write("					   CKEDITOR.replace(\"gdsDes\", ckeditor_config);\r\n");
      out.write("					</script>\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<label for=\"gdsImg\">이미지</label>\r\n");
      out.write("					<input type=\"file\" id=\"gdsImg\" name=\"file\" />\r\n");
      out.write("					<div class=\"select_img\"><img src=\"\" /></div>\r\n");
      out.write("					\r\n");
      out.write("					<script>\r\n");
      out.write("						$(\"#gdsImg\").change(function() {\r\n");
      out.write("							if(this.files && this.files[0]) {\r\n");
      out.write("								var reader = new FileReader;\r\n");
      out.write("								//console.log(\"파일변경\")\r\n");
      out.write("								reader.onload = function(data) {\r\n");
      out.write("									$(\".select_img img\").attr(\"src\", data.target.result).width(500);\r\n");
      out.write("								}\r\n");
      out.write("								reader.readAsDataURL(this.files[0]);\r\n");
      out.write("							}\r\n");
      out.write("						});\r\n");
      out.write("					</script>\r\n");
      out.write("					\r\n");
      out.write("					");
      out.print(request.getRealPath("/") );
      out.write("\r\n");
      out.write("					\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"inputArea\">\r\n");
      out.write("					<button type=\"submit\" id=\"register_Btn\" class=\"btn btn-primary\">등록</button>\r\n");
      out.write("				</div>\r\n");
      out.write("						\r\n");
      out.write("				</form>\r\n");
      out.write("				\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		\r\n");
      out.write("		<footer id=\"footer\">\r\n");
      out.write("			<div id=\"footer_box\">\r\n");
      out.write("				");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<style>\r\n");
      out.write("	#footer_ul li { list-style: none; padding-right: 50px!important; }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("	<!-- Footer-->\r\n");
      out.write("    <footer class=\"py-5 bg-dark\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        	<p class=\"m-0 text-center text-white\">Copyright &copy; Your Website 2023</p>\r\n");
      out.write("        	<ul class=\"m-0 text-center text-white\" id=\"footer_ul\">\r\n");
      out.write("				<li>사이트 소개</li>\r\n");
      out.write("				<li>이용약관</li>\r\n");
      out.write("				<li>wave-books</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("    \r\n");
      out.write("	<!-- Bootstrap core JS-->\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<!-- Core theme JS-->\r\n");
      out.write("	<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</footer>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		// 컨트롤러에서 데이터 받기 \r\n");
      out.write("		var jsonData = JSON.parse('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${category}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("');\r\n");
      out.write("		console.log(jsonData);\r\n");
      out.write("		\r\n");
      out.write("		var cate1Arr = new Array();\r\n");
      out.write("		var cate1Obj = new Object();\r\n");
      out.write("		\r\n");
      out.write("		// 1차 분류 셀렉트 박스에 삽입할 데이터 준비 \r\n");
      out.write("		for(var i=0; i < jsonData.length; i++) {\r\n");
      out.write("			\r\n");
      out.write("			if(jsonData[i].level == \"1\") {\r\n");
      out.write("				cate1Obj = new Object();	// 초기화\r\n");
      out.write("				\r\n");
      out.write("				cate1Obj.cateCode = jsonData[i].cateCode;\r\n");
      out.write("				cate1Obj.cateName = jsonData[i].cateName;\r\n");
      out.write("				\r\n");
      out.write("				cate1Arr.push(cate1Obj);\r\n");
      out.write("			}\r\n");
      out.write("		} \r\n");
      out.write("		\r\n");
      out.write("		// 1차 분류 셀렉트 박스에 데이터 삽입 \r\n");
      out.write("		var cate1Select = $(\"select.category1\")\r\n");
      out.write("		\r\n");
      out.write("		for(var i=0; i < cate1Arr.length; i++) {\r\n");
      out.write("			cate1Select.append(\"<option value='\" + cate1Arr[i].cateCode + \"'>\"\r\n");
      out.write("								+ cate1Arr[i].cateName + \"</option>\");\r\n");
      out.write("		}\r\n");
      out.write("		\r\n");
      out.write("		$(document).on(\"change\", \"select.category1\", function(){\r\n");
      out.write("\r\n");
      out.write("			 var cate2Arr = new Array();\r\n");
      out.write("			 var cate2Obj = new Object();\r\n");
      out.write("			 \r\n");
      out.write("			 // 2차 분류 셀렉트 박스에 삽입할 데이터 준비\r\n");
      out.write("			 for(var i = 0; i < jsonData.length; i++) {\r\n");
      out.write("			  \r\n");
      out.write("			  if(jsonData[i].level == \"2\") {\r\n");
      out.write("			   cate2Obj = new Object();  //초기화\r\n");
      out.write("			   cate2Obj.cateCode = jsonData[i].cateCode;\r\n");
      out.write("			   cate2Obj.cateName = jsonData[i].cateName;\r\n");
      out.write("			   cate2Obj.cateCodeRef = jsonData[i].cateCodeRef;\r\n");
      out.write("			   \r\n");
      out.write("			   cate2Arr.push(cate2Obj);\r\n");
      out.write("			  }\r\n");
      out.write("			 }\r\n");
      out.write("			 \r\n");
      out.write("			 var cate2Select = $(\"select.category2\");\r\n");
      out.write("			 \r\n");
      out.write("			 /*\r\n");
      out.write("			 for(var i = 0; i < cate2Arr.length; i++) {\r\n");
      out.write("			   cate2Select.append(\"<option value='\" + cate2Arr[i].cateCode + \"'>\"\r\n");
      out.write("			        + cate2Arr[i].cateName + \"</option>\");\r\n");
      out.write("			 }\r\n");
      out.write("			 */\r\n");
      out.write("			 \r\n");
      out.write("			 cate2Select.children().remove();\r\n");
      out.write("\r\n");
      out.write("			 $(\"option:selected\", this).each(function(){\r\n");
      out.write("			  \r\n");
      out.write("			  var selectVal = $(this).val();  \r\n");
      out.write("			  \r\n");
      out.write("			  cate2Select.append(\"<option value='\"+ selectVal +\"'>전체</option>\");\r\n");
      out.write("			  \r\n");
      out.write("			  for(var i = 0; i < cate2Arr.length; i++) {\r\n");
      out.write("			   if(selectVal == cate2Arr[i].cateCodeRef) {\r\n");
      out.write("			    cate2Select.append(\"<option value='\" + cate2Arr[i].cateCode + \"'>\"\r\n");
      out.write("			         + cate2Arr[i].cateName + \"</option>\");\r\n");
      out.write("			   }\r\n");
      out.write("			  }\r\n");
      out.write("			  \r\n");
      out.write("			 });\r\n");
      out.write("			 \r\n");
      out.write("			});\r\n");
      out.write("				\r\n");
      out.write("	</script>	\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		var regExp = /[^0-9]/gi;\r\n");
      out.write("		\r\n");
      out.write("		$(\"#gdsPrice\").keyup(function(){ numCheck($(this)); });\r\n");
      out.write("		$(\"#gdsStock\").keyup(function(){ numCheck($(this)); });\r\n");
      out.write("		\r\n");
      out.write("		function numCheck(selector) {\r\n");
      out.write("		   var tempVal = selector.val();\r\n");
      out.write("		   selector.val(tempVal.replace(regExp, \"\"));\r\n");
      out.write("		}\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/admin/goods/../include/nav.jsp(14,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("	\r\n");
          out.write("                    <li class=\"nav-item\"><a class=\"nav-link active\" aria-current=\"page\" href=\"/\">Home</a></li>\r\n");
          out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"/\">일반 화면</a></li>\r\n");
          out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"/member/signout\">Logout</a></li>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
