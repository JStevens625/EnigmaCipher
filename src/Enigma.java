/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Logan
 */
public class Enigma {

    private String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#";
    private String key_1 = "GNUAHOVBIPWCJQXDKRY#ELSZFMT";
    private String key_2 = "EJ#OTYCHMRWAFKPUZDINSXBGLQV";
    private String key_3 = "BDFHJLNPRTVXZACEGI#KMOQSUWY";
    private String key_4 = "KPHDEAC#VTWQMYNLXSURZOJFBGI";
    private String key_5 = "NDYGLQICVEZRPTAOXWBMJSUHK#F";
    private String key_O;
    private String key_M;
    private String key_I;

    public String assignKey(int keyNum) { //Sets selected key's string to the input key's position
        String key = "";
        if (keyNum == 1) { //If 1 is selected, set the key to key_1
            key = key_1;
        } else if (keyNum == 2) { //If 2 is selected, set the key to key_2
            key = key_2;
        } else if (keyNum == 3) { //If 3 is selected, set the key to key_3
            key = key_3;
        } else if (keyNum == 4) { //If 4 is selected, set the key to key_4
            key = key_4;
        } else if (keyNum == 5) { //If 5 is selected, set the key to key_5
            key = key_5;
        }
        return key;
    }

    public String startPos(String key, int position) {
        int end = key.length();
        String part1 = key.substring(0, position); //Takes everything before the start position
        String part2 = key.substring(position, end); //Takes everything after the start position
        key = part2 + part1; //Puts the start position as the first character, and puts the original start position after the original last character
        return key;
    }

    public String[] plugboardIn(String plugboard) {

        plugboard = plugboard.toUpperCase();
        String[] plug = plugboard.split(" "); //Splits the plugboard input by spaces and creates an array of two character long strings
        return plug;
    }

    public char plugboard(char ch, String[] plug) {
        try {
            int plugLength = plug.length;
            for (int j = 0; j < plugLength; j++) {//For all indexes in the plugboard array, check...
                if (ch == plug[j].charAt(0)) {//...if ch is the character at index 0 in the string at index j.
                    ch = plug[j].charAt(1);//replace the character at index 0 with the character at index 1
                } else// And if not, ...
                if (ch == plug[j].charAt(1)) {//...if ch is the character at index 1 in the string at index j
                    ch = plug[j].charAt(0);//replace the character at index 1 with the character at index 0
                }
            }
        } catch (Exception e) {
            System.err.println(e);
            return ch;
        }
        return ch;
    }

    public String rotationForward(String key) {
        String part1 = key.substring(key.length() - 1);
        String part2 = key.substring(0, key.length() - 1);
        key = part1 + part2;
        return key;
    }

    public String rotationBackward(String key) {
        String part1 = key.substring(1);
        String part2 = key.substring(0, 1);
        key = part1 + part2;
        return key;
    }

    public String encode(String text, String plugboard, int keyNum_O, int keyNum_M, int keyNum_I, int keyPos_O, int keyPos_M, int keyPos_I) {
        text = text.replaceAll(" ", "#");
        String caseSensitive = text;
        char caseChar;
        text = text.toUpperCase();
        key_O = assignKey(keyNum_O);
        key_M = assignKey(keyNum_M);
        key_I = assignKey(keyNum_I);
        key_O = startPos(key_O, keyPos_O);
        key_M = startPos(key_M, keyPos_M);
        key_I = startPos(key_I, keyPos_I);

        int length = text.length();

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);//Set ch to the character at the index
            if (Character.isAlphabetic(ch) || ch == '#') {
                caseChar = caseSensitive.charAt(i);
                plugboard(text.charAt(i), plugboardIn(plugboard));

                if (Character.isLowerCase(caseChar) || caseChar == '#') {
                    text = text.substring(0, i) + Character.toLowerCase(plugboard(key_O.charAt(key_M.indexOf(key_O.charAt(key_I.indexOf(plugboard(ch, plugboardIn(plugboard)))))), plugboardIn(plugboard))) + text.substring(i + 1);
                } else {
                    text = text.substring(0, i) + plugboard(key_O.charAt(key_M.indexOf(key_O.charAt(key_I.indexOf(plugboard(ch, plugboardIn(plugboard)))))), plugboardIn(plugboard)) + text.substring(i + 1);
                }
            }
            key_I = rotationForward(key_I);
            if (i % 27 == 0 && i != 0) {
                key_M = rotationForward(key_M);
                if (i % 729 == 0) {
                    key_O = rotationForward(key_O);
                }
            }
        }
        return text;
    }

    public String decode(String text, String plugboard, int keyNum_O, int keyNum_M, int keyNum_I, int keyPos_O, int keyPos_M, int keyPos_I) {
        String caseSensitive = text;
        char caseChar;
        text = text.toUpperCase();
        key_O = assignKey(keyNum_O);
        key_M = assignKey(keyNum_M);
        key_I = assignKey(keyNum_I);
        key_O = startPos(key_O, keyPos_O);
        key_M = startPos(key_M, keyPos_M);
        key_I = startPos(key_I, keyPos_I);
        int length = text.length() - 1;
        for (int i = 0; i < length; i++) {
            key_I = rotationForward(key_I);
            if (i % 27 == 0 && i != 0) {
                key_M = rotationForward(key_M);
                if (i % 729 == 0) {
                    key_O = rotationForward(key_O);
                }
            }
        }
        for (int i = length; i >= 0; i--) {
            char ch = text.charAt(i);//Set ch to the character at the index
            if (Character.isAlphabetic(ch) || ch == '#') {
                caseChar = caseSensitive.charAt(i);
                if (Character.isLowerCase(caseChar) || caseChar == '#') {
                    text = text.substring(0, i) + Character.toLowerCase(plugboard(key_I.charAt(key_O.indexOf(key_M.charAt(key_O.indexOf(plugboard(ch, plugboardIn(plugboard)))))), plugboardIn(plugboard))) + text.substring(i + 1);
                } else {
                    text = text.substring(0, i) + plugboard(key_I.charAt(key_O.indexOf(key_M.charAt(key_O.indexOf(plugboard(ch, plugboardIn(plugboard)))))), plugboardIn(plugboard)) + text.substring(i + 1);
                }
            }
            key_I = rotationBackward(key_I);
            if (i % 27 == 0 && i != 0) {
                key_M = rotationBackward(key_M);
                if (i % 729 == 0) {
                    key_O = rotationBackward(key_O);
                }
            }
        }
        text = text.replaceAll("#", " ");
        return text;
    }
}
