package cn.linuxcrypt.spring.bean.impl;

import cn.linuxcrypt.spring.bean.UserService;

/**
 * @function: this
 * @author: clibing
 * @date: 2018/1/20 20:23
 * @version: 1.0
 * @remark: none
 */
public class UserServiceImpl implements UserService {
    @Override
    public String login(String name, String pass) {
        return String.format("User info, name: %s, pass: %s", name, pass);
    }
}
