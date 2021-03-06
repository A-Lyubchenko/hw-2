 class NameEncoderDecoder {
     public static String encode(String name) {
         String replays = name.replaceAll("e", "1").
                 replaceAll("u", "2").
                 replaceAll("i", "3").
                 replaceAll("o", "4").
                 replaceAll("a", "5");
         return "NOTFORYOU" + replays + "YESNOTFORYOU";
     }

     public static String decode(String name) {
         return name.replaceAll("1", "e").
                 replaceAll("2", "u").
                 replaceAll("3", "i").
                 replaceAll("4", "o").
                 replaceAll("5", "a").
                 replaceAll("NOTFORYOU", "").
                 replaceAll("YES", "");
     }

     public static void main(String[] args) {
         System.out.println(encode("Crab"));
         System.out.println(decode("NOTFORYOUCr5bYESNOTFORYOU"));
     }
 }

