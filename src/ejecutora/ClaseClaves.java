
package ejecutora;


public class ClaseClaves {
    
    private final long valorFinal;
    
    public ClaseClaves(){
        this.valorFinal = crearValor();
    }
    private long crearValor (){
        return Math.round(Math.random()*1000);
    }
}
