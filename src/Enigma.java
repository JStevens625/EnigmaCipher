/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author Logan
 */
public class Enigma {

    String key_1 = "GNUAHOVBIPWCJQXDKRY#ELSZFMT";
    String key_2 = "EJ#OTYCHMRWAFKPUZDINSXBGLQV";
    String key_3 = "BDFHJLNPRTVXZACEGI#KMOQSUWY";
    String key_4 = "KPHDEAC#VTWQMYNLXSURZOJFBGI";
    String key_5 = "NDYGLQICVEZRPTAOXWBMJSUHK#F";
    StringBuilder keyForOuter;
    StringBuilder keyForMid;
    StringBuilder keyForInner;
    int startPosInner;
    int startPosMid;
    int startPosOuter;
    int index;
    public String encode(String in, int start1, int start2, int start3, int wheel_I, int wheel_M, int wheel_O, String[] plugboard) {
        int length = in.length();
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        startPosInner = start1;
        startPosMid = start2;
        startPosOuter = start3;
        String encoded = in;
        keyCreation(wheel_I, wheel_M, wheel_O);
        encoded = plugboard(plugboard, encoded);
        rotationEncode(length, index, in, encoded);
        encoded = plugboard(plugboard, encoded);
        return encoded;
    }
    public String decode(String in, int start1, int start2, int start3, int wheel_I, int wheel_M, int wheel_O, String[] plugboard) {
        int length = in.length();
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        startPosInner = start1;
        startPosMid = start2;
        startPosOuter = start3;
        String decoded = in;
        keyCreation(wheel_I, wheel_M, wheel_O);
        decoded = plugboard(plugboard, decoded);
        rotationDecode(length, index, in, decoded);
        decoded = plugboard(plugboard, decoded);
        return decoded;
    }/**/
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
        for (int i = 0; i < length; i++) {
            index = keyForInner.toString().indexOf(in.charAt(i));
            index = keyForMid.toString().indexOf(keyForOuter.charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.charAt(index));
            index = keyForInner.toString().toLowerCase().indexOf(in.charAt(i));
            index = keyForMid.toString().toLowerCase().indexOf(keyForOuter.toString().toLowerCase().charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.toString().toLowerCase().charAt(index));
            count++;
            for (int j = 0; j < 27; j++) {
                temp = keyForInner.charAt(0);
                if (j != 26) {
                    temporary = keyForInner.charAt(j);
                    keyForInner.setCharAt(j++, temporary);
                } else {
                    keyForInner.setCharAt(j, temp);
                }
            }
            if (count % 27 == 0) {
                rotate++;
                for (int j = 0; j < 27; j++) {
                    temp = keyForMid.charAt(0);
                    if (j != 26) {
                        temporary = keyForMid.charAt(j);
                        keyForMid.setCharAt(j++, temporary);
                    } else {
                        keyForMid.setCharAt(j, temp);
                    }
                }
            }
            if (rotate % 27 == 0) {
                turn++;
                for (int j = 0; j < 27; j++) {
                    temp = keyForOuter.charAt(0);
                    if (j != 26) {
                        temporary = keyForOuter.charAt(j);
                        keyForOuter.setCharAt(j++, temporary);
                    } else {
                        keyForOuter.setCharAt(j, temp);
                    }
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
        for (int i = 0; i < length; i++) {
            index = keyForInner.toString().indexOf(in.charAt(i));
            index = keyForMid.toString().indexOf(keyForOuter.charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.charAt(index));
            index = keyForInner.toString().toLowerCase().indexOf(in.charAt(i));
            index = keyForMid.toString().toLowerCase().indexOf(keyForOuter.toString().toLowerCase().charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.toString().toLowerCase().charAt(index));
            count++;
            for (int j = 0; j < 27; j++) {
                temp = keyForInner.charAt(0);
                if (j != 26) {
                    temporary = keyForInner.charAt(j);
                    keyForInner.setCharAt(j++, temporary);
                } else {
                    keyForInner.setCharAt(j, temp);
                }
            }
            if (count % 27 == 0) {
                rotate++;
                for (int j = 0; j < 27; j++) {
                    temp = keyForMid.charAt(0);
                    if (j != 26) {
                        temporary = keyForMid.charAt(j);
                        keyForMid.setCharAt(j++, temporary);
                    } else {
                        keyForMid.setCharAt(j, temp);
                    }
                }
            }
            if (rotate % 27 == 0) {
                turn++;
                for (int j = 0; j < 27; j++) {
                    temp = keyForOuter.charAt(0);
                    if (j != 26) {
                        temporary = keyForOuter.charAt(j);
                        keyForOuter.setCharAt(j++, temporary);
                    } else {
                        keyForOuter.setCharAt(j, temp);
                    }
                }
            }
        }
    }
    public String plugboard(String[] plugboard, String code) {
        int indx;
        StringBuilder encoded = new StringBuilder(code);
        for(int i = 0; i < plugboard.length; i++){
            for(int j = 0; j < code.length(); j++){
                char[] arr = new char[1];
                arr[0]=code.charAt(j);
                CharSequence charseq = new String(arr);
                if(plugboard[i].contains(charseq)) {
                    indx = plugboard[i].indexOf(charseq.toString());
                    if(indx == 0){
                        encoded.setCharAt(i, plugboard[i].charAt(1));
                    }
                    else{
                        if(indx == 1){
                            encoded.setCharAt(i, plugboard[i].charAt(0));
                        }
                    }
                }
            }
        }
        code = encoded.toString();
        return code;
    }
}
/**/
