window.addEventListener("load", function(){
    let edIcon = document.getElementById("education-icon");
    let workIcon = document.getElementById("work-icon");
    let miscIcon = document.getElementById("misc-icon");
    let progLangsIcon = document.getElementById("prog-langs");
    let frameworksIcon = document.getElementById("frameworks");
    let databasesIcon = document.getElementById("databases");
    let skillsMiscIcon = document.getElementById("skills-misc");

    let iconArray = [progLangsIcon, frameworksIcon, databasesIcon, skillsMiscIcon, edIcon, workIcon, miscIcon]

    for(let i = 0; i <= iconArray.length; i ++){

        if(iconArray[i] == null){
            continue

        }else{
            iconArray[i].addEventListener("mouseover", function(){
                iconArray[i].setAttribute("src", "5px solid #123163")
                iconArray[i].setAttribute("height", "90px")

            })

            iconArray[i].addEventListener("mouseout", function(){
                iconArray[i].setAttribute("border", "")
                iconArray[i].setAttribute("height", "80")
            })

        }   
          
    }


    // edIcon.addEventListener("mouseover", function(){
    //     edIcon.setAttribute("height", "150px")
    // })
    // edIcon.addEventListener("mouseout", function(){
    //     edIcon.setAttribute("height", "80px")
    // })

})
