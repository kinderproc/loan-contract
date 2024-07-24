package com.algon.loan.contract;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class BaseMessage {

    private UUID correlationId;
}
