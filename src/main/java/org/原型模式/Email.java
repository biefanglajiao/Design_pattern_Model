package org.原型模式;

public class Email implements Cloneable {
    private Attcchment attcchmentl = null;

    public Email() {
        this.attcchmentl = new Attcchment();

    }

    public Object clone() {//Object中提供了克隆方法
        Email clone = null;
        try {
            clone = (Email) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("clone error");
            throw new RuntimeException(e);
        }
        return clone;
    }

    public Attcchment getAttcchmentl() {
        return this.attcchmentl;
    }
}
