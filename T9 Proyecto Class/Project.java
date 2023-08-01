class Project {

    private String nombre;
    private String descripcion;

    public Project(){
        
    }

    public Project(String nombre){
        this.nombre = nombre;
    }

    public Project(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }


    public String getNombre (){
        return nombre;
    }

    public void setterNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }
    
    public void setterDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}
