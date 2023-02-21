public class Cliente implements Autenticacion {

    private AutenticacionUtil autenticador;

    public Cliente() {
        this.autenticador = new AutenticacionUtil();
    }

    @Override
    public void setContraseña(int contraseña) {
        this.autenticador.setContraseña(contraseña);
    }

    @Override
    public boolean autenticar(int contraseña) {
        return this.autenticador.autenticar(contraseña);
    }
}

