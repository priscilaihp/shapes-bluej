class Casa
{
    // Variables de Instancia
    Circle ventana;
    Triangle techo;
    Square pared;
    Square puerta;
    
    // Constructor
    Casa()
    {
        ventana = new Circle();
        techo = new Triangle();
        pared = new Square();
        puerta = new Square();
    }
    
    void dibujate()
    {
        pared.makeVisible();
        techo.makeVisible();
        puerta.makeVisible();
        ventana.makeVisible();
    }
    
    void acomodate()
    {
        // Que les corresponde
        pared.changeColor("green");
        pared.changeSize(50);
        puerta.changeColor("blue");
        puerta.changeSize(20);
        techo.changeColor("red");
        techo.changeSize(40, 50);
        ventana.changeColor("black");
        ventana.changeSize(20);
        
       
        puerta.moveDown();
        puerta.moveVertical(10);
        puerta.moveHorizontal(8);
        techo.moveRight();
        techo.moveVertical(-5);
        techo.moveHorizontal(14);
        ventana.moveVertical(-35);
        ventana.moveHorizontal(54);
        // Coloca los objetos en la posicion
        
    }
}