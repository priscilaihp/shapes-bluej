class Casa
{
    // Variables de Instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    int x;
    int y;
    
    /**
     * Constructor
     * @author Priscila Hernandez
     */
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
    }
    
    /**
     * Dibuja las figuras.
     */
    void dibujate()
    {
        pared.makeVisible();
        techo.makeVisible();
        puerta.makeVisible();
        ventana.makeVisible();
    }
    
    /**
     * En un principio da color y asigna tamaño a las figuras.
     * @param valorX Pide el valor de la coordenda en horizontal.
     * @param valorY Pide el valor de la coordenda en vertical.
     */
    void acomodate(int valorX, int valorY)
    {
        pared.changeColor("green");
        pared.changeSize(50);
        puerta.changeColor("blue");
        puerta.changeSize(20);
        techo.changeColor("red");
        techo.changeSize(40, 50);
        ventana.changeColor("black");
        ventana.changeSize(20);
        
        
        
        pared.moveHorizontal(valorX);
        pared.moveVertical(valorY);
        puerta.moveHorizontal(valorX + 10);
        puerta.moveVertical(valorY + 30);
        techo.moveHorizontal(valorX + 35);
        techo.moveVertical(valorY - 5);
        ventana.moveHorizontal(valorX + 55);
        ventana.moveVertical(valorY - 35);
    }
}
