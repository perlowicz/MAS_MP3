package dynamic;

public interface Engine { }

class Diesel implements Engine { }

class Electric implements Engine { }

class Car /* NOT extends Diesel/Electric */ {
    Engine engine; /* delegate or composition pattern */
}