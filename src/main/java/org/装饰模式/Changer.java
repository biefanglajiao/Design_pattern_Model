package org.装饰模式;

public class Changer implements Transform {
    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }

}
