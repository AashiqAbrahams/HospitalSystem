package me.aashiq.factory.hospital;

import me.aashiq.domain.hospital.Ward;
import me.aashiq.helper.IDGenerator;

public class WardFactory {

    public static Ward getWard(String wardSize) {
        return new Ward.WardBuilder()
                .wardId(IDGenerator.generateId())
                .wardSize(wardSize)
                .build();
    }



}
