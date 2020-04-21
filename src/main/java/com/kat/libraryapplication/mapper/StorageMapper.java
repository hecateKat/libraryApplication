package com.kat.libraryapplication.mapper;

import com.kat.libraryapplication.dto.StorageDto;
import com.kat.libraryapplication.entity.Storage;

public class StorageMapper {

    public static StorageDto mapStorageToStorageDto (Storage storage){

        StorageDto storageDto = new StorageDto();

        if (storage.getId() != null){
            storageDto.setBook(storage.getBook());
            storageDto.setBaseAmount(storage.getBaseAmount());
            storageDto.setCurrentAmount(storage.getCurrentAmount());
        }

        return storageDto;
    }

    public static Storage mapStorageDtoToStorage (Storage storage, StorageDto storageDto){

        storage.setBook(storageDto.getBook());
        storage.setBaseAmount(storageDto.getBaseAmount());
        storage.setCurrentAmount(storageDto.getCurrentAmount());

        return storage;
    }

}
