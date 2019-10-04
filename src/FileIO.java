import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {
    public FileIO() throws IOException {
    }

    public static void main(String[] args) throws IOException{
        //================Creating a items.txt file===================
        String directory = "data";
        String filename = "items.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
//============since it didn't exist already, it created it===================
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        System.out.println(getItemsContent());
        newListItems();
    }

    public static List<String> getItemsContent() {
        Path p = Paths.get("data","items.txt");

        List<String> itemsList = new ArrayList<>();

        try {
            itemsList = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return itemsList;
    }
//===========replaced the items in the list========================//
    public static void newListItems() {

        Path add = Paths.get("data","items.txt");

        List<String> newItemsList = Arrays.asList("blah", "blah blah", "blah blah blah");
        try {
            Files.write(add, newItemsList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}