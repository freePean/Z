package cn.z.jiuitan.asserts;


public class AssertFoo {

    public static void main(String[] args) {
        //断言1结果为true,则继续往下执行
        assert true;
        System.out.println("断言1没有问题，Go!");
        
        System.out.println("\n-----------------------\n");
        
        assert false;
        System.out.println("断言2没有问题，Go!");
    }
    
}
