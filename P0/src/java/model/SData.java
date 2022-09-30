/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tokyo
 */
public class SData {

    final private Map<String, SdorData2> SdorDatas = new HashMap<>();
    final private static SData instance = new SData();

    SData() {
        SdorDatas.put("ก้องภพ จำเริญสุข", new SdorData2("ก้องภพ จำเริญสุข", "64114540047", "ชาย", "1"));
        SdorDatas.put("TER", new SdorData2("ก้องภพ จำเริญสุข", "64114540047", "ชาย", "1"));
        
    }
    

    public static SData getInstance() {
        return instance;
    }

    public SdorData2 getSdorData(String name) {
        return SdorDatas.get(name);
    }
}
