/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author jorge_j3qr4sd
 */
public class NameHandler {
    
    private String name;
    private int age;
    private int hora;
    private String nacimiento;
    
    public NameHandler() {
        name=null;
        nacimiento=null;
        hora=Integer.parseInt(DateTimeFormatter.ofPattern("H").format(LocalTime.now())); //pasar el formato de tipo fecha a tipo int de hora militar    
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        age=Period.between(LocalDate.parse(nacimiento,DateTimeFormatter.ofPattern("d-M-y")),LocalDate.now()).getYears();
        return age;
    }

    public int getHora() {
        return hora;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    
    
    
}
