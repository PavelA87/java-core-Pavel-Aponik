package phone;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone(112233, "Huawei", 300);
        Phone phone2 = new Phone(223344, "Samsung", 400);
        Phone phone3 = new Phone(334455, "Iphone", 500);


        System.out.println(phone1.getNumber());
        phone1.receiveCall("Pavel", phone1.number);
        Phone.sendMessage(55555, 666666, 777777);

    }
}
