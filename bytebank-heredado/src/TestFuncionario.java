public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario sebastian = new Funcionario("Sebastian Naranjo", "123ff", 4300000);

        System.out.println(sebastian.getSalario());
        System.out.println(sebastian.getBonificacion());
    }
}
