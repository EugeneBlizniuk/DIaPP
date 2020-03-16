<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js"></script>
</head>
<body>
    <div class="container">
        <canvas id="first_chart"></canvas>
    </div>
    <script>
        let myChart = document.getElementById('first_chart').getContext('2d');

        let lineChart = new Chart(myChart, {
            type:'line', // bar, horizontalBar, pie, line, doughnut, radar, polarArea
            data:{
                labels: ${labelArrayX},
                datasets:[{
                    data: ${sourceDots},
                    borderWidth:2,
                     borderColor:'#c11d2a',
                    hoverBorderWidth:3,
                    hoverBorderColor:'#000'
                }]
            },
            options:{
                title:{
                    display:true,
                    text:'discrete Fourier transformation',
                    fontSize:25
                },
                legend:{
                    display:true,
                    position:'right',
                    labels:{
                        fontColor:'#000'
                    }
                },
                layout:{
                    padding:{
                        left:100,
                        right:100,
                        bottom:100,
                        top:100
                    }
                },
                tooltips:{
                    enabled:true
                }
            }
        });
    </script>
</body>
</html>
