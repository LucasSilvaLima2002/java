import java.util.Random;

public class teste2 {

	int a[] = new int[10];
	int i = 0;
	int j=0;
	int x = 0;
	
	public void funcao() {
		Random rand = new Random();
		for(i=0;i<10;i++) {
			a[i] = rand.nextInt(10)+1;
		if(i>=1) {
		
			switch(i){
			case 1:
		if(a[i] == a[0]) {
			while(a[i] == a[0]){
				a[i] = rand.nextInt(10)+1;
			}	
			}
			break;
		
			case 2:
		if((a[i] == a[0]) ||  (a[i] == a[1])) {
			while((a[i] == a[0]) ||  (a[i] == a[1])){
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 3:
		if((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2])) {
			while((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2])) {
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 4:
		if((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3])) {
			while((a[i] == a[0]) || (a[i] == a[1]) || (a[i] == a[2]) || (a[i] == a[3])) {
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 5:
		if((a[i] == a[0]) || (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) ||  (a[i] == a[4])) {
			while((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) ||  (a[i] == a[4])){
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 6:
		if((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2])||  (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5])) {
			while((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) || (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5])) {
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 7:
		if((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5]) ||  (a[i] == a[6])) {
			while((a[i] == a[0])|| (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5]) ||  (a[i] == a[6])) {
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 8:
		if((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) || (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5]) ||  (a[i] == a[6]) ||  (a[i] == a[7])) {
			while((a[i] == a[0]) || (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) || (a[i] == a[4]) ||  (a[i] == a[5]) ||  (a[i] == a[6]) || (a[i] == a[7])) {
				a[i] = rand.nextInt(10)+1;
		    }
			}	
			break;
			
			case 9:
		
		if((a[i] == a[0]) || (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5]) ||  (a[i] == a[6]) || (a[i] == a[7]) ||  (a[i] == a[8])) {
			while((a[i] == a[0]) ||  (a[i] == a[1])|| (a[i] == a[2]) ||  (a[i] == a[3]) ||  (a[i] == a[4]) ||  (a[i] == a[5]) ||  (a[i] == a[6]) || (a[i] == a[7]) ||  (a[i] == a[8])){
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
		
			case 10:
		if((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) ||  (a[i] == a[3]) || (a[i] == a[4]) || (a[i] == a[5]) || (a[i] == a[6]) ||  (a[i] == a[7]) ||  (a[i] == a[8]) ||  (a[i] == a[9])) {
			while((a[i] == a[0]) ||  (a[i] == a[1]) || (a[i] == a[2]) || (a[i] == a[3]) ||  (a[i] == a[4]) || (a[i] == a[5]) ||  (a[i] == a[6]) ||  (a[i] == a[7]) ||  (a[i] == a[8]) || (a[i] == a[9])){
				a[i] = rand.nextInt(10)+1;
			}
			}	
			break;
			}
		}
		}
	}
	
}

	
	
	

	
	


