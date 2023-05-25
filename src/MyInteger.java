public class MyInteger
{
    private int value;

    //Parameterized Constructor declared
    public MyInteger(int value)
    {
        this.value = value;
    }

    public int get()
    {
        return value;
    }

    //Checks if the value is Even and returns boolean value
    public boolean isEven()
    {
        return value % 2 == 0;
    }

    //Checks if the value is Odd and returns boolean value
    public boolean isOdd()
    {
        return value % 2 != 0;
    }

    //Checks if the value is Prime or not and returns boolean value
    public boolean isPrime()
    {
        if (value < 2)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++)
        {
            if (value % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int otherValue)
    {
        return value == otherValue;
    }

    //return true if the value in the object is equal to the specified value
    public boolean equals(MyInteger other)
    {
        return value == other.value;
    }

    public static boolean isEven(int value)
    {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value)
    {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value)
    {
        if (value < 2)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++)
        {
            if (value % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static boolean isEven(MyInteger myInteger)
    {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger)
    {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger)
    {
        return myInteger.isPrime();
    }

    public static int parseInt(String str)
    {
        return Integer.parseInt(str);
    }
}
