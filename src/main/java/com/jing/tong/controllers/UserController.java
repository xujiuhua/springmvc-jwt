package com.jing.tong.controllers;


import com.jing.tong.domain.User;
import com.jing.tong.utils.JWT;
import com.jing.tong.utils.ResponseData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p></p>
 *
 * @author xujiuhua
 * @create 2017-03-20-15:34
 */
@Controller
@RequestMapping("user")
public class UserController {

    @PostMapping("/login")
    @ResponseBody
    public ResponseData login(@RequestParam String username, @RequestParam String password) {
        if ("hello".equals(username) && "123456".equals(password)) {
            ResponseData responseData = ResponseData.ok();
            User user = new User();
            user.setId(1);
            user.setUsername(username);
            user.setPassword(password);
            responseData.putDataValue("user", user);
            String token = JWT.sign(user, 30L * 1000L);
            if (token != null) {
                responseData.putDataValue("token", token);
            }
            return responseData;
        }
        return ResponseData.customerError().putDataValue(ResponseData.ERRORS_KEY, new String[] { "用户名或者密码错误" });
    }
}
