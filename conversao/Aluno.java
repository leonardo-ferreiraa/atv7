/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversao;

/**
 *
 * @author Administrador
 */
public class Aluno {

    private String m1;
    private String m2;
    private Double media;
    
    public Aluno(String m1, String m2){
        this.m1 = m1;
        this.m2 = m2;
    }
    
    public String Getm1() {
        return m1;
    }

    public String Getm2() {
        return m2;
    }

    public Double Getmedia() {
        return media;
    }
    public void CalcularMedia() {
        media = (Double.parseDouble(m1) + Double.parseDouble(m2)) / 2;
    }

}
