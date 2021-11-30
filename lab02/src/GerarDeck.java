import java.util.Random;

public class GerarDeck {
    Random rand = new Random();
    
    int qtdcartasd;
    int qtdcartas;
    int tamanhodeck;
    int[] cartas; 
  
    public GerarDeck() {
        GerarDeckcCartas(); 
    }

     public  int[] GerarDeckcCartas() {
        qtdcartasd = GerarQtdCarta();//int qtdcartas = GerarQtdCarta();
        cartas = new int[qtdcartasd];
        for (int i = 0; i < qtdcartasd; i++) {
           cartas[i] = GerarCartas();
        }
        ordenaInsertion(cartas);
        tamanhodeck = cartas.length ;
        return cartas;
     }     

     public  int GerarCartas() {        
        int carta = rand.nextInt((104 - 1 ) - 1)+1;
        return carta;
     }
  
     public  int GerarQtdCarta() {        
        qtdcartas = rand.nextInt((105 - 1 ) - 1)+1 ;
        return qtdcartas;
     }
  
     public  int[] ordenaInsertion(int[] vetor){
          
        int aux,j;
        
        for (int i=1;i<vetor.length;i++){
            aux = vetor[i];
            j=i-1;
            
            while (j>=0 && aux < vetor[j]){
                vetor[j+1] = vetor[j];
                j--;
     
            }
            vetor[j+1] = aux;
        }return vetor;
    }


    
}
