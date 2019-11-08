package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import entidades.Circulos;
import entidades.Formas;
import entidades.Retangulos;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Formas> myShapes = new ArrayList<>();
		myShapes.add(new Retangulos(5.0, 2.0));
		myShapes.add(new Circulos(2.0));
		myShapes.add(new Circulos(6.5));
		
		List<Circulos> myCircles = new ArrayList<>();
		myCircles.add(new Circulos(2.0));
		myCircles.add(new Circulos(3.0));
		
		System.out.println("Total area of Shapes: " + String.format("%.2f",totalArea(myShapes)));
		System.out.println("Total area of Circles: " + String.format("%.2f",totalArea(myCircles)));
	}
	//Lista pode ser de Formas ou de qualquer tipo que seja um subtipo de Formas devido ao Curingas
	public static double totalArea(List<? extends Formas> list) {
		double sum = 0.0;
		for (Formas apelido : list) {
			sum = sum+ apelido.area();
		}
		return sum;
	}
}