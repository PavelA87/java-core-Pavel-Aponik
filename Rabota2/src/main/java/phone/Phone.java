package phone;

public class Phone {


    int number;
    String model;
    int weight;

    Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;

    }

    public void receiveCall (String name){

        System.out.println("звонит " + name);

    }
    public int getNumber (){

       return this.number;

    }

    public void receiveCall(String name, int number){

        System.out.println("звонит " + name + " телефон: " + number);

    }

    public static void sendMessage (int...numbers ){

        for (int i: numbers){
            System.out.println("Номер телефона, получивший сообщение " + i);
        }

    }





}










