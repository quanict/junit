package com.runsystem.traning.parameterized;

import java.util.ArrayList;
import java.util.List;
 import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class BetweenSupplier extends ParameterSupplier {
    @Override
    //public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
        
        Between annotation = sig.getAnnotation(Between.class);
 
        List<PotentialAssignment> list = new ArrayList<>();
        for (int i = annotation.first(); i <= annotation.last(); i++) {
            list.add(PotentialAssignment.forValue(null, i));
        }
        return list;
    }
}