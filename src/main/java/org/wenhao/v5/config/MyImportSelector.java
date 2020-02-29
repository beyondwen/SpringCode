package org.wenhao.v5.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"org.wenhao.v5.domain.V5MyEnity", "org.wenhao.v5.domain.V5YouEnity"};
    }
}
