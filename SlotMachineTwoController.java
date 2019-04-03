/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachinetwo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import java.util.Random;
import javafx.scene.control.Separator;
import javafx.scene.shape.Rectangle;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import java.util.*;



public class SlotMachineTwoController {
    
   @FXML
    private Button buttonBet5;

    @FXML
    private Button buttonDeposit;

    @FXML
    private TextField textFieldTotalBets;

    @FXML
    private Label labelBet;

    @FXML
    private Button buttonSpin;

    @FXML
    private Label labelYourBalance;

    @FXML
    private Button buttonMaxBet;

    @FXML
    private AnchorPane anchorPane1;

    @FXML
    private Label labelMain;

    @FXML
    private Rectangle rectangle01;

    @FXML
    private Button buttonBet500;

    @FXML
    private Button buttonBet100;

    @FXML
    private Button buttonBet50;

    @FXML
    private Button buttonBet10;

    @FXML
    private TextField textFieldDeposit;

    @FXML
    private ImageView imageViewRight;

    @FXML
    private Label labelTotalWins;

    @FXML
    private Label labelDeposit;

    @FXML
    private Label labelYouWon;

    @FXML
    private TextField textFieldBalance;

    @FXML
    private ImageView imageViewCenterRight;

    @FXML
    private TextField textFieldTotalLosses;

    @FXML
    private TextField textFieldBet;

    @FXML
    private Button buttonBet2X;

    @FXML
    private ImageView imageViewCenterLeft;

    @FXML
    private Label labelTotalLosses;

    @FXML
    private Button buttonCashOut;

    @FXML
    private Separator separator03;

    @FXML
    private TextField textFieldTotalWins;

    @FXML
    private ImageView imageViewLeft;

    @FXML
    private Font x1;

    @FXML
    private HBox hboxMain;

    @FXML
    private TextField textFieldYouWon;

    @FXML
    private Button buttonQuit;

    @FXML
    private Separator separator01;

    @FXML
    private Label labelTotalBets;

     @FXML
    private Button buttonReset;
    
    private final int ROWS = 1;
    private final int COLS = 3;
    private final int SIZE = 15;
    private final int ZERO = 0;
    private final int DOUBLE = 2;
    private final int TRIPLE = 3;
    private final int FOUR = 4;
    private final int MAXBET = 1000;
    
    
    private int fruit1;
    private int fruit2;
    private int fruit3;
    private int fruit4;
    
    private Image[]fruitImage;
    private Image blankImage;
    
    private int amountBet;
    private int amountWon;
    private int amountTotalWins;
    private int amountTotalLoss;
    private int amountDeposit;
    private int amountTotalDeposit;
    private int amountBalance;
    private int amountTotalBets;
    
    private int buttonBet;
    private int customButtonBet;

    
    private boolean validBet=true;
    private boolean validDeposit=true;
    
    private String str1 = new String("Welcome to Slot Machine Two");
    private String str2 = new String("YOU WON!!");
    private String str3 = new String("Sorry, You lost");
    
   
    
