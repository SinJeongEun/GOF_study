package com.company.designPattern2.adapter;

public class SocketAdapter implements Electronic110V {
    private Electronic220V electronic220V; //110로 바꿔줄 제품

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect(); //110v의 poweron이 아닌 220v의 함수 connect를 호출해줌
    }
    //220v ->110v
}
