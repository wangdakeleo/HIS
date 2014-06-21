package hdvon.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hdvon.dao.AccountMapper;
import hdvon.model.Account;
import hdvon.service.AccountServiceI;

@Service("accountService")
public class AccountServiceImpl implements AccountServiceI {
	private AccountMapper accountMapper;

	public AccountMapper getAccountMapper() {
		return accountMapper;
	}

	@Autowired
	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

	public Account getAccountById(int id) {
		return accountMapper.selectByPrimaryKey(id);
	}

	public List<Account> getAll() {
		
		return accountMapper.getAll();
	}

}
