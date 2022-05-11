import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

//Write MyBook class here
class MyBook extends Book{
    void setTitle(String s){
        this.title = s;
    } // title이 어디에 있는지? 어느걸 가리키나? (this 쓴게 일단 틀린듯)
}

public class JavaAbstractClass{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}


//Sample Input
//A tale of two cities

//Sample Output
//The title is: A tale of two cities