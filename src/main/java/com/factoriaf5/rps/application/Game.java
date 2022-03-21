package com.factoriaf5.rps.application;

import java.util.Scanner;

import com.factoriaf5.rps.models.Factory;
import com.factoriaf5.rps.models.Jugada;

public class Game {
   
    

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Player One: Introduzca Rock, Paper o Scissors");
    String playerOneinput = input.nextLine();
    
    System.out.println("Player Two: Introduzca Rock, Paper o Scissors");
    String playerTwoinput = input.nextLine();
    input.close();
    Jugada playerOne=Factory.SacarJugada(playerOneinput);
    Jugada playerTwo=Factory.SacarJugada(playerTwoinput);
    // System.out.println(playerOne.GetPlay());
    // System.out.println(playerTwo);
    if (playerOne.GetPlay()==playerTwo.GetPlay()){
        System.out.println("Empate");
    }
    if ((playerOne.GetPlay()=="Rock") & (playerTwo.GetPlay()=="Scissors")){
        System.out.println("Gana el jugador 1");
    }
    if ((playerOne.GetPlay()=="Rock") & (playerTwo.GetPlay()=="Paper")){
        System.out.println("Gana el jugador 2");
    }
    if ((playerOne.GetPlay()=="Scissors") & (playerTwo.GetPlay()=="Paper")){
        System.out.println("Gana el jugador 1");
    }
    if ((playerOne.GetPlay()=="Scissors") & (playerTwo.GetPlay()=="Rock")){
        System.out.println("Gana el jugador 2");
    }
    if ((playerOne.GetPlay()=="Paper") & (playerTwo.GetPlay()=="Rock")){
        System.out.println("Gana el jugador 1");
    }
    if ((playerOne.GetPlay()=="Paper") & (playerTwo.GetPlay()=="Scissors")){
        System.out.println("Gana el jugador 2");
    }
}
  
}
