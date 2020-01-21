package hp;

//import com.sun.org.apache.xpath.internal.operations.Mod;
//import com.sun.org.apache.xpath.internal.operations.Mod;
import db.Mysql_Connect;
//import org.springframework.context.annotation.ComponentScan;
import db.Std;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.ResultSet;

@Controller
//@RequestMapping
//@ComponentScan({"hp"})
public class Web_Controller {

    @RequestMapping("add")
    public String  get(Std s) throws Exception {

        new Mysql_Connect().put(s);
//        new
        return "index.jsp";

    }

    @RequestMapping("/show")
    public ModelAndView get_fp() throws Exception {
        int cnt=new Mysql_Connect().get();
        ResultSet rs= new Mysql_Connect().getData();

        Std[] s=new Std[cnt];

        int i=0;
        while(rs.next())
        {
          s[i]=new Std(rs.getInt(1),rs.getString(2));
          i++;
        }

//           Std s=new Std(rs.getInt(1),rs.getString(2));
//            i++;



        ModelAndView mv=new ModelAndView();
        mv.setViewName("i2.jsp");


        mv.addObject("obj",s);


        return mv;
    }


    @RequestMapping(value = "edit",method = RequestMethod.GET)
    public ModelAndView edit(@RequestParam("id") int id,@RequestParam("name") String name) throws Exception {


        ModelAndView mv=new ModelAndView();
        mv.setViewName("index.jsp");
        mv.addObject("obj",new Std(id,name));
        return mv;

    }

    @RequestMapping(value = "edit",method = RequestMethod.POST)
    public ModelAndView edit_data(Std s) throws Exception {
        new Mysql_Connect().edit(s);
        ModelAndView mv=this.get_fp();
        return mv;

    }


    @RequestMapping("del")
    public ModelAndView del(@RequestParam("id") int i) throws Exception {
     new Mysql_Connect().delete(i);
     return this.get_fp();
    }



}

//@Component

