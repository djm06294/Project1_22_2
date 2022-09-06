package org.example;

public interface ICRUD {
    //형태는 사용자가 원하는대로 만들어
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);

}
