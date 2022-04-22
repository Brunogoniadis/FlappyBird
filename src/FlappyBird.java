import java.util.Set;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird  implements Jogo{
	
	public double ground_offset = 0;
	public static double gvx = 70;
	public Passaro passaro ;
	public ArrayList<Cano> canos = new ArrayList<Cano>();
	public Random gerador = new Random();
	public Timer timer_cano;
	
	
	public FlappyBird() {
		passaro = new Passaro(35,180);
		timer_cano = new Timer(2, true, addCano());

	}
	
	private Acao addCano() {
		return new Acao() {
			public void executa() {
				canos.add(new Cano(getAltura()-200, gerador.nextInt(getAltura() - 112-Cano.HOLESIZE ) ,-gvx));
			}
		};
	}
	
	public String getTitulo() {
		return "Flapy Bird Genérico";
	}
	
	public int getLargura() {
		return 248 ;
	}
	
    public int getAltura() {
    	return 512;
    }
    
    public void tecla(String tecla) {
    	if(tecla.equals(" ")) {
    		passaro.flap();
    	}
    }
    
    
    public void tique(java.util.Set<String> teclas, double dt) {
    	ground_offset +=dt*gvx; 
    	ground_offset = ground_offset%308;
    	
    	timer_cano.tique(dt);
    	
    	passaro.atualiza(dt);
    	
    	for(Cano cano : canos) {
    		cano.atualiza(dt);
    	}
    	
    }
    
    public void desenhar(Tela t) {
    	//Background
    	t.imagem("flappy.png", 0,0,288,512,0,0,0);
    	t.imagem("flappy.png", 0,0,288,512,0,288,0);
        //tela.imagem("flappy.png", 0,0,288,512,0,288*2,0);
    	
    	//Cano
    	for(Cano cano: canos) {
    		cano.desenha(t);
    	}
    	
    	//Ground
    	t.imagem("flappy.png", 292, 0, 308, 112, 0, -ground_offset , getAltura()-112);
    	t.imagem("flappy.png", 292, 0, 308, 112, 0, 308 - ground_offset, getAltura()-112);
    	t.imagem("flappy.png", 292, 0, 308, 112, 0, 308 *2 -ground_offset , getAltura()-112);
    	
    
    	
    	
    	//Passaro
    	passaro.desenhar(t);
    	
    	
    }
    
    public static void main (String[]args) {
		roda();
	}
    
    private static void roda () {
    	new Motor (new FlappyBird());
    }
    
    
    
}
