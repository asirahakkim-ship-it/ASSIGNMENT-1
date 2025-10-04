import javax.naming.Name;

class Book {
        String title;
        String author;
        int price;
        void display(){
            System.out.println("Title:"+title);
            System.out.println("Author:"+author);
            System.out.println("Price:"+price);
    }
    }

class TextBook extends Book {
        String Name;
        int pages;
        void dispaly(){
            System.out.println("Name"+Name);
            System.out.println("Pages"+pages);
        }

    }

class Magazine extends Book {
        String MagazineName;
        void display(){
            System.out.println("Magazine Name"+MagazineName);
        }
    }

public class InheritanceLibrarySystem {
    public static void main(String[] args) {
        TextBook tb=new TextBook();
        tb.title="My learn";
        System.out.println(tb.title);
        tb.author="Sheakespear";
        System.out.println(tb.author);
        tb.pages=89;
        System.out.println(tb.pages);
        tb.Name="Little";
        System.out.println(tb.Name);
        Magazine msg=new Magazine();
        msg.MagazineName="BrainWaves";
        System.out.println(msg.MagazineName);



    }
}
