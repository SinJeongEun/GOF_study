package com.company.proxy_pattern.aop;

import com.company.proxy_pattern.proxy.Html;
import com.company.proxy_pattern.proxy.IBrowser;

public class AopBrowser implements IBrowser {

    private String url;
    private Html html;
    //aop는 관점 지향이므로 앞과 뒤를 체크해야 됨
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url,Runnable before, Runnable after){
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() {
        before.run();
        if(html == null){
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from : " + url);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        after.run();
        System.out.println("AopBrowser html cache : "+ url);
        return null;
    }
}
