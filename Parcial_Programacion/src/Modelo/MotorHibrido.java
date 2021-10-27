/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIO
 */
public class MotorHibrido extends MotorElectrico {

    public MotorHibrido() {
    }

    public MotorHibrido(double NoKilobatiosPorMinuto, int NoSerial, String Marca) {
        super(NoKilobatiosPorMinuto, NoSerial, Marca);
    }

    
    
    
    
    @Override
    public String toString() {
        return "MotorHibrido{" + '}';
    }
    
    
}
