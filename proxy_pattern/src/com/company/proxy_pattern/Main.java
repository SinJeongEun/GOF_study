package com.company.proxy_pattern;

import com.company.proxy_pattern.proxy.Browser;
import com.company.proxy_pattern.proxy.BrowserProxy;
import com.company.proxy_pattern.proxy.IBrowser;

public class Main {

    public static void main(String[] args) {
        //Cache 기능 전혀 없이 매번 로딩하여 결과 출력;
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show(); // 첫번째만 loading 하여 출력
        browser.show(); // 이후로는 cache 기능으로 이미 저장된 html 출력 출력
        browser.show();
        browser.show();
        browser.show();

    }
}
