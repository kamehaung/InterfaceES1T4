var desc = 0;
var liq = 0;
var valor = 0;

function addItem() {
	var tbody = document.getElementById("tbody");

	var cod = document.getElementById("cod");
	var prod = document.getElementById("prod");
	var qtd = document.getElementById("qtd");
	var preco = document.getElementById("preco");
	var tot = document.getElementById("tot");

	var tr = document.createElement("tr");

	var tdc = document.createElement("td");
	var tdp = document.createElement("td");
	var tdq = document.createElement("td");
	var tdpr = document.createElement("td");
	var tdt = document.createElement("td");

	var c = document.createElement("input");
	c.setAttribute("name", "listaNotaVenda");
	c.setAttribute("type", "text");
	c.setAttribute("value", cod.value);

	var p = document.createElement("input");
	p.setAttribute("name", "listaNotaVenda");
	p.setAttribute("type", "text");
	p.setAttribute("value", prod.value);

	var q = document.createElement("input");
	q.setAttribute("name", "listaNotaVenda");
	q.setAttribute("type", "number");
	q.setAttribute("value", qtd.value);
	

	var pr = document.createElement("input");
	pr.setAttribute("name", "listaNotaVenda");
	pr.setAttribute("type", "number");
	pr.setAttribute("step", "0.01");
	pr.setAttribute("value", preco.value);

	var t = document.createElement("input");
	t.setAttribute("name", "listaNotaVenda");
	t.setAttribute("type", "number");
	t.setAttribute("step", "0.01");
	t.setAttribute("value", qtd.value*preco.value);
	
	valor += parseFloat(qtd.value).toFixed(2)*preco.value;
	
	alert(valor);
	
	liq = valor - desc;

	tbody.appendChild(tr);

	tr.appendChild(tdc);
	tr.appendChild(tdp);
	tr.appendChild(tdq);
	tr.appendChild(tdpr);
	tr.appendChild(tdt);

	tdc.appendChild(c);						
	tdp.appendChild(p);
	tdq.appendChild(q);
	tdpr.appendChild(pr);
	tdt.appendChild(t);
	
	document.getElementById("totNota").value = valor; 
	document.getElementById("valorLiq").value = liq; 

}


