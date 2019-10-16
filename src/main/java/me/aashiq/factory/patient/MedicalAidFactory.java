package me.aashiq.factory.patient;

import me.aashiq.domain.patient.MedicalAid;
import me.aashiq.helper.IDGenerator;

public class MedicalAidFactory {

    public static MedicalAid getMedicalAid(double balance, String payTerms, String cover, String provider) {
        return (MedicalAid) new MedicalAid.MedicalAidBuilder()
                .medicalAidNo(IDGenerator.generateId())
                .cover(cover)
                .provider(provider)
                .accountId(IDGenerator.generateId())
                .balance(balance)
                .paymentTerms(payTerms)
                .build();

    }

}
