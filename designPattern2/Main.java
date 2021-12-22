package com.company.designPattern2;

import com.company.designPattern2.adapter.AirConditioner;
import com.company.designPattern2.adapter.Cleaner;
import com.company.designPattern2.adapter.Electronic110V;
import com.company.designPattern2.adapter.HairDryer;
import com.company.designPattern2.adapter.SocketAdapter;

public class Main {

    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        SocketAdapter adapter2 = new SocketAdapter(airConditioner);
        connect(adapter2);


        Cleaner cleaner = new Cleaner();
        SocketAdapter adapter = new SocketAdapter(cleaner);
        connect(adapter);
        //connect는 110v용 함수 , cleaner은 220v 인터페이스 사용
        // 인터페이스가 달라서 사용이 불가할 떄는 'adapter'를 사용하여 변환시켜준다.
        // ==> Adapter 패턴
    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
