
package pizza.granpizza;

/**
 *
 * @author Dana
 */
public class Pizza {
    private String nombre;
      private String ingrediente; 
      
    public Pizza (String n, String i){
        this.nombre= n;
        this.ingrediente= i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
    
    @Override
    public String toString(){
        return nombre + " " + ingrediente;
    }
    
}
