//Mahsa Askari
//Matrikulation Nummer 7216484
//Java course exam task 2
class Figure {
    // Base class Figure
}

class King extends Figure {
    // Derived class King
    public void move() {
        // Method to perform King's move
        System.out.println("King moves in any direction.");
    }
}

class Pawn extends Figure {
    // Derived class Pawn
    public void move() {
        // Method to perform Pawn's move
        System.out.println("Pawn moves forward one square.");
    }
}

class Queen extends Figure {
    // Derived class Queen
    public void move() {
        // Method to perform Queen's move
        System.out.println("Queen moves horizontally or vertically any number of squares.");
    }
}

public class Chess {
    public static void main(String[] args) {
        // Creating objects of the derived classes
        King king = new King();
        Pawn pawn = new Pawn();
        Queen queen = new Queen();

        // Calling move() method for each object
        System.out.println();
        king.move();
        pawn.move();
        queen.move();
    }
}
