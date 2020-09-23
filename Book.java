package LibraryManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    int[] bookId={1,2,3};
    String[] bookName = {"jvm调优指南","java编程思想","C与指针"} ;
    String[] bookAuthor= {"周志明","陈大王","王小二"};
    int[] inventory ={20,1,3};
    Scanner scanner = new Scanner(System.in);


    public void control_1(){
        System.out.println("1  "+"管理图书");
        System.out.println("2  "+"搜索图书");
        System.out.println("0  "+"退出");
        System.out.println("===============================");
        System.out.println("请输入编号操作(注意输完回车)");
    } //运行界面控制台

    public void refer() { //查询管理图书库
        for(int i=0;i<bookId.length;i++){
            System.out.print(bookId[i]+"  ");
            System.out.print(bookName[i]+"  ");
            System.out.print(bookAuthor[i]+"  ");
            System.out.println(inventory[i]);
        }
        System.out.println("0--返回"+'\t'+"1--新增图书"+'\t'+"2--删除图书");
        System.out.println("===============================");
        System.out.println("请输入编号操作(注意输完回车)");
    } //查询管理图书库

    public void add(){ //增加方法
        int bookId = scanner.nextInt();
        System.out.println("管理图书/新增图书");
        System.out.println("请输入图书名(注意输完回车)");
        String bookName = scanner.nextLine();
        System.out.println("请输入图书作者(注意输完回车)");
        String bookAuthor = scanner.nextLine();
        System.out.println("请输入图书库存(注意输完回车)");
        int inventory = scanner.nextInt();
        System.out.println("确认添加N/Y(注意输完回车)");
        String str = scanner.nextLine();
        if(str=="Y"){
            this.bookName = Arrays.copyOf(this.bookName, this.bookName.length + 1);
            this.bookName[this.bookName.length] = bookName;
            this.bookAuthor = Arrays.copyOf(this.bookAuthor, this.bookAuthor.length + 1);
            this.bookAuthor[this.bookAuthor.length] = bookAuthor;
            this.inventory = Arrays.copyOf(this.inventory, this.inventory.length + 1);
            this.inventory[this.inventory.length] = inventory;
        } else if (str=="N"){
            control_1();
        } else {
            System.out.println("错误输入");
            control_1();
        }

    } //添加图书

    public void search(){
        System.out.println("请输入书名：");
        String bookName = scanner.nextLine();
        for(int i=0;i<this.bookName.length;i++){
            if(this.bookName[i]==bookName){
                System.out.println("0-----返回");
                System.out.println("1-----退出");
                System.out.println("请输入图书名(注意输完回车)"+'\n');
                System.out.println("搜索结果:");
                System.out.println("书名:"+'\t'+this.bookName[i]);
                System.out.println("作者:"+'\t'+this.bookAuthor[i]);
                System.out.println("库存:"+'\t'+this.inventory[i]);

            }
        }
    } //输入图书名检索

    public void  delete(int index){ //删除方法
        int i;
        String bN;
        String bA;
        int in;
        if(index>=0 && index<bookId.length){
            i=bookId[bookId.length-1]; //交换数组下标位置
            bookId[bookId.length-1]=bookId[index-1];
            bookId[index-1]=i;
            bookId = Arrays.copyOf(bookId, bookId.length - 1);

            bN=bookName[bookName.length-1]; //交换数组下标位置
            bookName[bookName.length-1]=bookName[index-1];
            bookName[index-1]=bN;
            bookName = Arrays.copyOf(bookName, bookName.length - 1);

            bA=bookAuthor[bookAuthor.length-1]; //交换数组下标位置
            bookAuthor[bookAuthor.length-1]=bookAuthor[index-1];
            bookName[index-1]=bA;
            bookAuthor = Arrays.copyOf(bookAuthor, bookAuthor.length - 1);

            in=inventory[inventory.length-1]; //交换数组下标位置
            inventory[inventory.length-1]=inventory[index-1];
            inventory[index-1]=in;
            inventory = Arrays.copyOf(inventory, inventory.length - 1);
        } else {
            System.out.println("输入错误下标");
        }
        bookId = Arrays.copyOf(bookId,bookId.length-1);
        bookName = Arrays.copyOf(bookName,bookName.length-1);
        bookAuthor = Arrays.copyOf(bookAuthor,bookAuthor.length-1);
    } //删除图书


}

