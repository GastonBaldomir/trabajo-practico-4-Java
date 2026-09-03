package ejercicio2204;

public class Foto {
    private Integer id;
    private String descripcion;

    public Foto(){
    }

    public Foto(Integer id, String descripcion){
        this.id = id;
        this.descripcion = descripcion;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return this.descripcion;
    }
}

