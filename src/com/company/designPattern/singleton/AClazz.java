package com.company.designPattern.singleton;

public class AClazz {
    private SocketClient socketClient;

    //SocketClient 기본생성자를 private 이므로 사용 불가, getInstance로 객체 생성 가능
    public AClazz(){
        this.socketClient = SocketClient.getInstance();
        //singleton이 아닌 경우
//        this.socketClient = new SocketClient();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
