<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="/webjars/bootstrap/4.3.1/css/bootstrap.css" rel="stylesheet">
    <script src="/webjars/bootstrap/4.3.1/js/bootstrap.js"></script>
    <title>Formulario</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="/formulario">APP</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="/formulario">Fromulario <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/graficos">Grafico</a>
            </li>
        </ul>
    </div>
</nav>
    <div class="container">
        <form action="/submit" method="get">
            <div class="form-group">
                <label for="expetativa1">¿ Las charlas donde usted participó cumplieron con sus expectativas?</label>
                <select class="form-control" id="resultado1" name="resultado1">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="expetativa2">¿Los expositores mostraron tener dominio del tema?</label>
                <select class="form-control" id="resultado2" name="resultado2">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="expetativa3">¿Las instalaciones del evento fueron confortables para usted?</label>
                <select class="form-control" id="resultado3" name="resultado3">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <div class="form-group">
                <label for="expetativa4">¿Tiene algún comentario para los organizadores?</label>
                <select class="form-control" id="resultado4"  name="resultado4">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                </select>
            </div>
            <button type="submit" class="btn btn-success float-right">Guardar</button>
        </form>
    </div>

</body>
</html>