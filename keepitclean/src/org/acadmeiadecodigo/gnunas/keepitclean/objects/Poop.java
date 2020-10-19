package org.acadmeiadecodigo.gnunas.keepitclean.objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.acadmeiadecodigo.gnunas.keepitclean.characters.Cat;

public class Poop extends GameObject implements Interactable {

    Picture poop;
    private Cat cat;

    public Poop(Cat cat) {
        this.cat = cat;
        poop = new Picture(cat.getImageX(), cat.getImageY() , "GameObject/poop.png");
        poop.draw();
    }

    @Override
    public void interact() {

    }
}