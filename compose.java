// Finally we have to compose Move, board and finally game : 
public class Board {

    private Square[][] squareSet;


    public Piece[][] pieceSet { get; set; }


    public Board Clone() { ... }

}


public class Move {

    public Square From { get; }

    public Square To { get; }

    public Piece PieceMoved { get; }

    public Piece PieceCaptured { get; }

    public PieceType Promotion { get; }

    public string AlgebraicNotation { get; }

}


public class Game {

    public Board Board { get; }

    public List<Move> Movelist { get; }

    public PieceType Turn { get; set; }

    public Square DoublePawnPush { get; set; } // Used for tracking valid en passant captures

    public int Halfmoves { get; set; }

  

 Player p1,p2;


    public bool CanWhiteCastleA { get; set; }

    public bool CanWhiteCastleH { get; set; }

    public bool CanBlackCastleA { get; set; }

    public bool CanBlackCastleH { get; set; }

  

 //methods

 private void createAndPlacePieces(){

 //generate pieces using a factory method

   //for e.g. config[1][0] = PieceFactory("Pawn",color);

 }

  

 private void setTurn(color) {

  turn = color;

  currentPlayer = (turn==black)?p2 : p1;

 }

  

 private void Play()

 {

  while(CheckStatus!=GameOver)

  {

    changeTurn(); // calls movePiece on the Piece object    


  }

 }

  

}


public interface IGameRules {

    // ....

}
