package View;
import java.util.*;
import Model.*;
public class Interfaccia {
	     Scanner s=new Scanner(System.in);
         public void menu() {
        	 System.out.println("1)Crea Persona");
        	 System.out.println("2)Crea Dipendente");
        	 System.out.println("3)Crea Manager");
        	 System.out.println("4)Crea Dirigente");
        	 System.out.println("5)Fine del Programma");
         }
         public String leggiStringa(String s1) {
        	 System.out.print(s1);
        	 return s.nextLine();
         }
         public int leggiIntero(String s2) {
             System.out.print(s2);
             boolean flag;
             int num=0;
       	  do {
       		  flag=false;
       	  try {
       	    num=Integer.parseInt(s.nextLine());
       	  }
       	  catch(NumberFormatException e){
       		  System.out.println("Inserire un numero");
      		      flag=true;
             }
       	  }while(flag);
       	  
       	  return num;
         }
         public double leggiDouble(String s3) {
             System.out.print(s3);
             boolean flag;
             double num1=0;
             do {
          		  flag=false;
          	  try {
          	    num1=Double.parseDouble(s.nextLine());
          	  }
          	  catch(NumberFormatException e){
          		  System.out.println("Inserire un numero");
         		      flag=true;
                }
          	  }while(flag);
          	  
          	  return num1;
         }
         public void fineProgramma() {
        	 System.out.println("Fine Programma");
         }
         public void arrivederci() {
        	 System.out.println("Arrivederci");
         }
    //INSERIMENTO
         public void mascheraInserimento(Persona p) {
        	 if(p instanceof Dirigente) {
        		 Dirigente other=(Dirigente) p;
        		 other.setNome(leggiStringa("Insersci nome: "));
   	             other.setCognome(leggiStringa("Insersci cognome: "));
   	             other.setEta(leggiIntero("Insersci eta: "));
   	             other.setID(leggiIntero("Inserisci l'id:"));
   	             other.setRuolo(leggiStringa("Inserisci ruolo:"));
   	             other.setTitoloStudio(leggiStringa("Inserisci titolo di Studio:"));
   	             other.setStipendio(leggiDouble("Inserisci stipendio:"));
   	             other.setAreaResponsabilità(leggiStringa("Inserisci Area di responsabilità:"));
                 other.setLivelloFunzionale(leggiStringa("Inserisci livello funzionale:"));
        	 }
        	 else if(p instanceof Manager) {
        		  Manager other=(Manager) p;
        		     other.setNome(leggiStringa("Insersci nome: "));
    	             other.setCognome(leggiStringa("Insersci cognome: "));
    	             other.setEta(leggiIntero("Insersci eta: "));
    	             other.setID(leggiIntero("Inserisci l'id:"));
    	             other.setRuolo(leggiStringa("Inserisci ruolo:"));
    	             other.setTitoloStudio(leggiStringa("Inserisci titolo di Studio:"));
    	             other.setStipendio(leggiDouble("Inserisci stipendio:"));
    	             other.setAreaResponsabilità(leggiStringa("Inserisci Area di responsabilità:"));
        	 }
        	 else if(p instanceof Dipendente) {
        		 Dipendente other=(Dipendente) p;
        		 other.setNome(leggiStringa("Insersci nome: "));
	             other.setCognome(leggiStringa("Insersci cognome: "));
	             other.setEta(leggiIntero("Insersci eta: "));
	             other.setID(leggiIntero("Inserisci l'id:"));
	             other.setRuolo(leggiStringa("Inserisci ruolo:"));
	             other.setTitoloStudio(leggiStringa("Inserisci titolo di Studio:"));
	             other.setStipendio(leggiDouble("Inserisci stipendio:"));
        	 }
        	 else if(p instanceof Persona) {
        		 
        		 p.setNome(leggiStringa("Insersci nome: "));
	             p.setCognome(leggiStringa("Insersci cognome: "));
	             p.setEta(leggiIntero("Insersci eta: "));
	             p.setID(leggiIntero("Inserisci l'id:"));
        	 }
         }
     //STAMPA
         public void mascheraStampa(Persona p) {
        	 if(p instanceof Dirigente){
        		 Dirigente other=(Dirigente) p;
        	     System.out.println("Nome:"+p.getNome());
        	     System.out.println("Cognome:"+p.getCognome());
        	     System.out.println("Eta:"+p.getEta());
        	     System.out.println("ID:"+p.getID());
        	     System.out.println("Ruolo:"+(other.getRuolo()));
        	     System.out.println("Titolo di Studio:"+(other.getTitoloStudio()));
        	     System.out.println("Stipendio:"+(other.getStipendio()+"€"));
        	     System.out.println("Area :"+(other.getAreaResponsabilità()));
        	     System.out.println("Livello funzionale:"+(other.getLivelloFunzionale()));
             }
        	 else if(p instanceof Manager) {
        		 Manager other=(Manager) p;
        		 System.out.println("Nome:"+p.getNome());
        	     System.out.println("Cognome:"+p.getCognome());
        	     System.out.println("Eta:"+p.getEta());
        	     System.out.println("ID:"+p.getID());
        	     System.out.println("Ruolo:"+(other.getRuolo()));
        	     System.out.println("Titolo di Studio:"+(other.getTitoloStudio()));
        	     System.out.println("Stipendio:"+(other.getStipendio()+"€"));
        	     System.out.println("Area :"+(other.getAreaResponsabilità()));
        		 
        	 }
        	 else if(p instanceof Dipendente) {
        		 Dipendente other=(Dipendente) p;
        		 System.out.println("Nome:"+p.getNome());
        	     System.out.println("Cognome:"+p.getCognome());
        	     System.out.println("Eta:"+p.getEta());
        	     System.out.println("ID:"+p.getID());
        	     System.out.println("Ruolo:"+(other.getRuolo()));
        	     System.out.println("Titolo di Studio:"+(other.getTitoloStudio()));
        	     System.out.println("Stipendio:"+(other.getStipendio()+"€"));        	
        	 }
        	 else if(p instanceof Persona) {
        		 
        		 System.out.println("Nome:"+p.getNome());
        	     System.out.println("Cognome:"+p.getCognome());
        	     System.out.println("Eta:"+p.getEta());
        	     System.out.println("ID:"+p.getID());
        	 }
         }
  //MODIFICA
         public void modifica(Persona p) {
  //DIRIGENTE
        	 if(p instanceof Dirigente) {
        	Dirigente other=(Dirigente) p;
        //Name	
            System.out.print("Nome ["+p.getNome()+"] :");
        	String nome=leggiStringa(" nuovo nome: ") ; 
 			   if(nome.equals("")) System.out.println("Non modificato");
   			    else other.setNome(nome);
 	   //-----------------------------------------------------------------------
 	    //Surname
        	System.out.print("Cognome ["+p.getCognome()+"] :");
         	String cognome=leggiStringa(" nuovo cognome: ") ; 
  			   if(cognome.equals(""))System.out.println("Non modificato");
    		    else other.setCognome(cognome);
      //-----------------------------------------------------------------------	 
  	   //Age
  			 System.out.print("Eta ["+p.getEta()+"] :");
          	String eta=leggiStringa(" nuova eta: ") ; 
   			   if(eta.equals(""))System.out.println("Non modificato");
     		    else other.setEta(Integer.parseInt(eta));
      //-----------------------------------------------------------------------
   	    //ID
   			System.out.print("Id ["+p.getID()+"] :");
         	String id=leggiStringa(" nuovo id: ") ; 
  			   if(id.equals(""))System.out.println("Non modificato");
    		    else other.setID(Integer.parseInt(id));
      //-----------------------------------------------------------------------
  		//Rule
  			 System.out.print("Ruolo ["+other.getRuolo()+"] :");
          	String ruolo=leggiStringa(" nuovo ruolo: ") ; 
   			   if(ruolo.equals(""))System.out.println("Non modificato");
     		    else other.setRuolo(ruolo);
      //-----------------------------------------------------------------------	
   	    //Qualification
   			System.out.print("Titolo di studio ["+other.getTitoloStudio()+"] :");
         	String titolo=leggiStringa(" nuovo titolo di studio: ") ; 
  			   if(cognome.equals(""))System.out.println("Non modificato");
    		    else other.setTitoloStudio(titolo);
  	  //-----------------------------------------------------------------------	
  	    //Salary
  			 System.out.print("Stipendio ["+other.getStipendio()+"] :");
          	String stipendio=leggiStringa(" nuovo stipendio: ") ; 
   			   if(stipendio.equals(""))System.out.println("Non modificato");
     		    else other.setStipendio(Double.parseDouble(stipendio));
   	  //----------------------------------------------------------------------- 
   	    //Area of responsibility
   			System.out.print("Area responsabilità ["+other.getAreaResponsabilità()+"] :");
         	String area=leggiStringa(" nuova area: ") ; 
  			   if(area.equals(""))System.out.println("Non modificato");
    		    else other.setAreaResponsabilità(area);
  	 //-----------------------------------------------------------------------  
  		//Level
  			 System.out.print("Livello funzionale ["+other.getLivelloFunzionale()+"] :");
          	String  livello=leggiStringa(" nuovo livello: ") ; 
   			   if(livello.equals(""))System.out.println("Non modificato");
     		    else other.setLivelloFunzionale(livello);
    			   
        	 }
        
 //---------------------------------------------------------------------------------------- 
    //MANAGER
        	 else if(p instanceof Manager) {
        		  Manager other=(Manager) p;
        //Name	  
        		  System.out.print("Nome ["+p.getNome()+"] :");
              	String nome=leggiStringa(" nuovo nome: ") ; 
       			   if(nome.equals("")) System.out.println("Non modificato");
         			    else other.setNome(nome);
      //-----------------------------------------------------------------------
        //Surname
              	System.out.print("Cognome ["+p.getCognome()+"] :");
               	String cognome=leggiStringa(" nuovo cognome: ") ; 
        			   if(cognome.equals(""))System.out.println("Non modificato");
          		    else other.setCognome(cognome);
     //-----------------------------------------------------------------------
        //Age
        			 System.out.print("Eta ["+p.getEta()+"] :");
                	String eta=leggiStringa(" nuova eta: ") ; 
         			   if(eta.equals(""))System.out.println("Non modificato");
           		    else other.setEta(Integer.parseInt(eta));
     //-----------------------------------------------------------------------	
        //ID
         			System.out.print("Id ["+p.getID()+"] :");
               	String id=leggiStringa(" nuovo id: ") ; 
        			   if(id.equals(""))System.out.println("Non modificato");
          		    else other.setID(Integer.parseInt(id));
     //-----------------------------------------------------------------------	
        //Rule
        			 System.out.print("Ruolo ["+other.getRuolo()+"] :");
                	String ruolo=leggiStringa(" nuovo ruolo: ") ; 
         			   if(ruolo.equals(""))System.out.println("Non modificato");
           		    else other.setRuolo(ruolo);
     //-----------------------------------------------------------------------	
        //Qualification
         			System.out.print("Titolo di studio ["+other.getTitoloStudio()+"] :");
               	String titolo=leggiStringa(" nuovo titolo di studio: ") ; 
        			   if(cognome.equals(""))System.out.println("Non modificato");
          		    else other.setTitoloStudio(titolo);
     //-----------------------------------------------------------------------
        //Salary
        			 System.out.print("Stipendio ["+other.getStipendio()+"] :");
                	String stipendio=leggiStringa(" nuovo stipendio: ") ; 
         			   if(stipendio.equals(""))System.out.println("Non modificato");
           		    else other.setStipendio(Double.parseDouble(stipendio));
     //-----------------------------------------------------------------------	
        //Area of responsibility
         			System.out.print("Area responsabilità ["+other.getAreaResponsabilità()+"] :");
               	String area=leggiStringa(" nuova area: ") ; 
        			   if(area.equals(""))System.out.println("Non modificato");
          		    else other.setAreaResponsabilità(area);  
        	 }
 //----------------------------------------------------------------------------------------
      //DIPENDENTE
        	 else if(p instanceof Dipendente) {
        		 Dipendente other=(Dipendente) p;
          //Name	
                 System.out.print("Nome ["+p.getNome()+"] :");
             	String nome=leggiStringa(" nuovo nome: ") ; 
      			   if(nome.equals("")) System.out.println("Non modificato");
        			    else other.setNome(nome);
      	   //-----------------------------------------------------------------------
      	    //Surname
             	System.out.print("Cognome ["+p.getCognome()+"] :");
              	String cognome=leggiStringa(" nuovo cognome: ") ; 
       			   if(cognome.equals(""))System.out.println("Non modificato");
         		    else other.setCognome(cognome);
           //-----------------------------------------------------------------------	 
       	   //Age
       			 System.out.print("Eta ["+p.getEta()+"] :");
               	String eta=leggiStringa(" nuova eta: ") ; 
        			   if(eta.equals(""))System.out.println("Non modificato");
          		    else other.setEta(Integer.parseInt(eta));
           //-----------------------------------------------------------------------
        	    //ID
        			System.out.print("Id ["+p.getID()+"] :");
              	String id=leggiStringa(" nuovo id: ") ; 
       			   if(id.equals(""))System.out.println("Non modificato");
         		    else other.setID(Integer.parseInt(id));
           //-----------------------------------------------------------------------
       		//Rule
       			 System.out.print("Ruolo ["+other.getRuolo()+"] :");
               	String ruolo=leggiStringa(" nuovo ruolo: ") ; 
        			   if(ruolo.equals(""))System.out.println("Non modificato");
          		    else other.setRuolo(ruolo);
           //-----------------------------------------------------------------------	
        	    //Qualification
        			System.out.print("Titolo di studio ["+other.getTitoloStudio()+"] :");
              	String titolo=leggiStringa(" nuovo titolo di studio: ") ; 
       			   if(cognome.equals(""))System.out.println("Non modificato");
         		    else other.setTitoloStudio(titolo);
       	  //-----------------------------------------------------------------------	
       	    //Salary
       			 System.out.print("Stipendio ["+other.getStipendio()+"] :");
               	String stipendio=leggiStringa(" nuovo stipendio: ") ; 
        			   if(stipendio.equals(""))System.out.println("Non modificato");
          		    else other.setStipendio(Double.parseDouble(stipendio));
        	 }
  //-------------------------------------------------------------------------------------
     //PERSONA
        	 else if(p instanceof Persona) {
           //Name	
                 System.out.print("Nome ["+p.getNome()+"] :");
             	String nome=leggiStringa(" nuovo nome: ") ; 
      			   if(nome.equals("")) System.out.println("Non modificato");
        			    else p.setNome(nome);
      	   //-----------------------------------------------------------------------
      	    //Surname
             	System.out.print("Cognome ["+p.getCognome()+"] :");
              	String cognome=leggiStringa(" nuovo cognome: ") ; 
       			   if(cognome.equals(""))System.out.println("Non modificato");
         		    else p.setCognome(cognome);
           //-----------------------------------------------------------------------	 
       	   //Age
       			 System.out.print("Eta ["+p.getEta()+"] :");
               	String eta=leggiStringa(" nuova eta: ") ; 
        			   if(eta.equals(""))System.out.println("Non modificato");
          		    else p.setEta(Integer.parseInt(eta));
           //-----------------------------------------------------------------------
        	    //ID
        			System.out.print("Id ["+p.getID()+"] :");
              	String id=leggiStringa(" nuovo id: ") ; 
       			   if(id.equals(""))System.out.println("Non modificato");
         		    else p.setID(Integer.parseInt(id));
        	
        	 }
         }
     //CANCELLAZIONE
         public void cancella(Persona p) {
   
        	 if(p instanceof Dirigente) {
        		 Dirigente other=(Dirigente) p;
        		 other.setNome(null);
   	             other.setCognome(null);
   	             other.setEta(0);
   	             other.setID(0);
   	             other.setRuolo(null);
   	             other.setTitoloStudio(null);
   	             other.setStipendio(0);
   	             other.setAreaResponsabilità(null);
                 other.setLivelloFunzionale(null);
        	 }
       //--------------------------------------------------------------------------
        	 else if(p instanceof Manager) {
        		  Manager other=(Manager) p;
        		  other.setNome(null);
    	          other.setCognome(null);
    	          other.setEta(0);
    	          other.setID(0);
    	          other.setRuolo(null);
    	          other.setTitoloStudio(null);
    	          other.setStipendio(0);
    	          other.setAreaResponsabilità(null);
        	 }
       //--------------------------------------------------------------------------
        	 else if(p instanceof Dipendente) {
        		 Dipendente other=(Dipendente) p;
        		 other.setNome(null);
   	             other.setCognome(null);
   	             other.setEta(0);
   	             other.setID(0);
   	             other.setRuolo(null);
   	             other.setTitoloStudio(null);
   	             other.setStipendio(0);
        	 }
      //----------------------------------------------------------------------------
        	 else if(p instanceof Persona) {
        		 p.setNome(null);
   	             p.setCognome(null);
   	             p.setEta(0);
   	             p.setID(0);
        	 }
         }
         
}
