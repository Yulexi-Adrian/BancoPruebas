/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TipoCuentas;

/**
 *
 * @author I7
 */
public class CuentaCorriente extends BancoAbstrac {
    private double deposito;
    private double retiro;
    private double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double deposito, double retiro, double saldo, int clienteid, String nombre, String apellido, String tipocuenta, double monto) {
        super(clienteid, nombre, apellido, tipocuenta, monto);
        this.deposito = deposito;
        this.retiro = retiro;
        this.saldo = saldo;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("El saldo de la cuenta es : " +this.getSaldo());
  
    }   
}
