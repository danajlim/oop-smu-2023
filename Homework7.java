abstract class Printer{//추상 클래스
    private String model; //모델명
    private int printedCount;//현재까지의 출력 매수
    private int availableCount;//출력 가능 매수
    public abstract boolean print();//추상 멤버 함수
    public Printer(String model,int printedCount){
        this.model=model;
        this.printedCount=printedCount;}
    public int getavailableCount(){ return availableCount;}
    public String getmodel(){return model;}
    public int getprintedCount(){return printedCount;}
    public int incrementPrintedCount(){
        printedCount++;
        return getprintedCount();}
    public int decrementAvailableCount(){
        availableCount--;
        return getavailableCount();}

}

class InkjetPrinter extends Printer { //Printer를 상속받는 inkjet
    public InkjetPrinter(String model,int printedCount){
        super(model,printedCount);}
    @Override
    public boolean print(){
        if (getavailableCount()==0){
            System.out.println(getmodel()+":"+(getprintedCount()+1)+"매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
        else if (getavailableCount()>=1){
            incrementPrintedCount();
            decrementAvailableCount();
            return true;
            }
        return false;
        }
    }


class LaserPrinter extends Printer{ //Printer를 상속받는 laser
    public LaserPrinter(String model,int printedCount){
        super(model,printedCount);}
    public boolean print() {
        if (getavailableCount() == 0) {
            System.out.println(getmodel() + ":" + (getprintedCount() + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
        else if (getavailableCount()>=1) {
            incrementPrintedCount();
            decrementAvailableCount();
            return true;
            }
        return false;
    }
}

public class Homework7 {
    public static void main(String[] args){
        InkjetPrinter inkjet=new InkjetPrinter("Brother DCP-T720DW",7500);
        LaserPrinter laser= new LaserPrinter("Canon MFC643Cdw",1500);
        while (inkjet.print());
        while (laser.print());
    }
}
