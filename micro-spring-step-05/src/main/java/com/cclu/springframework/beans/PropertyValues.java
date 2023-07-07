package com.cclu.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChangCheng Lu
 * @date 2023/7/5 10:11
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

}
