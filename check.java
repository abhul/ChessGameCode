public class ChessPieceTurn {

};


public class GameManager {

    void processTurn(PlayerBase player) {

    };


    boolean acceptTurn(ChessPieceTurn turn) {

        return true;

    };


    Position currentPosition;

}


public abstract class PlayerBase {

    public abstract ChessPieceTurn getTurn(Position p);

}


class ComputerPlayer extends PlayerBase {

    @Override

    public ChessPieceTurn getTurn(Position p) {

        return null;

    }


    public void setDifficulty() {

    };


    public PositionEstimator estimater;

    public PositionBackTracker backtracter;

}


public class HumanPlayer extends PlayerBase {

    @Override

    public ChessPieceTurn getTurn(Position p) {

        return null;

    }

}


public abstract class ChessPieceBase {

    abstract boolean canBeChecked();


    abstract boolean isSupportCastle();

}


public class King extends ChessPieceBase {


    @Override

    boolean canBeChecked() {

        // TODO Auto-generated method stub

        return false;

    }


    @Override

    boolean isSupportCastle() {

        // TODO Auto-generated method stub

        return false;

    }

}


public class Queen extends ChessPieceBase {


    @Override

    boolean canBeChecked() {

        // TODO Auto-generated method stub

        return false;

    }


    @Override

    boolean isSupportCastle() {

        // TODO Auto-generated method stub

        return false;

    }

}


public class Position { // represents chess positions in compact form

    ArrayList<ChessPieceBase> black;


    ArrayList<ChessPieceBase> white;

}


public class PositionBackTracker {

    public Position getNext(Position p) {

        return null;

    }

}


public class PositionEstimator {

    public PositionPotentialValue estimate(Position p) {

        return null;

    }

}


public abstract class PositionPotentialValue {

    abstract boolean lessThan(PositionPotentialValue pv);

}
