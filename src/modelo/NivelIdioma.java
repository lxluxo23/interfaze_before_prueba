
package modelo;

public class NivelIdioma {
    private idioma idiomas;
    private Nivel nivelIdioma; 
    
    
    public idioma getidioma(){
        return idiomas;
    }
    
    public void setIdioma (idioma idioma,Nivel nivelIdioma){
        
        this.idiomas= idioma;
        this.nivelIdioma = nivelIdioma;
    }

}
