package org.example;

import java.util.Objects;

public class Patient {
    private String name;
    private int birthday;
    private double height;
    private double weigtht;
    private double rightEye;
    private double leftEye;
    
    public Patient(String name, int birthday, double height, double weigtht,
                   double rightEye, double leftEye){
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weigtht = weigtht;
        this.rightEye = rightEye;
        this.leftEye = leftEye;
    }
    
    public String getName(){
        return this.name;
    }
    public int getBirthday(){
        return this.birthday;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public double getWeigtht() {
        return this.weigtht;
    }
    
    public double getRightEye() {
        return this.rightEye;
    }
    
    public double getLeftEye() {
        return this.leftEye;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return getBirthday() == patient.getBirthday() &&
                Double.compare(patient.getHeight(), getHeight()) == 0 &&
                Double.compare(patient.getWeigtht(), getWeigtht()) == 0 &&
                Double.compare(patient.getRightEye(), getRightEye()) == 0 &&
                Double.compare(patient.getLeftEye(), getLeftEye()) == 0 &&
                getName().equals(patient.getName());
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBirthday(), getHeight(), getWeigtht(), getRightEye(), getLeftEye());
    }
    
    @Override
    public String toString() {
        return "名前：" + this.name + " " + "誕生日：" + this.birthday + " " + "身長：" + this.height + " " +
                "体重：" + this.weigtht + " " + "右目の視力：" + this.rightEye + " " + "左目の視力:" + this.leftEye;
    }
}
