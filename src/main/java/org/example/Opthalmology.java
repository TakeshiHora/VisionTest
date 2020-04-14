package org.example;

public class Opthalmology extends Hospital {
    @Override
    public String medicalExam(Patient p){
        if (p.getRightEye() <= 0.2){
            return p.getName() + "さんは視力は0.2以下です";
        }
        else {
            return "視力0.2以下では無いです";
        }
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
