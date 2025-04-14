package paperback.ai.data.mensaje;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
public class Mensaje {
    //
    private UUID uuid = UUID.randomUUID();
    private String tipo;
    private String texto;
    private Instant timeStamp = Instant.now();

    public Mensaje(String tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }
}
