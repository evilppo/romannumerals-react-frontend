package no.clave.eirik.trening.romannumerals.presentation;

import no.clave.eirik.trening.romannumerals.domain.RomanNumeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RomanNumeralController {

        RomanNumeralService romanNumeralService;

        @RequestMapping(method = RequestMethod.GET)
        public String greeting(){
            return "Hello! Please POST roman numeral..";
        }

        @RequestMapping(method = RequestMethod.POST)
        public int RomanToDecimal(@RequestBody String numeral){

            return romanNumeralService.convertRomanNumeralToDecimal(numeral);
        }

        @Autowired
        public RomanNumeralController(RomanNumeralService romanNumeralService) {
                this.romanNumeralService = romanNumeralService;
        }
}