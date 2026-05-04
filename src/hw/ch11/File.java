package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // search() 메서드 구현  
    @Override
    public List<Entry> search(String keyword) {
        List<Entry> results = new ArrayList<>();
        if (getName().contains(keyword)) {
            results.add(this);      
        }
        return results;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
