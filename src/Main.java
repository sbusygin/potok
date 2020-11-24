import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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



        GameProgress game1 = new GameProgress(78,3,17,20.1);
        GameProgress game2 = new GameProgress(89,3,19,25.3);
        GameProgress game3 = new GameProgress(56,7,22,34.6);

    }

    public void saveGame (String path, GameProgress gameProgress) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(gameProgress);
        objectOutputStream.close();
    }

    public void zipFiles(String path, String obj) throws FileNotFoundException {
        FileOutputStream zipFile = new FileOutputStream(path);
        try (ZipOutputStream zip = new ZipOutputStream(zipFile)) {
            zip.putNextEntry(new ZipEntry(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
