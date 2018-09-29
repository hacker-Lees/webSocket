package com.example.websocket.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.session.StandardSessionFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.Session;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;
import javax.websocket.server.ServerEndpointConfig.Configurator;

/**
 * @author huoNan
 */
@Slf4j
@Configuration
public class WebSocketConfig extends Configurator {

    @Override
    public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        /*如果没有监听器,那么这里获取到的HttpSession是null*/
        StandardSessionFacade ssf = (StandardSessionFacade) request.getHttpSession();
        if (ssf != null) {
            HttpSession httpSession = (HttpSession) request.getHttpSession();
            //关键操作
            sec.getUserProperties().put("sessionId", httpSession.getId());
            log.info("获取到的SessionID：" + httpSession.getId());
        }
    }


    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        //这个对象说一下，貌似只有服务器是tomcat的时候才需要配置,具体我没有研究
        return new ServerEndpointExporter();
    }
}