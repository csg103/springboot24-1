package com.csg;

import com.csg.vo.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 前段请求
 *
 * @author csg
 * @create 2017-06-14:16
 */
@RestController
@RequestMapping(value = "/user")
public class usermesControl {

    @Autowired
    private MyBean mybean;

    /**
     *  请求类型   http://localhost:8080/user/1?name1=3
     * @param id
     * @param name1
     * @return
     */
    @RequestMapping("/{id}")
    public MyBean findUser(@PathVariable("id") Long  id, @RequestParam String name1){
        System.out.println(id);
        mybean.getSecurity().getName();
        return mybean;
    }

    /**
     *  http://localhost:8080/user/addUser?id=5
     *  @RequestParam (value = "id",required = false) 标签可控制参数是否为必须 默认是把必须的
     * @param id
     * @return
     */
    @RequestMapping("addUser")
    public MyBean addUser( @RequestParam (value = "id",required = false)String id){
        System.out.println(id);
        return mybean;
    }
    /**
     *接收json类型参数，并转化为对象
     * * */
    @RequestMapping(value="JsonRequest",method={RequestMethod.POST})
    public MyBean addUser(@RequestBody MyBean bean){

        return  bean;
    }
}
