package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member mem0 = new Member("jws","정우성",50000);
		Member mem1 = new Member("yjs","유재석",30000);
		Member mem2 = new Member("lhr","이효리",40000);
		
		Member[] memberArr = new Member[3];
		memberArr[0] = mem0;
		memberArr[1] = mem1;
		memberArr[2] = mem2;
		
		for(int i=0; i<memberArr.length; i++) {
			memberArr[i].showInfo();
		}
		
	}

}
