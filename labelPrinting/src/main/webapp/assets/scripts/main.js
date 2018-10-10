window.onload=function(){

	var data={"Package":{
		               "IsPrinted":false,
		               "PackageID":"EW200192059TW",
		               "OrderID":"A00200113434",
		               "RecipientFirstName":"CHENMAO",
		               "RecipientMiddleInitial":"",
		               "RecipientLastName":" WANG",
		               "RecipientBusinessName":"",
		               "RecipientAddress_Line_1":"haitian unit#13 apt#801",
		               "RecipientAddress_Line_2":"Ningbo city,Zhejiang Provice",
		               "RecipientAddress_Line_3":"China",
		               "RecipientInLineTranslationAddressLine1":"中国 浙江省 宁波市 北仑区大契街道龙角山路和元宝山路交叉口海天三村13幢801",
		               "RecipientInLineTranslationAddressLine2":" 王陈茂",
		               "RecipientAddress_IsPOBox":"N",
		               "RecipientCity":"Ningbo",
		               "RecipientProvince":"Zhejiang",
		               "RecipientPostal_Code":"315800",
		               "RecipientCountry_Code":"CN",
		               "RecipientPhone":"",
		               "RecipientEmail":"",
		               "PackageWeight":"1.0",
		               "Item":
								[

								  {
									"ItemID":"1",
									"CommodityName":"shoes",
									"ItemDescription":"JINGDIANMAQIU POLOSHAN",
									"CustomsDescription":"JINGDIANMAQIU POLOSHAN",
									"UnitValue":"69.99",
									"ItemWeight":"0.64",
									"UnitOfItemWeight":"LB",
									"Quantity":"1",
									"CountryOfOrigin":"CN"
							      }
								]
						}
					}


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