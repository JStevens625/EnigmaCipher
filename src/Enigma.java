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

    public String encode(String in, int day, String plugboard) {
        in = in.replaceAll(" ", "#");
        in = in.toLowerCase();
        int index;
        
        String encoded = in;
            if(day == 1){
                keyForInner = key_3;
                keyForMid = key_1;
                keyForOuter = key_4;
                startPosInner = 18;
                startPosMid = 24;
                startPosOuter = 15;
            }
            if(day == 2){
                keyForInner = key_2;
                keyForMid = key_3;
                keyForOuter = key_5;
                startPosInner = 14;
                startPosMid = 3;
                startPosOuter = 19;
            }
            if(day == 3){
                keyForInner = key_5;
                keyForMid = key_2;
                keyForOuter = key_4;
                startPosInner = 20;
                startPosMid = 16;
                startPosOuter = 11;
            }
            if(day == 4){
                keyForInner = key_2;
                keyForMid = key_4;
                keyForOuter = key_1;
                startPosInner = 17;
                startPosMid = 5;
                startPosOuter = 9;
            }
            if(day == 5){
                keyForInner = key_3;
                keyForMid = key_1;
                keyForOuter = key_2;
                startPosInner = 24;
                startPosMid = 19;
                startPosOuter = 22;
            }
            if(day == 6){
                keyForInner = key_4;
                keyForMid = key_2;
                keyForOuter = key_5;
                startPosInner = 13;
                startPosMid = 26;
                startPosOuter = 3;
            }
            if(day == 7){
                keyForInner = key_2;
                keyForMid = key_5;
                keyForOuter = key_1;
                startPosInner = 25;
                startPosMid = 8;
                startPosOuter = 23;
            }
            if(day == 8){
                keyForInner = key_5;
                keyForMid = key_1;
                keyForOuter = key_3;
                startPosInner = 1;
                startPosMid = 21;
                startPosOuter = 17;
            }
            if(day == 9){
                keyForInner = key_3;
                keyForMid = key_2;
                keyForOuter = key_5;
                startPosInner = 6;
                startPosMid = 18;
                startPosOuter = 10;
            }
            if(day == 10){
                keyForInner = key_4;
                keyForMid = key_3;
                keyForOuter = key_2;
                startPosInner = 20;
                startPosMid = 12;
                startPosOuter = 14;
            }
            if(day == 11){
                keyForInner = key_5;
                keyForMid = key_1;
                keyForOuter = key_4;
                startPosInner = 16;
                startPosMid = 7;
                startPosOuter = 2;
            }
            if(day == 12){
                keyForInner = key_2;
                keyForMid = key_4;
                keyForOuter = key_3;
                startPosInner = 4;
                startPosMid = 15;
                startPosOuter = 11;
            }
            if(day == 13){
                keyForInner = key_3;
                keyForMid = key_2;
                keyForOuter = key_1;
                startPosInner = 3;
                startPosMid = 26;
                startPosOuter = 18;
            }
            if(day == 14){
                keyForInner = key_1;
                keyForMid = key_4;
                keyForOuter = key_2;
                startPosInner = 6;
                startPosMid = 20;
                startPosOuter = 25;
            }
            if(day == 15){
                keyForInner = key_5;
                keyForMid = key_3;
                keyForOuter = key_4;
                startPosInner = 24;
                startPosMid = 13;
                startPosOuter = 10;
            }
            if(day == 16){
                keyForInner = key_3;
                keyForMid = key_4;
                keyForOuter = key_5;
                startPosInner = 16;
                startPosMid = 4;
                startPosOuter = 7;
            }
            if(day == 17){
                keyForInner = key_1;
                keyForMid = key_5;
                keyForOuter = key_2;
                startPosInner = 18;
                startPosMid = 23;
                startPosOuter = 14;
            }
            if(day == 18){
                keyForInner = key_3;
                keyForMid = key_4;
                keyForOuter = key_1;
                startPosInner = 11;
                startPosMid = 21;
                startPosOuter = 1;
            }
            if(day == 19){
                keyForInner = key_5;
                keyForMid = key_1;
                keyForOuter = key_2;
                startPosInner = 8;
                startPosMid = 19;
                startPosOuter = 17;
            }
            if(day == 20){
                keyForInner = key_4;
                keyForMid = key_2;
                keyForOuter = key_1;
                startPosInner = 2;
                startPosMid = 22;
                startPosOuter = 5;
            }
            if(day == 21){
                keyForInner = key_3;
                keyForMid = key_4;
                keyForOuter = key_2;
                startPosInner = 15;
                startPosMid = 9;
                startPosOuter = 12;
            }
            if(day == 22){
                keyForInner = key_1;
                keyForMid = key_5;
                keyForOuter = key_3;
                startPosInner = 12;
                startPosMid = 26;
                startPosOuter = 7;
            }
            if(day == 23){
                keyForInner = key_4;
                keyForMid = key_1;
                keyForOuter = key_5;
                startPosInner = 15;
                startPosMid = 3;
                startPosOuter = 19;
            }
            if(day == 24){
                keyForInner = key_5;
                keyForMid = key_3;
                keyForOuter = key_1;
                startPosInner = 9;
                startPosMid = 19;
                startPosOuter = 6;
            }
            if(day == 25){
                keyForInner = key_4;
                keyForMid = key_1;
                keyForOuter = key_3;
                startPosInner = 4;
                startPosMid = 25;
                startPosOuter = 23;
            }
            if(day == 26){
                keyForInner = key_1;
                keyForMid = key_3;
                keyForOuter = key_2;
                startPosInner = 24;
                startPosMid = 10;
                startPosOuter = 1;
            }
            if(day == 27){
                keyForInner = key_3;
                keyForMid = key_5;
                keyForOuter = key_4;
                startPosInner = 18;
                startPosMid = 13;
                startPosOuter = 22;
            }
            if(day == 28){
                keyForInner = key_2;
                keyForMid = key_4;
                keyForOuter = key_5;
                startPosInner = 2;
                startPosMid = 20;
                startPosOuter = 16;
            }
            if(day == 29){
                keyForInner = key_5;
                keyForMid = key_2;
                keyForOuter = key_3;
                startPosInner = 11;
                startPosMid = 14;
                startPosOuter = 5;
            }
            if(day == 30){
                keyForInner = key_1;
                keyForMid = key_4;
                keyForOuter = key_5;
                startPosInner = 8;
                startPosMid = 17;
                startPosOuter = 21;
            }
            if(day == 31){
                keyForInner = key_3;
                keyForMid = key_5;
                keyForOuter = key_4;
                startPosInner = 17;
                startPosMid = 11;
                startPosOuter = 4;
            }
            int length = in.length();
            for (int i = 0; i < length; i++) {
                index = keyForInner.indexOf(in.charAt(i));
                index = keyForMid.indexOf(keyForOuter.charAt(index));
                encoded = encoded.replace(in.charAt(i), keyForOuter.charAt(index));
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
