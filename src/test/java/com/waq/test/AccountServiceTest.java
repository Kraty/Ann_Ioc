package com.waq.test;

import com.waq.domain.Account;
import com.waq.service.AccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AccountServiceTest {

    @Test
    public void testFindAll() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        List<Account> accounts = accountService.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    @Test
    public void testFindOne() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        Account account = accountService.findAccountById(1);
        System.out.println(account);

    }

    @Test
    public void testSave() {

        Account account = new Account();
        account.setName("test");
        account.setMoney(123f);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.saveAccount(account);

    }

    @Test
    public void testUpdate() {

        Account account = new Account();
        account.setId(4);
        account.setName("test");
        account.setMoney(1233f);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.updateAccount(account);

    }

    @Test
    public void testDelete() {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.deleteAccount(6);

    }

}
