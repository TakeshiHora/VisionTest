package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OpthalmologyTest {
    
    @Before
    public void setUp() throws Exception {
        Opthalmology doctor = new Opthalmology();
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    /*分岐網羅でのテストケース*/
    @Test
    public void trueTrueMedicalExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 0.1, 0.1);
        Opthalmology doctor = new Opthalmology();
        assertEquals("裕司さんは視力は0.2未満です", doctor.medicalExam(patient));
    }
    @Test
    public void trueFalseMedicalExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 0.1, 1.0);
        Opthalmology doctor = new Opthalmology();
        assertEquals("裕司さんは視力は0.2未満です", doctor.medicalExam(patient));
    }
    @Test
    public void falseTrueMedicalExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 1.1, 0.1);
        Opthalmology doctor = new Opthalmology();
        assertEquals("裕司さんは視力は0.2未満です", doctor.medicalExam(patient));
    }
    @Test
    public void falseFalseMedicalExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 0.5, 0.5);
        Opthalmology doctor = new Opthalmology();
        assertEquals("視力0.2以上です", doctor.medicalExam(patient));
    }
    /*マイナス値が入っていないかテスト*/
    @Test
    public void leftMinusMedicalExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, -0.1, 0.5);
        Opthalmology doctor = new Opthalmology();
        assertEquals("マイナス値は測定出来ません", doctor.medicalExam(patient));
    }
    @Test
    public void RightMinusMedicalExamTest() {
        Patient patient = new Patient("裕司", 19601001,
                165.5,80.0, 1.5, -0.5);
        Opthalmology doctor = new Opthalmology();
        assertEquals("マイナス値は測定出来ません", doctor.medicalExam(patient));
    }
    
}