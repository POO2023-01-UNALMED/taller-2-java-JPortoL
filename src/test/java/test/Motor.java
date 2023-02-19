package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	void asignarTipo(String tipo) 
	{switch (tipo){
		case "gasolina": this.tipo = "gasolina";
		break;
		case "electrico": this.tipo = "electrico";
		break;
		default:;
		break;
		};}
}
