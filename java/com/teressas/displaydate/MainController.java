package com.teressas.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// class definition and imports here...
    @GetMapping("/")
    public String index() {
        
        return "index.jsp";
    }
    
    @GetMapping("/date")
    public String date(Model model) {
    	SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
		String stringDate1 = sdf1.format(new Date());
		// Day
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
		String stringDate2 = sdf2.format(new Date());
		// Month
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM");
		String stringDate3 = sdf3.format(new Date());
		// Year
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");
		String stringDate4 = sdf4.format(new Date());
		
		String newDate = stringDate1 + ", the " + stringDate2 + " of " + stringDate3 + ", " + stringDate4;
		
		model.addAttribute("newDate", newDate);
		
		return "date.jsp";
    }
    
    @GetMapping("/time")
    public String time(Model model) {
	    SimpleDateFormat sdf5 = new SimpleDateFormat("HH:mm:ss");
	    Date date = new Date();  
	    String stringTime = sdf5.format(date);
	    
	    model.addAttribute("stringTime", stringTime);
	    
	    return "time.jsp";
    }
    

    
    

}
