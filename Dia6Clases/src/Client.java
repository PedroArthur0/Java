public class Client {

    String firsName;
    int age;
    int balance;

    Client() {
        balance = 10;
    }


    void newAccount(){
        System.out.println(firsName + " Account Created!");
        System.out.println("The New Balance Is $" + balance);
    }
}
