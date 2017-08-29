package no.clave.eirik.trening.romannumerals.presentation;

import no.clave.eirik.trening.romannumerals.domain.ConversionResponse;
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

        @RequestMapping(value = "/roman-to-decimal", method = RequestMethod.POST)
        public ConversionResponse romanToDecimal(@RequestBody Number number){

            return romanNumeralService.convertRomanNumeral(number);
        }

        @RequestMapping(value = "/decimal-to-roman", method = RequestMethod.POST)
        public ConversionResponse decimalToRoman(@RequestBody Number number){

            return romanNumeralService.convertDecimal(number);
        }

        @Autowired
        public RomanNumeralController(RomanNumeralService romanNumeralService) {

                this.romanNumeralService = romanNumeralService;
        }
}