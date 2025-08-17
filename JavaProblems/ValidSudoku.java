// JavaProblems/ValidSudoku.java
import java.util.*;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board){
        for(int i=0;i<9;i++){
            Set<Character> row=new HashSet<>();
            Set<Character> col=new HashSet<>();
            Set<Character> cube=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && !row.add(board[i][j])) return false;
                if(board[j][i]!='.' && !col.add(board[j][i])) return false;
                int r=3*(i/3)+j/3, c=3*(i%3)+j%3;
                if(board[r][c]!='.' && !cube.add(board[r][c])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        char[][] board={
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Is valid Sudoku: "+isValidSudoku(board));
    }
}
