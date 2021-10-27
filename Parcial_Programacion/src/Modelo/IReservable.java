/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIO
 */
public interface IReservable {
 
    
    boolean alquilarMotor(Motor m);
    Motor reservarMotor(Motor m);
    
    int getTotalMotorReservado();
    int getTotalMotorAlquilado();

    boolean getValorReserva ( );
    

}
