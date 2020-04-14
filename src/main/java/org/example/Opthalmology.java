package org.example;

public class Opthalmology extends Hospital {
    @Override
    public String medicalExam(Patient p){
        if (p.getRightEye() < 0.2 || p.getLeftEye() < 0.2){
            return p.getName() + "さんは視力は0.2未満です";
        }
        else {
            return "視力0.2以上です";
        }
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
