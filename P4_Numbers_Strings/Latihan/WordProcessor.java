import java.util.ArrayList;  

public class WordProcessor {
    // Atribut statik untuk menyimpan daftar kata
    private static ArrayList<String> words;

    /**
     * Konstruktor
     * Inisialisasi daftar kata
     */
    public WordProcessor() {
        words = new ArrayList<String>();
    }

    /**
     * Menambahkan kata ke dalam daftar kata
     * @param word
     */
    public static void addWord(String word) {
        words.add(word);
    }

    /**
     * Menghapus kata dari daftar kata
     * @param word
     */
    public static void removeWord(String word) {
        words.removeIf(w -> w.equals(word));

        // for (int i=0; i<words.size(); i++) {
        //     if (words.get(i).equals(word)) {
        //         words.remove(i);
        //         break;
        //     }
        // }

        // arr[i] for array
        // arrList.get(i) for array list
    }

    /**
     * Mencetak daftar kata dengan format:
     * 1. kata1
     * 2. kata2
     * ...
     */
    public static void printWords() {
        for (int i=0; i<words.size(); i++) {
            System.out.println(i + ". " + words.get(i));
        }
    }

    /**
     * Mengembalikan kata terbalik pada index tertentu
     * Index dimulai dari 0
     * @param indeks
     * @return
     */
    private static StringBuilder reverseWord(int indeks) {
        StringBuilder str = new StringBuilder(words.get(indeks));        
        return str.reverse();
    }
    
    /**
     * Mengembalikan apakah suatu kata pada index tertentu merupakan palindrome
     * Clue: gunakan method reverseWord
     * @param indeks
     * @return  true jika kata pada index tertentu merupakan palindrome
     *          false jika kata pada index tertentu bukan palindrome atau index tidak valid
     */
    public static boolean isPalindrome(int indeks) {
        if (indeks<0 || indeks>=words.size()) return false;

        return words.get(indeks).equals(reverseWord(indeks).toString());
    }
}