package com.zhonghangxin.proxy;

public class ProxyTest {
	
	/**
	 * ����ģʽ��Ӧ�ó�����

                     ������еķ�����ʹ�õ�ʱ����Ҫ��ԭ�еķ������иĽ�����ʱ�����ְ취��
            1���޸�ԭ�еķ�������Ӧ������Υ���ˡ�����չ���ţ����޸Ĺرա���ԭ��
			2�����ǲ���һ�����������ԭ�еķ������ҶԲ����Ľ�����п��ơ����ַ������Ǵ���ģʽ��
			ʹ�ô���ģʽ�����Խ����ܻ��ֵĸ��������������ں���ά����
			
	 * @param args
	 */

	public static void main(String[] args) {

		Sourceable source = new Proxy();
		source.method();
	}

}