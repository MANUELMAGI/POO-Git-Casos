package caso2;

public class Estudiante {
 
	private String nombre;
    private int edad;
    private String carrera;
    private String telefono;
    private String direccion;
    
    
    public Estudiante(String nombre, int edad, String carrera, String direccion, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 15) {
            this.edad = edad;
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    public void mostrarDatos() {
        System.out.println("*** Datos del Estudiante ***");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }
}