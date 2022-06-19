package jana60.valutazioni;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//creazione scanner per chiedere i dati dall'utente
		Scanner scan = new Scanner(System.in) ;
		
		//stampiamo la domanda
		System.out.println("QUANTI STUDENTI SONO PRESENTI IN CLASSE ?");
		
		//creiamo una variabile per far decidere la grandezza dell'arrey di studenti al utente
		int numeroStudenti = Integer.parseInt(scan.nextLine());
				
		//creo arrey di studenti
		Studente[] studenti = new Studente[numeroStudenti];
		
		// chiediamo i dati utente di studente per ogni posizione dell'arrey e creiamo un for
		
		for (int i = 0; i < studenti.length; i++) {
			//creiamo variabile idStudente che avanzera con l avanzare degli studenti
			int idStudente = i+1;
			//stampiamo l'idStudente
			System.out.println("Dati dello studente " + idStudente);
			//stampa richiesta utente
			System.out.println("Percentuali Assenze ");
			//ricezione valore inserito dall utente tramire lo scan
			int percentualeAssenze = Integer.parseInt(scan.nextLine());
			//stampa richiesta utente
			System.out.println("Media Voti ");
			//ricezione valore inserito dall utente tramire lo scan
			double mediaVoti = Double.parseDouble(scan.nextLine());
			//richiamiamo lo spazio nell'arrei con indice i per farlo avanzare con l avanzare del programma
			// chiamando il costruttore Studente e gli diciamo che al suo interno ha le varabiali prese con lo scan
			studenti[i] = new Studente(idStudente, percentualeAssenze, mediaVoti);
		}
		//creo un for per far avanzare la stampa assieme agli studenti ndll'arrey precendete 
		for (int i = 0; i < studenti.length; i++) {
			//stampo le info dello studente e poi con un if stampero se e promosso o bocciato
			System.out.println("Lo studente " + studenti[i].idStudente);
			if(studenti[i].isPromosso()) {
				System.out.println("è Promosso");
				
			}
			else {
					System.out.println("è Bocciato");
				
				}
			
		}
		
		
		scan.close();
	}

}
