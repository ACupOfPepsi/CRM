package com.ujiuye.auth.service;

import com.ujiuye.auth.bean.Role;

/**
 * @author ACupOfPepsi
 * @create 2020-07-19 11:08
 */
public interface RoleService {

    boolean addRole(Role role, String sourcesid);
}
