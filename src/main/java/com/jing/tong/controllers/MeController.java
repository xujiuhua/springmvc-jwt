package com.jing.tong.controllers;

import com.jing.tong.domain.User;
import com.jing.tong.utils.JWT;
import com.jing.tong.utils.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ${DESCRIPTION}
 *
 * @author xujiuhua
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/me")
public class MeController {

    @GetMapping("/get")
    @ResponseBody
    public ResponseData getInfo(@RequestParam String token) {
        User user = JWT.unsign(token, User.class);
        if (user != null) {
            return ResponseData.ok().putDataValue("user", user);
        }
        return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "token不合法" });
    }
}
