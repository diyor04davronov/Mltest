import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Data {
    public static void main(String[] args)  {
        Stack<String> stackData = new Stack<String>();

        stackData.add( "Mathwdewdwddcwd");
        stackData.add( "PI");
        stackData.push("Hello");

//        for (int i = 0; i < 1000000000; i++) {
//            stackData.push("another copy");
//            System.out.println(1);
//        }


 //////////////////////////////////////////////////////////////


        //interface Queue
        // line structure (data type)
        // Queue =  FIFO data structure - First-in First-out
        // enqueue (add)
        // dequeue (remove)

        Queue<String> datatype = new LinkedList<String>();

        datatype.offer("Diyor");
        datatype.offer("Abduzim");
        datatype.offer("Abubakir");
        // datatype.poll();
//        System.out.println(datatype);
//        System.out.println(datatype.isEmpty());


/////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////
        //////////////////////////
    // File class


  //      File file = new File("java.txt");

//        if (file.exists()) {
//            file.createNewFile();
//
//        } else {
//            System.out.println("something went wrong !!!");
//        }
//

 /////////////////////////
        ////////////////////////////
                    ///////////////////

        /// FileWriter class
//       try {
//           FileWriter wr = new FileWriter("file.txt");
//
//           wr.write("My name is Diyor \nI'm student at ITPU");
//           wr.append("\n hmm something goes wrong ");
//           wr.append("\n     ^^      ..                                       ..\n" +
//                   "            []                                       []\n" +
//                   "          .:[]:_          ^^                       ,:[]:.\n" +
//                   "        .: :[]: :-.                             ,-: :[]: :.\n" +
//                   "      .: : :[]: : :`._                       ,.': : :[]: : :.\n" +
//                   "    .: : : :[]: : : : :-._               _,-: : : : :[]: : : :.\n" +
//                   "_..: : : : :[]: : : : : : :-._________.-: : : : : : :[]: : : : :-._\n" +
//                   "_:_:_:_:_:_:[]:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:_:[]:_:_:_:_:_:_\n" +
//                   "!!!!!!!!!!!![]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!![]!!!!!!!!!!!!!\n" +
//                   "^^^^^^^^^^^^[]^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^[]^^^^^^^^^^^^^\n" +
//                   "            []                                       []\n" +
//                   "            []                                       []\n" +
//                   "            []                                       []\n" +
//                   " ~~^-~^_~^~/  \\~^-~^~_~^-~_^~-^~_^~~-^~_~^~-~_~-^~_^/  \\~^-~_~^-~~-\n" +
//                   "~ _~~- ~^-^~-^~~- ^~_^-^~~_ -~^_ -~_-~~^- _~~_~-^_ ~^-^~~-_^-~ ~^\n" +
//                   "   ~ ^- _~~_-  ~~ _ ~  ^~  - ~~^ _ -  ^~-  ~ _  ~~^  - ~_   - ~^_~\n" +
//                   "     ~-  ^_  ~^ -  ^~ _ - ~^~ _   _~^~-  _ ~~^ - _ ~ - _ ~~^ -\n" +
//                   "jgs     ~^ -_ ~^^ -_ ~ _ - _ ~^~-  _~ -_   ~- _ ~^ _ -  ~ ^-\n" +
//                   "            ~^~ - _ ^ - ~~~ _ - _ ~-^ ~ __- ~_ - ~  ~^_-\n" +
//                   "                ~ ~- ^~ -  ~^ -  ~ ^~ - ~~  ^~ - ~ ");
//           wr.close();
//
//
//       } catch (IOException e) {
//           e.printStackTrace();
//
//       }
// ////////////////////////////////////////
//        /////////////////////////////////////////////
//        ////////////////////////////////////////////////////
//
//        //FileReader:
//     try{
//         FileReader read = new FileReader("file.txt");
//         int letter = read.read();
//
//         while (letter != -1) {
//             System.out.print((char)letter);
//             letter = read.read();
//         }
//
//
//
//     } catch (IOException e) {
//         e.printStackTrace();
//
//
//
//     }



        ////////////////////////////////
        ////////////
        /////

       //  Sound in java
//        Scanner scn = new Scanner(System.in);
//
//        File sound = new File("sound1.wav");
//        try {
//            AudioInputStream audioNasheed  = AudioSystem.getAudioInputStream(sound);
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioNasheed);
//
//
//            String response = "";
//
//            while (!response.equals("S")) {
//                System.out.println("Play : play\nSTOP : stop\nREPLAY: repeat\nCLOSE : close");
//
//                System.out.print("Enter input:");
//                response = scn.next();
//                response = response.toUpperCase();
//                switch (response) {
//                    case ("PLAY"): clip.start();
//                        break;
//                    case ("STOP"): clip.stop();
//                    break;
//                    case ("REPLAY"): clip.setMicrosecondPosition(0);
//                    break;
//                    case ("CLOSE"): clip.close();
//                    break;
//                    default: System.out.println("This command does not exist ");
//
//                }
//            }
//
//        } catch (UnsupportedAudioFileException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (LineUnavailableException e) {
//            throw new RuntimeException(e);
//        }

  ///////////////////////////////////////
        /////////////////////////////////////////
                    ////////////////////////////////////////


        //JFrame = a GUI window to add components to

        //JFrame frame = new JFrame();
//       frame.setTitle("Frame testing");
//       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit out of application
//       frame.setResizable(true); // prevent frame from being resized
//       frame.setSize(900, 450); // sets the x-dimension, and y-dimension of frame
//       frame.setVisible(true); // make frame visible
//
//
//        ImageIcon logo = new ImageIcon("logo.png"); // add an image
//
//        frame.setIconImage(logo.getImage()); // change icon of frame
//        frame.getContentPane().setBackground(new Color(22, 29, 45));



//            ImageIcon img = new ImageIcon("lo.png");
//        Border brd = BorderFactory.createLineBorder(Color.yellow, 10);                    NewFrame frame =  new NewFrame();
//             JLabel label  = new JLabel(); //add label
//             label.setText("My frame test"); // set text of label
//        label.setIcon(img);

//                label.setHorizontalTextPosition(JLabel.CENTER); // set text position
//                label.setForeground(Color.blue);
//                label.setVerticalTextPosition(JLabel.TOP);
//                label.setFont(new Font("Mv boli", Font.BOLD,30));
//             //   label.setIconTextGap(-60); // set gap of text to image
//                label.setBackground(Color.BLACK); // set background color
//                label.setOpaque(true);// display bckg color
//                label.setBorder(brd);
//                label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon + text within label
//                label.getHorizontalAlignment();
             //   label.setBounds(0, 0, 150,150);


        ImageIcon img = new ImageIcon("lg.jpg");

             JLabel label = new JLabel();
             label.setText("Second label");
             label.setIcon(img);
             label.setVerticalAlignment(JLabel.TOP);
                JPanel green = new JPanel();
                green.setBackground(Color.green);
                green.setBounds(0,0,300,300);

        JPanel yellow = new JPanel();
        yellow.setBackground(Color.yellow);
        yellow.setBounds(300,0,300,300);


        JPanel red = new JPanel();
        red.setBackground(Color.red);
        red.setBounds(300,300,300,300);

        JPanel blck = new JPanel();
                        blck.setBackground(Color.black);
                        blck.setBounds(0,300,300,300);


        NewFrame frame = new NewFrame();

//                frame.add(label);
                frame.setVisible(true);
             frame.setLayout(null);
            // frame.pack(); // add at the end
               frame.setSize(800, 800);

               green.add(label);
               frame.add(green);

        frame.add(blck);
        frame.add(yellow);
        frame.add(red);
        frame.add(label);


    }
}

