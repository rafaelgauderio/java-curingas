package entidades;

public class Retangulos implements Formas {

	private double width;
	private double height;
	
	public Retangulos(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public double perimetro() {
		
		return width + width + height + height;
	}
}