package PatronAdapter;
/**
 *
 * @author mdelgado
 */
public class AppAdapter {

    
private void usarMotorComun() {
    Motor motor = new MotorComun();
    motor.encender();
    motor.acelerar();
    motor.apagar();
}
 
private void usarMotorElectrico() {
    Motor motor = new MotorElectricoAdapter() ;
    motor.encender();
    motor.acelerar();
    motor.apagar();  
}
 
private void usarMotorEconomico() {
    Motor motor = new MotorEconomico();
    motor.encender();
    motor.acelerar();
    motor.apagar();  
}
public static void main(String args[]){
  System.out.println();
  AppAdapter adap= new AppAdapter();
  adap.usarMotorComun();
 }
        
}
