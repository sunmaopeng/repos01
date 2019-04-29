package com.itheima.controller;

import com.itheima.domain.User;

import com.sun.deploy.util.SessionState;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class ControllerTest {

//    @RequestMapping("/text")
//    public String text(Model model){
//        User user = new User();
//        user.setId(1);
//        user.setSex("nan");
//        user.setName("sadad");
//        model.addAttribute(user);
//        System.out.println("sadadadadadada");
//        return "success";
//    }

//    @RequestMapping("/text2")
//    public void text2(HttpServletRequest request, HttpServletResponse response) throws Exception {
////        request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request,response);
////        response.sendRedirect(request.getContextPath()+"/index.jsp");
//        response.setContentType("text/html;charset=utf-8");
//        response.getWriter().print("dadadadadadadadadadadad");
//    }
//
//    @RequestMapping("/text3")
//    public  @ResponseBody User text3(@RequestBody User user){
//        System.out.println(user);
//        user.setName("老王");
//        return user;
//
//    }

//    @RequestMapping("/load")
//    public String textLOad(HttpServletRequest request, HttpSession session) throws Exception {
//        String realPath = session.getServletContext().getRealPath("/upload");
//        System.out.println(realPath);
//        File file = new File(realPath);
//        if (!file.exists()){
//            file.mkdirs();
//        }
//
//        DiskFileItemFactory df = new DiskFileItemFactory();
//        ServletFileUpload sfu = new ServletFileUpload(df);
//        List<FileItem> fileItems = sfu.parseRequest(request);
//        for (FileItem fileItem : fileItems) {
//            if (fileItem.isFormField()){
//
//            }else {
//                String filename = fileItem.getName();
//                fileItem.write(new File(realPath,filename));
//                fileItem.delete();
//            }
//        }
//        System.out.println("方法执行");
//        return "success";
//    }
    @RequestMapping("/load")
    public String loadText(MultipartFile upload) throws IOException {
        String path = "http://localhost:9090/img";
        System.out.println(path);
        String filrname = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
        filrname = uuid+"+"+filrname;
        Client client = Client.create();
        WebResource resource = client.resource(path+filrname);
        resource.put(upload.getBytes());
        return "success";
    }
}
