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
    String keyForOuter;
    String keyForMid;
    String keyForInner;
    int startPosInner;
    int startPosMid;
    int startPosOuter;

    public String encode(String in, int start1, int start2, int start3, int wheel_I, int wheel_M, int wheel_O, String plugboard) {
        int length = in.length();
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        int index;

        String encoded = in;
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
        startPosInner = start1;
        startPosMid = start2;
        startPosOuter = start3;
        for (int i = 0; i < length; i++) {
            index = keyForInner.indexOf(in.charAt(i));
            index = keyForMid.indexOf(keyForOuter.charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.charAt(index));
        }
        for (int i = 0; i < length; i++) {
            index = keyForInner.toLowerCase().indexOf(in.charAt(i));
            index = keyForMid.toLowerCase().indexOf(keyForOuter.toLowerCase().charAt(index));
            encoded = encoded.replace(in.charAt(i), keyForOuter.toLowerCase().charAt(index));
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
