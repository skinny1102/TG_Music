package Book;

public class Book {
    private int resoucreId;
    private  String title;

    public Book(int resoucreId, String title) {
        this.resoucreId = resoucreId;
        this.title = title;
    }

    public int getResoucreId() {
        return resoucreId;
    }

    public void setResoucreId(int resoucreId) {
        this.resoucreId = resoucreId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
