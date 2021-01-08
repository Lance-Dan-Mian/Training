package com.example.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Lance
 * @date 2021/1/7 17:54
 */
@Getter
@AllArgsConstructor
public enum ItemTypeEnum {
    CONSULT(2, "CONSULT"),
    COMPLAINT(1, "COMPLAINT");

    private Integer code;
    private String desc;

    public static String getDesc(Integer code) {
        for (ItemTypeEnum type : ItemTypeEnum.values()) {
            if (type.getCode().equals(code)) {
                return type.getDesc();
            }
        }
        return null;
    }
}
