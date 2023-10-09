
package logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Cliente {
    
    private Socket miServidor;
    private DataInputStream datosEntrada;
    private DataOutputStream datosSalida;
    

    public void conectar() throws IOException {
        
        String ruta = "localhost"; // "127.0.0.1"
        int puerto = 5000;
        
        
        // Paso 1: Establecer conexion
        miServidor = new Socket(ruta, puerto);
        
        // Paso 2: Capturar flujos
        datosEntrada = new DataInputStream(miServidor.getInputStream());
        datosSalida = new DataOutputStream(miServidor.getOutputStream());
        
        // Paso 3: Envio/Recepcion de datos (Se respeta la implementación del protocolo)
        datosSalida.write("Hola mundo!".getBytes());
        
        // Paso 4: Cerrar todo, cuando todo se termine
        datosEntrada.close();
        datosSalida.close();
        miServidor.close();
        
    }
    
}
