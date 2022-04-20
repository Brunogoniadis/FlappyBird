
public class FlappyBird  implements Jogo{
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
    	
    }
    
    
    public void tecla(String tecla) {
    	
    }
    
    public void desenhar(Tela tela) {
    	tela.imagem("flappy.png", 0,0,288,512,0,0,0);
    	tela.imagem("flappy.png", 0,0,288,512,0,288,0);
    }
    
    public static void main (String[]args) {
		roda();
	}
    
    private static void roda () {
    	new Motor (new FlappyBird());
    }
    
    
    
}
