<#ftl output_format="HTML"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>fetch data</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
        $(function () {
            $.getJSON('/main/get-data', function () {
                console.log('done');
                window.location.href = '/main/re-direct';
            })
                .fail(function () {
                    console.log('error');
                })
                .always(function (data) {
                    console.log(data)
                });
        });
    </script>
</head>
<body>
<div class="col-md-12">
    <div class="col-md-2 alert alert-info"> data fetching...</div>
</div>
</body>
</html>