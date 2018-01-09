package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        String ss = null;
        // 친구정보 입력받기
        for (int i=0;i<friendArray.length;i++) {
        	ss=sc.nextLine();
        }
        // 입력받은 친구정보를 공백으로 분리
        String[] tt = ss.split(" ");
        	
        
        // Friend 객체 생성하여 데이터 넣기
        String name=null;
        String hp=null; 
        String school=null;
        
        Friend aa=new Friend(name,hp,school);
        for(int i=0;i<3;i++) {
        	aa.setName(tt[i]);
        	aa.setHp(tt[i+1]);
        	aa.setSchool(tt[i+2]);
        // 배열에 추가하기
        	friendArray[i]=new String[]{aa.getName(),aa.getHp(),aa.getSchool()};
        }
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	aa.showInfo();
        }

        sc.close();
    }

}
