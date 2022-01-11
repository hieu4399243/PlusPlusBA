<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <title>Register!</title>
    </head>
    <body>
        <main class="container">
            <header>
                <div class="row">
                    <div class="alert alert-success col">
                        <h1>
                            DANG KY
                        </h1>
                    </div>
                </div>
            </header>
            <section class="row">
                <div class="col-7">
                    <div class="row">
                        <div class="col">
                            <form action="RegisterSevlet" method="post">
                                <div class="from-group">
                                    <label for="username">
                                        Ten Dang Nhap: 
                                    </label>  
                                    <input type="text" id="username" name="username" class="form-control" />
                                </div>        

                                <div class="form-group">
                                    <label for="password">
                                        Mat Khau: 
                                    </label> 
                                    <input type="text" id="password" class="form-control" />
                                </div>
                                <div class="form-group">
                                    <label for="gender">
                                        Gioi Tinh: 
                                    </label> 
                                    <div class="form-check from-check-inline">
                                        <input type="radio" class="form-check-input" id="genderM" name="gender" />
                                        <label for="genderM">Nam</label>
                                    </div>
                                    <div class="form-check from-check-inline">
                                        <input type="radio" class="form-check-input" id="genderF" name="gender" />
                                        <label for="genderF">Nu</label>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <div class="form-check">
                                        <input type="checkbox" class="form-check-input" id="married" name="married" />
                                        <label for="married"> Da co gia dinh chua</label>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label for="nationality">
                                        Quoc Tich: 
                                    </label>
                                    <select name="nationality" id="nationality" class="form-control">
                                        <option value="vi">Viet Nam</option>
                                        <option value="us">My</option>
                                        <option value="jp">Nhat Ban</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="favorites">
                                        So Thich: 
                                    </label>
                                    <div class="form-check from-check-inline">
                                        <input type="checkbox" class="form-check-input" id="favorites" name="favorites" />
                                        <label for="favorites">Doc Sach</label>
                                    </div>
                                    <div class="form-check from-check-inline">
                                        <input type="checkbox" class="form-check-input" id="favorites" name="favorites" />
                                        <label for="favorites">Am Nhac</label>
                                    </div>
                                    <div class="form-check from-check-inline">
                                        <input type="checkbox" class="form-check-input" id="favorites" name="favorites" />
                                        <label for="favorites">Du lich</label>
                                    </div>
                                    <div class="form-check from-check-inline">
                                        <input type="checkbox" class="form-check-input" id="favorites" name="favorites" />
                                        <label for="favorites">Khac</label>
                                    </div>

                                </div>
                                <div class="form-group">
                                    <label for="note">
                                        Ghi Chu
                                    </label>
                                    <textarea name="note" id="note" rows="3" class="form-control"></textarea>

                                </div>
                                <hr/>
                                <button type="submit" class="btn btn-primary">Dang Ky</button>
                            </form>
                        </div>

                    </div>
                </div>
                <div class="col-5">
                    <h3> Thong tin da duoc dang ky </h3>   
                    <ul>
                        <li>Ten Dang Nhap: ${username}</li>
                       
                        <li>So thich: ${favorities}</li>
                        
                    </ul>
                </div>

            </section>

        </main>

        <!-- Optional JavaScript; choose one of the two! -->

        <!-- Option 1: Bootstrap Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


    </body>
</html>
