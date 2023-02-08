package com.ruoyi.project.seedoctor.registrationlist.service.impl;

import com.ruoyi.project.seedoctor.registrationlist.domain.RegList;
import com.ruoyi.project.seedoctor.registrationlist.mapper.RegistrationListMapper;
import com.ruoyi.project.seedoctor.registrationlist.service.RegistrationListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @Author Ada
 * @Date 2021/7/15 21:25
 */
@Service
public class RegistrationListServiceImpl implements RegistrationListService {

    @Autowired
    private RegistrationListMapper registrationListMapper;

    private String dir = "E:/";

    @Override
    public List<RegList> findMore(RegList regList) {
        return registrationListMapper.selectMore(regList);
    }

    @Override
    public List<RegList> findType() {
        return registrationListMapper.selectType();
    }

    @Override
    public List<RegList> findPeriod() {
        return registrationListMapper.selectPeriod();
    }

    @Override
    public List<RegList> findStatus() {
        return registrationListMapper.selectStatus();
    }

    @Override
    public byte[] getImage(String imageName) {
        System.out.println(imageName);
        String name= imageName.substring(imageName.lastIndexOf("/")+1);
        System.out.println(name);

        File file= new File(new File(dir),name);

        FileInputStream inputStream=null;
        byte[] datas=null;

        try {
            inputStream = new FileInputStream(file);

            datas=new byte[inputStream.available()];
            inputStream.read(datas,0,datas.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            datas=null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("datas"+datas);

        return datas;
    }
}
