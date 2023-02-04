class Question6
{
    protected void print(String...input)
    {
        for(String s:input)
            System.out.print(s+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Question6 obj=new Question6();
        obj.print();
        obj.print("Hello");
        obj.print("We","are","from","ZSgs");
    }
}
