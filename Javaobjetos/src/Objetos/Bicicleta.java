package Objetos;
import javax.swing.JOptionPane;
public class Bicicleta {

	 //Atributos	
	 int velocidadActual;
	 int platoActual;
	 int pi�onActual;
	 
	//Constructor
	 public Bicicleta(int velocidadActual, int platoActual, int pi�onActual) {
		this.velocidadActual=velocidadActual;
		this.platoActual=platoActual;
		this.pi�onActual=pi�onActual;
	 }
	 //Metodos
	 public void acelerar () {
		 System.out.print("La velocidad actual es:"+velocidadActual+"Km/h");
		 velocidadActual=(velocidadActual*2);
		 System.out.print("La velocidad si aceleras sera de:"+velocidadActual+"Km/h");
		 
	}
	 public void frenar () {
		 int freno = velocidadActual/4;
		 System.out.print("La velocidad si freno ser� de:"+freno+"Km/h");
		 
	 }
	 public void Cambiarpi�on(int pi�on) {
		 System.out.print("El pi�on actual es"+pi�onActual+"\n");
		 pi�onActual=Integer.parseInt(JOptionPane.showInputDialog(null,"�A "+"que numero de pi�on desea cambiar?\n"));
	 }
	 public void Cambiarplato(int plato) {
		 System.out.print("El plato actual es:"+platoActual+"\n");
		 platoActual=Integer.parseInt(JOptionPane.showInputDialog(null,"�A "+"que numero de plato desea cambiar?\n"));
		 
	 }

}
