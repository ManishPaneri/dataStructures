package array;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("array.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }



        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int numberOfDays = in.nextInt();
            ArrayList<String> ingredientIdArr= new ArrayList<>();
            for (int i = 0; i < numberOfDays; i++) {
                String ingredientId = in.next();
                ingredientIdArr.add(ingredientId);
            }



        }


        public static void separatedIngredientId(int day, int ing, String[] IngArr, int n){
            HashSet<String> ingSet = new HashSet<>();
            int FAT=ing/3, FIBER=ing/3, CARB=ing/3;
            String PrevIng= ""; String Prev=""; boolean flag =false;
            for(int i=0; i<n; i++){
                for(String val : IngArr){
                    if(val.startsWith("FAT")){
                        if(FAT==0){
                            ingSet.remove(PrevIng);
                            if(!ingSet.isEmpty()){
                                System.out.print(String.join(":", ingSet));
                                ingSet.clear();
                            }
                        }else{
                            ingSet.add(val);
                            System.out.print("-");
                            FAT=0;
                            i++;
                        }
                        Prev= "FAT";
                        flag = true;
                    }else if(val.startsWith("FIBER")){
                        if(FIBER==0){
                            ingSet.remove(PrevIng);
                            if(!ingSet.isEmpty()){
                                System.out.print(String.join(":", ingSet));
                                ingSet.clear();
                            }
                        }else{
                            ingSet.add(val);
                            System.out.print("-");
                            FIBER=0;
                            i++;
                        }
                        Prev= "FIBER";
                        flag = true;

                    }else if(val.startsWith("CARB")){
                        if(CARB==0){
                            ingSet.remove(PrevIng);
                            if(!ingSet.isEmpty()){
                                System.out.print(String.join(":", ingSet));
                                ingSet.clear();
                            }
                        }else{
                            ingSet.add(val);
                            System.out.print("-");
                            CARB=0;
                            i++;
                        }
                        flag = true;
                        Prev = "CARB";
                    }

                    if(flag == false){
                        ingSet.add(val);
                    }
                    PrevIng = val;
                    flag =false;

                }
            }

        }
//    public static void main(String[] args) {
//        launch(args);
//    }
}
