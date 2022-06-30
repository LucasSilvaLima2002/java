package aula07;

public class CampeaoTeste {
	public static void main(String[] args) {
		
		Campeao  c[] = new Campeao[16];
		
		c[1] = new Campeao("Draven","Atirador","Bot");
		c[2] = new Campeao("Zilean", "Suporte", "Bot");
		c[3] = new Campeao("Gragas", "Lutador", "Selva");
		c[4] = new Campeao("Darius" , "Lutador", "Topo");
		c[5] = new Campeao("Sett" , "Lutador", "Topo");
		c[6] = new Campeao("Riven", "Lutador", "Topo");
		c[7] = new Campeao("Taric", "Suporte", "Bot");
		c[8] = new Campeao("Swain", "Suporte", "Bot");
		c[9] = new Campeao("Vayne","Atirador","Bot");
		c[10] = new Campeao("Jhin","Atirador","Bot");
		c[11] = new Campeao("Rammus", "Tanque", "Selva");
		c[12] = new Campeao("Vladmir", "Mago","Mid");
		c[13] = new Campeao("Veigar","Mago","Mid");
		c[14] = new Campeao("Viktor","Mago","Mid");
		c[15] = new Campeao("Zac", "Tanque", "Selva");
		
		for(int i=1;i<16;i++) {
			System.out.println("Esse é o campeão numero " + i);
			c[i].apresentar();
		}
			Fight m = new Fight();
			
			m.marcarLuta(c[7], c[8]);
			m.lutar();
		
		
		
		
		
				
		
	}

}
