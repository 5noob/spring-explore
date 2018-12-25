package com.me.spring.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author OuyangJie
 * @Date 2018/12/20 9:58
 * @Description:
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.me.spring.listener.MyApplicationListener"};
    }
}
