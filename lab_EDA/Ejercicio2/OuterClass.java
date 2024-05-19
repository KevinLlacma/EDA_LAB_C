public class OuterClass {
    private String outerField = "Outer field";

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        public void innerMethod() {
            // Acceso a los miembros de la clase contenedora
            System.out.println(outerField);
            outerMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerMethod();
    }
}
