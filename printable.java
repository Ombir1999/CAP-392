interface printable {
    void print();
}
interface showable extends printable
{
    void show();
}
class TestInterface4 implements showable
{
    public void print()
    {
        System.out.println("hello");
    }
    public void show()
    {
        System.out.println("Welcome");
    }
    public static void main(String args[])
    {
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}