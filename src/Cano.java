
public class Cano {
	
	public double x,y;
	
	public double vxcano = FlappyBird.gvx;
	public static int HOLESIZE = 100;
	
	
	public Cano(double x, double y,double vx) {
		this.x = x;
		this.y = y;
		this.vxcano = vx;
		
		}	
	
	public void atualiza (double dt) {
		
	}
	
	public void desenha(Tela t) {
		
		
		t.imagem("flappy.png", 604, 0, 52, 270, 0, x, y-270); //cano de cima
		
		t.imagem("flappy.png", 660, 0, 52, 242, 0, x, y+HOLESIZE); //cano de baixo
	}
	
	
	
}
