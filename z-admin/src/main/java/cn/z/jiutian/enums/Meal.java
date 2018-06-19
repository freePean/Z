package cn.z.jiutian.enums;


public enum Meal {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);
   
    private Food[] values;
    
    private Meal(Class<? extends Food> kind){
        this.values = kind.getEnumConstants();
    }

}
