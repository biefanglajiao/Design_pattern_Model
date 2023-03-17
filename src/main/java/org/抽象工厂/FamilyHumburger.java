package org.抽象工厂;

public class FamilyHumburger implements Hamburger{
    @Override
    public void prebark() {
        System.out.println("准备FamilyHumburger");
    }

    @Override
    public void cut() {
        System.out.println("切FamilyHumburger");
    }

    @Override
    public void Box() {
        System.out.println(
                "打包FamilyHumburger"
        );
    }
}
