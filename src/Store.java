/*
* File: Store.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Refactored: Ritzl Bence, 2024-11-28
* Group: oktat
* Date: 2024-11-27
* Github: https://github.com/oktat/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;

public class Store {

  public static void writeIncidentToFile(Incident incident) {
    try {
      tryWriteIncidentToFile(incident);
    } catch (Exception e) {
      System.err.println("Hiba!");
      System.err.println(e.getMessage());
    }
  }
  

  public static void tryWriteIncidentToFile(Incident incident) throws IOException {
    FileWriter fw = new FileWriter("incidents.txt");
    fw.write(incident.name + ":" + incident.message + "\n");
    fw.close();
  }
}
