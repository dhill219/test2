/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author dhill
 */
public class parttimestudenet {
    private String name;
    private int num;

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public parttimestudenet(String name, int num) {
        this.name = name;
        this.num = num;
    }
    
}
