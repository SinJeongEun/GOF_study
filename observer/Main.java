package com.company.decoratorPattern;

import com.company.decoratorPattern.observer.Button;
import com.company.decoratorPattern.observer.IButtonListener;

import java.nio.Buffer;

public class Main {

    public static void main(String[] args) {
        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });

        button.click("메시지 전달 1");
        button.click("메시지 전달 2");
        button.click("메시지 전달 3");
        button.click("메시지 전달 4");
        button.click("메시지 전달 5");

    }
}
