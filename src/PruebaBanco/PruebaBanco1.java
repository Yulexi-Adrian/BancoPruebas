/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaBanco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import TipoCuentas.CuentaAhorros;
import TipoCuentas.BancoAbstrac;
import TipoCuentas.CuentaCorriente;
import TipoCuentas.Cuentajoven;

/**
 *
 * @author I7
 */
public class PruebaBanco1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaAhorros Ahorro= new CuentaAhorros();
       Ahorro.setNombre("Mariela");
        Ahorro.setApellido("Jimenez");
       Ahorro.setClienteid(123645);
       Ahorro.setTipocuenta("Cuenta de ahorros");
       Ahorro.setEstado("Activo");
        
        CuentaCorriente Corriente= new CuentaCorriente();
        Corriente.setNombre("Leticia");
        Corriente.setApellido("Leon");
       Corriente.setClienteid(456238);
       Corriente.setTipocuenta("Cuenta corriente");
       Corriente.setSaldo(2563.89);
         
        Cuentajoven AhorroJoven= new Cuentajoven();
       AhorroJoven.setNombre("Ethan");
        AhorroJoven.setApellido("Pincay");
       AhorroJoven.setMedad(14);
      AhorroJoven.setClienteid(0524);
      AhorroJoven.setTipocuenta("Cuenta de ahorros joven");
       AhorroJoven.setEstado("Activo");
        
       List<BancoAbstrac> cuentabancarias = new ArrayList<BancoAbstrac>();
       cuentabancarias.add(Ahorro);
       cuentabancarias.add(Corriente);
       cuentabancarias.add(AhorroJoven);
        
       cuentabancarias.forEach((persona) -> {
            persona.mostrar();
        });
        
        Scanner s = new Scanner(System.in);
        s.nextLine();
       
    } 
    
}
