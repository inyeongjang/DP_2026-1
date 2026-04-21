package practice.ch11;

public class Main {
    public static void main(String[] args) {        
        
        // 디렉터리 트리를 만든다. 
        Directory root = new Directory("root");
       
        // 업 캐스팅은 자동으로 일어난다. 
        // Entry root = new Directory("root"); // add() 메소드 호출 시 컴파일 에러 발생 (Directory 타입의 add() 메소드는 Entry 타입에서 선언되지 않았기 때문) -> 형변환 필요 

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 파일 생성 및 추가 
        
        // 다운 캐스팅
        // ((Directory)root).add(bin); // 형 변환, . 연산자가 타입 캐스팅 연산자보다 우선 순위가 높다. 
        
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 디렉토리 리스트 출력 
        root.printList();
    }   
    
}
