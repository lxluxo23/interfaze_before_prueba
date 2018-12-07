package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persona {
    
    private Map <Idioma,Nivel> idiomas;
    
    public Persona (){
        this.crear();
        
    } 

    private void crear() {
        this.idiomas = new HashMap<Idioma,Nivel>();
    }
    
    public void agregarIdioma(Idioma idioma , Nivel nivel){
        
        idiomas.put (idioma,nivel);
        
        
        
    }
    
}
