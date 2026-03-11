public class bankAccount {
   
    private String nama;
    private String nomorRekening;
    private String password;
    private double saldo;

    public bankAccount(String nama, String nomorRekening, String password, double saldo){
        if(nama.length() < 4){
            System.out.println("Nama harus lebih dari 4 karakter");
            return;
        } 

        if(nomorRekening.length() < 8){
            System.out.println("Nomor Rekening kurang dari 8 hurufz");
            return;
        }

        if(!validPassword(password)){
            System.out.println("Password harus memiliki minimal 8 character, 1 huruf besar, dan 1 underscore");
            return;
        }

        if(saldo < 0){
            System.out.println("Saldo tidak boleh kurang dari nol rupiah");
            return;
        }

        this.nama = nama;
        this.nomorRekening = nomorRekening;
        this.password = password;
        this.saldo = saldo;

}
        private boolean validPassword(String pass){
            if(pass.length() < 8){
                return false;
            }

            boolean adaUnderscore = pass.contains("_");
            boolean adaHurufBesar = false;

            for(int i = 0; i < pass.length(); i++){
                if(Character.isUpperCase(pass.charAt(i))){
                    adaHurufBesar = true;
                }
            }

            return adaUnderscore && adaHurufBesar;

        }

        public void tambahSaldo(double jumlah, String pass){
            if(!pass.equals(password)){
                System.out.println("Password salah");
                return;
            }

            if(jumlah <= 0){
                System.out.println("Jumlah harus lebih dari 0");
                return;
            }

            saldo += jumlah;
            System.out.println("Saldo berhasil ditambah");
        }

        public void tarikSaldo(double jumlah, String pass){
            if(!pass.equals(password)){
                System.out.println("Password salah");
                return;
            }

            if(jumlah > saldo){
                System.out.println("Saldo tidak cukup");
                return;
            }

            saldo -= jumlah;
            System.out.println("Penarikan berhasil");
        }

        public void lihatSaldo(String pass){
            if(!pass.equals(password)){
                System.out.println("Password salah");
                return;
            }

            System.out.println("Saldo anda: " + saldo);
        }

        public void display(){
            System.out.println("Nama: " + nama);
            System.out.println("No Rekening: " + nomorRekening);
            System.out.println("Saldo: " + saldo);
        }
    }