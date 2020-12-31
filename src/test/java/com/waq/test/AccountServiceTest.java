package com.waq.test;

import com.waq.domain.Account;
import com.waq.service.AccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用Junit单元测试
 * spring整合Junit的配置
 * 1、导入spring整合Junit的jar
 * 2、使用Junit提供的注释替换原有的main方法
 * 3、告知spring的运行器，是基于注解还是xml，并说明位置
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll() {

        List<Account> accounts = accountService.findAllAccount();
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    @Test
    public void testFindOne() {

        Account account = accountService.findAccountById(1);
        System.out.println(account);

    }

    @Test
    public void testSave() {

        Account account = new Account();
        account.setName("test");
        account.setMoney(123f);
        accountService.saveAccount(account);

    }

    @Test
    public void testUpdate() {

        Account account = new Account();
        account.setId(4);
        account.setName("test");
        account.setMoney(1233f);
        accountService.updateAccount(account);

    }

    @Test
    public void testDelete() {
        accountService.deleteAccount(6);
    }

}
