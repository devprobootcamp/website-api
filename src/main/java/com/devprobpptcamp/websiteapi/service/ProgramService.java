package com.devprobpptcamp.websiteapi.service;

import com.devprobpptcamp.websiteapi.domain.Program;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProgramService {
    public List<Program> getProgramList(){
        return Arrays.asList(
                new Program("Java Backend Development - Spring & SpringBoot", "24 weeks", "https: //static.wixstatic.com/media/11062b_3bc0a742dcc54a698a440056823c715f~mv2.jpg/v1/fit/w_800,h_600,al_c,q_90/file.webp"),
                new Program("Javascript Web Development - ReactJS", "24 weeks", "https://static.wixstatic.com/media/11062b_8c2d39267b894821935af1b8095e9bfd~mv2.jpg/v1/fit/w_1000,h_800,al_c,q_90/file.webp"),
                new Program("Database Design & Implementation", "8 weeks", "https://static.wixstatic.com/media/nsplsh_494b48764f6c5a46434f67~mv2_d_4608_3072_s_4_2.jpg/v1/fit/w_800,h_600,al_c,q_90/file.webp"),
                new Program("Linux System Administration", "8 weeks", "https://static.wixstatic.com/media/nsplsh_49859ec972bd4aa5b74213448088d3a5~mv2.jpg/v1/fit/w_1000,h_800,al_c,q_90/file.webp")
        );
    }
}
