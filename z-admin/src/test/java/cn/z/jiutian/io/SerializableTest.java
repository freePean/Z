package cn.z.jiutian.io;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.BaseTest;
import cn.z.jiutian.io.serializable.Person;
import cn.z.jiutian.io.serializable.SerializableUtils;

public class SerializableTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(SerializableTest.class);
    
    /*
     * 对象、文件、数据，有许多不同的格式，很难统一传输和保存。
     * 序列化以后就都是字节流，无论原来是什么东西，都能变成一样的东西，
     * 就可以进行通用的格式传输或保存，传输结束以后，要再次使用，就进行
     * 反序列化还原，这样对象还是对象，文件还是文件。
     * 
     * 定义
     * 序列化（serialization）在计算机科学的资料处理中，
     * 是指将数据结构或物件状态转换成可取用格式（例如存成档案，
     * 存于缓冲，或经由网络中传送），以留待后续在相同或另一台
     * 计算机环境中，能恢复原先状态的过程。
     */
    
    @Test
    public void writeTest(){
        Person p = new Person();
        p.setName("人生大赢家");
        
        SerializableUtils.writeObject(p);
    }

    @Test
    public void readTest(){
        Object obj = SerializableUtils.readObject();
        Person p = (Person) obj;
        
        LOG.info(JSON.toJSONString(p));
    }
}
