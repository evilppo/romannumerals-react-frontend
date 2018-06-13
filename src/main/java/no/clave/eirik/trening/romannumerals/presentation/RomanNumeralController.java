package no.clave.eirik.trening.romannumerals.presentation;

import no.clave.eirik.trening.romannumerals.domain.ConversionResponse;
import no.clave.eirik.trening.romannumerals.domain.Number;
import no.clave.eirik.trening.romannumerals.domain.service.RomanNumeralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RomanNumeralController {

        private RomanNumeralService romanNumeralService;

        @RequestMapping(value = "/")
        public ResponseEntity root(){
            return ResponseEntity.ok("Roman numerals API");
        }

        @RequestMapping(value = "/roman-to-decimal", method = RequestMethod.POST)
        public ResponseEntity romanToDecimal(@RequestBody Number number){

            ConversionResponse response = romanNumeralService.convertRomanNumeral(number);

            if(response.getValidation().isValid()){

                return ResponseEntity.ok().body(response);
            }

            return ResponseEntity.badRequest().body(response);
        }

        @RequestMapping(value = "/decimal-to-roman", method = RequestMethod.POST)
        public ResponseEntity decimalToRoman(@RequestBody Number number){

            ConversionResponse response = romanNumeralService.convertDecimal(number);

            if(response.getValidation().isValid()) {
                return ResponseEntity.ok().body(response);
            }

            return ResponseEntity.badRequest().body(response);
        }



        @Autowired
        public RomanNumeralController(RomanNumeralService romanNumeralService) {

                this.romanNumeralService = romanNumeralService;
        }
}