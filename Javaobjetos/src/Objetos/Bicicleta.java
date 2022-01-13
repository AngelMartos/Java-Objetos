package Objetos;
import javax.swing.JOptionPane;
public class Bicicleta {

	 //Atributos	
	 int velocidadActual;
	 int platoActual;
	 int piñonActual;
	 
	//Constructor
	 public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		this.velocidadActual=velocidadActual;
		this.platoActual=platoActual;
		this.piñonActual=piñonActual;
	 }
	 //Metodos
	 public void acelerar () {
		 System.out.print("La velocidad actual es:"+velocidadActual+"Km/h");
		 velocidadActual=(velocidadActual*2);
		 System.out.print("La velocidad si aceleras sera de:"+velocidadActual+"Km/h");
		 
	}
	 public void frenar () {
		 int freno = velocidadActual/4;
		 System.out.print("La velocidad si freno será de:"+freno+"Km/h");
		 
	 }
	 public void Cambiarpiñon(int piñon) {
		 System.out.print("El piñon actual es"+piñonActual+"\n");
		 piñonActual=Integer.parseInt(JOptionPane.showInputDialog(null,"¿A "+"que numero de piñon desea cambiar?\n"));
	 }
	 public void Cambiarplato(int plato) {
		 System.out.print("El plato actual es:"+platoActual+"\n");
		 platoActual=Integer.parseInt(JOptionPane.showInputDialog(null,"¿A "+"que numero de plato desea cambiar?\n"));
		 
	 }

}