    public void initialize()
    {
    
        //Console message
        System.out.println("Slot Machine initialization");

        //label
        labelMain.setText(str1); 

        //image
        blankImage = new Image("file:C:\\SlotMachineOne\\img\\blank.jpg");
        
        //spin images
        fruitImage = new Image[SIZE];
        fruitImage[0]=new Image("file:C:\\SlotMachineOne\\img\\bigwatermelon.jpg");
        fruitImage[1]=new Image("file:C:\\SlotMachineOne\\img\\blackberries.jpg");
        fruitImage[2]=new Image("file:C:\\SlotMachineOne\\img\\classiccherries.jpg");
        fruitImage[3]=new Image("file:C:\\SlotMachineOne\\img\\lychee.jpg");
        fruitImage[4]=new Image("file:C:\\SlotMachineOne\\img\\peach.jpg");
        fruitImage[5]=new Image("file:C:\\SlotMachineOne\\img\\orangeberries.jpg");
        fruitImage[6]=new Image("file:C:\\SlotMachineOne\\img\\pomegranate.jpg");
        fruitImage[7]=new Image("file:C:\\SlotMachineOne\\img\\purplegrapes.jpg");
        fruitImage[8]=new Image("file:C:\\SlotMachineOne\\img\\blueberries.jpg");
        fruitImage[9]=new Image("file:C:\\SlotMachineOne\\img\\strawberries.jpg");
        fruitImage[10]=new Image("file:C:\\SlotMachineOne\\img\\redgrapes.jpg");
        fruitImage[11]=new Image("file:C:\\SlotMachineOne\\img\\redcherries.jpg");
        fruitImage[12]=new Image("file:C:\\SlotMachineOne\\img\\supercherries.jpg");
        fruitImage[13]=new Image("file:C:\\SlotMachineOne\\img\\superberries.jpg");
        fruitImage[14]=new Image("file:C:\\SlotMachineOne\\img\\yellowcherries.jpg");
        
        //ImageView
        imageViewRight.setImage(blankImage);
        imageViewLeft.setImage(blankImage);
        imageViewCenterRight.setImage(blankImage);
        imageViewCenterLeft.setImage(blankImage);
        
        //TextField
        textFieldYouWon.setText("0");
        textFieldBet.setText("");
        textFieldTotalLosses.setText("0");
        textFieldTotalWins.setText("0");
        textFieldDeposit.setText("");
        textFieldBalance.setText("0");
        
        amountBalance = 0;
        amountDeposit = 0;
        amountTotalLoss =0;
        amountTotalWins = 0;
        amountTotalBets = 0;
        amountWon = 0;
        amountBet = 0;

      //  Media soundWon = new Media("file:C:\\soundyouwon.mp3");
      //  Media soundLost = new Media("file:C:\\soundyoulost.mp3");

//instantiate media
       // Media soundSpin = new Media("C:\\soundSpin.mp3");
        
        //MediaPlayer soundPlayer = new MediaPlayer(soundSpin);
        //soundPlayer.setAutoPlay(true);
    }
    
    //random generator
    public int spin()
    {
        //create random number
        int spinSlot;

        Random randomSpin = new Random();

        
        
        spinSlot = randomSpin.nextInt(14);
       
        
        return spinSlot;
     

    }

    
    

    //This method checks that the bet is a numeric value

   public boolean readBet()
   {
         
       try
       {

       textFieldBet.focusedProperty().addListener((arg0, oldValue, newValue) -> {
        if (!newValue) 
        { // when focus lost
                if (!textFieldBet.getText().matches("[0-9]*")) 
                {
                    textFieldBet.setText("");
                    labelMain.setText("Your Bet is not valid!");
                }
              validBet=false;
                    }}
       );
           
        amountBet=Integer.parseInt(textFieldBet.getText()); 
        validBet=true;
      }
     
        
       catch (InputMismatchException e)
       {
            System.out.println(e.getMessage());
            textFieldBet.clear();
            textFieldBet.setText("0");
            validBet=false;
            labelMain.setText("Your Bet is not valid!");
        }
   
       return validBet;
   }
       
   
   public boolean readDeposit()
   {
         
       try
       {

       textFieldDeposit.focusedProperty().addListener((arg0, oldValue, newValue) -> {
        if (!newValue) 
        { // when focus lost
                if (!textFieldDeposit.getText().matches("[0-9]*")) 
                {
                    textFieldDeposit.setText("");
                    labelMain.setText("Your Deposit Amount is not valid!");
                }
              validDeposit=false;
                    }}
       );
           
        amountDeposit=Integer.parseInt(textFieldDeposit.getText()); 
        validDeposit=true;
      }
     
        
       catch (InputMismatchException e)
       {
            System.out.println(e.getMessage());
            textFieldDeposit.clear();
            textFieldDeposit.setText("0");
            validDeposit=false;
            labelMain.setText("Your Deposit Amount is not valid!");
        }
   
       return validDeposit;
   }
   
   
   //method to calculate wins, losses and cumulatives
   
