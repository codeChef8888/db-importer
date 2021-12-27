package io.java.DB.Importer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import io.java.DB.Importer.Service.ProductService;


@RestController
public class ExportController {

    @Autowired
    private ProductService productService;
    
//    @Autowired
//    ExcelView excel;

    /**
     * Handle request to download an Excel document
     */
    @GetMapping("/download")
    public ResponseEntity<Object> download(Model model) {

        model.addAttribute("Product", productService.getAll());
       return new ResponseEntity<Object>(productService.getAll(), HttpStatus.OK);
    }
}
