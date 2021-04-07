package com.caelan.island.controller;


import com.caelan.island.service.CUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author caelan
 * @since 2021-04-07
 */
@RestController
@RequestMapping("/c-user")
public class CUserController {
    @Autowired
    CUserService CUserService;
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return CUserService.getById(id);
    }
}
