
package modelo;


public class Baraja {
    
    private palo palo;
    
    public Baraja (palo palo){
        this.palo= palo;
        
    }
    
    public String getNombrePALO (){
        
        
        String nombre ="";
        switch(palo){
            case PICAS:
                nombre= palo.getNombre();
        }
        
     return nombre;   
    }  
}
