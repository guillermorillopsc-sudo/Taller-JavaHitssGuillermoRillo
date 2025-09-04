package interfaces;

import java.util.Date;

public interface ILibro {
    Date getFechaPublicacion();  // +getFechaPublicacion(): Date
    String getAutor();           // +getAutor(): String
    String getTitulo();          // +getTitulo(): String
    String getEditorial();       // +getEditorial(): String
}
