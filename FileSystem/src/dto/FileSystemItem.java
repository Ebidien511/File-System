package dto;

import java.time.LocalDateTime;

public abstract class FileSystemItem {
    protected String name;
    protected byte size;
    protected Folder parentFolder;
    protected LocalDateTime dateCreated;
    protected LocalDateTime lastModificationDate;
    protected LocalDateTime lastAccessedDate;

    public FileSystemItem(String name, Folder parentFolder) {
        this.name = name;
        this.parentFolder = parentFolder;
        this.dateCreated = LocalDateTime.now();
        this.lastModificationDate = LocalDateTime.now();
        this.lastAccessedDate = LocalDateTime.now();
    }

    public abstract byte getSize();

    public String getItemPath(){
        if(parentFolder == null) return name;
        else return parentFolder.getItemPath()+"/"+name;
    }

    public String getName(){
        return this.name;
    }

    public void rename(String newName){
        this.name = newName;
    }
}
