package com.company.designPattern.singleton;
//한 번 연결해놨던 connect 통로를 사용하는 예시

//singleton은 자기 자신을 객체로 가져야 함.
//기본생성자를 private으로 막아야 함.(기본생성자로 생성 불가능하도록)
//static 메소드로 getInstance 메소드 제공해야 함.
public class SocketClient {
    private static SocketClient socketClient = null;
    private SocketClient(){

    }
    //singleton이 아닌 경우
//    public SocketClient(){
//
//    }


    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect~~");
    }
}
