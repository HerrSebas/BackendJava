public class TestGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente(null, null, 0);
        g1.setNombre("Marco");
        g1.setDocumento("123fg");;
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumento());
        System.out.println(g1.getSalario());

        g1.setClave("unodostres");
        boolean autentico = g1.autenticar("unodostres");

        System.out.println(autentico); 
        System.out.println(g1.getBonificacion());
    }    
}
