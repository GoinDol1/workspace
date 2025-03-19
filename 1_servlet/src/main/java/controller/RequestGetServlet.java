package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestGetServlet
 */
@WebServlet("/test.do")
public class RequestGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
        String userName = request.getParameter("userName");
        System.out.println("이름 : " + userName); // 서버 콘솔상 표시
        String gender = request.getParameter("gender");
        System.out.println("성별 : " + gender);
        
        String age = request.getParameter("age");
        System.out.println("나이 : " + age);
        String address = request.getParameter("address");
        System.out.println("주소 : " + address); 
        String height = request.getParameter("height");
        System.out.println("키 : " + height);
        
        if(!age.isEmpty()) {
        	int ageNum = Integer.parseInt(age);
        	System.out.println("나이 --> " + ageNum);
        }
        double hightDouble = Double.parseDouble(height);
         
        String[] foods = request.getParameterValues("food");
        
        if (foods == null) {
        	System.out.println("좋아하는 음식이 없습니다.");
        } else
        {   // System.out.println(Arrays.toString(foods));
        	System.out.println("좋아하는 음식 : " + String.join(",", foods));
        }        
        
        // Servlet -> DAO -> DB작업
        // * 응답 데이터의 문서형식 및 인코딩 방식 설정
        response.setContentType("text/html; charset=UTF-8");
        
        // * 응답 시 사용할 스트림 객체 (PrintWriter --> 응답 페이지를 작성)
        PrintWriter pw = response.getWriter();
        pw.println("<!doctype html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<style>");
        pw.println("span {color: red; }");
        pw.println("</style>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h2>응답페이지</h2>");
        
        pw.printf("<span>%s</span>님은", userName);
        pw.printf("<span>%s</span>에 살고있습니다.", address);
        
        if(foods == null) {
        	pw.println("좋아하는 음식이 없습니다.");
        } else {
        	pw.printf("<span>좋아하는 음식 %s</span>", String.join(",", foods));
        }
        
        pw.println("</body>");
        pw.println("</html>");        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
		doGet(request, response);
	}

}
