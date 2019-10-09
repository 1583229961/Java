package com.demo.model;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.ibatis.cache.Cache;

public class CusCache implements Cache {

	private ReadWriteLock lock = new ReentrantReadWriteLock();
    private ConcurrentHashMap<Object,Object> cache = new ConcurrentHashMap<Object, Object>();
    private String id;

    public  CusCache(){
        System.out.println("��ʼ��-1��");
    }

  //�����иù��캯��
    public CusCache(String id){
        System.out.println("��ʼ��-2��");
        this.id = id;
    }

    // ��ȡ������
    public String getId() {
        System.out.println("�õ�ID��" + id);
        return id;
    }

    //��ȡ�������Ĵ�С
    public int getSize() {
        System.out.println("��ȡ�����С��");
        return 0;
    }
    // ����keyֵ�������
    public void putObject(Object key, Object value) {
        System.out.println("�����������Ԫ�أ�key=" + key+",value=" + value);
        cache.put(key,value);
    }

    //ͨ��KEY
    public Object getObject(Object key) {
        System.out.println("ͨ��kEY��ȡֵ��" + key);
        System.out.println("OVER");
        System.out.println("=======================================================");
        System.out.println("ֵΪ��" + cache.get(key));
        System.out.println("=====================OVER==============================");
        return cache.get(key);
    }

    // ͨ��keyɾ���������
    public Object removeObject(Object key) {
        System.out.println("�Ƴ��������" + key);
        return null;
    }

    // ��ջ���
    public void clear() {
        System.out.println("������棡");
        cache.clear();
    }

    // ��ȡ����Ķ�д��
    public ReadWriteLock getReadWriteLock() {
        System.out.println("��ȡ�����󣡣���");
        return lock;
    }
}
