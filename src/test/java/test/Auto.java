package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	int cantidadAsientos(){
		int num=0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i]!= null) {
				num+=1;
			}
			}
		return num;
				}
	String verificarIntegridad() {
		int num=0;
	if (this.registro == motor.registro) {
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i]!= null) {
				if (asientos[i].registro!=motor.registro) {
					num+=1;
				}
			}
			}
	}
	if (num==0) {
		return "Auto original";
	}else {
		return "Las piezas no son originales";
	}
	}

}
