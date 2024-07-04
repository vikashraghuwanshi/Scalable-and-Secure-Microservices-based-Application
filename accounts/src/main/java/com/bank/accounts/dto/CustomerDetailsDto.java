package com.bank.accounts.dto;

import lombok.Data;

@Data
public class CustomerDetailsDto {

    CustomerDto customerDto;
    LoansDto loansDto;
    CardsDto cardsDto;

}
