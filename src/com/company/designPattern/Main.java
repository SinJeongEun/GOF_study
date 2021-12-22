package com.company.designPattern;

import com.company.designPattern.singleton.AClazz;
import com.company.designPattern.singleton.BClazz;
import com.company.designPattern.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        //singleton 이므로 두 객체가 동일하다고 나옴.
        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        //singleton이 아닌 경우: 두 객체가 다르다고 나옴

        System.out.println("두개의 객체가 동일한가요?");
        System.out.println(aClient.equals(bClient));
    }
}
