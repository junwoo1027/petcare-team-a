package com.petcare.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.petcare.web.domain.Hospital;

public class HospitalLoginInterceptor extends HandlerInterceptorAdapter {

	public class AuthenticationInterceptor extends HandlerInterceptorAdapter{
		 
		
		// preHandle() : 컨트롤러보다 먼저 수행되는 메서드
	    @Override
	    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	            throws Exception {
	        // session 객체를 가져옴
	        HttpSession session = request.getSession();
	        // login처리를 담당하는 사용자 정보를 담고 있는 객체를 가져옴
	        Hospital hospitaluser = (Hospital) session.getAttribute("hospital");
	         
	        if (hospitaluser == null){
	            // 로그인이 안되어 있는 상태임으로 로그인 폼으로 다시 돌려보냄(redirect)
	            response.sendRedirect("/login");
	            return false; // 더이상 컨트롤러 요청으로 가지 않도록false로 반환함
	        }
	         
	        // preHandle의return은 컨트롤러 요청 uri로 가도 되냐 안되냐를 허가하는 의미임
	        // 따라서true로하면 컨트롤러 uri로 가게 됨.
	        return true;
	    }
	 
	    // 컨트롤러가 수행되고 화면이 보여지기 직전에 수행되는 메서드
	    @Override
	    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	            ModelAndView modelAndView) throws Exception {
	        // TODO Auto-generated method stub
	        super.postHandle(request, response, handler, modelAndView);
	    }
	}
}