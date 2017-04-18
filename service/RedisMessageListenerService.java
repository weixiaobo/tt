package com.lsn.web.service;

import javax.annotation.Resource;

import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import com.lsn.web.entity.RedisMessageListener;


/** 
* @ClassName: RedisMessageService 
* @Description: redis消息队列服务类
* @author 000001
* @date 2017年4月14日 上午11:36:12 
*  
*/
public class RedisMessageListenerService {

	@Resource 
	private RedisMessageListenerContainer redisMessageListenerContainer;
	
	@Resource
	private RedisMessageListener redisMessageListener;
	
	/** 
	* @Title: initContainer 
	* @Description: 添加消息容器messageListener
	* @param   参数说明 
	* @return void    返回类型 
	* @throws 
	*/
	public void initContainer() {
		PatternTopic topic=new PatternTopic("douzi");
		redisMessageListenerContainer.addMessageListener(redisMessageListener, topic);
	}
}
