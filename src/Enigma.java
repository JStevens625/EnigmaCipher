/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Logan
 */
public class Enigma {

    private String key_1 = "GNUAHOVBIPWCJQXDKRY#ELSZFMT";
    private String key_2 = "EJ#OTYCHMRWAFKPUZDINSXBGLQV";
    private String key_3 = "BDFHJLNPRTVXZACEGI#KMOQSUWY";
    private String key_4 = "KPHDEAC#VTWQMYNLXSURZOJFBGI";
    private String key_5 = "NDYGLQICVEZRPTAOXWBMJSUHK#F";
    private StringBuilder keyForOuter;
    private StringBuilder keyForMid;
    private StringBuilder keyForInner;
    private int index;

    public void keyCreation(int wheel_I, int wheel_M, int wheel_O) {
        if (wheel_O == 1) {
            keyForOuter = new StringBuilder(key_1);
        } else {
            if (wheel_O == 2) {
                keyForOuter = new StringBuilder(key_2);
            } else {
                if (wheel_O == 3) {
                    keyForOuter = new StringBuilder(key_3);
                } else {
                    if (wheel_O == 4) {
                        keyForOuter = new StringBuilder(key_4);
                    } else {
                        if (wheel_O == 5) {
                            keyForOuter = new StringBuilder(key_5);
                        }
                    }
                }
            }
        }
        if (wheel_M == 1) {
            keyForMid = new StringBuilder(key_1);
        } else {
            if (wheel_M == 2) {
                keyForMid = new StringBuilder(key_2);
            } else {
                if (wheel_M == 3) {
                    keyForMid = new StringBuilder(key_3);
                } else {
                    if (wheel_M == 4) {
                        keyForMid = new StringBuilder(key_4);
                    } else {
                        if (wheel_M == 5) {
                            keyForMid = new StringBuilder(key_5);
                        }
                    }
                }
            }
        }
        if (wheel_I == 1) {
            keyForInner = new StringBuilder(key_1);
        } else {
            if (wheel_I == 2) {
                keyForInner = new StringBuilder(key_2);
            } else {
                if (wheel_I == 3) {
                    keyForInner = new StringBuilder(key_3);
                } else {
                    if (wheel_I == 4) {
                        keyForInner = new StringBuilder(key_4);
                    } else {
                        if (wheel_I == 5) {
                            keyForInner = new StringBuilder(key_5);
                        }
                    }
                }
            }
        }
    }

    public void rotationEncode(int length, int index, String in, String encoded) {
        int count = 0;
        int rotate = 0;
        int turn = 0;
        char temporary;
        char temp;
        String part1;
        String part2;
        for (int i = 0; i < length; i++) {
            index = keyForInner.toString().indexOf(in.charAt(i));
            index = keyForMid.toString().indexOf(keyForOuter.charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.charAt(index));
            index = keyForInner.toString().toLowerCase().indexOf(in.charAt(i));
            index = keyForMid.toString().toLowerCase().indexOf(keyForOuter.toString().toLowerCase().charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.toString().toLowerCase().charAt(index));
            count++;
            for (int j = 0; j < 26; j++) {
                part1 = keyForInner.substring(1, 26);
                part2 = keyForInner.substring(0, 1);
                keyForInner = new StringBuilder(part1 + part2);
                System.out.println(keyForInner);
            }
            if (count % 27 == 0) {
                rotate++;
                for (int j = 0; j < 26; j++) {
                    part1 = keyForMid.substring(1, 26);
                    part2 = keyForMid.substring(0, 1);
                    keyForMid = new StringBuilder(part1 + part2);
                    System.out.println(keyForMid);
                }
            }
            if (rotate % 27 == 0) {
                for (int j = 0; j < 26; j++) {
                    part1 = keyForOuter.substring(1, 26);
                    part2 = keyForOuter.substring(0, 1);
                    keyForOuter = new StringBuilder(part1 + part2);
                    System.out.println(keyForOuter);
                }
            }
        }
    }

