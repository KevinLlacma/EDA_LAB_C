public class OuterClass2 {
    private static String staticOuterField = "Static outer field";

    public static void staticOuterMethod() {
        System.out.println("Static outer method");
    }

    public static class StaticNestedClass {
        public void staticNestedMethod() {
            // Acceso a los miembros estáticos de la clase contenedora
            System.out.println(staticOuterField);
            staticOuterMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass2.StaticNestedClass nested = new OuterClass2.StaticNestedClass();
        nested.staticNestedMethod();
    }
}