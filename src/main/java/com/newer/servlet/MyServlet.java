package com.newer.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 严思乐
 * @create 2021-06-09  19:39
 **/

/**
 *  @Controller:创建处理器对象，对象放在springmvc容器中。
 *  位置：在类的上面
 *  和Spring中讲的@Service ,@Component
 *
 *  能处理请求的都是控制器（处理器）： MyController能处理请求，
 *                         叫做后端控制器（back controller）
 *
 *  没有注解之前，需要实现各种不同的接口才能做控制器使用
 */
//servlet 层创建对象的注解
@Controller
public class MyServlet {
    //方法使用注解
    /**
     * 准备使用doSome方法处理some.do请求。
     * @RequestMapping: 请求映射，作用是把一个请求地址和一个方法绑定在一起。
     *                  一个请求指定一个方法处理。
     *       属性： 1. value 是一个String，表示请求的uri地址的（some.do）。
     *                value的值必须是唯一的， 不能重复。 在使用时，推荐地址以“/”
     *       位置：1.在方法的上面，常用的。
     *            2.在类的上面
     *  说明： 使用RequestMapping修饰的方法叫做处理器方法或者控制器方法。
     *  使用@RequestMapping修饰的方法可以处理请求的，类似Servlet中的doGet, doPost
     *
     *  返回值：ModelAndView 表示本次请求的处理结果
     *   Model: 数据，请求处理完成后，要显示给用户的数据
     *   View: 视图， 比如jsp等等。
     */
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        //相当于给作用域存值
        mv.addObject("msg","第一次使用springMVC");
        mv.addObject("fun","取值成功");
        //相当于转发页面
        mv.setViewName("/show.jsp");

        return mv;
    }
}
