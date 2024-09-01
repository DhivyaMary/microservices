package com.practice.accounts.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Accounts extends BaseEntity{

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name="account_number")
    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

    @Column(name = "mobile_number")
    private String mobileNumber;
}
