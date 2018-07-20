package com.booking.inventory.controller;

import com.booking.inventory.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    public BookRepository bookRepository;


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public List<Book> books(){
        return bookRepository.findAll();
    }

}
