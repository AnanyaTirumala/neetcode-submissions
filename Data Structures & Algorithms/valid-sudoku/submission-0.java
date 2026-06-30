class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<9; i++){
        HashSet<Character> rows = new HashSet<>();
        for(int j=0; j<9; j++){
            if (board[i][j]!='.'){
                if(!rows.add(board[i][j])){
                    System.out.println("1i=" + i + "j=" + j);
                    return false;
                }
            }
        }
       }
       for(int i=0; i<9; i++){
            HashSet<Character> cols = new HashSet<>();
            for(int j=0; j<9; j++){
                // System.out.println("\n" + board[j][i]);
                if (board[j][i]!='.'){
                    if(!cols.add(board[j][i])){
                        System.out.println("2i=" + i + "j=" + j);
                        return false;
                    }
                } 
            }
       }

        HashSet<Character> square1 = new HashSet<>();
        HashSet<Character> square2 = new HashSet<>();
        HashSet<Character> square3 = new HashSet<>();

        // int j=0;
        for(int i=0; i<9; i++){
            if(i%3==0){
                square1.clear();
                square2.clear();
                square3.clear();
            }
            for(int j=0; j<3; j++){
                System.out.println("#i=" + i + " j=" + j);
                if (board[i][j]!='.'){
                    System.out.println(square1);
                    
                    if(!square1.add(board[i][j])){
                        System.out.println("3i=" + i + "j=" + j);
                        return false;
                    }
                } 
            }
            for(int j=3; j<6; j++){
                System.out.println("$i=" + i + " j=" + j);
                if (board[i][j]!='.'){
                    if(!square2.add(board[i][j])){
                        System.out.println("3i=" + i + "j=" + j);
                        return false;
                    }
                } 
            }
            for(int j=6; j<9; j++){
                System.out.println("^i=" + i + " j=" + j);
                if (board[i][j]!='.'){
                    if(!square3.add(board[i][j])){
                        System.out.println("3i=" + i + "j=" + j);
                        return false;
                    }
                } 
            }
            // j=0;
            
       }
       System.out.println("Here");
       return true;

    }
}
