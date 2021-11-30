import java.util.Arrays;

/**
 * Regra de negócio
 * 1 <= A quantidade de cartas que deve ser <= 104    qtdcartas 
 * 1 <= Indicadores de cartas que devem existir >= 105  cartas
 * 
 * Regra de trocas 
 * Se existir um elemento igual dentro do deck é possível realizar a troca
 * Ao tentar realizar a troca precisa verificar se a carta já existe no baralho
 * Caso não, troca. 
 */

/**
 * Cartas
 */
public class Cartas {

  public static void main(String[] args) {

    GerarDeck alice_deck = new GerarDeck(); 
    GerarDeck betty_deck = new GerarDeck();

    int contador ;

    System.out.println("Deck alice: " + Arrays.toString(alice_deck.cartas));
    System.out.println('\n' + "Deck betty: " + Arrays.toString(betty_deck.cartas));
    


    if (alice_deck.qtdcartasd > betty_deck.qtdcartasd) {
      for (int i = 0; i < alice_deck.cartas.length - 1; i++) {
        if ((alice_deck.cartas[i] == alice_deck.cartas[i + 1])) {
         for (int j = 0; j < betty_deck.cartas.length - 1;j++ ) {
            contador = 0;
            if (alice_deck.cartas[contador] != betty_deck.cartas[j]) {              
               for (int k = 0; k <= alice_deck.qtdcartasd ; k++) {
                 if (betty_deck.cartas[j] == alice_deck.cartas[contador]){
                  //procura outro i
                  k = 200;
                  
                 }else{
                  //quero que passe por todo o array e verifique se existe
                  //se passar por todo o array n achar ngm igual troca
                  
                  if (contador == alice_deck.tamanhodeck - 1 ) {
                    int aux = alice_deck.cartas[i];
                    alice_deck.cartas[i] = betty_deck.cartas[j];
                    betty_deck.cartas[j] = aux;
                    System.out.println("Deck alterado! '\n' Deck Alice: " + Arrays.toString(alice_deck.cartas) );
                    System.out.println("Deck alterado! '\n' Deck Betty: " + Arrays.toString(betty_deck.cartas) );
                    i++;
                  }
                  contador++;
                  
                 }
               
                                       
              
             }
            

            }else{
              System.out.println("Alice já possui esta carta. Vamos tentar outra.");
              i++;
            }
          }

         } 
         
        }
      }
    } 
  
  
  }



