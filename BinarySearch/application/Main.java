package application;

import entities.BinarySearch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fileCSV = new File("D:\\Documents\\Faculdade\\Java\\Aulas Workspace\\Algoritmos\\ListNamesCSV.csv");
        String[][] listCSV = new String[128][2];
        Scanner inputScann = new Scanner(System.in);

        try(BufferedReader bf = new BufferedReader(new FileReader(fileCSV))){
            String listLine = bf.readLine();
            int counter = 0;

            while(listLine != null){
                String[] listColumn = listLine.split(",");
                listCSV[counter][0] = listColumn[0];
                listCSV[counter][1] = listColumn[1];
                counter++;

                listLine = bf.readLine();
            }
        }
        catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }

        System.out.println("Digite o nome de um cliente da lista | Input a name from the client list");
        System.out.print("Nome | Name: ");
        String name = inputScann.nextLine();

        BinarySearch binarySearch = new BinarySearch(listCSV,name);
        binarySearch.listNameConfirmed();

        inputScann.close();
    }
}