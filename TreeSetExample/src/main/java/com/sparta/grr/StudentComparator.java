package com.sparta.grr;

import java.util.Comparator;
import java.util.Objects;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int scoreDifference = student1.getScore() - student2.getScore();
        int idDifference = student1.getId() - student2.getId();

        if(Objects.equals(student1.getId(), student2.getId()))
        {
            return 0;
        }
        else if(scoreDifference != 0)
        {
            return scoreDifference;
        } else{
            return idDifference;
        }
    }

}
