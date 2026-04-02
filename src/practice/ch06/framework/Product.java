package practice.ch06.framework;

// public interface Product { // CloneNotSupportedException 발생  
public interface Product extends Cloneable { // Cloneable 인터페이스 상속 
    public abstract void use(String s);
    public abstract Product createCopy(); // 복제 메서드 
}
