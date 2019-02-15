package com.nivedita.giflib.web.controller;


import com.nivedita.giflib.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs(Model model) {
        // TODO: Get all gifs

        return "gif/index";
    }

}
