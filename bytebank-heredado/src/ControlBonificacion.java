public class ControlBonificacion {
    
    private double suma;

    public void registrarSalario(Funcionario funcionario){
        this.suma += funcionario.getBonificacion();
    }

    public double getSuma() {
        return suma;
    }
}
