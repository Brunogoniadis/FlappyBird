
public class Passaro {
	public double x, y;
	public double vy;
	public static double G = 500;
	public static double FLAP = -300;
	
	
	
	public Passaro(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	public void desenhar (Tela t) {
    	t.imagem("flappy.png", 528, 128, 34, 24, 0,x,y);
	}
}
