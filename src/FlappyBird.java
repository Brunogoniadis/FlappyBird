
public class FlappyBird  implements Jogo{
	
	public double ground_offset = 0;
	public double gvx = 70;
	
	
	public String getTitulo() {
		return "Flapy Bird Genérico";
	}
	public int getLargura() {
		return 384;
	}
    public int getAltura() {
    	return 512;
    }
    public void tique(java.util.Set<String> teclas, double dt) {
    	ground_offset +=dt*gvx; 
    	ground_offset = ground_offset%308;
    	
    }
    
    
    public void tecla(String tecla) {
    	
    }
    
    public void desenhar(Tela tela) {
    	//Background
    	tela.imagem("flappy.png", 0,0,288,512,0,0,0);
    	tela.imagem("flappy.png", 0,0,288,512,0,288,0);
        //tela.imagem("flappy.png", 0,0,288,512,0,288*2,0);
    	
    	//Ground
    	tela.imagem("flappy.png", 292, 0, 308, 112, 0, -ground_offset , getAltura()-112);
    	tela.imagem("flappy.png", 292, 0, 308, 112, 0, 308 - ground_offset, getAltura()-112);
    	tela.imagem("flappy.png", 292, 0, 308, 112, 0, 308 *2 -ground_offset , getAltura()-112);
    	
    	
    }
    
    public static void main (String[]args) {
		roda();
	}
    
    private static void roda () {
    	new Motor (new FlappyBird());
    }
    
    
    
}
