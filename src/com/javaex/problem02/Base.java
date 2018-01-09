package com.javaex.problem02;

public class Base {
    
    public void service(String state) {
        
        //코드작성
    	switch(state) {
        case "낮": {day(); break;}
        case "밤": {night(); break;}
        case "오후": {afternoon(); break;}
        }
    }

    public void day() {
        System.out.println("낮에는 열심히 일하자");
    }

    public void night() {
        System.out.println("night");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }

}
