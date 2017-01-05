package cn.psvmc.controllers;
 

import cn.psvmc.dao.ZJUserDao;
import cn.psvmc.model.ZJUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
  @Autowired
  private ZJUserDao userDao;
  @RequestMapping("/")
  public String index(Map<String,Object> model,String name) {
    model.put("name",name);
    return "index/hello";
  }

  @RequestMapping("/userlist")
  @ResponseBody
  public List<ZJUser> userlist() {
    List<ZJUser> users = userDao.findAll();
    return users;
  }

}
