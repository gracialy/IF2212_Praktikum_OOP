public class MaskPII {
    private String maskEmail(String email) {
        email = email.toLowerCase();
        String[] splEmail = email.split("@");

        String name = splEmail[0];
        String domain = splEmail[1];

        return String.format(name.charAt(0) + "*****" + name.charAt(name.length()-1) + "@" + domain);
    }

    private String maskPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("[+\\-()\\s]", "");

        if (phoneNumber.length() == 10) return String.format("***-***-"+ phoneNumber.substring(6, 10));
        else if (phoneNumber.length() == 11) return String.format("+*-***-***-" + phoneNumber.substring(7, 11));
        else if (phoneNumber.length() == 12) return String.format("+**-***-***" + phoneNumber.substring(8, 12));
        else return String.format("+***-***-***" + phoneNumber.substring(9, 13));
    }

    public String maskPII(String pii) {
        // dilakukan pengecekan String pii
        // jika pii merupakan email, panggil method maskEmail
        // jika pii merupakan phone number, panggil method maskPhoneNumber
        if (pii.contains("@") ) return maskEmail(pii);
        else return maskPhoneNumber(pii);
    }
}