    public void rotationDecode(int length, int index, String in, String encoded) {
        int count = 0;
        int rotate = 0;
        int turn = 0;
        char temporary;
        char temp;
        String part1;
        String part2;
        for (int i = 0; i < length; i++) {
            count++;
            for (int j = 0; j < 26; j++) {
                part1 = keyForInner.substring(1, 26);
                part2 = keyForInner.substring(0, 1);
                keyForInner = new StringBuilder(part1 + part2);
                System.out.println(keyForInner);
            }
            if (count % 27 == 0) {
                rotate++;
                for (int j = 0; j < 26; j++) {
                    part1 = keyForMid.substring(1, 26);
                    part2 = keyForMid.substring(0, 1);
                    keyForMid = new StringBuilder(part1 + part2);
                    System.out.println(keyForMid);
                }
            }
            if (rotate % 27 == 0) {
                for (int j = 0; j < 26; j++) {
                    part1 = keyForOuter.substring(1, 26);
                    part2 = keyForOuter.substring(0, 1);
                    keyForOuter = new StringBuilder(part1 + part2);
                    System.out.println(keyForOuter);
                }
            }
        }
        count = 0;
        for (int i = 0; i < length; i++) {
            index = keyForOuter.toString().indexOf(in.charAt(i));
            index = keyForMid.toString().indexOf(keyForInner.charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForInner.charAt(index));
            index = keyForOuter.toString().toLowerCase().indexOf(in.charAt(i));
            index = keyForMid.toString().toLowerCase().indexOf(keyForInner.toString().toLowerCase().charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForInner.toString().toLowerCase().charAt(index));
            count++;
            if (i < length - 1) {
                for (int j = 0; j < 26; j++) {
                    part1 = keyForInner.substring(1, 26);
                    part2 = keyForInner.substring(0, 1);
                    keyForInner = new StringBuilder(part1 + part2);
                    System.out.println(keyForInner);
                }
                if (count % 27 == 0) {
                    rotate++;
                    for (int j = 0; j < 26; j++) {
                        part1 = keyForMid.substring(1, 26);
                        part2 = keyForMid.substring(0, 1);
                        keyForMid = new StringBuilder(part1 + part2);
                        System.out.println(keyForMid);
                    }
                }
                if (rotate % 27 == 0) {
                    for (int j = 0; j < 26; j++) {
                        part1 = keyForOuter.substring(1, 26);
                        part2 = keyForOuter.substring(0, 1);
                        keyForOuter = new StringBuilder(part1 + part2);
                        System.out.println(keyForOuter);
                    }
                }
            }
        }
    }

    public String plugboard(String[] plugboard, String code) {
        int indx;
        StringBuilder encoded = new StringBuilder(code);
        for (int i = 0; i < plugboard.length; i++) {
            for (int j = 0; j < code.length(); j++) {
                char[] arr = new char[1];
                arr[0] = code.charAt(j);
                CharSequence charseq = new String(arr);
                if (plugboard[i].contains(charseq)) {
                    indx = plugboard[i].indexOf(charseq.toString());
                    if (indx == 0) {
                        encoded.setCharAt(i, plugboard[i].charAt(1));
                    } else {
                        if (indx == 1) {
                            encoded.setCharAt(i, plugboard[i].charAt(0));
                        }
                    }
                }
            }
        }
        code = encoded.toString();
        return code;
    }

    public StringBuilder startPos(StringBuilder key, int start) {
        String part1;
        String part2;
        for (int j = 0; j < 26; j++) {
            part1 = key.substring(start, 26);
            part2 = key.substring(0,start);
            key = new StringBuilder(part1+part2);
            System.out.println(key.toString());
        }
        return key;
    }

    public String encode(String in, int start1, int start2, int start3, int wheel_I, int wheel_M, int wheel_O, String plug) {
        String[] plugboard = plug.split(" ");
        int length = in.length();
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        keyForInner = startPos(keyForInner, start1);
        keyForMid = startPos(keyForMid, start2);
        keyForOuter = startPos(keyForOuter, start3);
        String encoded = in;
        keyCreation(wheel_I, wheel_M, wheel_O);
        encoded = plugboard(plugboard, encoded);
        rotationEncode(length, index, in, encoded);
        encoded = plugboard(plugboard, encoded);
        return encoded;
    }

    public String decode(String in, int start1, int start2, int start3, int wheel_I, int wheel_M, int wheel_O, String plug) {
        String[] plugboard = plug.split(" ");
        int length = in.length();
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        keyForInner = startPos(keyForInner, start1);
        keyForMid = startPos(keyForMid, start2);
        keyForOuter = startPos(keyForOuter, start3);
        String decoded = in;
        keyCreation(wheel_I, wheel_M, wheel_O);
        decoded = plugboard(plugboard, decoded);
        rotationDecode(length, index, in, decoded);
        decoded = plugboard(plugboard, decoded);
        return decoded;
    }
}
