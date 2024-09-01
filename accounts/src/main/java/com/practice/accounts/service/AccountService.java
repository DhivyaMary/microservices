package com.practice.accounts.service;

import com.practice.accounts.dto.AccountsDto;
import com.practice.accounts.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AccountService {

    public void createAccount(CustomerDto customerDto);

    CustomerDto fecthAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
