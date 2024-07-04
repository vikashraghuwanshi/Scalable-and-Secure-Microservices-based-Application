package com.bank.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the Bank Acccount",
            example = "1034548392"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    private Long accountNumber;


    @Schema(
            description = "Account Type of the bank Account",
            example = "Savings"
    )
    @NotEmpty(message = "Account Number can not be null or empty")
    private String accountType;


    @Schema(
            description = "Branch Address of the Bank",
            example = "ABC, India"
    )
    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;
}
