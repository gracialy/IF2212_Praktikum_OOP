public class Umandana {
    /**
     * Mengembalikan kata yang telah diubah menjadi bahasa Umandana
     * Huruf a menjadi "aiden"
     * Huruf i menjadi "ipri"
     * Huruf u menjadi "upru"
     * Huruf e menjadi "epre"
     * Huruf o menjadi "opro"
     * Huruf mati yang tidak diikuti huruf vokal menjadi huruf tersebut + "es"
     * Suku kata "ng" yang tidak diikuti huruf vokal menjadi "strengen"
     * Suku kata "ng" yang diikuti huruf vokal tetap menjadi "ng"
     * Suku kata "ny" yang diikuti huruf vokal tetap menjadi "ny"
     * Selain ketentuan di atas, huruf/karakter tidak diubah
     * *
     * 
     * @param words kata yang akan diubah menjadi bahasa Umandana
     * @return kata yang telah diubah menjadi bahasa Umandana
     * 
     */
    public static String toUmandana(String words) {
        String umWord = new String();
        
        int i = 0;
        while (i < words.length()) {
            if (words.charAt(i) == 'a') umWord += "aiden";
            else if (words.charAt(i) == 'i') umWord += "ipri";
            else if (words.charAt(i) == 'u') umWord += "upru";
            else if (words.charAt(i) == 'e') umWord += "epre";
            else if (words.charAt(i) == 'o') umWord += "opro";

            else if (words.charAt(i) == ' ') umWord += " ";

            else if (words.charAt(i) == 'n') {

                // indeks 2 = length 3
                // indeks 2 harus length 4
                if (i + 1 < words.length()) {
                    if (words.charAt(i+1) == 'g') {
                        if (i + 2 < words.length()) {
                            if (isVowel(words.charAt(i+2))) {
                                umWord += "ng";
                                i++;
                            } 
                            else {
                                umWord += "strengen";
                                i++;
                            }
                        } 
                        else {
                            umWord += "strengen";
                            i++;
                        }
                    }

                    else if (words.charAt(i+1) == 'y') {
                        if (i + 2 < words.length()) {
                            if (isVowel(words.charAt(i+2))) {
                                umWord += "ny";
                                i++;
                            } 
                            else {
                                umWord += "nes";
                            }
                        } else {
                            umWord += "nes";
                        }
                    }

                    else if (isVowel(words.charAt(i+1))) {
                        umWord += words.charAt(i);
                    }

                    else {
                        umWord += words.charAt(i) + "es";
                    }
                }
                else {
                    umWord += words.charAt(i) + "es";
                }
            }

            else if (isConsonant(words.charAt(i))) {
                if (i + 1 < words.length()) {
                    if (isVowel(words.charAt(i+1))) {
                        umWord += words.charAt(i);
                    } 
                    else {
                        umWord += words.charAt(i) + "es";
                    }
                } 
                else {
                    umWord += words.charAt(i) + "es";
                }
            }

            // // n case
            // else if (words.charAt(i) == 'n') {
            //     // n + 2 case
            //     if (i < words.length() - 2) {
            //         // ng case
            //         if (words.charAt(i + 1) == 'g') {
            //             if (isVowel(words.charAt(i + 2))) {
            //                 umWord += "ng";
            //                 i++;
            //             } 
            //             else {
            //                 umWord += "strengen";
            //                 i++;
            //             }
            //         } 
                    
            //         // ny case
            //         else if (words.charAt(i + 1) == 'y') {
            //             if (isVowel(words.charAt(i + 2))) {
            //                 umWord += "ny";
            //                 i++;
            //             } 
            //             else {
            //                 umWord += "nes";
            //             }
            //         } 
                    
            //         // n vowel case
            //         else if (isVowel(words.charAt(i + 1))) umWord += words.charAt(i);

            //         // n consonant case
            //         else umWord += words.charAt(i) + "es";
            //     }

            //     // n + 1 case
            //     else if (i < words.charAt(i) - 1) {
            //         // n vowel case
            //         if (isVowel(words.charAt(i + 1))) umWord += words.charAt(i);

            //         // ng case
            //         else if (words.charAt(i + 1) == 'g') {
            //             umWord += "strengen";
            //             i++;
            //         }

            //         // n consonant case
            //         else umWord += words.charAt(i) + "es";
            //     }

            //     // n case
            //     else umWord += words.charAt(i) + "es";
            // }

            // // consonant case
            // else if (isConsonant(words.charAt(i))) {
            //     // cons + 1 case
            //     if (i < words.length() - 1) {
            //         if (isVowel(words.charAt(i + 1))) umWord += words.charAt(i);
            //         else umWord += words.charAt(i) + "es";
            //     } 

            //     // cons case
            //     else umWord += words.charAt(i) + "es";
            // }
            
         
            else umWord += words.charAt(i);
            i++;
        }
        return umWord;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }

    private static boolean isConsonant(char c) {
        return !isVowel(c);
    }

    /**
     * Mengembalikan kata Umandana ke bentuk normal
     * *
     * 
     * @param words kata dalam bahasa Umandana
     * @return kata telah diubah ke bentuk normal
     */
    public static String deUmandana(String words) {
        String nomWords = new String(words);
        nomWords = nomWords.replaceAll("aiden", "a");
        nomWords = nomWords.replaceAll("ipri", "i");
        nomWords = nomWords.replaceAll("upru", "u");
        nomWords = nomWords.replaceAll("epre", "e");
        nomWords = nomWords.replaceAll("opro", "o");
        nomWords = nomWords.replaceAll("strengen", "ng");
        nomWords = nomWords.replaceAll("([^aiueo])es", "$1");
        return nomWords;
    }

    // public static void main(String[] args) {
    //     String test  = "menyanyi sampai monyongny";

    //     System.out.println(toUmandana(test));
    
    //     if(toUmandana(test).equals("meprenyaidennyipri saidenmespaidenipri mopronyoprostrengennesyes")){
    //         System.out.println("benar");
    //     }

    //     System.out.println(toUmandana("aku sayang kamu"));
    //     System.out.println(toUmandana("kaki kudanil"));
    //     System.out.println(toUmandana("kristal dingin"));
    //     System.out.println(toUmandana("elang ompong"));
    //     System.out.println(toUmandana("menyanyi sampai monyong"));

    //     System.out.println(deUmandana("aidenkupru saidenyaidenstrengen kaidenmupru"));
    //     System.out.println(deUmandana("kaidenkipri kuprudaidennipriles"));
    //     System.out.println(deUmandana("kesriprisestaidenles dipringiprines"));
    //     System.out.println(deUmandana("eprelaidenstrengen opromespoprostrengen"));
    //     System.out.println(deUmandana("meprenyaidennyipri saidenmespaidenipri mopronyoprostrengen"));    
    // }
}
