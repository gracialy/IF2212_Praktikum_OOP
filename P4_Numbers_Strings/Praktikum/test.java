public class test {
    public static void main(String[] args) {
        String word = "password123";

        // int countVocal = 0;
        // for (int i=0; i<word.length(); i++) {            
        //     if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') countVocal++;
        // }

        int countVocal = word.replaceAll("[^aiueoAIUEO]", "").length();
        System.out.println("countVocal = " + countVocal);
        countVocal = 2;

        StringBuilder tmp = new StringBuilder();
        for (int i=0; i<word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) tmp.append((char) (Character.getNumericValue(word.charAt(i)) + 'a'));
            else tmp.append(word.charAt(i));
        }
        System.out.println(tmp);

        System.out.println(word.charAt(0));
        System.out.println((char) (Character.getNumericValue(word.charAt(0)) + 'a'));

        String tmp2 = tmp.toString();

        StringBuilder hash = new StringBuilder();
        for (int i=0; i<tmp2.length(); i++) {
            hash.append((char) ((tmp2.charAt(i) + countVocal - 'a') % 26 + 'a'));
        }
        System.out.println(hash);
    }
}
