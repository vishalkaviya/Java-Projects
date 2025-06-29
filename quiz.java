import java.util.Scanner;
import java.io.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.shape.*;
import javafx.scene.layout.*; 
public class quiz extends Application
{
	int mark;
	public static void main(String argv[])
	{
		launch();
	}
	public void start(Stage s)
	{
		try
		{	
			File f = new File("example.txt");
		 	if(! f.exists())
				System.out.println("File does not exists");
			else
			{
				Scanner kb = new Scanner(f);
				TextField t = new TextField();
				ToggleGroup tg1= new ToggleGroup();
				ToggleGroup tg2= new ToggleGroup();
				ToggleGroup tg3= new ToggleGroup();
				ToggleGroup tg4= new ToggleGroup();
				FlowPane fp=new FlowPane();
				VBox v = new VBox();
				//Label w1=new Label(scan.nextLine());
				//Label w2=new Label(scan.nextLine());
				Label no1 = new Label(kb.nextLine()); //Question no1
				Button b= new Button("Submit");		
				
				fp.getChildren().addAll(b,t);
				RadioButton rb1[]=new RadioButton[4];
				for(int i=0;i<4;i++)
				{	
					rb1[i]=new RadioButton(kb.nextLine());
				}
				for(int j=0;j<4;j++)
				{	
					rb1[j].setToggleGroup(tg1);
				}
				v.getChildren().addAll(no1,rb1[0],rb1[1],rb1[2],rb1[3]);
				Label no2 = new Label(kb.nextLine()); // Question no2
				RadioButton rb2[]= new RadioButton[4];
				for(int i=0;i<4;i++)
				{	
					rb2[i]=new RadioButton(kb.nextLine());
				}
				for(int j=0;j<4;j++)
				{	
					rb2[j].setToggleGroup(tg2);
				}
				v.getChildren().addAll(no2,rb2[0],rb2[1],rb2[2],rb2[3]);
				Label no3 = new Label(kb.nextLine()); // Question no3
				RadioButton rb3[]= new RadioButton[4];
				for(int i=0;i<4;i++)
				{	
					rb3[i]=new RadioButton(kb.nextLine());
				}
				for(int j=0;j<4;j++)
				{	
					rb3[j].setToggleGroup(tg3);
				}
				v.getChildren().addAll(no3,rb3[0],rb3[1],rb3[2],rb3[3]);
				Label no4 = new Label(kb.nextLine()); // Question no4
				RadioButton rb4[]= new RadioButton[4];
				for(int i=0;i<4;i++)
				{	
					rb4[i]=new RadioButton(kb.nextLine());
				}
				for(int j=0;j<4;j++)
				{	
					rb4[j].setToggleGroup(tg4);
				}
				v.getChildren().addAll(no4,rb4[0],rb4[1],rb4[2],rb4[3]);
			
				v.getChildren().add(fp);					
				EventHandler<ActionEvent> ae6= new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						t.setText(" Your score : "+mark+"/4");
					}
				};
				EventHandler<ActionEvent> ae1= new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						if(rb1[1].isSelected())
						{
							mark+=1;
							b.setOnAction(ae6);
						}	
					}
				};
				EventHandler<ActionEvent> ae2= new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						if(rb2[1].isSelected())
						{
							mark+=1;
							b.setOnAction(ae6);
						}	
					}
				};
				EventHandler<ActionEvent> ae3= new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						if(rb3[2].isSelected())
						{
							mark+=1;
							b.setOnAction(ae6);
						}	
					}
				};
				EventHandler<ActionEvent> ae4= new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent e)
					{
						if(rb4[0].isSelected())
						{
							mark+=1;
							b.setOnAction(ae6);
						}	
					}
				};
				
				for(int i=0;i<4;i++)
				{
					rb1[i].setOnAction(ae1);
				}
				for(int i=0;i<4;i++)
				{
					rb2[i].setOnAction(ae2);
				}
				for(int i=0;i<4;i++)
				{
					rb3[i].setOnAction(ae3);
				}
				for(int i=0;i<4;i++)
				{
					rb4[i].setOnAction(ae4);
				}
				
				Scene s1=new Scene(v);
				s.setScene(s1);
				s.show();	
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception deleted");
		}
	}
}