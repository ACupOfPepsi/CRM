package com.ujiuye.auth.service;

import com.ujiuye.auth.bean.Sources;

/**
 * @author ACupOfPepsi
 * @create 2020-07-18 17:30
 */
public interface SourcesService {
    Sources getRootSources();

    boolean addSources(Sources sources);

    Sources showOneById(int id);
}
