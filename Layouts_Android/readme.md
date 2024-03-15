<h2>To design an application using Linear Layout, Relative Layout, Table Layout, Frame Layout and Intent.</h2>

<h1>4 Types of Android Layout</h1>

1. Linear Layout
2. Relative Layout
3. Table Layout
4. Frame Layout



<div> To Connect application layouts / pages we need to use Intent. <br>
Used for navigating among various activities within the same application, but note, is not limited to one single application, i.e., they can be utilized from moving from one application to another as well. 
<br> 
  There are two types of intents in android <br></div>
  <ol>
    <li>Implicit</li>  
    <li>Explicit </li>
  </ol>

<p>Syntax:   Implicit Intent

Intent intent=new Intent(Intent.ACTION_VIEW); <br>
intent.setData(Uri.parse("..."));   <br>
startActivity(intent);</p>

<p>Syntax:  Explicit Intent

Intent i = new Intent(getApplicationContext(), ActivityTwo.class);  
startActivity(i);  </p>




<h5>This Layouts_Android consists four types of layout design with its xml and java file</h5>
<p> Consists of all Four .JAVA file
<a href="https://github.com/patilshivani22/Mobile-App-Development-/tree/main/Layouts_Android/myapplication"> myapplication</a>

Consists of all Four .XML file
<a href="https://github.com/patilshivani22/Mobile-App-Development-/tree/main/Layouts_Android/layout"> layout</a>

</p>
