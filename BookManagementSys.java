package LibraryManagementSystem;

import java.util.Scanner;

public class BookManagementSys {
    public static void main(String[] args) {
        Book user = new Book();
        order(user);
    }
    private static void order (Book user) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String bN;
        boolean boo = true;
        do {
            user.control_1();
            num = scanner.nextInt();
            switch (num) {
                case 0: {
                    boo = false;
                    break;
                }
                case 1: {
                    user.refer();
                    int num_1 = scanner.nextInt();
                    switch (num_1) {
                        case 0: {
                            boo = true;
                            break;
                        }
                        case 1: {
                            user.add();
                            break;
                        }
                        case 2: {
                            int index = scanner.nextInt();
                            user.delete(index);
                            break;
                        }
                        default: {
                            System.out.println("指令错误");
                            break;
                        }
                    }
                }
                case 2: {
                    num = scanner.nextInt();
                    switch (num){
                        case 0:{
                            boo = true;
                            break;}
                        case 1:{
                            boo = false;
                            break;}
                        case 3:{
                            user.search();
                            break;
                        }
                        default: {
                            boo = false;
                            System.out.println("指令错误系统退出");
                            break;
                        }
                    }
                    break;
                }
                default: {
                    System.out.println("指令错误");
                    break;
                }
            }
        }while (boo);

    } //输入命令完成操作
}
