package no.clave.eirik.trening.romannumerals.presentation;

import no.clave.eirik.trening.romannumerals.domain.ConversionRequest;
import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.service.RomanNumeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RomanNumeralController {

        private RomanNumeralService romanNumeralService;

        @RequestMapping(method = RequestMethod.GET)
        public String greeting(){
            return "Hello! Please POST roman numeral..";
        }

        @RequestMapping(value = "/roman-to-decimal", method = RequestMethod.POST)
        public ConversionRequest romanToDecimal(@RequestBody Number number){

//            if(!number.hasRomanNumeral()) throw new IllegalArgumentException("Zero is not defined for roman numerals");

            return romanNumeralService.convertRomanNumeral(number);
        }

        @RequestMapping(value = "/decimal-to-roman", method = RequestMethod.POST)
        public ConversionRequest decimalToRoman(@RequestBody Number number){

//            if(!number.hasDecimal()) throw new IllegalArgumentException("Zero is not defined for roman numerals");

        return romanNumeralService.convertDecimal(number);
    }

        @Autowired
        public RomanNumeralController(RomanNumeralService romanNumeralService) {
                this.romanNumeralService = romanNumeralService;
        }
}