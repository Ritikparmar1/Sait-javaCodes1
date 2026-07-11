class Test
{
    Test()
    {
        this(10);
        System.out.print("A");
    }

    Test(int x)
    {
        System.out.print("B");
    }

    public static void main(String[] args)
    {
        new Test();
    }
}