package temp;

    interface b1{
        void browser();
    }
    interface b2{
        void browser1();
    }
    interface b3{
        void browser2();
    }

    class Browser implements b1,b2,b3{
        public void browser()
        {
            System.out.println("GC");
        }
        public void browser1()
        {
            System.out.println("Safari");
        }
        public void browser2()
        {
            System.out.println("Firefox");
        }
    }  
    public class monday1
    {
    public static void main(String[] args) {
      Browser obj=new Browser();
      obj.browser();
      obj.browser1();
      obj.browser2();
    }
}
    
