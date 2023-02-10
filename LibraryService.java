package geekster.example.library_management_app.service;

import org.springframework.stereotype.Service;
import geekster.example.library_management_app.model.Library;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private static ArrayList<Library>libraries=new ArrayList<>();
//    private static int libraryCount=0;
    static{
        libraries.add(new Library(1,"sashay","bhopal"));

    }




    public void addLibrary(Library library) {
        libraries.add(library);
    }

    public List<Library> findAll() {
        return libraries;

    }
}
