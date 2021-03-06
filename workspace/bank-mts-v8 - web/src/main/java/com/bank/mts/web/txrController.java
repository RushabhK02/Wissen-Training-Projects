package com.bank.mts.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.bank.mts.service.TxrService;

@WebServlet(urlPatterns= {"/txr"})
public class txrController extends HttpServlet {
	private TxrService txrService;
	
	@Override
	public void init() throws ServletException {
		ApplicationContext applicationContext = null;
		applicationContext = (ApplicationContext) WebApplicationContextUtils.getRequiredWebApplicationContext(getServletConfig().getServletContext());
		this.txrService = applicationContext.getBean("txrService", TxrService.class);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fromAccNum = req.getParameter("fromAccNum");
		String toAccNum = req.getParameter("toAccNum");
		String amount = req.getParameter("amount");

		txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);
		resp.sendRedirect("txr-status.jsp");
		}
	
	
}
