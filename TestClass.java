package CRUD_raw_code_project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<StudentClass> studentclass = new ArrayList<>();

        OperationClass oc = new OperationClass();


        while (true) {
            System.out.println("Welcome to our Student portal");
            oc.operation();

            System.out.println("Enter a option - ");
            int option = input.nextInt();

            switch (option) {
                case 1: {
                    oc.calculator();
                    break;
                }
                case 2: {
                    oc.student_operation();
                    System.out.println("Enter chose an option - ");
                    int op2 = input.nextInt();

                    switch (op2) {
                        case 0: {
                            break;
                        }

                        case 1: {
                            System.out.println("Enter name - ");
                            String name = input.next();

                            input.nextLine();

                            System.out.println("Enter id - ");
                            int id = input.nextInt();

                            System.out.println("Enter contact - ");
                            int contact = input.nextInt();

                            studentclass.add(new StudentClass(name, id, contact));

                            System.out.println("Successfully added ! ");

                            break;
                        }
                        case 2: {
                            System.out.println(studentclass);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter a id - ");
                            int op3 = input.nextInt();
                            Iterator itr = studentclass.iterator();
                            while (itr.hasNext()) {
                                if ((itr.next()).getId == op3) {

                                }
                            }
                            break;

                        }


                    }
                }
            }
        }


    }
}
