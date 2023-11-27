public class VisitorDesenhar implements Visitor{
    
    public Object[] visitaCirculo(Circulo c){
        return new Object[]{"   *****   \n" + " *       * \n" + "*         *\n" + " *       * \n" + "   *****   "};
    }

    public Object[] visitaTriangulo(Triangulo t){
        return new Object[]{"    *    \n" + "   * *   \n" + "  *   *  \n" + " *     * \n" + "*********"};
    }

    public Object[] visitaRetangulo(Retangulo r){
        return new Object[]{"********\n" + "*      *\n" + "********"};
    }    

    public Object[] visitaTrapezio(Trapezio t){
        return new Object[]{"   *****\n" + "  *     *\n" + " *       *\n" + "***********"};
    }

}
