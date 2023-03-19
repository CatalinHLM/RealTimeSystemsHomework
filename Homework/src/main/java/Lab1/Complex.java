package Lab1;

public class Complex {

    private int re;
    private int im;

    public Complex() {
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getRe() {
        return re;
    }

    public int getIm() {
        return im;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public void setIm(int im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return re + "+" + im + "i";
    }

    public Complex sum(Complex a, Complex b)
    {
        return new Complex(a.re+b.re,a.im+b.im);
    }

    public Complex plus(Complex b)
    {
        return new Complex(this.re+b.re,this.im+b.im);
    }
    public Complex times(Complex b)
    {
        return new Complex(this.re*b.re-this.im*b.im,this.re*b.im+this.im*b.re);
    }

    public static void main(String args[])
    {
        Complex a= new Complex(2,5);
        Complex b= new Complex(4,-1);

        System.out.println("("+a +")+("+b+")="+a.plus(b));
        System.out.println("("+a +")*("+b+")="+a.times(b));

    }
}
