class Solution {
    public boolean isValidRowSodoku(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Integer> rowSet = new HashSet<>();
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch == '.'){
                    continue;
                }else{
                    int num = ch - '0';
                    if(rowSet.contains(num)){
                        return false;
                    }
                    rowSet.add(num);
                }
            }
        }
        return true;
    }

    public boolean isValidColSodoku(char[][] board){
        for(int i=0;i<9;i++){
            HashSet<Integer> colSet = new HashSet<>();
            for(int j=0;j<9;j++){
                char ch = board[j][i];
                if(ch == '.'){
                    continue;
                }else{
                    int num = ch - '0';
                    if(colSet.contains(num)){
                        return false;
                    }
                    colSet.add(num);
                }
            }
        }
        return true;
    }

    public boolean isValidGridSodoku(char[][] board){
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                HashSet<Integer> gridSet = new HashSet<>();
                for(int r=i;r<i+3;r++){
                    for(int c=j;c<j+3;c++){
                        char ch = board[r][c];
                        if(ch == '.'){
                            continue;
                        }else{
                            int num = ch - '0';
                            if(gridSet.contains(num)){
                                return false;
                            }
                            gridSet.add(num);
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        boolean isSodokuValid = isValidRowSodoku(board) && isValidColSodoku(board) && isValidGridSodoku(board);
        return isSodokuValid;
    }
}
