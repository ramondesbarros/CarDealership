package br.com.cardealership.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.stereotype.Component;

@Component
public class RedisSessionRepositoryImpl implements RedisSessionRepository {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Autowired
    private RedisOperationsSessionRepository redisOperationsSessionRepository;

    @Override
    public void delete(String sessionId) {

        redisOperationsSessionRepository.delete(sessionId);
    }

}
