<!DOCTYPE html>
<html lang="en">
 <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clientkk Creation</title>
 </head>
  <body>
   <header>
    <h1>Client Creation</h1>
   </header>
    <main>
      <form action="saveClient" method="post">
        <div>
            <label for="nom">Nom : </label>
            <input type="text" id="nom" name="nom">
        </div>
        <div>
            <label for="prénom">Prénom : </label>
            <input type="text" id="prénom" name="prénom">
        </div>
        <div>
            <label for="téléphone"> Téléphone : </label>
            <input type="text" id="téléphone" name="téléphone">
        </div>
        <div>
            <label for="email">EMAIL : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
      </form>
    </main>
<footer>
    <a href="clientlist">Client List</a>
</footer>
</body>
</html>



