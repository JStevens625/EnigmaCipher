public class TEST {
    private static String key_1 = "GNUAHOVBIPWCJQXDKRY#ELSZFMT";
    private static String key_2 = "EJ#OTYCHMRWAFKPUZDINSXBGLQV";
    private static String key_3 = "BDFHJLNPRTVXZACEGI#KMOQSUWY";
    private static String key_4 = "KPHDEAC#VTWQMYNLXSURZOJFBGI";
    private static String key_5 = "NDYGLQICVEZRPTAOXWBMJSUHK#F";
    private static String key_O;
    private static String key_M;
    private static String key_I;
    private static int start_O = 1;
    private static int start_M = 1;
    private static int start_I = 1;
    private static int keyNum_O = 1;
    private static int keyNum_M = 2;
    private static int keyNum_I = 3;
    private static String plugboard;
    public static void main(String[] args) {
        System.out.println(key_O + "\n" + key_M + "\n" + key_I);
        key_O = startPos(assignKey(keyNum_O), start_O);
        key_M = startPos(assignKey(keyNum_M), start_M);
        key_I = startPos(assignKey(keyNum_I), start_I);  
        System.out.println(key_O + "\n" + key_M + "\n" + key_I);
    }
    public static String assignKey(int keyNum) { //Sets selected key's string to the input key's position
        String key = "";
        if (keyNum == 1) { //If 1 is selected, set the key to key_1
            key = key_1;
        } else {
            if (keyNum == 2) { //If 2 is selected, set the key to key_2
                key = key_2;
            } else {
                if (keyNum == 3) { //If 3 is selected, set the key to key_3
                    key = key_3;
                } else {
                    if (keyNum == 4) { //If 4 is selected, set the key to key_4
                        key = key_4;
                    } else {
                        if (keyNum == 5) { //If 5 is selected, set the key to key_5
                            key = key_5;
                        }
                    }
                }
            }
        }
        return key;
    }
    public static String startPos(String key, int position) {
        int end = key.length();
        String part1 = key.substring(0, position); //Takes everything before the start position
        String part2 = key.substring(position, end); //Takes everything after the start position
        key = part2 + part1; //Puts the start position as the first character, and puts the original start position after the original last character
        return key;
    }
    public static String[] plugboardIn() {
        plugboard = plugboard.toUpperCase();
        String[] plug = plugboard.split(" "); //Splits the plugboard input by spaces and creates an array of two character long strings
        return plug;
    }
    public static String plugboard(String text, String[] plug) {
        while (text != null) {
            int length = text.length();
            for (int i = 0; i < length; i++) {//For all characters
                char ch = text.charAt(i);//Set ch to the character at the index
                for (int j = 0; j < 10; j++) {//For all indexes in the plugboard array, check...
                    if (ch == plug[j].charAt(0)) {//...if ch is the character at index 0 in the string at index j.
                        text = text.substring(0, i) + plug[j].charAt(1) + text.substring(i + 1);//replace the character at index 0 with the character at index 1
                    }
                    if (ch == plug[j].toLowerCase().charAt(0)) {//...if ch is the lowercase character at index 0 in the string at index j.
                        text = text.substring(0, i) + plug[j].toLowerCase().charAt(1) + text.substring(i + 1);//replace the character at index 0 with the character at index 1
                    }else {// And if not, ...
                        if (ch == plug[j].charAt(1)) {//...if ch is the character at index 1 in the string at index j
                            text = text.substring(0, i) + plug[j].charAt(0) + text.substring(i + 1);//replace the character at index 1 with the character at index 0
                        }
                        if (ch == plug[j].toLowerCase().charAt(1)) {//...if ch is the lowercase character at index 1 in the string at index j
                            text = text.substring(0, i) + plug[j].toLowerCase().charAt(0) + text.substring(i + 1);//replace the character at index 1 with the character at index 0
                        }
                    }
                }
            }
        }
        return text;
    }
    public static String roatationForward(String key){
        return key;
    }
    public static String roatationBackward(String key){
        return key;
    }
    
}