   public void slotNumbers()
   {
       
    
        //console message
       
       //If 4 fruits same, 4x
       
       if ((fruit1 == fruit2)&&(fruit3 == fruit4)&&(fruit1 == fruit3))
            {
                amountWon = FOUR*amountBet;
                amountWon = TRIPLE*amountBet;
                textFieldYouWon.setText(Integer.toString(amountWon));   
                labelMain.setText(str2);
                amountBalance = amountBalance+ amountWon-amountBet;
            }
           
            if (   ((fruit1 == fruit2) && (fruit2 == fruit3) && (fruit1 !=fruit4)) ||  ((fruit1 == fruit2) && (fruit1 == fruit4) && (fruit1!=fruit3)) || ((fruit2==fruit3)&&(fruit2==fruit4)&&(fruit2!=fruit1)) ||((fruit1==fruit3)&&(fruit1==fruit4)&&(fruit1!=fruit2)))
        //3 fruits are the same
            {
                amountWon = TRIPLE*amountBet;
                textFieldYouWon.setText(Integer.toString(amountWon));   
                labelMain.setText(str2);
                amountBalance = amountBalance+ amountWon-amountBet;
            }
        
        //case when no fruits are same
        if ((fruit1 != fruit2) && (fruit3 != fruit4) && (fruit1 != fruit3) && (fruit2!=fruit3) && (fruit1!=fruit4) && (fruit2!=fruit4))
            {  
                amountWon = ZERO;
                textFieldYouWon.setText(Integer.toString(amountWon));
                labelMain.setText(str3);
                amountBalance = amountBalance - amountBet;
            }
        
        
        //case when 2 fruits are same (Default)
        else
            {
                amountWon = DOUBLE*amountBet;
                textFieldYouWon.setText(Integer.toString(amountWon));      
                labelMain.setText(str2);
                amountBalance = amountBalance + amountWon - amountBet;

            }
        
        //cumulative wins
        amountTotalWins +=amountWon;
        textFieldTotalWins.setText(Integer.toString(amountTotalWins));
        
            
        //total losses
        amountTotalLoss = amountTotalDeposit - amountBalance;
        textFieldTotalLosses.setText(Integer.toString(amountTotalLoss));
       
        textFieldBalance.setText(Integer.toString(amountBalance));        
        // Your balance
       
        textFieldTotalBets.setText(Integer.toString(amountTotalBets));
        
        
        
   }

    public void setCustomBet(int customBet)
    {
        customButtonBet = customBet;
        //command check
        System.out.println("Button amount is $"+customButtonBet);
    }
   
    
   public void buttonBet2XListener()
   {
       //console message
       System.out.println("Button Bet 2X pressed");
       buttonBet = 2*amountBet;
       setCustomBet(buttonBet);
       buttonSpinListener();
     
       
   }
   
   
   public void buttonBet5Listener()
   {
       //console message
       System.out.println("Button Bet $5 pressed");
       buttonBet = 5;
       setCustomBet(buttonBet);
       buttonSpinListener();
       
   }
   
   
   public void buttonBet10Listener()
   {
       //console message
       System.out.println("Button Bet $10 pressed");
       buttonBet = 10;
       setCustomBet(buttonBet);
       buttonSpinListener();
    }
   
   
   public void buttonBet50Listener()
   {
       //console message
       System.out.println("Button Bet $50 pressed");
        buttonBet = 50;
       setCustomBet(buttonBet);     
       buttonSpinListener();
   }
   
   public void buttonBet100Listener()
   {
       //console message
       System.out.println("Button Bet $100 pressed");
        buttonBet = 100;
       setCustomBet(buttonBet);
       buttonSpinListener();
   }
   
   public void buttonBet500Listener()
   {
       //console message
       System.out.println("Button Bet $500 pressed");
        buttonBet = 500;
       setCustomBet(buttonBet);
       buttonSpinListener();
   }
   
   public void buttonMaxListener()
   {
       //console message
       System.out.println("Button Max Bet pressed");
       
       if (amountBalance>MAXBET)
           buttonBet = MAXBET;
       else
       buttonBet = amountBalance;
       setCustomBet(buttonBet);
       buttonSpinListener();
   }

