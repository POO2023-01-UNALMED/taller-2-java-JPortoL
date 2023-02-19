package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	void cambiarColor(String color) {
		switch (color){
		case "rojo": this.color = "rojo";
		break;
		case "verde": this.color = "verde";
		break;
		case "amarillo": this.color = "amarillo";
		break;
		case "negro": this.color = "negro";
		break;
		case "blanco": this.color = "blanco";
		break;
		default:;
		break;
		}
	}
}
