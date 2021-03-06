public enum PieceType {

    None, Pawn, Knight, Bishop, Rook, Queen, King

}


public enum PieceColor {

    White, Black

}


public struct Piece {

    public PieceType Type { get; set; }

    public PieceColor Color { get; set; }

}

public class Square {

    public int X { get; set; }

    public int Y { get; set; }

}

