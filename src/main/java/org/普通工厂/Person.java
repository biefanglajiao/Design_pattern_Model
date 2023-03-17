package org.普通工厂;

public  class Person implements Iwork{
    private String person;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
Iwork iwork;
    @Override
    public  void work() throws Exception {

        iwork=WorkFactory.workfactory("mouthmask");
        iwork.work();
        System.out.println(getPerson()+"干活");
    }
}
