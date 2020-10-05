import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "E:\\JavaRush\\Game\\";
        File tempDir = new File(path + "temp");
        tempDir.mkdir();
        File temp = new File(path +"temp\\temp.txt");
        try {
            temp.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder stringBuilder = new StringBuilder("logs\n");

        File main = new File(path + "src\\main\\Main.java");
        File utils = new File(path + "src\\main\\Utils.java");

        File dir1 = new File(path + "src\\main");
        File dir2 = new File(path + "src\\test");
        File dir3 = new File(path + "savegames");
        File dir5 = new File(path + "res\\drawables");
        File dir6 = new File(path + "res\\vectors");
        File dir7 = new File(path + "res\\icons");

        if (dir1.mkdirs()) stringBuilder.append("Folder \"src\\main\" created \n");
        else stringBuilder.append("Folder \"src\\main\" not created \n");

        if(dir2.mkdirs()) stringBuilder.append("Folder \"src\\test\" created \n");
        else stringBuilder.append("Folder \"src\\test\" not created \n");

        if(dir3.mkdir()) stringBuilder.append("Folder \"savegames\" created \n");
        else stringBuilder.append("Folder \"savegames\" not created \n");

        if(dir5.mkdirs()) stringBuilder.append("Folder \"res\\drawables\" created \n");
        else stringBuilder.append("Folder \"res\\drawables\" not created \n");

        if(dir6.mkdirs()) stringBuilder.append("Folder \"res\\vectors\" created \n");
        else stringBuilder.append("Folder \"res\\vectors\" not created \n");

        if(dir7.mkdirs()) stringBuilder.append("Folder \"res\\icons\" created \n");
        else stringBuilder.append("Folder \"res\\icons\" not created \n");

        try {
            main.createNewFile();
            stringBuilder.append("File Main.java created \n");
        } catch (IOException e) {
            stringBuilder.append("File Main.java not created \n");
        }

        try {
            utils.createNewFile();
            stringBuilder.append("File Utils.java created \n");
        } catch (IOException e) {
            stringBuilder.append("File Utils.java not created \n");
        }
        FileWriter fileWriter = new FileWriter(temp);
        fileWriter.write(String.valueOf(stringBuilder));
        fileWriter.close();
    }
}