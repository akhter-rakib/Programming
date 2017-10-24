package designPattern.factoryMethodPattern;

//this is the factory class and getComputer method is the factory method ;)
//amader je class a object need just se class ar object create kore dise ae factory method named getComputer()
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type))
            return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type))
            return new Server(ram, hdd, cpu);
        return null;
    }
}
