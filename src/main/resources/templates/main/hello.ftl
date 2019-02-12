<#ftl output_format="HTML" />
<#global htmlEscape=true />
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" lang="tw">
<head>
    <meta charset="UTF-8">
    <title>Hello ${name}!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <style>
        .down-arrows {
            font-size: 1.2em;
        }
    </style>
</head>
<body>
<h2 class="hello-title">Hello ${name}!</h2>
<div class="col-md-12">
    <div class="col-md-2 down-arrows alert alert-danger">↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓</div>
    <div class="col-md-2 down-arrows alert alert-warning">↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓</div>
</div>
<div class="col-md-12">
    <div>
        <a href="/main/fetch-data" type="button" class="btn btn-primary col-md-2">Fetch and save data</a>
    </div>
    <div>
        <a href="/main/csv-to-h2" type="button" class="btn btn-primary col-md-2">Save from csv file</a>
    </div>
</div>

</body>
</html>