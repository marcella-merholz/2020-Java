package at.dcv.marcella;

public class KW45_Day02_TwoDArray {
    public static void graph() {
        char[][] myField = initArray(80, 80);

        // drawSquare(myField, 5);
        // drawSquare(myField, 11);
        // drawSquare(myField, 17);
        // drawSquare(myField, 23);
        drawLine(myField, 0, 0, 0, 0);
        //drawLine(myField, 25, 0, 0, 25);
        printField(myField);
    }

    public static char[][] initArray(int rows, int columns){
        char[][] retVal = new char[rows][columns];
        for (int row = 0; row < retVal.length; row++) {
            for (int column = 0; column < retVal[row].length; column++) {
                retVal[row][column] = ' ';
            }
        }
        return retVal;
    }

    public static void drawLine(char[][] field, int startRow, int startColumn, int endRow, int endColumn){
        float direction = getGrade(startRow, startColumn, endRow, endColumn);

        if (Math.abs(direction) <= 1) {
            int stepColumn = (endColumn - startColumn) / Math.abs(endColumn - startColumn);
            for (int currentColumn = startColumn; currentColumn != endColumn; currentColumn += stepColumn) { // stepColumn gibt die Richtung an (links/rechts)
                int currentRow = startRow + Math.round((currentColumn - startColumn) * direction);
                //System.out.println("Col: " + currentColumn + " Row: " + currentRow);
                field[currentRow][currentColumn] = 'X';
            }
        } else {
            int stepRow = (endRow - startRow != 0) ? (endRow - startRow) / Math.abs((endRow - startRow)) : 1;
            for (int currentRow = startRow; currentRow != endRow; currentRow += stepRow) {
                int currentColumn = startColumn + Math.round((currentRow - startRow) / direction);
                field[currentRow][currentColumn] = 'T';
            }
        }
        field[endRow][endColumn] = 'X';

/*
        for (int i = 0; i < field[endRow][endColumn]; i++) {

            double direction = getGrade(startRow, startColumn, endRow, endColumn);
            if (direction == 1.0) {
                field[startRow + i][startColumn + i] = 'X';
            }
            else if (direction < 1.0) {
                field[startRow + i][startColumn + i * Math.round((endColumn - startColumn) / (endRow - startRow))] = 'X';
            }
            else if (direction > 1.0) {
                field[startRow + i * Math.round((endRow - startRow) / (endColumn - startColumn))][startColumn + i] = 'X';
            }
        }
 */
    }

    public static float getGrade(int startRow, int startColumn, int endRow, int endColumn) {
        float grade = (float)(endRow - startRow) / (float)(endColumn - startColumn);
        //System.out.println(grade);
        return grade;
    }

    public static void drawSquare(char[][] field, int size){
        int startRow = Math.round((field.length-size) / 2.0f);
        int startColumn = Math.round((field[0].length-size) / 2.0f);

        for (int i = 0; i < size; i++) {
            field[startRow + 0][startColumn + i] = '1';
            field[startRow + i][startColumn + 0] = '2';
            field[startRow + size - 1][startColumn + i] = '3';
            field[startRow + i][startColumn + size - 1] = '4';
        }
    }

    public static void printField(char[][] field){
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                System.out.print(field[row][column]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }



}
