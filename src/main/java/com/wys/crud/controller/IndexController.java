package com.wys.crud.controller;

import com.wys.crud.pojo.User;
import com.wys.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    /**
     * 查询所有用户信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/allUser")
    public String allUser(Model model) {
        List<User> users = userService.list(null);
        model.addAttribute("users", users);
        return "allUser";
    }

    /**
     * 跳转到添加用户页面
     * @return
     */
    @RequestMapping("/toAddUserPage")
    public String toAddUserPage() {
        return "addUser";
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(User user) {
        userService.save(user);
        return "redirect:allUser";
    }

    /**
     * 跳转到更新用户页面 并携带id
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/toUpdatePage/{id}")
    public String toUpdatePage(@PathVariable(value = "id") Integer id, Model model) {
        model.addAttribute("id", id);
        return "updateUser";
    }

    /**
     * 更新用户
     * @param user
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        userService.updateById(user);
        return "redirect:allUser";
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") Integer id) {
        userService.removeById(id);
        return "redirect:/allUser";
    }


}
