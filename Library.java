package geekster.example.library_management_app.model;

public class Library {
    private int library_no;
    private String library_name;
    private String library_add;

    Library() {};
    public Library(int library_no,String library_name,String library_add){
        this.library_name=library_name;
        this.library_add=library_add;
        this.library_no=library_no;
    }
    public int getLibrary_no() {
        return library_no;
    }

    public void setLibrary_no(int library_no) {
        this.library_no = library_no;
    }

    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    public String getlibrary_add() {
        return library_add;
    }

    public void setlibrary_add(String getLibrary_add) {
        this.library_add = library_add;
    }

    @Override
    public String toString() {
        return "Library{" +
                "library_no=" + library_no +
                ", library_name='" + library_name + '\'' +
                ", library_add='" + library_add + '\'' +
                '}';
    }
}
