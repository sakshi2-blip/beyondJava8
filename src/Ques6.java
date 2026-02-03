public class Ques6 {


        public static void main(String[] args) {

            Shape circle = new Circle();
            Shape rectangle = new Rectangle();
            Shape triangle = new Triangle();

            circle.draw();
            rectangle.draw();
            triangle.draw();
        }
    }

    /* ================= PARENT SEALED CLASS ================= */

    sealed abstract class Shape
            permits Circle, Rectangle, Triangle {

        abstract void draw();
    }

    /* ================= FINAL CHILD CLASS ================= */

    final class Circle extends Shape {

        @Override
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    /* ================= SEALED CHILD CLASS ================= */

    sealed class Rectangle extends Shape
            permits Square {

        @Override
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    /* ================= FINAL GRANDCHILD ================= */

    final class Square extends Rectangle {

        @Override
        void draw() {
            System.out.println("Drawing Square");
        }
    }

    /* ================= NON-SEALED CHILD CLASS ================= */

    non-sealed class Triangle extends Shape {

        @Override
        void draw() {
            System.out.println("Drawing Triangle");
        }
    }

    /*  SUBCLASS OF NON-SEALED */

    class RightTriangle extends Triangle {

        @Override
        void draw() {
            System.out.println("Drawing Right Triangle");
        }
    }


