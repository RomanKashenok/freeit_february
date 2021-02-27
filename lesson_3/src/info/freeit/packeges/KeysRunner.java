package info.freeit.packeges;


public class KeysRunner {
    public static void main(String[] args) {

        info.freeit.packeges.doorkeys.Key key1 = new info.freeit.packeges.doorkeys.Key("Regular doors");
        info.freeit.packeges.securitykeys.Key securityKey1 = new info.freeit.packeges.securitykeys.Key("Слоны идут на север");

        System.out.println("key1 className: " + key1.getClass().getName());
        System.out.println(key1);
        System.out.println("securityKey1 className: " + securityKey1.getClass().getName());
        System.out.println(securityKey1);

    }
}


// com.google.drive.model
// com.google.drive.api
// com.google.drive.service

// 1. Инкапсуляция смежной логики
// 2. Инкапсуляция
// 3. Разграничение пространсва имен