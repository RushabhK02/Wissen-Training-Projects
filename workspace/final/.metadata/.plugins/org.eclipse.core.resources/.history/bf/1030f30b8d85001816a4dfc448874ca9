package com.bank.mts.web;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.bank.mts.service.TxrService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value = "/api/product-txn")
public class TxrController {

	private TxrService txrService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext applicationContext = null;
		applicationContext = (ApplicationContext) WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		this.txrService = applicationContext.getBean("txrService", TxrService.class);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// input
		String fromAccNum = req.getParameter("fromAccNum");
		String toAccNum = req.getParameter("toAccNum");
		String amount = req.getParameter("amount");
		// process input
		txrService.txr(Double.parseDouble(amount), fromAccNum, toAccNum);
		// output
		resp.sendRedirect("txr-status.jsp");
	}

}
