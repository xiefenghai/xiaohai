package com.zhonghangxin.abstractfactory;

public class Test {

	public static void main(String[] args) {
         Provider provider = new SendMailFactory();
         
         Sender sender = provider.produce();
         System.out.println("44");

         sender.send();
	}

}
