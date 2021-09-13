package p1;

import mysql.SDetailsDTO;
import mysql.SchoolDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FirstController {


    SchoolDAO dao = new SchoolDAO();

    @RequestMapping("/")
    public String getURL(){
        return "index";
    }

    @RequestMapping("/new")
    public String getURL1(){
        return "new";
    }

    @RequestMapping("/display/{sid}")
    public String display(@PathVariable String sid, Model model) throws Exception {
        SDetailsDTO dto = dao.getAnyStudent(sid);
        model.addAttribute("name", dto);
        return "displayName";
    }

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public String getStudent(){
        return "student";
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insertStudent(@RequestBody SDetailsDTO stdDao, Model model) throws Exception {
        dao.insertStudent(stdDao);
        model.addAttribute("msg","Record Added"+stdDao.getSid());
        return "student";
    }



}
