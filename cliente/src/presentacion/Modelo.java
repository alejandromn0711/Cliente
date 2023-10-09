package presentacion;

import java.io.IOException;
import logica.Cliente;

public class Modelo {

    private Cliente appCliente;
    
    public Modelo() {
    }

    public Cliente getAppCliente() {
        if(appCliente == null){
            appCliente = new Cliente();
        }
        return appCliente;
    }
    
    
    public void iniciar(){
        
        try {
            getAppCliente().conectar();
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
