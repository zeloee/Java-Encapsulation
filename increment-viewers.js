setInterval(function() {
    try {
        let response1 = fetch("https://camo.githubusercontent.com/46649221f79a04501a723887c43220a6f251fa0214797409566ab8ea4ed50f7c/68747470733a2f2f6b6f6d617265762e636f6d2f67687076632f3f757365726e616d653d4265726e617264536170696461266c6162656c3d50726f66696c65253230766965777326636f6c6f723d306537356236267374796c653d666c6174");
    } catch(e) {
        console.log("Error: " + e);
    }
}, 1000);