public class TestCuentas {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(111, 111);
        cc.depositar(100.0);
    
        CuentaAhorros cp = new CuentaAhorros(222, 222);
        cp.depositar(100.0);

        cc.trasnferir(10.0, cp);
        System.out.println("CC: " + cc.getSaldo());

        System.out.println("CP: " + cp.getSaldo());

        cc.retirar(10);
        System.out.println("CC: " + cc.getSaldo());
    }
}
