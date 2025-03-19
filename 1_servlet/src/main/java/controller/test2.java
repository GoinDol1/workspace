package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test2
 */
@WebServlet("/test2.do")
public class test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// System.out.println("doGet");

        
        // Servlet -> DAO -> DB작업
        // * 응답 데이터의 문서형식 및 인코딩 방식 설정
//        response.setContentType("text/html; charset=UTF-8");
//        // * 응답 시 사용할 스트림 객체 (PrintWriter --> 응답 페이지를 작성)
//        PrintWriter pw = response.getWriter();
//        pw.println("<!doctype html>");
//        pw.println("<html>");
//        pw.println("<head>");
//        pw.println("<style>");
//        pw.println("span {color: red; }");
//        pw.println("</style>");
//        pw.println("</head>");
//        pw.println("<body>");
//        pw.println("<h2>응답페이지</h2>");
//        
//        pw.printf("<span>%s</span>님은", userName);
//        pw.printf("<span>%s</span>에 살고있습니다.", address);
//        
//        if(foods == null) {
//        	pw.println("좋아하는 음식이 없습니다.");
//        } else {
//        	pw.printf("<span>좋아하는 음식 %s</span>", String.join(",", foods));
//        }
//        
//        pw.println("</body>");
//        pw.println("</html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// System.out.println("doPost");		
		// doGet(request, response);
		request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String gender = request.getParameter("gender");        
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String height = request.getParameter("height");
        String[] foods = request.getParameterValues("food");

        
        System.out.println("이름 : " + userName); // 서버 콘솔상 표시
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address); 
        System.out.println("키 : " + height);        
        if(!age.isEmpty()) {
        	int ageNum = Integer.parseInt(age);
        	System.out.println("나이 --> " + ageNum);
        }
        double hightDouble = Double.parseDouble(height);        
        if (foods == null) {
        	System.out.println("좋아하는 음식이 없습니다.");
        } else
        {   // System.out.println(Arrays.toString(foods));
        	// System.out.println("좋아하는 음식 : " + String.join(",", foods));
        	for(String f : foods) System.out.print(f + ", ");
        }        		
        
        // response.setContentType("text/html;charset:UTF-8");
        // response.setCharacterEncoding("UTF-8");
        
        request.setAttribute("name", userName);
        request.setAttribute("gender", gender);
        request.setAttribute("age", age);
        request.setAttribute("addr", address);
        request.setAttribute("height", height);
        request.setAttribute("foods", foods);
        
        // 응답 페이지를 jsp에게 맡겨보자!
        
        // * jsp 페이지로 응답
        //   -> RequestDispatcher 변수명 = request.getRequestDispatcher(응답할페이지경로);
        RequestDispatcher view = request.getRequestDispatcher("views/responsePage.jsp");
        view.forward(request, response);
        
        //   -> 변수명.forward(request, response);
        
        
        

		
	}

}
