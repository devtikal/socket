package tikal.socket;


import java.io.DataOutputStream;
import java.io.IOException;


public class Cliente extends Conexion
{
    public Cliente() throws IOException{super("cliente");} //Se usa el constructor para cliente de Conexion

    public void startClient() //Método para iniciar el cliente
    {
        try
        {
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(cs.getOutputStream());

          
                salidaServidor.writeUTF("^|¡0023<CR><LF>^|¡015<CR><LF>^|¡02PPPPP-<CR><LF>^|¡03JJJ<CR><LF>^|¡04G<CR><LF>^|¡05VY<CR><LF>"
                		+ "^|¡06H<CR><LF>^|¡07V<CR><LF>^|¡080000<CR><LF>|¡09966341<CR><LF>^|¡09966341<CR><LF>^|¡10037<CR><LF>^|¡1110<CR><LF>");
//             
//            }

            cs.close();//Fin de la conexión

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}