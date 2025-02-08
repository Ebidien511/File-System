package dto;

import java.util.ArrayList;

public class Folder extends FileSystemItem {
    private ArrayList<FileSystemItem> folderContents;

    public Folder(String name, Folder parentFolder) {
        super(name, parentFolder);
        folderContents = new ArrayList<>();
    }

    @Override
    public long getSize() {
        long size = 0;
        for(FileSystemItem item : folderContents) {
            if(item instanceof Folder) {
                Folder nestedFolder = (Folder) item;
                size += nestedFolder.getSize();
            } else if (item instanceof File) {
                size += item.getSize();
            }
        }
        return size;
    }

    public void deleteItem(FileSystemItem item) {
        folderContents.remove(item);
    }

    public void addItem(FileSystemItem item) {
        folderContents.add(item);
    }

    public int getNumberOfFiles(){
        int count=0;
        for(FileSystemItem item : folderContents) {
            if(item instanceof Folder) {
                Folder currentFolder = (Folder) item;
                currentFolder.getNumberOfFiles();
            } else if (item instanceof File) {
                count++;
            }
        }
        return count;
    }
}
