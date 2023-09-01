package com.cclu.springframework.beans;

import cn.hutool.core.util.StrUtil;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ChangCheng Lu
 * @date 2023/8/31 21:19
 */
@Getter
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue propertyValue) {
        propertyValueList.add(propertyValue);
    }

    public PropertyValue getPropertyValue(String propertyValueName) {
        if (!StrUtil.isNotBlank(propertyValueName)) {
            return null;
        }
        return propertyValueList.stream().filter(propertyValue -> propertyValueName.equals(propertyValue.getName())).collect(Collectors.toList()).get(0);
    }

}
