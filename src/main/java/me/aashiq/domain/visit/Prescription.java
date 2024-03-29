package me.aashiq.domain.visit;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    private String prescriptionId;
    private String medicationId;
    private String visitId;

    public Prescription(String prescriptionId, String medicationId, String visitId) {
        this.prescriptionId = prescriptionId;
        this.medicationId = medicationId;
        this.visitId = visitId;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getMedicationId() {
        return medicationId;
    }

    public void setMedicationId(String medicationId) {
        this.medicationId = medicationId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prescription that = (Prescription) o;
        return Objects.equals(prescriptionId, that.prescriptionId) &&
                Objects.equals(medicationId, that.medicationId) &&
                Objects.equals(visitId, that.visitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prescriptionId, medicationId, visitId);
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "prescriptionId='" + prescriptionId + '\'' +
                ", medicationId='" + medicationId + '\'' +
                ", visitId='" + visitId + '\'' +
                '}';
    }
}
