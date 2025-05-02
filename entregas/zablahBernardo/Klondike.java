package zablahBernardo;

public class Klondike {
    private Baraja baraja;
    private Descarte descarte;

    private int NUMERO_PALOS = 0;

    public Klondike(){
        baraja = new Baraja();
        descarte = new Descarte();
    }

    public void jugar() {
        boolean estaJugando = true;
        while (estaJugando) {
            Menu menu = new Menu();
            menu.imprimeOpciones();
            mostrarTapete();
        }
    }
    
    private void mostrarTapete(){
        Console console = new Console();
        baraja.mostrar();
        descarte.mostrar();
        //for(int) dos fors que no me acuerdo que eran
    }

    private void imprimeOpciones(){

    }
}
