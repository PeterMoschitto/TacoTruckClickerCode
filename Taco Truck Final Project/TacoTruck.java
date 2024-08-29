import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import javafx.scene.text.Font; 
import javafx.stage.StageStyle;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.NumberFormat;
import javafx.animation.AnimationTimer;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TacoTruck extends Application 
{
	int money = 0;
	int click = 1;
	int beanCost = 200;
	int avocadoCost = 1000;
	int chilliPepperCost = 10;
	int tortaCost = 50000;
	int timerCost = 300;
        
    @Override
    public void start(Stage primaryStage) 
    {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		primaryStage.setTitle("Taco Truck Clicker");//code to create the grid and it's properties
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setVgap(0);
		grid.setHgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		grid.setGridLinesVisible(false);//set grid to visible
	
        Image image = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCHyUp_hJGQwgVlpgBteKpL2USNYWypVQeew&usqp=CAU");
        ImageView imageView = new ImageView(image);
		imageView.setFitWidth(600);
		imageView.setFitHeight(350);
		
		Button tacoTruck = new Button("", imageView);//tacoTruck button code
		tacoTruck.setMinHeight(350);
		tacoTruck.setMinWidth(600);
		HBox HtacoTruck = new HBox(0);
		HtacoTruck.setAlignment(Pos.TOP_LEFT);
		HtacoTruck.getChildren().add(tacoTruck);
		grid.add(HtacoTruck,0,3);
		
		final Text tacoTarget = new Text();
		grid.add(tacoTarget,0,0);
		tacoTarget.setStyle("-fx-font: 70 IMPACT;");
		tacoTarget.setFill(Color.RED);
		
		final Text titleTarget = new Text();
		grid.add(titleTarget,1,0);
		titleTarget.setStyle("-fx-font: 70 IMPACT;");
		titleTarget.setFill(Color.ORANGE);
		titleTarget.setText("Taco Truck Clicker");
		
		final Text by = new Text();
		grid.add(by,0,6);
		by.setStyle("-fx-font: 40 IMPACT;");
		by.setFill(Color.ORANGE);
		by.setText("By: Eli, Peter, Mason, Charlie");
		
		final Text clickText = new Text();
		grid.add(clickText,0,1);
		clickText.setStyle("-fx-font: 35 IMPACT;");
		clickText.setFill(Color.RED);
		
		final Text shop = new Text();
		grid.add(shop, 3, 0);
		shop.setStyle("-fx-font: 60 IMPACT;");
		shop.setFill(Color.ORANGE);
		shop.setText("Shop:");
		
		tacoTruck.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void  handle(ActionEvent e) {
			
			if(money > 100000000)
		{
			Text win = new Text();
			win.setText("You win!");
			win.setStyle("-fx-font: 550 IMPACT;");
			grid.add(win, 0,3);
			win.setFill(Color.DEEPPINK);
		}
		
		money+=click;
				
		tacoTarget.setText("Money: " + formatter.format(money) + "");		
		clickText.setText("Money Per Click " + formatter.format(click));
		}});
						
		clickText.setText("Money Per Click " + formatter.format(click));
		tacoTarget.setText("Money: " + formatter.format(money) + "");

		
		Image beanG = new Image("https://mrswarnerarlington.weebly.com/uploads/6/9/0/0/6900648/1204414_1.jpg");
        ImageView beanView = new ImageView(beanG);
		beanView.setFitWidth(200);
		beanView.setFitHeight(200);
		
		
		Button beans = new Button("", beanView);//beans button code
		beans.setMinHeight(200);
		beans.setMinWidth(200);
		HBox Hbeans = new HBox(0);
		Hbeans.setAlignment(Pos.TOP_LEFT);
		Hbeans.getChildren().add(beans);
		grid.add(Hbeans,4,3);
		
		final Text beanTarget = new Text();
		grid.add(beanTarget,4,1);
		beanTarget.setStyle("-fx-font: 35 IMPACT;");
		beanTarget.setFill(Color.RED);
		
		
		
		Image avocado = new Image("https://st.depositphotos.com/1354412/4705/v/950/depositphotos_47050563-stock-illustration-avocado-mexican-cartoon-character-a.jpg");
        ImageView avocadoView = new ImageView(avocado);
		avocadoView.setFitWidth(200);
		avocadoView.setFitHeight(200);
		
		
		Button avocadoB = new Button("", avocadoView);//avocado button code
		avocadoB.setMinHeight(200);
		avocadoB.setMinWidth(200);
		HBox Havocado = new HBox(0);
		Havocado.setAlignment(Pos.TOP_LEFT);
		Havocado.getChildren().add(avocadoB);
		grid.add(Havocado,2,3);
		
		final Text avocadoTarget = new Text();
		grid.add(avocadoTarget,2,1);
		avocadoTarget.setStyle("-fx-font: 35 IMPACT;");
		avocadoTarget.setFill(Color.RED);
		
		
		
		Image chilliPepper = new Image("https://i.pinimg.com/736x/36/d9/6f/36d96f5a720fd6d83156b1d42515b050.jpg");
        ImageView chilliPepperView = new ImageView(chilliPepper);
		chilliPepperView.setFitWidth(200);
		chilliPepperView.setFitHeight(200);
		
		
		Button chilliPepperB = new Button("", chilliPepperView);//chilliPepper button code
		chilliPepperB.setMinHeight(200);
		chilliPepperB.setMinWidth(200);
		HBox HchilliPepper = new HBox(0);
		HchilliPepper.setAlignment(Pos.TOP_LEFT);
		HchilliPepper.getChildren().add(chilliPepperB);
		grid.add(HchilliPepper,2,5);
		
		final Text chilliPepperTarget = new Text();
		grid.add(chilliPepperTarget,2,4);
		chilliPepperTarget.setStyle("-fx-font: 35 IMPACT;");
		chilliPepperTarget.setFill(Color.RED);
		
		
		
		Image torta = new Image("https://www.colourbox.com/preview/42497025-mexican-torta.jpg");
        ImageView tortaView = new ImageView(torta);
		tortaView.setFitWidth(200);
		tortaView.setFitHeight(200);
		
		
		Button tortaB = new Button("", tortaView);//torta button code
		tortaB.setMinHeight(200);
		tortaB.setMinWidth(200);
		HBox Htorta = new HBox(0);
		Htorta.setAlignment(Pos.TOP_LEFT);
		Htorta.getChildren().add(tortaB);
		grid.add(Htorta,4,5);
		
		
		Image chip = new Image("https://media.istockphoto.com/vectors/tortilla-chips-and-salsa-junk-food-snack-vector-id165694997?b=1&k=20&m=165694997&s=170667a&w=0&h=HLDLsdyygtS6mpJ812tKI9hqJLtzKoSqO_6RRDVHiQA=");
        ImageView chipView = new ImageView(chip);
		chipView.setFitWidth(200);
		chipView.setFitHeight(200);
		
		Button timerB = new Button("", chipView);//timer button code
		timerB.setMinHeight(200);
		timerB.setMinWidth(200);
		HBox Htimer = new HBox(0);
		Htimer.setAlignment(Pos.CENTER);
		Htimer.getChildren().add(timerB);
		grid.add(Htimer,1,5);
	
		
		final Text timerTarget = new Text();
		grid.add(timerTarget,1,4);
		timerTarget.setStyle("-fx-font: 35 IMPACT;");
		timerTarget.setFill(Color.RED);
		
		final Text tortaTarget = new Text();
		grid.add(tortaTarget,4,4);
		tortaTarget.setStyle("-fx-font: 35 IMPACT;");
		tortaTarget.setFill(Color.RED);

		 Timer timer1 = new Timer();
		 
		
		Scene window = new Scene(grid, 1500,1000);
		primaryStage.setScene(window);
		window.getStylesheets().add
		(TacoTruck.class.getResource("TacoTruck.css").toExternalForm());
		primaryStage.show();
		
		timerB.setOnAction(new EventHandler<ActionEvent>(){
			// @Override
			public void  handle(ActionEvent e) {
		

			if(money >= timerCost)
			{
				  timer1.scheduleAtFixedRate(new TimerTask() {
            public void run() {

				String c = Integer.toString(money);
				tacoTarget.setText(c);
								tacoTarget.setText("Money: " + formatter.format(money) + "");		
			                 money++;

			   
                }
            
				}, 0, 500);
				 money-= timerCost;
			   timerCost*=5;
			}
		
			timerTarget.setText("            Cost: " + formatter.format(timerCost) + "\n            Chip: Gives $1 every second");
			
		}
		}
		);
		
		timerTarget.setText("            Cost: " + formatter.format(timerCost) + "\n            Chip: Gives $1 every second");
		
		
		beans.setOnAction(new EventHandler<ActionEvent>(){
			// @Override
			public void  handle(ActionEvent e) {
			
			if(money >= beanCost)
			{
				 money-= beanCost;
				 click*= 2;
				 beanCost*=7;
			}
		
			beanTarget.setText("Cost: " + formatter.format(beanCost) + "\nBean: Doubles\nmoney");
			
		}
		}
		);
			beanTarget.setText("Cost: " + formatter.format(beanCost) + "\nBean: Doubles\nmoney");

		
		
		avocadoB.setOnAction(new EventHandler<ActionEvent>(){
			// @Override
			public void  handle(ActionEvent e) {
			
			
			if(money >= avocadoCost)
			{
				 money-= avocadoCost;
				 click*= 3;
				 avocadoCost*=8;
			}
			
			avocadoTarget.setText("Cost: " + formatter.format(avocadoCost) + "\nAvocado: Triples\nmoney");
			

		}
		}
		);
			avocadoTarget.setText("Cost: " + formatter.format(avocadoCost) + "\nAvocado: Triples\nmoney");

		
		chilliPepperB.setOnAction(new EventHandler<ActionEvent>(){
			// @Override
			public void  handle(ActionEvent e) {
			
			if(money >= chilliPepperCost)
			{
				 money-= chilliPepperCost;
				 click+= 1;
				 chilliPepperCost+=5;
			}
			
			chilliPepperTarget.setText("Cost: " + formatter.format(chilliPepperCost) + "\nChilli Pepper: +\n1 per click");
			

		}
		}
		);
			chilliPepperTarget.setText("Cost: " + formatter.format(chilliPepperCost) + "\nChilli Pepper: +\n1 per click");

		
		tortaB.setOnAction(new EventHandler<ActionEvent>(){//all of the code to make the password will be here
			// @Override
			public void  handle(ActionEvent e) {
			
			if(money >= tortaCost)
			{
				 money-= tortaCost;
				 click*= 10;
				 tortaCost*=15;
			}
			
			
			tortaTarget.setText("Cost: " + formatter.format(tortaCost) + "\nTorta: Tenfolds\nmoney");
		
		}
		}
		);
			tortaTarget.setText("Cost: " + formatter.format(tortaCost) + "\nTorta: Tenfolds\nmoney");
		
	    }

	

    public static void main(String[] args) {
        launch();
    }
}

