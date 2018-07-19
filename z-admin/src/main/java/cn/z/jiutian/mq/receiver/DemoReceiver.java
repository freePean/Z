package cn.z.jiutian.mq.receiver;

import javax.jms.Message;

import com.alibaba.fastjson.JSON;

import cn.z.jiutian.mq.DemoDto;
import cn.z.jiutian.mq.MessageReceiver;

public class DemoReceiver extends MessageReceiver<DemoDto>{

    @Override
    public void onMessage(Message message) {
        DemoDto dto = parseObject(message, DemoDto.class);
        logger.info("{}", JSON.toJSON(dto));
    }
    
}
