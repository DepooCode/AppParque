package parque;

class Cliente {
    private String usuario;
    private String contrasenia;

    public Cliente(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void comprarTiquete(Tiquete tiquete) {
        System.out.println("El cliente " + usuario + " ha comprado el tiquete: " + tiquete.getId());
    }
}
