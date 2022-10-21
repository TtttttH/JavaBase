package Base;

public class FatherClass {
    static {
        System.out.println("Father static code block");
    }

    {
        System.out.println("Father non-static code block");
    }

    public FatherClass() {
        System.out.println("Father Construction");
    }

    public void pubFunc() {
        System.out.println("Father public function");
    }

    protected void protFunc() {
        System.out.println("Father protected function");
    }

    private void priFunc() {
        System.out.println("Father private function");
    }

    public static void main(String[] args) {
//        FatherClass father = new FatherClass();
        //1.static code block
        //2.main
        //3.non-static code block
        //4.Construction block
        System.out.println("Father main");
        FatherClass father = new FatherClass();
    }
}
