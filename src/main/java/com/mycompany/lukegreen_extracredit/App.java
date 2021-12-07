package com.mycompany.lukegreen_extracredit;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label();
        
        // x, y, radius
        //this is the main circle that has the smaller circle on it
        Circle mainCircle = new Circle(320, 240, 200);
        mainCircle.setFill(Color.WHITE);
        mainCircle.setStroke(Color.BLACK);
        mainCircle.setStrokeWidth(2);
        
        //i will use another circle to limit movement of the color cirlce further
        Circle theCircle = new Circle(320, 240, 125);
        theCircle.setFill(Color.WHITE);
        
        //top and bottom boundaries
        Circle c2 = new Circle(320, 110, 40);
        Circle c3 = new Circle(320, 370, 40);
        
        //left and right boundaries
        Circle c4 = new Circle(450, 240, 40);
        Circle c5 = new Circle(190, 240, 40);
        
        //top left boundaries
        Circle c6 = new Circle(210, 180, 40);
        Circle c7 = new Circle(260,135,40);
        
        //top right boundaries
        Circle c8 = new Circle(430, 180, 40);
        Circle c9 = new Circle(380,135,40);
        
        //bottom right boundaries
        Circle c10 = new Circle(430, 300, 40);
        Circle c11 = new Circle(380,345,40);
        
        //bottom left boundaries
        Circle c12 = new Circle(210, 300, 40);
        Circle c13 = new Circle(260,345,40);
        
        //outside boundaries top left
        Circle c14 = new Circle(90, 75, 40);
        Circle c15 = new Circle(105, 110, 20);
        Circle c16 = new Circle(140, 55, 20);
        Circle c17 = new Circle(155, 55, 20);
        
        //normal circle is (320, 240)
        //outside boundaries bottom right
        Circle c18 = new Circle(550, 405, 40);
        Circle c19 = new Circle((320-105) + 320, (240 -110) + 240, 20);
        Circle c20 = new Circle((320-140)+320, (240-55)+240, 20);
        Circle c21 = new Circle(320-155+320, 240-55+240, 20);
        
        //outside boundaries bottom left
        Circle c22 = new Circle(90, 405, 40);
        Circle c23 = new Circle(105, (240 -110) + 240, 20);
        Circle c24 = new Circle(140, (240-55)+240, 20);
        Circle c25 = new Circle(155, 240-55+240, 20);
        
        //outside boundaries top right
        Circle c26 = new Circle(550, 75, 40);
        Circle c27 = new Circle((320-105) + 320, 110, 20);
        Circle c28 = new Circle((320-140)+320, 55, 20);
        Circle c29 = new Circle(320-155+320, 55, 20);
        
        
        
        c2.setFill(Color.WHITE);
        c3.setFill(Color.WHITE);
        c4.setFill(Color.WHITE);
        c5.setFill(Color.WHITE);
        c6.setFill(Color.WHITE);
        c7.setFill(Color.WHITE);
        c8.setFill(Color.WHITE);
        c9.setFill(Color.WHITE);
        c10.setFill(Color.WHITE);
        c11.setFill(Color.WHITE);
        c12.setFill(Color.WHITE);
        c13.setFill(Color.WHITE);
        
        c14.setFill(Color.WHITE);
        c15.setFill(Color.WHITE);
        c16.setFill(Color.WHITE);
        c17.setFill(Color.WHITE);
        c18.setFill(Color.WHITE);
        c19.setFill(Color.WHITE);
        c20.setFill(Color.WHITE);
        c21.setFill(Color.WHITE);
        c22.setFill(Color.WHITE);
        c23.setFill(Color.WHITE);
        c24.setFill(Color.WHITE);
        c25.setFill(Color.WHITE);
        c26.setFill(Color.WHITE);
        c27.setFill(Color.WHITE);
        c28.setFill(Color.WHITE);
        c29.setFill(Color.WHITE);
        
        //this is the samller circle that you drag on top of main circle to select color
        Circle c1 = new Circle(465, 100, 18);
        c1.setFill(Color.BLUE);
        //for boundary outside of main "main" circle
        double xDiff = mainCircle.getRadius() + mainCircle.getCenterX();
        double yDiff = mainCircle.getRadius() + mainCircle.getCenterY();
        double xDiff2 = mainCircle.getCenterX() - mainCircle.getRadius();
        double yDiff2 = mainCircle.getCenterY() - mainCircle.getRadius();
        
        //for main boundary circle
        double xDiff3 = theCircle.getRadius() + theCircle.getCenterX(); //right side of theCircle
        double yDiff3 = theCircle.getRadius() + theCircle.getCenterY(); //top side of theCircle
        double xDiff4 = theCircle.getCenterX() - theCircle.getRadius(); //left side of the cricle
        double yDiff4 = theCircle.getCenterY() - theCircle.getRadius(); //bottome side of the circle
        
        //for top boundary circle
        double xDiff5 = c2.getRadius() + c2.getCenterX(); //right side of theCircle
        double yDiff5 = c2.getRadius() + c2.getCenterY(); //top side of theCircle
        double xDiff6 = c2.getCenterX() - c2.getRadius(); //left side of the cricle
        double yDiff6 = c2.getCenterY() - c2.getRadius();
        
        //for bottom boundary circle
        double xDiff7 = c3.getRadius() + c3.getCenterX(); //right side of theCircle
        double yDiff7 = c3.getRadius() + c3.getCenterY(); //top side of theCircle
        double xDiff8 = c3.getCenterX() - c3.getRadius(); //left side of the cricle
        double yDiff8 = c3.getCenterY() - c3.getRadius();
        
        //for right boundary circle
        double xDiff9 = c4.getRadius() + c4.getCenterX(); //right side of theCircle
        double yDiff9 = c4.getRadius() + c4.getCenterY(); //top side of theCircle
        double xDiff10 = c4.getCenterX() - c4.getRadius(); //left side of the cricle
        double yDiff10 = c4.getCenterY() - c4.getRadius();
        
        //for left boundary circle
        double xDiff11 = c5.getRadius() + c5.getCenterX(); //right side of theCircle
        double yDiff11 = c5.getRadius() + c5.getCenterY(); //top side of theCircle
        double xDiff12 = c5.getCenterX() - c5.getRadius(); //left side of the cricle
        double yDiff12 = c5.getCenterY() - c5.getRadius();
        
        //for top left circle boundaries
        double xDiff13 = c6.getRadius() + c6.getCenterX(); //right side of theCircle
        double yDiff13 = c6.getRadius() + c6.getCenterY(); //top side of theCircle
        double xDiff14 = c6.getCenterX() - c6.getRadius(); //left side of the cricle
        double yDiff14 = c6.getCenterY() - c6.getRadius();
        double xDiff15 = c7.getRadius() + c7.getCenterX(); //right side of theCircle
        double yDiff15 = c7.getRadius() + c7.getCenterY(); //top side of theCircle
        double xDiff16 = c7.getCenterX() - c7.getRadius(); //left side of the cricle
        double yDiff16 = c7.getCenterY() - c7.getRadius();
        
        //for top right circle boundaries
        double xDiff17 = c8.getRadius() + c8.getCenterX(); //right side of theCircle
        double yDiff17 = c8.getRadius() + c8.getCenterY(); //top side of theCircle
        double xDiff18 = c8.getCenterX() - c8.getRadius(); //left side of the cricle
        double yDiff18 = c8.getCenterY() - c8.getRadius();
        double xDiff19 = c9.getRadius() + c9.getCenterX(); //right side of theCircle
        double yDiff19 = c9.getRadius() + c9.getCenterY(); //top side of theCircle
        double xDiff20 = c9.getCenterX() - c9.getRadius(); //left side of the cricle
        double yDiff20 = c9.getCenterY() - c9.getRadius();
        
        //for bottom right circle boundaries
        double xDiff21 = c10.getRadius() + c10.getCenterX(); //right side of theCircle
        double yDiff21 = c10.getRadius() + c10.getCenterY(); //top side of theCircle
        double xDiff22 = c10.getCenterX() - c10.getRadius(); //left side of the cricle
        double yDiff22 = c10.getCenterY() - c10.getRadius();
        double xDiff23 = c11.getRadius() + c11.getCenterX(); //right side of theCircle
        double yDiff23 = c11.getRadius() + c11.getCenterY(); //top side of theCircle
        double xDiff24 = c11.getCenterX() - c11.getRadius(); //left side of the cricle
        double yDiff24 = c11.getCenterY() - c11.getRadius();
        
        //for bottom left circle boundaries
        double xDiff25 = c12.getRadius() + c12.getCenterX(); //right side of theCircle
        double yDiff25 = c12.getRadius() + c12.getCenterY(); //top side of theCircle
        double xDiff26 = c12.getCenterX() - c12.getRadius(); //left side of the cricle
        double yDiff26 = c12.getCenterY() - c12.getRadius();
        double xDiff27 = c13.getRadius() + c13.getCenterX(); //right side of theCircle
        double yDiff27 = c13.getRadius() + c13.getCenterY(); //top side of theCircle
        double xDiff28 = c13.getCenterX() - c13.getRadius(); //left side of the cricle
        double yDiff28 = c13.getCenterY() - c13.getRadius();
        
        //for top left outside boundaries
        double xDiff29 = c14.getRadius() + c14.getCenterX(); //right side of theCircle
        double yDiff29 = c14.getRadius() + c14.getCenterY(); //top side of theCircle
        double xDiff30 = c14.getCenterX() - c14.getRadius(); //left side of the cricle
        double yDiff30 = c14.getCenterY() - c14.getRadius();
        double xDiff31 = c15.getRadius() + c15.getCenterX(); //right side of theCircle
        double yDiff31 = c15.getRadius() + c15.getCenterY(); //top side of theCircle
        double xDiff32 = c15.getCenterX() - c15.getRadius(); //left side of the cricle
        double yDiff32 = c15.getCenterY() - c15.getRadius();
        double xDiff33 = c16.getRadius() + c16.getCenterX(); //right side of theCircle
        double yDiff33 = c16.getRadius() + c16.getCenterY(); //top side of theCircle
        double xDiff34 = c16.getCenterX() - c16.getRadius(); //left side of the cricle
        double yDiff34 = c16.getCenterY() - c16.getRadius();
        double xDiff35 = c17.getRadius() + c17.getCenterX(); //right side of theCircle
        double yDiff35 = c17.getRadius() + c17.getCenterY(); //top side of theCircle
        double xDiff36 = c17.getCenterX() - c17.getRadius(); //left side of the cricle
        double yDiff36 = c17.getCenterY() - c17.getRadius();
        
        //bottom right outside boundaries
        double xDiff37 = c18.getRadius() + c18.getCenterX(); //right side of theCircle
        double yDiff37 = c18.getRadius() + c18.getCenterY(); //top side of theCircle
        double xDiff38 = c18.getCenterX() - c18.getRadius(); //left side of the cricle
        double yDiff38 = c18.getCenterY() - c18.getRadius();
        double xDiff39 = c19.getRadius() + c19.getCenterX(); //right side of theCircle
        double yDiff39 = c19.getRadius() + c19.getCenterY(); //top side of theCircle
        double xDiff40 = c19.getCenterX() - c19.getRadius(); //left side of the cricle
        double yDiff40 = c19.getCenterY() - c19.getRadius();
        double xDiff41 = c20.getRadius() + c20.getCenterX(); //right side of theCircle
        double yDiff41 = c20.getRadius() + c20.getCenterY(); //top side of theCircle
        double xDiff42 = c20.getCenterX() - c20.getRadius(); //left side of the cricle
        double yDiff42 = c20.getCenterY() - c20.getRadius();
        double xDiff43 = c21.getRadius() + c21.getCenterX(); //right side of theCircle
        double yDiff43 = c21.getRadius() + c21.getCenterY(); //top side of theCircle
        double xDiff44 = c21.getCenterX() - c21.getRadius(); //left side of the cricle
        double yDiff44 = c21.getCenterY() - c21.getRadius();
        
        //bottom left outside boundaries
        double xDiff45 = c22.getRadius() + c22.getCenterX(); //right side of theCircle
        double yDiff45 = c22.getRadius() + c22.getCenterY(); //top side of theCircle
        double xDiff46 = c22.getCenterX() - c22.getRadius(); //left side of the cricle
        double yDiff46 = c22.getCenterY() - c22.getRadius();
        double xDiff47 = c23.getRadius() + c23.getCenterX(); //right side of theCircle
        double yDiff47 = c23.getRadius() + c23.getCenterY(); //top side of theCircle
        double xDiff48 = c23.getCenterX() - c23.getRadius(); //left side of the cricle
        double yDiff48 = c23.getCenterY() - c23.getRadius();
        double xDiff49 = c24.getRadius() + c24.getCenterX(); //right side of theCircle
        double yDiff49 = c24.getRadius() + c24.getCenterY(); //top side of theCircle
        double xDiff50 = c24.getCenterX() - c24.getRadius(); //left side of the cricle
        double yDiff50 = c24.getCenterY() - c24.getRadius();
        double xDiff51 = c25.getRadius() + c25.getCenterX(); //right side of theCircle
        double yDiff51 = c25.getRadius() + c25.getCenterY(); //top side of theCircle
        double xDiff52 = c25.getCenterX() - c25.getRadius(); //left side of the cricle
        double yDiff52 = c25.getCenterY() - c25.getRadius();
        
        //top right outside boundaries
        double xDiff53 = c26.getRadius() + c26.getCenterX(); //right side of theCircle
        double yDiff53 = c26.getRadius() + c26.getCenterY(); //top side of theCircle
        double xDiff54 = c26.getCenterX() - c26.getRadius(); //left side of the cricle
        double yDiff54 = c26.getCenterY() - c26.getRadius();
        double xDiff55 = c27.getRadius() + c27.getCenterX(); //right side of theCircle
        double yDiff55 = c27.getRadius() + c27.getCenterY(); //top side of theCircle
        double xDiff56 = c27.getCenterX() - c27.getRadius(); //left side of the cricle
        double yDiff56 = c27.getCenterY() - c27.getRadius();
        double xDiff57 = c28.getRadius() + c28.getCenterX(); //right side of theCircle
        double yDiff57 = c28.getRadius() + c28.getCenterY(); //top side of theCircle
        double xDiff58 = c28.getCenterX() - c28.getRadius(); //left side of the cricle
        double yDiff58 = c28.getCenterY() - c28.getRadius();
        double xDiff59 = c29.getRadius() + c29.getCenterX(); //right side of theCircle
        double yDiff59 = c29.getRadius() + c29.getCenterY(); //top side of theCircle
        double xDiff60 = c29.getCenterX() - c29.getRadius(); //left side of the cricle
        double yDiff60 = c29.getCenterY() - c29.getRadius();
        
        

        //this was painfull to write
        //they just provide a barrier that the moving circle cannot cross, makes circle stay along boundary of large circle
        c1.setOnMouseDragged(eh->{
            if(((eh.getX() <= xDiff + 8 && eh.getY() <= yDiff + 8) && (eh.getX() >= xDiff2 - 8 && eh.getY() >= yDiff2 - 8)) &&
                    ((eh.getX() >= xDiff3 + 18 || eh.getY() >= yDiff3 + 18) || (eh.getX() + 18 <= xDiff4 || eh.getY() + 18 <= yDiff4)) &&
                    ((eh.getX() >= xDiff5 + 18 || eh.getY() >= yDiff5 + 18) || (eh.getX() + 18 <= xDiff6 || eh.getY() + 18 <= yDiff6)) && 
                    ((eh.getX() >= xDiff7 + 18 || eh.getY() >= yDiff7 + 18) || (eh.getX() + 18 <= xDiff8 || eh.getY() + 18 <= yDiff8)) &&
                    ((eh.getX() >= xDiff9 + 18 || eh.getY() >= yDiff9 + 18) || (eh.getX() + 18 <= xDiff10 || eh.getY() + 18 <= yDiff10)) &&
                    ((eh.getX() >= xDiff11 + 18 || eh.getY() >= yDiff11 + 18) || (eh.getX() + 18 <= xDiff12 || eh.getY() + 18 <= yDiff12)) &&
                    ((eh.getX() >= xDiff13 + 18 || eh.getY() >= yDiff13 + 18) || (eh.getX() + 18 <= xDiff14 || eh.getY() + 18 <= yDiff14)) &&
                    ((eh.getX() >= xDiff15 + 18 || eh.getY() >= yDiff15 + 18) || (eh.getX() + 18 <= xDiff16 || eh.getY() + 18 <= yDiff16)) &&
                    ((eh.getX() >= xDiff17 + 18 || eh.getY() >= yDiff17 + 18) || (eh.getX() + 18 <= xDiff18 || eh.getY() + 18 <= yDiff18)) &&
                    ((eh.getX() >= xDiff19 + 18 || eh.getY() >= yDiff19 + 18) || (eh.getX() + 18 <= xDiff20 || eh.getY() + 18 <= yDiff20)) &&
                    ((eh.getX() >= xDiff21 + 18 || eh.getY() >= yDiff21 + 18) || (eh.getX() + 18 <= xDiff22 || eh.getY() + 18 <= yDiff22)) &&
                    ((eh.getX() >= xDiff23 + 18 || eh.getY() >= yDiff23 + 18) || (eh.getX() + 18 <= xDiff24 || eh.getY() + 18 <= yDiff24)) &&
                    ((eh.getX() >= xDiff25 + 18 || eh.getY() >= yDiff25 + 18) || (eh.getX() + 18 <= xDiff26 || eh.getY() + 18 <= yDiff26)) &&
                    ((eh.getX() >= xDiff27 + 18 || eh.getY() >= yDiff27 + 18) || (eh.getX() + 18 <= xDiff28 || eh.getY() + 18 <= yDiff28)) &&

                    ((eh.getX() >= xDiff29 + 18 || eh.getY() >= yDiff29 + 18) || (eh.getX() + 18 <= xDiff30 || eh.getY() + 18 <= yDiff30)) &&
                    ((eh.getX() >= xDiff31 + 18 || eh.getY() >= yDiff31 + 18) || (eh.getX() + 18 <= xDiff32 || eh.getY() + 18 <= yDiff32)) &&
                    ((eh.getX() >= xDiff33 + 18 || eh.getY() >= yDiff33 + 18) || (eh.getX() + 18 <= xDiff34 || eh.getY() + 18 <= yDiff34)) &&
                    ((eh.getX() >= xDiff35 + 18 || eh.getY() >= yDiff35 + 18) || (eh.getX() + 18 <= xDiff36 || eh.getY() + 18 <= yDiff36)) &&
                    
                    ((eh.getX() >= xDiff37 + 18 || eh.getY() >= yDiff37 + 18) || (eh.getX() + 18 <= xDiff38 || eh.getY() + 18 <= yDiff38)) &&
                    ((eh.getX() >= xDiff39 + 18 || eh.getY() >= yDiff39 + 18) || (eh.getX() + 18 <= xDiff40 || eh.getY() + 18 <= yDiff40)) &&
                    ((eh.getX() >= xDiff41 + 18 || eh.getY() >= yDiff41 + 18) || (eh.getX() + 18 <= xDiff42 || eh.getY() + 18 <= yDiff42)) &&
                    ((eh.getX() >= xDiff43 + 18 || eh.getY() >= yDiff43 + 18) || (eh.getX() + 18 <= xDiff44 || eh.getY() + 18 <= yDiff44)) &&
                    
                    ((eh.getX() >= xDiff45 + 18 || eh.getY() >= yDiff45 + 18) || (eh.getX() + 18 <= xDiff46 || eh.getY() + 18 <= yDiff46)) &&
                    ((eh.getX() >= xDiff47 + 18 || eh.getY() >= yDiff47 + 18) || (eh.getX() + 18 <= xDiff48 || eh.getY() + 18 <= yDiff48)) &&
                    ((eh.getX() >= xDiff49 + 18 || eh.getY() >= yDiff49 + 18) || (eh.getX() + 18 <= xDiff50 || eh.getY() + 18 <= yDiff50)) &&
                    ((eh.getX() >= xDiff51 + 18 || eh.getY() >= yDiff51 + 18) || (eh.getX() + 18 <= xDiff52 || eh.getY() + 18 <= yDiff52)) &&
                    
                    ((eh.getX() >= xDiff53 + 18 || eh.getY() >= yDiff53 + 18) || (eh.getX() + 18 <= xDiff54 || eh.getY() + 18 <= yDiff54)) &&
                    ((eh.getX() >= xDiff55 + 18 || eh.getY() >= yDiff55 + 18) || (eh.getX() + 18 <= xDiff56 || eh.getY() + 18 <= yDiff56)) &&
                    ((eh.getX() >= xDiff57 + 18 || eh.getY() >= yDiff57 + 18) || (eh.getX() + 18 <= xDiff58 || eh.getY() + 18 <= yDiff58)) &&
                    ((eh.getX() >= xDiff59 + 18 || eh.getY() >= yDiff59 + 18) || (eh.getX() + 18 <= xDiff60 || eh.getY() + 18 <= yDiff60))
                    ) {
        c1.setCenterX(eh.getX());
        c1.setCenterY(eh.getY());
        double green = 0.88;
        double blue = 0.90;
        c1.setFill(new Color(Math.random(), green, Math.random(), 1.0));
            }
        });
        
        Group gp = new Group(label, mainCircle, theCircle, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21,
                c22,c23,c24,c25,c26,c27,c28,c29,
        c1);
        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}