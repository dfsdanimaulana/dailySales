var p1,p2,p3,c1,c2,c3;

p1 = document.getElementById('p1');
p2 = document.getElementById('p2');
p3 = document.getElementById('p3');
c1 = document.getElementById('c1');
c2 = document.getElementById('c2');
c3 = document.getElementById('c3');

function getValue() {
  var totalPos = eval(p1.value+'+'+p2.value+'+'+p3.value);
  var totalCust = eval(c1.value+'+'+c2.value+'+'+c3.value);
  var average = eval(totalPos/totalCust);
  var averageFinal = parseInt(average);
  
function rupiah(ribuan){
  var	reverse = ribuan.toString().split('').reverse().join(''),
  ribuan = reverse.match(/\d{1,3}/g);
  ribuan = ribuan.join('.').split('').reverse().join('');
  return ribuan;
};
  var posR = rupiah(totalPos);
  var avR = rupiah(averageFinal);
  
  var textArea=document.getElementById('hasil');
  textArea.innerHTML='Sales : Rp.'+posR+'<br/>'+'Cust : '+totalCust+'<br/>'+'Average : Rp.'+avR;
}

var span = document.getElementById("hasil");
function copyText(){
    document.execCommand("copy");
  if(span.innerHTML==''){
  }else{
    alert('Berhasil di Copy');
   };
}
span.addEventListener("copy", function(event){
  event.preventDefault()
  
if (event.clipboardData) {
    event.clipboardData.setData("text/plain", span.textContent);
  }
});

const pbaru=document.createElement('p');
const pisi= document.createTextNode('Tekan untuk mengcopy');
const pnew= pbaru.appendChild(pisi);
const lok1 =document.getElementById('hasil');
const parent =document.getElementById('parent');
parent.insertBefore(pnew,lok1);
pbaru.classList.toggle('popup');