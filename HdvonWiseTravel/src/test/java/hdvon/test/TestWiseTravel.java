package hdvon.test;

import java.util.List;

import org.apache.log4j.Logger;

import hdvon.model.Account;
import hdvon.service.AccountServiceI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mybatis.xml" })
public class TestWiseTravel {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(TestWiseTravel.class);

	private AccountServiceI accountService;

	public AccountServiceI getAccountService() {
		return accountService;
	}

	@Autowired
	public void setAccountService(AccountServiceI accountService) {
		this.accountService = accountService;
	}

	/*
	 * 所有测试方法前执行初始化操作
	 */
	@Test
	public void test1() {
		Account account = accountService.getAccountById(0);
		logger.info(JSON.toJSONStringWithDateFormat(account, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test2() {
		List<Account> list=accountService.getAll();
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}

}
