package com.company.proxy_pattern;

import com.company.proxy_pattern.aop.AopBrowser;
import com.company.proxy_pattern.proxy.Browser;
import com.company.proxy_pattern.proxy.BrowserProxy;
import com.company.proxy_pattern.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {
        //Cache 기능 전혀 없이 매번 로딩하여 결과 출력;
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();

        //proxy 패턴
//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show(); // 첫번째만 loading 하여 출력
//        browser.show(); // 이후로는 cache 기능으로 이미 저장된 html 출력 출력
//        browser.show();
//        browser.show();
//        browser.show();

        //aop : 프록시 패턴을 사용하고 있음
        // 특정 메소드 앞뒤로 원하는 기능을 넣어(ex 시간 확인) 어느쪽에서 지연이 발생하는지 발견 가능함
        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                });
        //설정해둔 1.5초 걸림
        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        //cache 기능으로 0초 걸림
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }
}
