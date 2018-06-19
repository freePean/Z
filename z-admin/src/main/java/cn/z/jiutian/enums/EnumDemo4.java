package cn.z.jiutian.enums;


public class EnumDemo4 {

    public static void printName(Color color){
        switch(color){
            case BLUE:
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }
    
    public static void main(String[] args) {
        printName(Color.BLUE);
        printName(Color.RED);
        printName(Color.GREEN);
    }

}

enum Color{
    GREEN, RED, BLUE;
}
