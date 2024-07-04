package com.bank.accounts.functions;

import com.bank.accounts.service.IAccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AccountsFunctions {

    private static final Logger log = LoggerFactory.getLogger(AccountsFunctions.class);

    private IAccountsService iAccountsService;

    @Bean
    public Consumer<Long> updateCommunication(IAccountsService iAccountsService) {
        return accountNumber -> {
            log.info("Updating Communication status for the account number: " + accountNumber.toString());
            iAccountsService.updateCommunicationStatus(accountNumber);
        };
    }

}
