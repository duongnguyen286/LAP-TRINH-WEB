<%-- 
    Document   : NapThe
    Created on : Jun 9, 2023, 12:41:53 AM
    Author     : VXH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>NAPTHE</title>
        <link rel="stylesheet" href="./assets/css/napthe.css">

    </head>

    <body class="c-layout- full">
        <div class="c-layout-page">
            <div class="contain">
                <div class="c-layout-sidebar-content">

                    <div class="c-title">
                        <!--<h3> <b>NẠP THẺ</b></h3>-->
                        <div class="c-Line-left"> </div>
                    </div>
                    <p style="text-align: center; color: white;"></p>
                    <p style="text-align: center; color: red;"> Chú ý nạp thẻ sai mệnh giá mất 100% giá trị thẻ</p>
                    <form action="napthe" method="post" accept-charset="UTF-8" class="form-horizontal form-charge">
                        <div class="form-group">
                            <div class="form-inline">
                                <label class="col-md-3 control-label"> Tài Khoản:</label>
                                <input name="user" class="form-control c-square c-theme" type="text" value="${sessionScope.account.username}" readonly>
                                <input type="hidden" id="keyword" name="sodu" value="${sessionScope.account.sodu}">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-inline">
                                <label class="col-md-3 control-label"> Loại thẻ:</label>
                                <select class="form-control c-square c-theme" name="loaithe" id="type">
                                    <option value="MOBIFONE">MOBIFONE</option>
                                    <option value="VIETTEL">VIETTEL</option>
                                    <option value="VINAPHONE">VINAPHONE</option>
                                </select>

                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-inline">
                                <label class="col-md-3 control-label"> Mệnh giá:</label>
                                <select style="width: 50%;" class="" name="menhgia" id="amount" required>
                                    <option value>-- Chọn đúng mệnh giá, sai mất thẻ --</option>
                                    <option r-default="0" value="10000" rel-ratio="100.0">10,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="20000" rel-ratio="100.0">20,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="30000" rel-ratio="100.0">30,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="50000" rel-ratio="100.0">50,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="100000" rel-ratio="100.0">100,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="200000" rel-ratio="100.0">200,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="300000" rel-ratio="100.0">300,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="500000" rel-ratio="100.0">500,000 VNĐ (nhận 100.0%)
                                    </option>
                                    <option r-default="0" value="1000000" rel-ratio="100.0">1,000,000 VNĐ (nhận 100.0%)
                                    </option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-inline">
                                <div style="color: red">
                                    ${mess}
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="form-inline">
                                <label class="col-md-3 control-label"> Mã số thẻ:</label>
                                <input class="form-control  c-square c-theme " name="mathe" type="text" maxlength="16"
                                       required placeholder autofocus>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="form-inline">
                                <label class="col-md-3 control-label">Số serial:</label>
                                <input class="form-control c-square c-theme " name="seri" type="text" maxlength="16"
                                       required placeholder>
                            </div>

                        </div>
                        <div class="form-group">
                            <div class="form-inline">
                                <div style="clear: both; padding-top: 15px"></div>
                                <label class="col-md-3 control-label">Mã bảo vệ (*):</label>
                                <div class="col-md-6">
                                    <div class="input-group">
                                        <input type="text" class="form-control c-square" id="captcha" name="captcha"
                                               placeholder="Mã bảo vệ" maxlength="3" autocomplete="off" required>
                                        <span class="input-group-addon" style="padding: 1px;">
                                            <img src="https://shopmobaviet.vn/captcha/flat?beQh00mS" height="30px"
                                                 id="imgcaptcha"
                                                 onclick="document.getElementById('imgcaptcha').src = 'https://shopmobaviet.vn/captcha/flat?xYECLkSX' + Math.random();document.getElementById('captcha').focus();">
                                        </span>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="form-group c-margin-t-40">
                            <div class="form-inline">
                                <label class="col-md-3 control-label"></label>
                                <div class="col-md-6" style="display: inline-block">
                                    <button type="submit" class="nap btn btn-outline-primary"
                                            data-loading-text="<i class='fa fa-spinner fa-spin '></i>">Nạp thẻ </button>
                                    <script>
                                        $(".form-charge").submit(function () {
                                            $('.btn-submit').button('loading');
                                        });
                                    </script>
                                </div>
                            </div>

                        </div>
                    </form>
                    <div class="alert alert-info"> </div>
                    <!--                    <table id="hand_card_recent" class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th>Thời gian </th>
                                                    <th> Nhà mạng </th>
                                                    <th> Mã thẻ </th>
                                                    <th>Serial </th>
                                                    <th>Kiểu nạp </th>
                                                    <th>Mệnh giá </th>
                                                    <th>Kết quả </th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr>
                                                    <td colspan="7">Không có dữ liệu</td>
                                                </tr>
                                            </tbody>
                                        </table>-->
                </div>
            </div>
        </div>
        <script>
            GetAmount();
            $("#type").on('change', function () {

                GetAmount();

            });
            function GetAmount() {

                var telecom_key = $("#type").val();


                var getamount = $.get("/nap-the/get-auto-amount?telecom_key=" + telecom_key, function (data, status) {

                    $("#amount").find('option').remove();
                    $("#amount").html(data).val($("#amount option:first").val());
                    ;

                }).done(function () {

                }).fail(function () {

                    alert("Không tìm thấy mệnh giá phù hợp");
                })
            }
        </script>
    </body>

</html>
