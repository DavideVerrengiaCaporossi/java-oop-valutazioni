package jana60.valutazioni;

public class Studente {
	//creazione variabili
	
	int idStudente ;
	int percentualeAssenze;
	float mediaVoti;
	
	//creazione costruttore
	public Studente(int idStudente, int percentualeAssenze, float mediaVoti) {
		super();
		this.idStudente = idStudente;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti= mediaVoti;
	}
/*public void calcolaPromozione ( ) {
	if(percentualeAssenze > 50) {
		System.out.println("bocciato") ;
	   }		
		else if (percentualeAssenze > 25 && percentualeAssenze < 50 && mediaVoti > 2 ) {
			
		System.out.println("promosso");
		}
		else if (percentualeAssenze < 25 && mediaVoti >= 2) {
			System.out.println("promosso");
	          } */
	/*- se lo studente ha fatto più del 50% di assenze è bocciato
	- se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2
	- se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2*/
          //creazione metodo con valore boolean
	boolean isPromosso ( ) {
		boolean isPromosso ;
		if(percentualeAssenze > 50) {
			isPromosso = false;			
		}
		else if (percentualeAssenze >= 25  && mediaVoti > 2) {
			isPromosso = true ;
		}
		else if (percentualeAssenze < 25 && percentualeAssenze < 50 && mediaVoti >= 2) {
			isPromosso = true;
		}
		else{
			isPromosso = false;
		}
		
		return isPromosso;
	}
	
     }

