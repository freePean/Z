package cn.z.jiutian.jdk8;


public class Employee {

    private String name;
    
    private Long id;
    
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public Employee setId(Employee employee){
        this.id = employee.getId();
        return this;
    }
    
    public Employee setName(Employee employee){
        this.name = employee.getName();
        return this;
    }
    
    public Employee setDesc(Employee employee){
        this.desc = employee.getDesc();
        return this;
    }
}
