/*
 * Copyright 2021 tu.cn All right reserved. This software is the
 * confidential and proprietary information of tu.cn ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Tu.cn
 */
package com.me.learn.boot.selector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @Author: Administrator
 * Created: 2021/10/30
 **/
public class BootDeferredImportSelector implements DeferredImportSelector {

    /**
     *注意一下，selectImports这个方法是不是Spring 框架调用的，是DeferredImportSelector.Group的实现类调用的
     * */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                //返回完整限定名
            DeferredBean.class.getName()
        };
    }

    @Override
    public Class<? extends Group> getImportGroup() {
        return BootDeferredImportSelectorGroup.class;
    }

    private static class BootDeferredImportSelectorGroup implements Group{
        private List<Entry> entryList = new ArrayList<>();
        @Override
        public void process(AnnotationMetadata metadata, DeferredImportSelector selector) {
            String[] strings = selector.selectImports(metadata);
            for (String string : strings) {
                entryList.add(new Entry(metadata, string));
            }
        }

        @Override
        public Iterable<Entry> selectImports() {
            return entryList;
        }
    }
}
