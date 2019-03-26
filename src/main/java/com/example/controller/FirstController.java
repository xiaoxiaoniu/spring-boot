package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:
 *
 * @ClassName: FirstController
 * @author: sunshiyu@richinfo.cn
 * @Date: 2019/3/26 14:43
 **/
@RestController
@RequestMapping("/first")
public class FirstController {

  @RequestMapping("/method1")
  public String method1() {
    return "hi man!";
  }
  @RequestMapping("/method2")
  public String method2(){
    return "test dev is ok!";
  }
}
