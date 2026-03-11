public class mainBank {
    public static void main(String[] args) {

        bankAccount akun1 = new bankAccount(
            "Queen", 
            "13245768", 
            "pass_kwinbi", 
            1000000
        );
        akun1.display();
        System.out.println();
        akun1.lihatSaldo("pass_kwinbi");
        System.out.println();
        akun1.tambahSaldo(500000, "pass_kwinbi");
        System.out.println();
        akun1.tarikSaldo(200000, "pass_kwinbi");
        System.out.println();
        akun1.lihatSaldo("pass_kwinbi");
        System.out.println();
    }
}