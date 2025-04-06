class Monitor{
    private String monitorSize="32인치";
    private String color="Black";
    private String power="45W";

    public void turnOn(){
        System.out.print("Turning on the monitor.\n");
    }
    public void printInfo(){
        System.out.print("The spec of the monitor\n");
        System.out.printf(" Size: %s\n Color:%s\n Power:%s\n", monitorSize,color,power);
    }
}

class Computer{
    private String cpu="Core i7";
    private String memory="32GB";
    private String hd="2TB";
    private String color="White";
    private String power="700W";

    public void turnOn(){
        System.out.print("Turning on the Computer.\n");
    }
    public void printInfo(){
        System.out.print("The spec of the computer\n");
        System.out.printf(" CPU: %s\n Memory:%s\n HDD: %s\n Color:%s\n Power:%s\n",cpu,memory,hd,color,power);
    }
}

class PersonalComputer{
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        Computer computer = new Computer();
        computer.turnOn();
        monitor.turnOn();
        computer.printInfo();
        monitor.printInfo();
    }
}

class Test{
    public static void main(String[] args){

    }
}