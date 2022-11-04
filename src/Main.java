import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Data> list=new ArrayList();
        Data obj1 =new Data("Dina",1001);
        Data obj2=new Data("Ahmed",1002);
        Data obj3 =new Data("Seif",1003);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        int s = list.size();
        int n =(list.size())-1;
       int previousID=list.get(n).id;
        S: while (true){
            System.out.println("Do you want to add a new name ?");
            boolean answer=in.nextBoolean();
            if (answer){
                System.out.println("Enter the name :");
                String name = in.next();
                System.out.println("Enter the id (Enter 0 if you don’t want to):");
                int id = in.nextInt();
                if (id ==0){
                    previousID++;
                    Data obj5= new Data(name,previousID);
                    list.add(obj5);
                }else{
                    for (int i =0;i<s;i++){
                        if (id == list.get(i).id){
                            list.get(i).name=name;
                            for (Data obj :list){
                                System.out.println(obj);
                            }
                            break S;
                        }
                    }
                   Data obj5 = new Data(name,id);
                    list.add(obj5);

                }
                for (Data obj :list){
                    System.out.println(obj);
                }
                break ;
            }else {
                System.out.println("Do you want to get a specific name by its id ?");
                boolean answer2 = in.nextBoolean();
                if (answer2) {
                    System.out.println("please enter the id :");
                    int id = in.nextInt();
                    for (int i =0;i<s;i++) {
                        if (id == list.get(i).id) {
                            System.out.println(list.get(i).name);
                            break S;
                        }


                        }
                    System.out.println(" id does not exist");
                    break ;
                    }
                }
            }


        }


    }
