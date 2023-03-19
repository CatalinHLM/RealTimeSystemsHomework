package Lab1;

import java.util.Arrays;

public class Matrix{

    int[][] m= new int[3][3];

    public Matrix() {
    }

    public Matrix(int[][] a) {
        this.m = a;
    }

    @Override
    public String toString() {
        return Arrays.toString(m[0]) +
                "\n" + Arrays.toString(m[1]) +
                "\n" + Arrays.toString(m[2]);

    }

    public Matrix plus(Matrix b)
    {
        Matrix c=new Matrix();
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                c.m[i][j]=this.m[i][j]+b.m[i][j];
        return c;
    }

    public Matrix times(Matrix b)
    {
        int[][] cr={{0,0,0},{0,0,0},{0,0,0}};
        Matrix c=new Matrix(cr);
        for(int r=0;r<3;r++)
            for(int l=0;l<3;l++)
                for(int i=0;i<3;i++)
                    c.m[r][l]=c.m[r][l]+this.m[r][i]*b.m[i][l];
        return c;
    }
    public static void main(String args[])
    {
        int[][] ar={{2,3,1},{7,1,6},{9,2,4}};
        int[][] br={{8,5,3},{3,9,2},{2,7,3}};
        Matrix a =new Matrix(ar);
        Matrix b =new Matrix(br);

        System.out.println("Sum=");
        System.out.println(a.plus(b));
        System.out.println("Product=");
        System.out.println(a.times(b));
    }

}
