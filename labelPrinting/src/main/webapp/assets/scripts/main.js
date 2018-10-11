window.onload=function(){

	var data={"Package":{"IsPrinted":true,"PackageID":"CY000114921US"}}

var print=function(param){

            
        var base64EncodedPDF = b64EncodeUnicode(param);
        $("#embedHolder").append("<object id='embedder' width='80%' height='600px'><embed width=100% height=100%"
                                     + ' type="application/pdf"'
                                     + ' src="data:application/pdf;base64,'
                                     + base64EncodedPDF
                                     + "></embed></object>");

            
}
        

 function b64EncodeUnicode(str) {
     return btoa(encodeURIComponent(str).replace(/%([0-9A-F]{2})/g, function(match, p1) {
                return String.fromCharCode('0x' + p1);
            }));
        }

document.getElementById("printlabel").onclick=function(e){
 
      $.ajax({

        type:'POST',
        url:'test',
        data:JSON.stringify(data),
        dataType:'json',
        contentType:'application/json',
        
        success:function(d){
         $('#packageID').value=d.PackageID;
         console.log(d.LackageID);
         console.log(d.labelByte);
         
         for(var i=0;i<d.LabelDataStringArray.length;i++)
         {
         	
         		console.log(d.LabelDataStringArray[i]);
         		
         		print(d.LabelDataStringArray[i]);
         	
         }
         
         
         }
       

      });
};
}