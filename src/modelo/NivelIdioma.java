
package modelo;

public class NivelIdioma {
    private Idioma idiomas;
    private Nivel nivelIdioma; 
    
    
    public Idioma getidioma(){
        return idiomas;
    }
    
    public void setIdioma (Idioma idioma,Nivel nivelIdioma){
        
        this.idiomas= idioma;
        this.nivelIdioma = nivelIdioma;
    }

}
