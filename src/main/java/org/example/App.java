package org.example;

/**
 * 視力検査の結果を伝える
 *
 */
public class App
{
    public static void main( String[] args ) {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 0.1, 0.2);
        Opthalmology doctor = new Opthalmology();
        System.out.println(doctor.medicalExam(patient));
        System.out.println(patient.toString());
    }
}