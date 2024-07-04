package com.bank.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example = "Vikash Raghuwanshi"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min=5, max=30, message = "The name length should be b/w 5 and 30")
    private String name;


    @Schema(
            description = "Email Address of the Customer",
            example = "vrcorpit@gmail.com"
    )
    @NotEmpty(message = "Name can not be null or empty")
    @Email(message = "Email address should be valid")
    private String email;


    @Schema(
            description = "mobile Number of the Customer",
            example = "9423456879"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;


    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountsDto;
}
