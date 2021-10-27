/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author JULIO
 */
public  abstract class Motor  {
    
    
    private int NoSerial;
    private String Marca;

    
    public abstract double getImporteMotor();
    public abstract String getDatosTipoMotor();
    
    public Motor() {
    }

    public Motor(int NoSerial, String Marca) {
        this.NoSerial = NoSerial;
        this.Marca = Marca;
    }

    public int getNoSerial() {
        return NoSerial;
    }

    public void setNoSerial(int NoSerial) {
        this.NoSerial = NoSerial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    // retorna la  información común de los motores
    
    public  String getInfoMotor() {
        return null;
}

   
}
    
    

