package com.memes.memes.gpacalc;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by rj29 on 12/1/16.
 */
public class GPACalc {

    ArrayList<Double> grades;
    ArrayList<Double> credits;

    public GPACalc(ArrayList<Double> arrayList) {
        grades = arrayList;
    }


    //This method will convert the grade in points of each individual to the numerical equivalent.
    public double numericalEquivalent(double pointGrade) {

        if (pointGrade >= 90)
            return 4.00;

        else if ( pointGrade >= 79.45)
            return 3.00;

        else if ( pointGrade >= 69.45)
            return 2.00;

        else if ( pointGrade >= 59.45)
            return 1.00;
        else
            return 0;
    }


    //This method will calculate the total GPA.
    public double calculateGPA() {

        ArrayList<Double> qualityPts = new ArrayList<Double>();

        for (int x = 0; x < grades.size(); x++) {

            qualityPts.add(numericalEquivalent(grades.get(x)) * credits.get(x));
        }


        double qualitySum = 0, totalCredits = 0;

        for (int x = 0; x < qualityPts.size(); x++)
            qualitySum += qualityPts.get(x);


        for (int x = 0; x < credits.size(); x++)
            totalCredits += credits.get(x);

        return qualitySum/totalCredits;





    }





}
