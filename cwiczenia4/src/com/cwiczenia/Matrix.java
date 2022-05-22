package com.cwiczenia;

public class Matrix {
    private int [][] matrix;
    private static int [][] tmpMatrix;
    private int [] tmpMultiMtx;
    private static int counter;

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        if(matrix == null){
            throw new IllegalArgumentException("The matrix cannot be null");
        }
        this.matrix = matrix;
    }

    public int[][] getTmpMatrix() {
        return tmpMatrix;
    }

    public void setTmpMatrix(int[][] tmpMatrix) {
        if(matrix == null){
            throw new IllegalArgumentException("The matrix cannot be null");
        }
        this.tmpMatrix = tmpMatrix;
    }

    private Matrix(int[][] tmpMatrix) {
        matrix = tmpMatrix;
    }
    public static void SetUpMatrix(int rowCount, int columnCount){
        if(rowCount <= 0 || columnCount <= 0){
            throw new IllegalArgumentException("Number of rows and columns have to be positive.");
        }
        tmpMatrix = new int [rowCount][columnCount];
    }
    public static void insertRow(int[] row){
        for (int i = 0; i < row.length; i++) {
            tmpMatrix[counter][i] = row[i];
        }
        counter ++;
    }
    public static Matrix Create(){
        counter = 0;
        Matrix matrix = new Matrix(tmpMatrix);
        return matrix;
    }
    public void print(){
        for (int i = 0; i < this.getMatrix().length; i++) {
            System.out.print("| ");
            for (int j = 0; j < this.getMatrix()[0].length; j++) {
                System.out.print(this.getMatrix()[i][j]+" ");
            }
            System.out.print("|");
            System.out.println("");
        }
    }
    public Matrix add(Matrix m){
        if(m.getMatrix().length != this.getMatrix().length || m.getMatrix()[0].length != this.getMatrix()[0].length){
            throw new IllegalArgumentException("The dimensions of matrixes have to be same.");
        }
        for (int i = 0; i < m.getMatrix().length; i++) {
            for (int j = 0; j < m.getMatrix()[0].length; j++) {
                this.getMatrix()[i][j] = m.getMatrix()[i][j] + this.getMatrix()[i][j];
            }
        }
        return this;
    }
    public static Matrix add(Matrix m1, Matrix m2){
        if(m1.getMatrix().length != m2.getMatrix().length || m1.getMatrix()[0].length != m2.getMatrix()[0].length){
            throw new IllegalArgumentException("The dimensions of matrixes have to be same.");
        }
        Matrix.SetUpMatrix(m1.getMatrix().length,m1.getMatrix()[0].length);
        int []tmpMtx = new int [m1.getMatrix()[0].length];
        for (int i = 0; i < m1.getMatrix().length; i++) {
            for (int j = 0; j < m1.getMatrix()[0].length; j++) {
                tmpMtx [j] = m1.getMatrix()[i][j] + m2.getMatrix()[i][j];
            }
            Matrix.insertRow(tmpMtx);
        }
        Matrix sumMtx = Matrix.Create();
        return sumMtx;
    }
    public Matrix subtract(Matrix m){
        if(m.getMatrix().length != this.getMatrix().length || m.getMatrix()[0].length != this.getMatrix()[0].length){
            throw new IllegalArgumentException("The dimensions of matrixes have to be same.");
        }
        for (int i = 0; i < m.getMatrix().length; i++) {
            for (int j = 0; j < m.getMatrix()[0].length; j++) {
                this.getMatrix()[i][j] = this.getMatrix()[i][j] - m.getMatrix()[i][j] ;
            }
        }
        return this;
    }
    public static Matrix subtract(Matrix m1, Matrix m2){
        if(m1.getMatrix().length != m2.getMatrix().length || m1.getMatrix()[0].length != m2.getMatrix()[0].length){
            throw new IllegalArgumentException("The dimensions of matrixes have to be same.");
        }
        Matrix.SetUpMatrix(m1.getMatrix().length,m1.getMatrix()[0].length);
        int []tmpMtx = new int [m1.getMatrix().length];
        for (int i = 0; i < m1.getMatrix().length; i++) {
            for (int j = 0; j < m1.getMatrix()[0].length; j++) {
                tmpMtx [j] = m1.getMatrix()[i][j] - m2.getMatrix()[i][j];
            }
            Matrix.insertRow(tmpMtx);
        }
        Matrix sumMtx = Matrix.Create();
        return sumMtx;
    }
    public static Matrix multiply(Matrix m1, Matrix m2){//Niestesty nie działa poprawnie. Jedynie dla skrajnych elementów je OK, tzn. dla elementu [0][0] i [n][n]
        if(m1.getMatrix()[0].length != m2.getMatrix().length){
            throw new IllegalArgumentException("Number of columns first matrix have to be equal number of rows second matrix.");
        }
        Matrix.SetUpMatrix(m1.getMatrix().length,m1.getMatrix()[0].length);
        int []tmpMtx = new int [m1.getMatrix()[0].length];
        int sumElement = 0;
        for (int i = 0; i < m1.getMatrix().length; i++) {
            for (int j = 0; j < m1.getMatrix()[0].length; j++) {
                sumElement += m1.getMatrix()[i][j] * m2.getMatrix()[j][i];
                for (int k = 0; k < m1.getMatrix().length; k++) {
                    tmpMtx[k] = sumElement;
                }
            }
            Matrix.insertRow(tmpMtx);
            sumElement = 0;

        }
        Matrix mulMtx = Matrix.Create();
        return mulMtx;
    }
}

