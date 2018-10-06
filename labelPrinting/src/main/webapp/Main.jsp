<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
<link rel="stylesheet" href="/labelPrinting/assets/css/main.css">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="/labelPrinting/assets/scripts/main.js"></script>


</head>
<body>
<div class="topnav">
  <a id="refresh" class="active"  >refresh</a>
  <a id="printlabel" >printlabel</a>
  <a id="AddToreceptacle" >AddToreceptacle</a>
  <a role="button">default</a>
</div>
<div id="embedHolder">
</div>
    <form id="form1">
        <div>
            <table class="equal-width"style="width: 100%; height: 100%">
                <tr>
                    <td>
                        <table id="left-table" border="1">
                            <tr class="row" style="float:left">
                                <td colspan="2">
                                <label id="label0" for="Scan">Scan:</label>
                                <input type="text" style="width: 536px" /></td>
                            </tr>

                            <tr class="row">
                                <td colspan="2">
                                    <input type="textarea" style="width: 536px; height: 94px" />
                                </td>
                            </tr>
                            <tr class="row">
                                <td>Reveice:<p />
                                    <img /><img /></td>
                                <td>Send:<p />
                                    <img /></td>
                            </tr>
                            <tr class="row">
                                <td colspan="2">Remark: </td>
                            </tr>
                            <tr class="row">
                                <td colspan="2">ReveiceGoods:<p />
                                    <table>
                                        <tr>
                                            <td>SKU</td>
                                            <td id="packageID">PackageNo</td>
                                            <td>Count</td>
                                            <td>Name</td>
                                            <td>Brank</td>
                                            <td>Spec</td>
                                        </tr>
                                        <tr>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table id="right-table" border="1">
                            <tr>
                                <td>PackageInfo:<p />
                                    <table>
                                        <tr>
                                            <td>PackageNo</td>
                                            <td></td>
                                            <td>ShippingNo</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>CreateTime</td>
                                            <td></td>
                                            <td>OpTime</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Status</td>
                                            <td></td>
                                            <td>Type</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Server</td>
                                            <td></td>
                                            <td>Remark</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Weigth</td>
                                            <td></td>
                                            <td>L*W*H</td>
                                            <td></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>ShippingInfo:<p />
                                    <table>
                                        <tr>
                                            <td>PackageNo</td>
                                            <td></td>
                                            <td>ShippingNo</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>CreateTime</td>
                                            <td></td>
                                            <td>OpTime</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Status</td>
                                            <td></td>
                                            <td>Type</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Server</td>
                                            <td></td>
                                            <td>Remark</td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td>Weigth</td>
                                            <td></td>
                                            <td>L*W*H</td>
                                            <td></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>SendGoods:<p />
                                    <table>
                                        <tr>
                                            <td>SKU</td>
                                            <td>PackageNo</td>
                                            <td>Count</td>
                                            <td>Name</td>
                                            <td>Brank</td>
                                            <td>Spec</td>
                                        </tr>
                                        <tr>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                            <td>..</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                    </td>
            </table>

        </div>
    </form>
</body>
</html>