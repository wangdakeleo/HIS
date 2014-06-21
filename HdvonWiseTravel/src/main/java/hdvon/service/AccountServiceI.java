package hdvon.service;

import hdvon.model.Account;

import java.util.List;

public interface AccountServiceI {

	public Account getAccountById(int id);

	public List<Account> getAll();
}
