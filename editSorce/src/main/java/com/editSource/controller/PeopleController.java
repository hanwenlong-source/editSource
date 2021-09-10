package com.editSource.controller;

import com.editSource.data.PeopleData;
import com.editSource.entities.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Collection;

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
}