   public int getButtonBet()
   {
       return customButtonBet;
   }

   public void keyResetListener()
   {
       int confirm;
       
       confirm = JOptionPane.showConfirmDialog(null, "Do you want to Reset the game?", "Please confirm.",JOptionPane.YES_NO_OPTION);
       if (confirm == JOptionPane.YES_OPTION)
       {
          initialize();
          
       }
      
   }
   
   
   public void keyQuitListener()
           
   {
       
       int confirm;
       
       confirm = JOptionPane.showConfirmDialog(null, "Do you want to Quit the game?", "Please confirm.",JOptionPane.YES_NO_OPTION);
       if (confirm == JOptionPane.YES_OPTION)
       {
          buttonCashOutListener(); 
          System.exit(0);
       }
       
   }
   
   public void buttonCashOutListener()
   {
       //console message
       System.out.println("Button CASH OUT pressed");
       System.out.println("Amount to cash out $"+amountBalance);
       
       if (amountBalance>=1)
       {
            labelMain.setText("Cashing Out");
            textFieldBet.setText("");
            textFieldDeposit.setText("");
            textFieldYouWon.setText("");
            
            for(int i = amountBalance;i>0;i--)
            
            {
                amountBalance--;
                textFieldBalance.setText(Integer.toString(amountBalance));
            }
                      
       }
       
       
       
       else
       {
           labelMain.setText("Nothing to cash Out");
       }
       
   }
   
   public void buttonDepositListener()
   {
   // console message
       System.out.println("DEPOSIT CASH");
       readDeposit();
       System.out.println("Deposit $"+amountDeposit);
       
       if (amountDeposit<1)
       {
           validDeposit = false;
           labelMain.setText("The minimum deposit is $1");
           textFieldDeposit.setText("");
       }
       else if(amountDeposit>10000)
       {
           validDeposit = false;
           labelMain.setText("Maximum Single deposit is $10,000");
           textFieldDeposit.setText("");
       }
       else validDeposit=true;
       
       if (validDeposit==true)
       {
           //add to balance
           
           amountBalance+=amountDeposit;
           textFieldBalance.setText(Integer.toString(amountBalance));
           labelMain.setText("You deposited $"+amountDeposit);
       }
           
       amountTotalDeposit+=amountDeposit;
       textFieldDeposit.setText("");
           }
   
   
   
    public void buttonSpinListener()
    {
  
        //console message
        System.out.println("SPINNING");
        
        
        
        if (0 <getButtonBet())
        {
        amountBet = getButtonBet();
        }
        
        else
        readBet(); 
        
        System.out.println("Betting $" +amountBet);
        
        
        //check for the bet value to be correct
        if(amountBet<1)
        { 
            validBet = false;
            labelMain.setText("Incorrect Bet! Minimum Bet is $1");
            textFieldBet.setText("");
        }
        
        else if(amountBet>MAXBET)
        {
            validBet = false;
            labelMain.setText("Incorrect Bet! Maximum Bet is $1000");
            textFieldBet.setText("");
        }
        
        else validBet = true;
        
        //if bet value is correct, then spin
        if (validBet == true)
        {
     
        if (amountBalance <amountBet)
         
        {
            labelMain.setText("Reduce your bet or Deposit more funds");
            
        }    
        else    
        {    
        //spinning left fruit
        fruit1 = spin();
        System.out.println(fruit1);
        imageViewLeft.setImage(fruitImage[fruit1]);

        //spinning Center left fruit
        fruit2 = spin();
        System.out.println(fruit2);
        imageViewCenterLeft.setImage(fruitImage[fruit2]);

        //spinning Center right fruit
        fruit3 = spin();
        System.out.println(fruit3);
        imageViewCenterRight.setImage(fruitImage[fruit3]);
  
        //spinning right fruit
        fruit4 = spin();
        System.out.println(fruit4);
        imageViewRight.setImage(fruitImage[fruit4]);
  
        
        
        //calculate win, loss, cumulative
        buttonBet = 0;
        
        slotNumbers();
        }
        }
              
    }
        
        
    }
    
    

