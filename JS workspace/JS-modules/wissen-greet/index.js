console.log("-local-package-");
let en =require("./quesEng");
let guj=require("./quesGuj");

function question(lang){
    if(lang==="en"){
        en();
        return;
    }
    if(lang==="guj"){
        guj();
        return;
    }
    console.log("-wissen-ques/index.js-");
}

module.exports=question;