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

    public String encode(String in, int start1, int start2, int start3, int wheel_I, int wheel_M, int wheel_O, String[] plugboard) {
        int length = in.length();
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        int index;

        String encoded = in;
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
        startPosInner = start1;
        startPosMid = start2;
        startPosOuter = start3;
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
            for(int j = 0; j<27; j++){
                temp = keyForInner.charAt(0);
                if(j != 26){
                    temporary = keyForInner.charAt(j);
                    keyForInner.setCharAt(j++, temporary);
                }
                else{
                    keyForInner.setCharAt(j,temp);
                }
            }
            if (count % 27 == 0) {
                rotate++;
            }
            if (rotate % 27 == 0) {
                turn++;
            }
        }

        return encoded;
    }
    /*public String decode(String in, int wheel_O, int wheel_M, int wheel_I) {
        if (wheel_O == 1) {
            keyForOuter = key_1;
        } else {
            if (wheel_O == 2) {
                keyForOuter = key_2;
            } else {
                if (wheel_O == 3) {
                    keyForOuter = key_3;
                } else {
                    if (wheel_O == 4) {
                        keyForOuter = key_4;
                    } else {
                        if (wheel_O == 5) {
                            keyForOuter = key_5;
                        }
                    }
                }
            }
        }
        if (wheel_M == 1) {
            keyForMid = key_1;
        } else {
            if (wheel_M == 2) {
                keyForMid = key_2;
            } else {
                if (wheel_M == 3) {
                    keyForMid = key_3;
                } else {
                    if (wheel_M == 4) {
                        keyForMid = key_4;
                    } else {
                        if (wheel_M == 5) {
                            keyForMid = key_5;
                        }
                    }
                }
            }
        }
        if (wheel_I == 1) {
            keyForInner = key_1;
        } else {
            if (wheel_I == 2) {
                keyForInner = key_2;
            } else {
                if (wheel_I == 3) {
                    keyForInner = key_3;
                } else {
                    if (wheel_I == 4) {
                        keyForInner = key_4;
                    } else {
                        if (wheel_I == 5) {
                            keyForInner = key_5;
                        }
                    }
                }
            }
        }
        String decoded;
        decoded = decoded.replaceAll("#", " ");
        return decoded;
    }*/
}
/**/
