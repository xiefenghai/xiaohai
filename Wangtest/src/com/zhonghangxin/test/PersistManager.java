package com.zhonghangxin.test;

public class PersistManager {
	
	 //ģ�巽�������ɸ��ӿ�ʵ�֣�
    public static void persist(PersistCallback persistCallback) {
	  Session session = SessionFactory.openSession();
         try {
            System.out.println("��������");     
            persistCallback.doPersist(session);
            System.out.println("�ύ����");
         }catch(Exception e) {
            e.printStackTrace();
            System.out.println("�ع�����");
         }finally {
        	 System.out.println("�ر�����");
             System.out.println("1111");
         }           
    }

}
