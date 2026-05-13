package hw.ch16;

import java.awt.Label;
import java.awt.Color;

public class ColleagueLabel extends Label implements Colleague {
    
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setColleagueEnabled(boolean enabled) {
        if (enabled) {
            setText("● 로그인 가능");
            setForeground(Color.blue);
        } else {
            setText("● 로그인 불가");
            setForeground(Color.gray);
        }
        setEnabled(enabled);
    }

}
