package geekster.example.library_management_app.controller;

import geekster.example.library_management_app.model.Library;
import geekster.example.library_management_app.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/library")

public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @PostMapping("/add-library")
    public void addLibrary(@RequestBody Library library){
        libraryService.addLibrary(library);
    }
    @GetMapping("/find-All")
    public List<Library> findAllLibrary(){
        return libraryService.findAll();
    }




}
