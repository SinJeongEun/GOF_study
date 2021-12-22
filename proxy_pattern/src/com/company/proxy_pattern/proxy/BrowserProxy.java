package com.company.proxy_pattern.proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private Html html; //html을 캐싱할거임

    public BrowserProxy(String url){
        this.url = url;
    }

    @Override
    public Html show() {
        if(html == null){
            this.html = new Html(url);
            System.out.println("BrowserProxy loading html from : " + url);
        }
        System.out.println("BrowserProxy use cache html from : " + url);
        return html;
    }
}
