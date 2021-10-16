package com.nas.autocomplete.restservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nas.autocomplete.data.TitleDAO;

@RestController
public class AutocompleteTitleController {

    @GetMapping("/autocomplete")
    public List<Title> autocomplete(@RequestParam(value = "searchString", required = true) String searchString,
                                    @RequestParam(value = "startsWith", required = false, defaultValue = "false") Boolean startsWith) {
        return TitleDAO.getInstance().findMatches(searchString, startsWith);
    }

}
