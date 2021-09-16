package megasena;
/**
*@author AriCamargos
*@version 8.0 (Sept 15, 2021)
* Colocar na tela na um volante do jogo da Mega Sena 1 até 60.
**/
public class MegaSena {
    public static void main(String[] args) {
        for(int i=1; i <=60; i++  ){
            System.out.print(i + "");
            if( i % 10 == 0 );
                System.out.println();
        }
    }
}