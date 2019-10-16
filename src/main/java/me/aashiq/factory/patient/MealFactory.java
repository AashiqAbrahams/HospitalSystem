package me.aashiq.factory.patient;

import me.aashiq.domain.patient.Meal;
import me.aashiq.helper.IDGenerator;


public class MealFactory {

    public static Meal getMeal(String fName, String lName, String specialisation) {
        return (Meal) new Meal.MealBuilder()
                .mealId(IDGenerator.generateId())
                .breakfast(fName)
                .lunch(lName)
                .supper(specialisation)
                .build();
    }



}
