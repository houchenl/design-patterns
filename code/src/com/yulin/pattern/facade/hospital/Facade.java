package com.yulin.pattern.facade.hospital;

// 接待员
public class Facade {

    private DepartA departA;
    private DepartB departB;
    private DepartC departC;
    private DepartD departD;

    public Facade() {
        departA = new DepartA();
        departB = new DepartB();
        departC = new DepartC();
        departD = new DepartD();
    }

    public void guahao() {
        if (null != departB) {
            departB.guahao();
        }
    }

    public void consult() {
        if (null != departA) {
            departA.consult();
        }
    }

    public void medicine() {
        if (null != departC) {
            departC.medicine();
        }
    }

    public void pay() {
        if (null != departD) {
            departD.pay();
        }
    }

}
