package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class AppController {
	
	public static final String outputFileName="/Users/bibinbabyjohn/Downloads/The_Batman2.jpg";

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public Author getMAllUsers(@RequestParam("age")int age) {
        List<Author> author = new ArrayList<>();
        author.add(new Author(1,"james",age));
        author.add(new Author(2,"john",age));
        return new Author(2,"john",age);
    }
    
    @RequestMapping(value = "/author", method = RequestMethod.POST)
    public String postMAllUsers(@RequestBody Content inputPayload) throws IOException {
        byte[] decodedBytes = Base64.getDecoder().decode(inputPayload.getImage());
        FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
       return "done";
    }
    




}
