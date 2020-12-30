package com.waq.service;

import com.waq.domain.Account;

import java.util.List;

/**
 * 业务层接口
 */

public interface AccountService {

    // 查询所有
    List<Account> findAllAccount();
    // 查询一个
    Account findAccountById(Integer accountId);
    // 保存账户
    void saveAccount(Account account);
    // 修改账户
    void updateAccount(Account account);
    // 删除账户
    void deleteAccount(Integer accountId);

}
