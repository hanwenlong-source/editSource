package com.editSource.controller;

import com.editSource.data.PeopleData;
import com.editSource.entities.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PeopleController {

    @Autowired
    PeopleData peopleData;

    @GetMapping({"/index", "/"})
    public String list(Model model){

        Collection<People> peoples = peopleData.getAll();
        model.addAttribute("index", peoples);
        return "index";
    }

    @GetMapping("/add")
    public String toAddPage(){

        return "add";
    }

    @PostMapping("/add")
    public String addPeople(People people){

        System.out.println(people);
        peopleData.save(people);
        return "redirect:/";
    }

    //修改页面
    @GetMapping("/edit/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){

        People people = peopleData.get(id);
        model.addAttribute("people", people);
        return "/add";
    }

    //修改
    @PutMapping("/add")
    public String updatePeople(People people){

        System.out.println(people);
        peopleData.save(people);
        return "redirect:/";
    }

    @RequestMapping("/kaka")
    @ResponseBody
    public Map<String, String> kaka(@RequestBody Map<String,String> map){

        System.out.println(map.toString());

        Map<String,String> map1 = new HashMap<>();
        map1.put("aaa","bbbbb");
        map1.put("bbb","cccc");

        return map1;
    }

}
