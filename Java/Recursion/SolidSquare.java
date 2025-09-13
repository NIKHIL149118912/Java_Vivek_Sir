class SolidSquare{
    static void printRow(int rowCount, int colCount)
    {
        if(rowCount<=0)
        {
            return;
        }
        printColumn(colCount);
        System.out.println();
        printRow(rowCount-1, colCount);
        
    }
    static void printColumn(int colCount)
    {
        if(colCount<=0)
        {
            return;
        }
        System.out.print("*");
        printColumn(colCount-1);
    }

    public static void main(String[] args)
    {
        printRow(5, 8);
    }
}