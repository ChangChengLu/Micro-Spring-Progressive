package com.cclu.springframework.beans;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/8/21 11:47
 */
@Getter
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public PropertyValue getPropertyValue(String propertyValueName) {
        for (PropertyValue pv : propertyValueList) {
            if (pv.getName().equals(propertyValueName)) {
                return pv;
            }
        }
        return null;
    }

}
