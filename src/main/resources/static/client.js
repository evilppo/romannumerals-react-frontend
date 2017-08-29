var client = (function () {
    this.convertRomanToDecimal = function () {


         $.ajax({
            url: "/api/roman-to-decimal",
            type: "POST",
            data: JSON.stringify(buildRequest1()),
            contentType: 'application/json;charset=UTF-8',
            success: function (response) {
                console.log(response);
                $('#decimal').val(response.number.decimal);
            },

            error: function(error){

                window.alert(error.responseJSON.message);
                $('#decimal_error').val(responseJSON.status);
                console.log("Something went wrong", error);
            }
        });
    }

    this.buildRequest1 = function () {
        var romanNumeral = $('#romannumeral').val();

        return {romanNumeral: romanNumeral};
    }


    this.convertDecimalToRoman = function () {


         $.ajax({
            url: "/api/decimal-to-roman",
            type: "POST",
            data: JSON.stringify(buildRequest2()),
            contentType: 'application/json;charset=UTF-8',
            success: function (response) {
                console.log(response);
                $('#romannumeral').val(response.number.romanNumeral);
            },

            error: function(error){

                window.alert(error.responseJSON.message);
                console.log("Something went wrong", error);
            }
        });
    }

    this.buildRequest2 = function () {
        var decimal = $('#decimal').val();

        return {decimal: decimal};
    }

    return this;
})();


