package com.nas.autocomplete.data;

import java.util.ArrayList;
import java.util.List;

import com.nas.autocomplete.restservice.Title;
import com.nas.autocomplete.util.BookTitleGenerator;

public class TitleDAO {

    private static List<Title> titleList;
    private static TitleDAO instance;

    private TitleDAO() {
        // The JVM ensures that only one thread can invoke a constructor call at a given
        // point in time
        if (titleList == null) {
            titleList = BookTitleGenerator.getTitles();
        }
    }

    /**
     * Get a new instance of Title DAO to avoid overhead of creating a new object
     * each time it is needed.
     */
    public static TitleDAO getInstance() {
        if (instance == null) {
            instance = new TitleDAO();
        }

        return instance;
    }

    public List<Title> findMatches(String searchString, boolean beginsWith) {
        List<Title> returnValue = new ArrayList<Title>();
        String searchStringLower = searchString.toLowerCase();

        for (Title title : titleList) {
            if (beginsWith) {
                if (title.getTitle().toLowerCase().startsWith(searchStringLower)) {
                    returnValue.add(title);
                }
            } else {
                if (title.getTitle().toLowerCase().contains(searchStringLower)) {
                    returnValue.add(title);
                }
            }
        }

        return returnValue;
    }

}
