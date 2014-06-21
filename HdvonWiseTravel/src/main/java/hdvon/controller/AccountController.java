package hdvon.controller;

import hdvon.model.Account;
import hdvon.service.AccountServiceI;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accountController")
public class AccountController {
	private AccountServiceI accountService;

	public AccountServiceI getAccountService() {
		return accountService;
	}

	@Autowired
	public void setAccountService(AccountServiceI accountService) {
		this.accountService = accountService;
	}

//	@RequestMapping("/showAccount")
//	public String showAccount(int id, HttpServletRequest request) {
//		Account account = accountService.getAccountById(id);
//		request.setAttribute("account", account);
//		return "showAccount";
//
//	}
	
//	@RequestMapping("/showAccount/{id}")
//	public String showAccount(@PathVariable int id, HttpServletRequest request) {
//		Account account = accountService.getAccountById(id);
//		request.setAttribute("account", account);
//		return "showAccount";
//	}
	
	@RequestMapping("/{id}/showAccount")
	public String showAccount(@PathVariable int id, HttpServletRequest request) {
		Account account = accountService.getAccountById(id);
		request.setAttribute("account", account);
		return "showAccount";
	}
}