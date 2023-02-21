public class TestSistema {
    public static void main(String[] args) {
        Autenticacion gerente = new Gerente();

        gerente.setContraseña(2222);

        SistemaInterno sistemaInterno = new SistemaInterno();

        sistemaInterno.autenticar(gerente);



    }
}