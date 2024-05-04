public class Email {
    private String email; 
    public Email(String email) {
        this.email = email;
    };
    
    public boolean validateEmail() throws InvalidEmailException, InvalidDomainException {
        if (email.length() == 0) {
            throw new InvalidEmailException("Email tidak boleh kosong");
        } else if (email.indexOf("@") != email.lastIndexOf("@")) {
            throw new InvalidEmailException("Email harus mengandung tepat satu buah @");
        } else if (email.indexOf("@") == 0) {
            throw new InvalidEmailException("@ tidak boleh di awal email");
        } else if (email.indexOf("@") == -1) {
            throw new InvalidEmailException("Email harus mengandung tepat satu buah @");
        } else if (email.indexOf(".") == -1 || email.lastIndexOf(".") == email.length() - 1 || !(email.lastIndexOf(".") > email.indexOf("@") + 1)) {
            throw new InvalidDomainException();
        } else {
            return true;
        }
        /**
         * Implementasi dengan aturan:
         * Aturan email
         * - Email harus mengandung tepat 1 karakter @ ditengah email
         * - Bagian sebelum @ tidak boleh kosong
         * - Bagian email setelah @ harus memiliki tepat 1 buah titik (.)
         * - Email hanya akan mengandung huruf, angka, (@), dan (.). Karakter lain tidak
         * perlu diperiksa
         * 
         * "john@example.com" => Email Valid
         * "jane.doe@gmail.com" => Email Valid
         * "" => mengembalikan pesan "Email tidak boleh kosong"
         * "example.com" => mengembalikan pesan "Email harus mengandung tepat satu buah @"
         * "@example.com" => mengembalikan pesan "@ tidak boleh di awal email"
         * "john@com" => mengembalikan pesan "Email harus memiliki domain yang valid"
         */
    }

}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
        // Implementasi InvalidEmailException
    }
}

class InvalidDomainException extends Exception {
    public String getMessage() {
        return "Email harus memiliki domain yang valid";
        // Implementasi custom message InvalidDomainException
        // Return pesan multak berisi: "Email harus memiliki domain yang valid
    }
}