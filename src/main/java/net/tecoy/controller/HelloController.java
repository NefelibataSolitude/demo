/**
 * @Author: Tecoy
 * Contact: itecoy@163.com
 * @Date: 2022/7/1 13:29
 * @Version: 1.0
 * @Description:
 */
package net.tecoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hell World!");
        return "Hell World!";
    }
}
