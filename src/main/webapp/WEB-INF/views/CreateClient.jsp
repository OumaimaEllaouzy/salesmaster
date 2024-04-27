<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Client Creation</title>
</head>
<body>
<header>
    <h1>Customer Creation</h1>
</header>
<main>
    <form action="saveClient" method="post">
        <div>
            <label for="nom">First Name : </label>
            <input type="text" id="nom" name="nom">
        </div>
        <div>
            <label for="prenom">Last Name : </label>
            <input type="text" id="prenom" name="prenom">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="telephone">Address : </label>
            <input type="text" id="telephone" name="telephone">
        </div>
        <div>
            <label for="historiqueAchats">Address : </label>
            <input type="text" id="historiqueAchats" name="historiqueAchats">
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="clientList">Customers List</a>
</footer>
</body>
</html>


