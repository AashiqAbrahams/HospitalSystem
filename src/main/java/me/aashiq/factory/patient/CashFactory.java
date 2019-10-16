package me.aashiq.factory.patient;

import me.aashiq.domain.patient.Cash;
import me.aashiq.helper.IDGenerator;

public class CashFactory {

    public static Cash getCash(double cashAmount, String paymentDatre) {
        return (Cash) new Cash.CashBuilder()
                .cashAmount(cashAmount)
                .paymentDate(paymentDatre)
                .accountId(IDGenerator.generateId())
                .build();

    }

}
