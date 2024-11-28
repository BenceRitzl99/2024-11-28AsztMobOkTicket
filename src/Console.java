/*
* File: Console.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Refactored: Ritzl Bence, 2024-11-28
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.util.Scanner;

public class Console {

  /*
   * A be() függvény indítja a bekérést,
   * és a tárolást.
   */
  public void startApp(){
    

    
    String name = input("Bejelentő neve: ");
    String message = input("Hiba leírása:");
    
    
    Incident incident = new Incident(name, message);
   

    
    
    Store.writeIncidentToFile(incident);
    
  }

  private String input(String message) {
    System.out.println(message);
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    

    return input;
  }

}
