package com.algon.loan.contract.request;

import com.algon.loan.contract.BaseMessage;
import com.algon.loan.contract.dto.Company;

import java.math.BigDecimal;


public class CreateTrancheRequest extends BaseMessage {
    Company principal;
    Company beneficiary;
    BigDecimal totalAmount;
}
