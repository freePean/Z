package cn.z.jiutian.enums;


public enum EnumDemo3 {

    FIRST{

        @Override
        public String getInfo() {
            // TODO Auto-generated method stub
            return "FIRST TIME";
        }
    },
    SECOND{
        @Override
        public String getInfo() {
            // TODO Auto-generated method stub
            return "SECOND TIME";
        }
    };

    public abstract String getInfo();
    
    public static void main(String[] args) {
        System.out.println("F : " + EnumDemo3.FIRST.getInfo());
        System.out.println("S : " + EnumDemo3.SECOND.getInfo());
    }
}
