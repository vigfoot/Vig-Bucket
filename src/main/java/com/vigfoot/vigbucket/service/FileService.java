package com.vigfoot.vigbucket.service;

import com.vigfoot.vigbucket.vo.Bucket;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileService {

    @Value("${dir}")
    public String directory;

    public List<Bucket.File> getStorage(){


        return null;
    }
}
