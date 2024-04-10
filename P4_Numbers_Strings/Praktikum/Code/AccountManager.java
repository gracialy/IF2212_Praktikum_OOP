import java.util.ArrayList;

public class AccountManager {
    private ArrayList<Account> accounts;

    /**
     * AccountManager constructor
     * 
     * Menginisiasi ArrayList Account
     */
    public AccountManager() {
        this.accounts = new ArrayList<Account>();
    }

    /**
     * Mengecek apakah format username valid
     * Username dikatakan valid jika:
     * 1. Terdiri minimal dari 5 karakter
     * 2. Terdiri dari alfanumerik (huruf dan angka)
     * 
     * @param username username yang akan dicek
     * @return true jika sesuai ketentuan username yang valid
     */
    private static boolean isValidUsername(String username) {
        if (username.length()<5) return false;
        
        for (int i=0; i<username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) return false;
        }

        return true;
    }

    /**
     * Mengecek apakah password merupakan password yang kuat
     * Password dikatakan kuat jika:
     * 1. Terdiri minimal dari 8 karakter
     * 2. Terdiri dari alfanumerik (huruf dan angka)
     * 3. Minimal terdiri dari 1 huruf dan 1 angka
     * 
     * @param password password yang akan dicek
     * @return true jika sesuai ketentuan password yang kuat
     */
    private static boolean isStrongPassword(String password) {
        if (password.length()<8) return false;
        
        int digitCount = 0; int letterCount = 0;
        for (int i=0; i<password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) digitCount ++;
            else if (Character.isLetter(password.charAt(i))) letterCount ++;
            else return false;
        }
        if (digitCount<1 || letterCount<1) return false;

        return true;
    }

    /**
     * Menambahkan akun baru ke dalam atribut accounts
     * 
     * Akun dapat ditambahkan jika:
     * 1. Username valid, jika tidak valid maka
     * mencetak pesan "Username tidak valid"
     * 2. Username belum terdafta, jika terdaftar maka
     * mencetak pesan "Username telah digunakan"
     * 3. Password kuat, jika tidak kuat maka
     * mencetak pesan "Password tidak cukup kuat"
     * 
     * Pengecekan dilakukan berurut berdasarkan penjelasan di atas
     * Apabila memenuhi syarat di atas, maka akun ditambahkan
     * dan password disimpan dalam format hash,
     * kemudian mencetak pesan "Akun berhasil didaftarkan"
     * 
     * @param username username dari akun baru
     * @param password password dari akun baru dalam format tidak dihash
     */
    public void addAccount(String username, String password) {
        if (!isValidUsername(username)) {
            System.out.println("Username tidak valid");
            return;
        }
        
        for (int i=0; i<accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(username)) {
                System.out.println("Username telah digunakan");
                return;
            }
        }

        if (!isStrongPassword(password)) {
            System.out.println("Password tidak cukup kuat");
            return;
        }

        Account newAccount = new Account(username, (Ucrypt.hash(password)).toString());
        accounts.add(newAccount);
        System.out.println("Akun berhasil didaftarkan");
        return;
    }

    /**
     * Masuk ke akun yang telah didaftarkan
     * 
     * Apabila username akun tidak terdaftar
     * maka akan mencetak pesan "Akun tidak terdaftar"
     * 
     * Apabila password akun salah
     * maka akan mencetak pesan "Password yang dimasukkan salah"
     * 
     * Apabila username dan password sesuai
     * maka akan mencetak pesan "Berhasil masuk"
     * 
     * @param username username dari akun
     * @param password password dari akun dalam format tidak dihash
     */
    public void login(String username, String password) {
        boolean found = false;
        for (int i=0; i<accounts.size(); i++) {
            if (accounts.get(i).getUsername().equals(username)) {
                found = true;
                if (Ucrypt.compare(password, accounts.get(i).getPassword())) {
                    System.out.println("Berhasil masuk");
                }
                else System.out.println("Password yang dimasukkan salah");
                return;
            }
        }
        if (!found) System.out.println("Akun tidak terdaftar");
        return;
    }
}
