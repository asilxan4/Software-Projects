class Book{
    String title;
    String author;
    int page;

    Book(String title,String author,int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void printInfo(){
        System.out.println(title + " by" + author +","+ page + " page");
    }
}

public class HomeworkBook{
    public static void main(String[] args) {
        Book book1 = new Book("info1", "author1", 12);
        book1.printInfo();

        Book book2 = new Book("info2","author2", 13);
        book2.printInfo();

        Book book3 = new Book("info3","author3", 14);
        book3.printInfo();
    }
}