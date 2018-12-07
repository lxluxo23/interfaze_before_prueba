package modelo;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    
    private List <NivelIdioma> idiomas;
    
    public Persona (){
        this.crear();
        
    } 

    private void crear() {
        this.idiomas = new ArrayList<NivelIdioma>();
    }
    
    public void agregarIdioma(Idioma idioma , Nivel nivel){
        
        
        
    }
    
}
