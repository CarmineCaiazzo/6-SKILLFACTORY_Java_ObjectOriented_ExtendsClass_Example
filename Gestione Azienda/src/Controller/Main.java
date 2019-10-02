package Controller;
import Model.*;
import View.Interfaccia;
public class Main {

	public static void main(String[] args) {
	  Interfaccia v=new Interfaccia();
	  Persona p;
	  Dipendente dip;
	  Manager  m;
	  Dirigente dir;
	  String rip;
	  String rip1;
	  int scelta;
	  int scelta1;
      do {
    	  v.menu();
        scelta=v.leggiIntero("Fai una scelta da 1 a 5: ");
       switch(scelta) {
        case 1:
        	   do {
        		   p=new Persona();
        		   v.mascheraInserimento(p);
        		  do {
        		   scelta1=v.leggiIntero("Scegli tra :MODIFICA (1) |STAMPA (2)|CANCELLA (3):");
        		   switch(scelta1) {
        		    case 1: v.modifica(p);
        		     break;
        		    case 2: v.mascheraStampa(p);
        		     break;
        		    case 3: v.cancella(p);
        		     break;
        		   }
        		   rip1=v.leggiStringa("Vuoi ancora scegliere?");
        		   }while(rip1.equals("s"));
        		   rip=v.leggiStringa("Ripetere il programma?");
        	   }while(rip.equals("s"));
         break;
        case 2:
        	do {
     		   dip=new Dipendente();
     		   v.mascheraInserimento(dip);
     		  do {
     		   scelta1=v.leggiIntero("Scegli tra :MODIFICA (1) |STAMPA (2)|CANCELLA (3):");
     		   switch(scelta1) {
     		    case 1: v.modifica(dip);
     		     break;
     		    case 2: v.mascheraStampa(dip);
     		     break;
     		    case 3: v.cancella(dip);
     		     break;
     		   }
     		   rip1=v.leggiStringa("Vuoi ancora scegliere?");
     		   }while(rip1.equals("s"));
     		   rip=v.leggiStringa("Ripetere il programma?");
     	   }while(rip.equals("s"));         
        	break;
        case 3:
        	do {
     		   m=new Manager();
     		   v.mascheraInserimento(m);
     		  do {
     			scelta1=v.leggiIntero("Scegli tra :MODIFICA (1) |STAMPA (2)|CANCELLA (3):");
     		   switch(scelta1) {
     		    case 1: v.modifica(m);
     		     break;
     		    case 2: v.mascheraStampa(m);
     		     break;
     		    case 3: v.cancella(m);
     		     break;
     		   }
     		   rip1=v.leggiStringa("Vuoi ancora scegliere?");
     		   }while(rip1.equals("s"));
     		   rip=v.leggiStringa("Ripetere il programma?");
     	   }while(rip.equals("s"));
         break;
        case 4:
        	do {
     		   dir=new Dirigente();
     		   v.mascheraInserimento(dir);
     		   do {
     			scelta1=v.leggiIntero("Scegli tra :MODIFICA (1) |STAMPA (2)|CANCELLA (3):");
     		   switch(scelta1) {
     		    case 1: v.modifica(dir);
     		     break;
     		    case 2: v.mascheraStampa(dir);
     		     break;
     		    case 3: v.cancella(dir);
     		     break;
     		   }
     		   rip1=v.leggiStringa("Vuoi ancora scegliere?");
     		   }while(rip1.equals("s"));
     		   rip=v.leggiStringa("Ripetere il programma?");
     	   }while(rip.equals("s"));
         break;
        case 5: v.fineProgramma();
         break;
       }
       if(scelta !=5){
       rip=v.leggiStringa("Vuoi tornare al Menu?");
       }
       else rip="NO";
      }while(rip.equals("s") || rip.equals("S"));
      v.arrivederci();
	}

}
