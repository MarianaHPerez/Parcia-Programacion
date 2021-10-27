/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIO
 */
public class MotorMecanico extends Motor implements IVendible {
    
    
    private double CentrimetrosCubicos;
    private String TipoDeCombustible;

    public MotorMecanico() {
    }


    public MotorMecanico(double CentrimetrosCubicos, String TipoDeCombustible, int NoSerial, String Marca) {
        super(NoSerial, Marca);
        this.CentrimetrosCubicos = CentrimetrosCubicos;
        this.TipoDeCombustible = TipoDeCombustible;
    }

    public double getCentrimetrosCubicos() {
        return CentrimetrosCubicos;
    }

    public void setCentrimetrosCubicos(double CentrimetrosCubicos) {
        this.CentrimetrosCubicos = CentrimetrosCubicos;
    }

    public String getTipoDeCombustible() {
        return TipoDeCombustible;
    }

    public void setTipoDeCombustible(String TipoDeCombustible) {
        this.TipoDeCombustible = TipoDeCombustible;
    }

    
    
    public double getValorVenta ( ){

        return 0;

}

    @Override
    public double getImporteMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDatosTipoMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}