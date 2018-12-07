package modelo;

public enum palo {
    
    PICAS ("Picas"),
    CORAZONES ("Corazones"),
    TREBOLES ("Treboles"),
    DIAMANTES ("Diamantes");
    
    
    private final String nombre;
    
    private palo (String nombre){
        this.nombre = nombre;
        
    }
    
    public String getNombre (){
        return this.nombre;
    }
    
}
