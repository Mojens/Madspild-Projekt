package com.example.madspildprojekt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Mohammad Adel Murtada
 */
@Controller
public class Main {
  public static void main(String[] args) {

  }

  @GetMapping("/")
  public String index(){
    return"index";
  }

  @GetMapping("/hvad-er-madspild")
  public String madSpild(){
    return "madspild";
  }

  @GetMapping("/ivaerksaetteri")
  public String ivaerksaetteri(){
    return "ivaerksaetteri";
  }

  @GetMapping("/sunhed")
  public String sunhed(){
    return "sunhed";
  }

  @GetMapping("/smider-814000-ton-mad")
  public String artikel1(){
    return "artikel1";
  }

  @GetMapping("/hvorfor-er-madspild-et-problem")
  public String artikel2(){
    return "artikel2";
  }

  @GetMapping("/kampen-mod-madspild-er-paa-rette-vej")
  public String artikel3(){
    return "artikel3";
  }

}
