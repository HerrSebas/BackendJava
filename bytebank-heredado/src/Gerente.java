public class Gerente extends Funcionario {

    private String clave;
    public Gerente(String nombre, String documento, double salario) {
        super(nombre, documento, salario);
        //TODO Auto-generated constructor stub
    }

    

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean autenticar(String contraseña) {
        if (this.clave == contraseña) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacion(){
        return super.getSalario() + super.getBonificacion();
    }

}
