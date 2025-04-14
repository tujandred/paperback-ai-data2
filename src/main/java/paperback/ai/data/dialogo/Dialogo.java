package paperback.ai.data.dialogo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import paperback.ai.data.mensaje.Mensaje;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dialogo {
    //
    private List<Mensaje> instrucciones = new ArrayList<>();
    private List<Mensaje> mensajes = new ArrayList<>();
}
