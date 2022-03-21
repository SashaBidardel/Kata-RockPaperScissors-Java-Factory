package com.factoriaf5.rps.models;

public class Factory {
    
    public static  Jugada SacarJugada(String name){
        Jugada jugada= null;
        if (name.equals("Rock")){
           jugada= new Rock();
       }
       if (name.equals("Paper")){
        jugada= new Paper();
       }
       if (name.equals("Scissors")){
        jugada=  new Scissors();
       }
    return jugada;
       

}
}
