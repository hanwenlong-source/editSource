package com.editSource.data;

import com.editSource.entities.People;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PeopleData {

    private static Map<Integer, People> peoples = null;

    static{

        peoples = new HashMap<Integer, People>();

        peoples.put(1001, new People(1001, "妹爷", "110@163.com", 1, new Date()));
        peoples.put(1002, new People(1002, "球球", "120@163.com", 0, new Date()));
        peoples.put(1003, new People(1003, "猪小明", "119@163.com", 1, new Date()));
        peoples.put(1004, new People(1004, "米线", "911@163.com", 0, new Date()));
        peoples.put(1005, new People(1005, "腿腿", "12306@163.com", 0, new Date()));
        peoples.put(1006, new People(1006, "闰土", "10086@163.com", 1, new Date()));
    }

    private static Integer initId = 1007;

    public void save(People people){

        if(people.getId() == null){

            people.setId(initId++);
        }

        peoples.put(people.getId(), people);
    }

    public Collection<People> getAll(){

        return peoples.values();
    }

    public People get(Integer id){

        return peoples.get(id);
    }
}