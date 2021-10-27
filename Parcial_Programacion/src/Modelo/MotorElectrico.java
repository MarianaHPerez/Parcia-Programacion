/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIO
 */
public class MotorElectrico  extends Motor implements IReservable {
    
    
    private double NoKilobatiosPorMinuto;

    public MotorElectrico() {
    }

 

    public MotorElectrico(double NoKilobatiosPorMinuto, int NoSerial, String Marca) {
        super(NoSerial, Marca);
        this.NoKilobatiosPorMinuto = NoKilobatiosPorMinuto;
    }

    public double getNoKilobatiosPorMinuto() {
        return NoKilobatiosPorMinuto;
    }

    public void setNoKilobatiosPorMinuto(double NoKilobatiosPorMinuto) {
        this.NoKilobatiosPorMinuto = NoKilobatiosPorMinuto;
    }

    
    
    
    
    
    
    
    @Override
    public boolean getValorReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getImporteMotor() {
        return this.NoKilobatiosPorMinuto * 1500;
    }

    @Override
    public String getDatosTipoMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean alquilarMotor(Motor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Motor reservarMotor(Motor m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalMotorReservado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalMotorAlquilado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
