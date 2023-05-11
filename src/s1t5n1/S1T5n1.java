package s1t5n1;

import java.io.*;

public class S1T5n1 {

	public static void main(String[] args) {
		//Exercici 1
		
		FileManager tractamnet1 = new FileManager(new File("Carpeta Exemple"));
		tractamnet1.ordenarILlistar();
		/*
		//serialitzar i desserialitzar
		try {
		ObjectOutputStream escrivint_fitxer = new ObjectOutputStream(new FileOutputStream(/*path del fitxer));
		escrivint_fitxer.writeObject(/*el que vulgui serialitzar; array o el que sigui);
		escrivint_fitxer.close();
		ObjectInputStream recuperant_fitxer = new ObjectInputStream(new FileInputStream(/*el path d'on està el que vols recuperar));
		aquí crear variable que emmagatzemi info del tipus q sigui (array etc.) i fer casteing a aquest del recuperant_fitxer.readObject pq és un OBject()
		recuperant_fitxer.close();
		}catch(Exception e) {
			
		}
		*/
	}

}
