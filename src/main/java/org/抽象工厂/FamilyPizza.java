package org.抽象工厂;

public class FamilyPizza implements Pizza{
    @Override
    public void prebark() {
        System.out.println("FamliyPizza准备");
    }

    @Override
    public void cut() {

        System.out.println("切FamliyPizza");
    }

    @Override
    public void Box() {

        System.out.println(
                "打包FamilyPizza"
        );
    }
}
