(function(){var a,f;"undefined"!==typeof window?(a=window.sfx,f=window.cfx):(a=require("./jchartfx.system.js"),f=a.cfx);f.motif="relief";var e=a["gauge.templates"];if(void 0!=e){e.reliefDashBorder='<T><T.R><Th K="borderGap">10</Th><cc K="clrConverter"/><s K="plotMargin">targetChart</s></T.R><g M="3"><g.RD><RD H="Auto" MinHeight="32"/><RD H="1"/><RD H="1"/><RD H="*"/></g.RD><B Flags="65536" F="{B F}" S="{B FillS}" ST="{B ST}" CR="2" g.RowSpan="4"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1" g.RowSpan="4"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1" g.RowSpan="4"/><TextBlock M="14,0,10,0" FontFamily="{Binding Class=DashboardTitle.font-family}" FontSize="12" Text="{B Title}" VerticalAlignment="Center" HorizontalAlignment="Left" Foreground="{Binding Class=DashboardTitle.fill}"/><B g.R="1" F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.375}" H="1"/><B g.R="2" F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*1.3}" H="1"/><C g.R="3" N="targetChart" M="0,0,0,0"/></g></T>';
e.reliefRadialDashBorder='<T><T.R><Th K="borderGap">4</Th><cc K="clrConverter"/></T.R><C><E ST="2" F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.7}"><E.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="1"/></L></E.S></E></C></T>';
e.reliefRadialCap='<T><T.R><Th K="borderGap">4</Th><cc K="clrConverter"/></T.R><C><E ST="2" F="{B F}"><E.S><L S="1,1" E="0,0" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="1"/></L></E.S></E></C></T>';e.reliefRadialGlare="<T/>";
e.reliefDashGlare="<T/>";e.reliefLinearDashBorder="<T/>";e.reliefLinearGlare="<T/>";e.reliefMarkerVertical='<T><T.R><s K="ratio">0.5</s><cc K="clrConverter"/></T.R><V VW="25" VH="40"><C><P C.Top="0" C.Left="0" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" D="M25,21.001v-16c0-2.762-2.238-5-5-5H5c-2.762,0-5,2.238-5,5v16l9.986,13.218c1.382,2.354,3.646,2.386,5.027,0.032L25,21.001z"/><P C.Top="-3" C.Left="3" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" D="M25,21.001v-16c0-2.762-2.238-5-5-5H5c-2.762,0-5,2.238-5,5v16l9.986,13.218c1.382,2.354,3.646,2.386,5.027,0.032L25,21.001z"/><P C.Top="-1.5" C.Left="1.5" F="{B F}" D="M25,21.001v-16c0-2.762-2.238-5-5-5H5c-2.762,0-5,2.238-5,5v16l9.986,13.218c1.382,2.354,3.646,2.386,5.027,0.032L25,21.001z"/></C></V></T>';
e.reliefMarkerHorizontal='<T><T.R><s K="ratio">0.5</s><cc K="clrConverter"/></T.R><V VW="25" VH="40"><C><P C.Top="0" C.Left="0" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" D="M15.014,1.75c-1.382-2.354-3.646-2.322-5.027,0.032L0,15v16c0,2.762,2.239,5,5,5h15c2.762,0,5-2.238,5-5V15L15.014,1.75z"/><P C.Top="3" C.Left="3" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" D="M15.014,1.75c-1.382-2.354-3.646-2.322-5.027,0.032L0,15v16c0,2.762,2.239,5,5,5h15c2.762,0,5-2.238,5-5V15L15.014,1.75z"/><P C.Top="1.5" C.Left="1.5" F="{B F}" D="M15.014,1.75c-1.382-2.354-3.646-2.322-5.027,0.032L0,15v16c0,2.762,2.239,5,5,5h15c2.762,0,5-2.238,5-5V15L15.014,1.75z"/></C></V></T>';
e.reliefFillerHorizontal='<T><T.R><cc K="clrConverter"/></T.R><C><B F="{B F}" CR="2"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>';e.reliefFillerVertical=e.reliefFillerHorizontal;e.reliefRadialIndicator=e.reliefLinearFiller;e.reliefRadialFiller='<T><T.R><cc K="clrConverter"/></T.R><C><P D="{B G}" F="{B F}"/><P D="{B GeometryInside}" ST="2" ><P.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="1"/></L></P.S></P><P D="{B GeometryOutside}" ST="2" ><P.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="1"/></L></P.S></P></C></T>';
e.reliefRepeaterHorizontal='<T><T.R><cc K="clrConverter"/><s K="ratio">0.2</s></T.R><C><B F="{B F}" CR="2"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>';e.reliefRepeaterVertical='<T><T.R><cc K="clrConverter"/><s K="ratio">0.2</s></T.R><C><B F="{B F}" CR="2"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="2" Segments="2" CR="1"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="0" Segments="2" CR="1"/></C></T>';
e.reliefRepeaterRadial='<T><T.R><s K="ratio">0.3</s></T.R><B F="{B F}" CR="2"/></T>';e.reliefLinearBar='<T><T.R><cc K="clrConverter"/></T.R><C M="-6"><B F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.7}" S="{N}" CR="2"/><B F="{N}" ST="2" S="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="3" Segments="2" CR="2"/><B F="{N}" ST="2" S="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="1" Segments="2" CR="2"/></C></T>';
e.reliefPictoGraph='<T><T.R><s K="ratio">0.46064</s><s K="forceBorder">true</s><cc K="clrConverter"/></T.R><V VW="11.516" VH="25"><C><P Reuse="true" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" D="M8.327,3.07c0,1.423-1.151,2.574-2.574,2.574c-1.419,0-2.57-1.151-2.57-2.574C3.183,1.651,4.333,0.5,5.752,0.5C7.175,0.5,8.327,1.651,8.327,3.07L8.327,3.07z M8.327,3.07M10.896,8.214c0,0,0-1.712-1.716-1.712H2.325c0,0-1.717,0-1.717,1.712v6.002c0,1.712,1.717,1.712,1.717,1.712V24.5H9.18v-8.572c0,0,1.716,0,1.716-1.712V8.214z M10.896,8.214z"/><P Reuse="true" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" D="M9.327,4.07c0,1.423-1.151,2.574-2.574,2.574c-1.419,0-2.57-1.151-2.57-2.574C4.183,2.651,5.333,1.5,6.752,1.5C8.175,1.5,9.327,2.651,9.327,4.07L9.327,4.07z M9.327,4.07M11.896,9.214c0,0,0-1.712-1.716-1.712H3.325c0,0-1.717,0-1.717,1.712v6.002c0,1.712,1.717,1.712,1.717,1.712V25.5H10.18v-8.572c0,0,1.716,0,1.716-1.712V9.214z M11.896,9.214z"/><P Reuse="true" F="{B F}" D="M8.827,3.57c0,1.423-1.151,2.574-2.574,2.574c-1.419,0-2.57-1.151-2.57-2.574C3.683,2.151,4.833,1,6.252,1C7.675,1,8.827,2.151,8.827,3.57L8.827,3.57z M8.827,3.57M11.396,8.714c0,0,0-1.712-1.716-1.712H2.825c0,0-1.717,0-1.717,1.712v6.002c0,1.712,1.717,1.712,1.717,1.712V25H9.68v-8.572c0,0,1.716,0,1.716-1.712V8.714z M11.396,8.714z"/></C></V></T>';
e.reliefTrendIndicator='<T xmlns:x="a" xmlns:sys="b"><T.R><cc K="clrConverter"/><T K="fillTemplate"><T.R><cc K="clrConverter"/></T.R><C><P C.Top="1" C.Left="1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}"/></P.S></P><P C.Top="-1" C.Left="-1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}"/></P.S></P><P D="{B G}" F="{B F}" S="{B S}" ST="{B ST}"/></C></T><T K="backTemplate"><T.R><cc K="clrConverter"/></T.R><C><P C.Top="1" C.Left="1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}"/></P.S></P><P C.Top="-1" C.Left="-1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}"/></P.S></P><P D="{B G}" F="{B F}" S="{B S}" ST="{B ST}"/></C></T><T K="strokeBackTemplate"><T.R><cc K="clrConverter"/></T.R><C><P C.Top="1" C.Left="1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}"/></P.S></P><P C.Top="-1" C.Left="-1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}"/></P.S></P><P D="{B G}" S="{B S}" ST="{B ST}"/></C></T><T K="fillBackTemplate"><T.R><cc K="clrConverter"/></T.R><C><P C.Top="1" C.Left="1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}"/></P.S></P><P C.Top="-1" C.Left="-1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}"/></P.S></P><P D="{B G}" F="{B F}" S="{B S}" ST="{B ST}"/></C></T></T.R><C><P C.Top="1" C.Left="1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B StrokeColor, Converter={S clrConverter},ConverterParameter=#*0.4}"/></P.S></P><P C.Top="-1" C.Left="-1" D="{B G}" ST="{B ST}" ><P.S><SolidBrush C="{B StrokeColor, Converter={S clrConverter},ConverterParameter=#*1.3}"/></P.S></P><P D="{B G}" S="{B S}" ST="{B ST}"/></C></T>';
e.TipBorderDefault='<T xmlns:x="a"><T.R><mc K="multConverter"/><cc K="clrConverter"/><Th K="padding">3</Th></T.R><C Padding="{B Padding}"><B S="{N}" ST="1" F="{B F}" Padding="8,8,8,8" CR="2"><DockPanel N="container" Orientation="Vertical"><TextBlock Text="{B Title}" V="{B TitleVisible}" HorizontalAlignment="Left" M="3,0,3,0"/></DockPanel></B><B S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" ST="1" F="{N}" Segments="2" StartCorner="3" CR="1"/><B S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}" Segments="2" StartCorner="1" CR="1"/></C></T>';
var m=new f.gauge.Palette;m.setColors([null,"#242527",null,"#1A1C1D","#008000",null,"#008000",null,"#1E1E21",null,"#A0A0A0","#1A1C1D",null,null,"#A00000",null,null,"#CCCB0A",null,null,"#14CC14",null,null,"#666666","#666666","#E0E0E0","#E0E0E0","#A0A0A0","#E0E0E0","#A00000","#949596","#00A000","#666666","#1A1C1D","#999999","#002D00","#444444","#222222","#008000","#0816A4","#CC5F0A","#CCCB0A","#800040","#095F0B","#081879","#984815","#999820","#5F0330"]);f.gauge.Palette.setDefaultPalette(m)}a=a["vector.templates"];
void 0!=a&&(a["DashboardCaption.stroke"]="0,#E0E0E0",a["DashboardTitle.fill"]="0,#E0E0E0",a["Border.fill"]="0,#242527",a["DashboardTitle.font-family"]="1,Arial",a["AxisY_Text.fill"]="0,#666666",a.reliefBorder='<T><T.R><s K="plotMargin">targetChart</s><Th K="uiMargin">8,8,0,0</Th><cc K="clrConverter"/></T.R><g M="3"><g.RD><RD H="Auto" MinHeight="32"/><RD H="1"/><RD H="1"/><RD H="*"/></g.RD><B Flags="65536" F="{B F}" S="{B F}" ST="{B ST}" CR="2" g.RowSpan="4"/><B F="{N}" ST="1" S="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1" g.RowSpan="4"/><B F="{N}" ST="1" S="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1" g.RowSpan="4"/><g><g.CD><CD W="Auto"/><CD W="*"/></g.CD><r V="{B UIVisible}" W="{B UISize}" M="0,0,4,0" H="1" F="#FF0000" S="#000000"/><TextBlock g.C="1" M="10,0" Text="{B Title}" FontFamily="{Binding Class=DashboardTitle.font-family}" FontSize="12" VerticalAlignment="Center" Foreground="{Binding Class=DashboardTitle.fill}"/></g><B g.R="1" F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.375}" H="1"/><B g.R="2" F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*1.3}" H="1"/><C g.R="3" N="targetChart" M="10,0,10,10"/></g></T>',
a.reliefBar='<T><T.R><cc K="clrConverter"/></T.R><C><B F="{B F}" S="{B S}" CR="2" ST="{B ST}"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>',a.reliefGantt=a.reliefBar,a.reliefEqualizer=a.reliefBar,a.reliefLine='<T><Pl P="{B P}" S="{B S}" ST="{B ST}"/></T>',a.reliefArea='<T><T.R><cc K="clrConverter"/></T.R><C><Po P="{B P}" S="{N}" C.Left="1" C.Top="1" ST="1"><Po.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*0.4}}"/></Po.F></Po><Po P="{B P}" S="{N}" C.Left="-1" C.Top="-1" ST="1"><Po.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*1.3}}"/></Po.F></Po><Po P="{B P}" F="{B F}" S="{N}"/></C></T>',
a.reliefCurveArea='<T><T.R><cc K="clrConverter"/></T.R><C><P D="{B G}" S="{N}" C.Left="1" C.Top="1" ST="1"><P.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*0.4}}"/></P.F></P><P D="{B G}" S="{N}" C.Left="-1" C.Top="-1" ST="1"><P.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*1.3}}"/></P.F></P><P D="{B G}" F="{B F}" S="{N}"/></C></T>',a.reliefFunnel='<T><T.R><cc K="clrConverter"/></T.R><C><Po P="{B P}" F="{B F}" S="{B S}" ST="1.5"/><Po P="{B P}" ST="1.5" ><Po.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*0.4}" O="1"/></L></Po.S></Po></C></T>',
a.reliefPie='<T><T.R><T K="cfxForegroundFull"><C c="{B CE}"><E ST="1.5"><E.S><L S="0,0" E="1,1" ><G C="#60FFFFFF" O="0"/><G C="#60FFFFFF" O="0.4"/><G C="#60000000" O="0.6"/><G C="#60000000" O="1"/></L></E.S></E></C></T></T.R><C><P D="{B G}" F="{B F}" S="{B S}" ST="1"/></C></T>',a.reliefDoughnut='<T><T.R><T K="cfxForegroundFull"><C c="{B CE}"><E ST="1.5"><E.S><L S="0,0" E="1,1" ><G C="#60FFFFFF" O="0"/><G C="#60FFFFFF" O="0.4"/><G C="#60000000" O="0.6"/><G C="#60000000" O="1"/></L></E.S></E><P D="{B GeometryInside}" ST="1.5"><P.S><L S="1,1" E="0,0" ><G C="#60FFFFFF" O="0"/><G C="#60FFFFFF" O="0.4"/><G C="#60000000" O="0.6"/><G C="#60000000" O="1"/></L></P.S></P></C></T></T.R><C><P D="{B G}" F="{B F}" S="{B S}" ST="1"/></C></T>',
a.reliefRose='<T><T.R><D K="cfxDefStrokeThickness">3</D><cc K="clrConverter"/></T.R><C><P D="{B G}" F="{B F}" S="{B S}" ST="1.5"/><P D="{B G}" ST="1.5" ><P.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=b;#*0.4}" O="1"/></L></P.S></P></C></T>',
a.reliefPyramid=a.reliefFunnel,a.reliefHighLow='<T><T.R><cc K="clrConverter"/><T K="lineTemplate"><C/></T></T.R><C><Po P="{B P}" S="{N}" C.Left="1" C.Top="1" ST="1"><Po.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*0.4}}"/></Po.F></Po><Po P="{B P}" S="{N}" C.Left="-1" C.Top="-1" ST="1"><Po.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*1.3}}"/></Po.F></Po><Po P="{B P}" F="{B F}"/></C></T>',a.reliefHighLowBaseline='<T><T.R><cc K="clrConverter"/><T K="baselineTemplate"></T><T K="lineTemplate"><C/></T></T.R><C><Po P="{B P}" S="{N}" C.Left="1" C.Top="1" ST="1"><Po.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*0.4}}"/></Po.F></Po><Po P="{B P}" S="{N}" C.Left="-1" C.Top="-1" ST="1"><Po.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*1.3}}"/></Po.F></Po><Po P="{B P}" F="{B F}"/></C></T>',
a.reliefMarker1='<T><T.R><cc K="clrConverter"/></T.R><C><B F="{B F}" S="{B S}" CR="2" ST="{B ST}"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>',a.reliefMarker2='<T><T.R><Th K="borderGap">4</Th><cc K="clrConverter"/></T.R><C><E S="{B S}" ST="{B ST}" F="{B F}"/><E ST="{B ST}" F="{N}"><E.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="1"/></L></E.S></E></C></T>',
a.reliefMarker3='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M12,0L24,24L0,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}"  /><P D="M12,0L0,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.5}" ST="1" F="{N}"  /><P D="M12,1L23,23L1,23Z" S="{N}" F="{B F}"  /></C></V></T>',a.reliefMarker4='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M24,12L12,24L0,12L12,0Z" S="{B S}" ST="{B ST}" F="{B F}"  /><P D="M24,12L12,24L0,12L12,0Z" ST="{B ST}" ><P.S><L S="0,0" E="1,0" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.5"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.5"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="1"/></L></P.S></P></C></V></T>',
a.reliefMarker5='<T><T.R><Th K="borderGap">4</Th><cc K="clrConverter"/></T.R><C><E S="{B S}" ST="{B ST}" F="{B F}"/><E><E.F><R><G C="#55FFFFFF" O="0"/><G C="#55333333" O="1"/></R></E.F></E><E ST="{B ST}" F="{N}"><E.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="1"/></L></E.S></E></C></T>',
a.reliefMarker6='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M0,14L0,10L24,10" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.5}" ST="1" F="{N}"/><P D="M0,14L24,14L24,10" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}"/><P D="M0.5,10.5L23.5,10.5L23.5,13.5L0.5,13.5Z" F="{B F}"/></C></V></T>',a.reliefMarker7='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M14,0L10,0L10,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.5}" ST="1" F="{N}"/><P D="M10,24L14,24L14,0" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}"/><P D="M10.5,0.5L13.5,0.5L13.5,23.5L10.5,23.5Z" F="{B F}"/></C></V></T>',
a.reliefMarker8='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M14,0L10,0L10,10L0,10L0,14M14,10L24,10M10,14L10,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.5}" ST="1" F="{N}"/><P D="M10,24L14,24L14,14L24,14L24,10M14,0L14,10M0,14L10,14" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}"/><P D="M10.5,0.5L13.5,0.5L13.5,10.5L23.5,10.5L23.5,13.5L13.5,13.5L13.5,23.5L10.5,23.5L10.5,13.5L0.5,13.5L0.5,10.5L10.5,10.5Z" F="{B F}"/></C></V></T>',
a.reliefMarker9='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M12,24L24,0" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}"  /><P D="M24,0L0,0L12,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.5}" ST="1" F="{N}"  /><P D="M0.5,0.5L23.5,0.5L12,23.5Z" S="{N}" F="{B F}"  /></C></V></T>',a.reliefMarker10='<T><T.R><D K="cfxOSW">1</D><cc K="clrConverter"/></T.R><V VW="25" VH="25"><C><P D="M3,0L0,0L10,12L0,24M24,0L21,0L12,10M12,14L21,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.5}" ST="1" F="{N}"  /><P D="M3,0L12,10M0,24L3,24L12,14M24,0L14,12L24,24L21,24" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}"  /><P D="M0.5,0.5L2.5,0.5L12,10.5L21.5,0.5L23.5,0.5L13.5,12L23.5,23.5L21.5,23.5L12,13.5L2.5,23.5L0.5,23.5L10.5,12Z" S="{N}" F="{B F}"  /></C></V></T>',
a.reliefBubble='<T><T.R><Th K="borderGap">4</Th><cc K="clrConverter"/></T.R><C><E S="{B S}" ST="1.5" F="{B F}"/><E ST="1.5" F="{N}"><E.S><L S="0,0" E="1,1" ><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*1.3}" O="0.4"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="0.6"/><G C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.4}" O="1"/></L></E.S></E></C></T>',
a.reliefOverlayBubble=a.reliefBubble,a.reliefTreeMap='<T><T.R><cc K="clrConverter"/></T.R><C M="1"><B F="{B F}" S="{N}" CR="1"/><B ST="1.5" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B ST="1.5" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>',a.reliefHeatMap='<T><T.R><cc K="clrConverter"/></T.R><C M="1"><B F="{B F}" S="{N}" CR="1"/><B ST="1.5" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B ST="1.5" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>',
a.reliefBullet='<T><T.R><cc K="clrConverter"/><T K="templateLine"><T.R><cc K="clrConverter"/></T.R><C><B C.Left="{B X1}" C.Top="{B Y1}" W="3" H="{B H}" CR="2" ><B.F><SolidBrush C="{B FC}"/></B.F></B><B C.Left="{B X1}" C.Top="{B Y1}" W="3" H="{B H}" CR="1" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2"/><B C.Left="{B X1}" C.Top="{B Y1}" W="3" H="{B H}" CR="1" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2"/></C></T></T.R><C><B F="{B F}" S="{N}" CR="2"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="3" Segments="2" CR="1"/><B F="{N}" ST="1" S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="1" Segments="2" CR="1"/></C></T>',
a.reliefSparklineBar=a.reliefTreeMap,a.reliefPictoGraph='<T><T.R><s K="ratio">0.46064</s><s K="forceBorder">true</s><cc K="clrConverter"/></T.R><V VW="11.516" VH="25"><C><P Reuse="true" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" D="M8.327,3.07c0,1.423-1.151,2.574-2.574,2.574c-1.419,0-2.57-1.151-2.57-2.574C3.183,1.651,4.333,0.5,5.752,0.5C7.175,0.5,8.327,1.651,8.327,3.07L8.327,3.07z M8.327,3.07M10.896,8.214c0,0,0-1.712-1.716-1.712H2.325c0,0-1.717,0-1.717,1.712v6.002c0,1.712,1.717,1.712,1.717,1.712V24.5H9.18v-8.572c0,0,1.716,0,1.716-1.712V8.214z M10.896,8.214z"/><P Reuse="true" F="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" D="M9.327,4.07c0,1.423-1.151,2.574-2.574,2.574c-1.419,0-2.57-1.151-2.57-2.574C4.183,2.651,5.333,1.5,6.752,1.5C8.175,1.5,9.327,2.651,9.327,4.07L9.327,4.07z M9.327,4.07M11.896,9.214c0,0,0-1.712-1.716-1.712H3.325c0,0-1.717,0-1.717,1.712v6.002c0,1.712,1.717,1.712,1.717,1.712V25.5H10.18v-8.572c0,0,1.716,0,1.716-1.712V9.214z M11.896,9.214z"/><P Reuse="true" F="{B F}" D="M8.827,3.57c0,1.423-1.151,2.574-2.574,2.574c-1.419,0-2.57-1.151-2.57-2.574C3.683,2.151,4.833,1,6.252,1C7.675,1,8.827,2.151,8.827,3.57L8.827,3.57z M8.827,3.57M11.396,8.714c0,0,0-1.712-1.716-1.712H2.825c0,0-1.717,0-1.717,1.712v6.002c0,1.712,1.717,1.712,1.717,1.712V25H9.68v-8.572c0,0,1.716,0,1.716-1.712V8.714z M11.396,8.714z"/></C></V></T>',
a.TipBorderDefault='<T xmlns:x="a"><T.R><mc K="multConverter"/><cc K="clrConverter"/><Th K="padding">3</Th></T.R><C Padding="{B Padding}"><B S="{N}" ST="1" F="{B F}" Padding="8,8,8,8" CR="2"><DockPanel N="container" Orientation="Vertical"><TextBlock Text="{B Title}" V="{B TitleVisible}" HorizontalAlignment="Left" M="3,0,3,0"/></DockPanel></B><B S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*1.3}" ST="1" F="{N}" Segments="2" StartCorner="3" CR="1"/><B S="{B FillColor, Converter={S clrConverter},ConverterParameter=B;#*0.4}" ST="1" F="{N}" Segments="2" StartCorner="1" CR="1"/></C></T>',
a=new f.Palette,a.setColors("#008000 #0816A4 #CC5F0A #CCCB0A #800040 #8712B3 #0E6E8D #807700 #CC0A3F #CCA40A #000080 #800066 #084D32 #0AAECC #800037 #803800 #003000 #0C20F0 #713506 #717006 #F00078 #B569F0 #18BCF0 #C9BB00 #64051F #645105 #006AC9 #C93FA1 #11A46A #055564 #E00060 #E06200 #242527 #242527 #19191B #19191B #666666 #242527 #A00000 #999999 #666666 #666666 #00000000 #E0E0E0 #00000000 #666666 #00000000 #242527 #666666 #1A1C1D #666666 #1A1C1D #666666 #666666 #242527 #666666 #19191B #666666 #666666 #444444 #666666".split(" ")),
f.Chart.setDefaultPalette(a));var g=function(){};f.motifs.relief=g;g.getStyleInfo=function(c){var a="";void 0!==c&&(c=c[0],void 0!==c&&(a=c[0]));c={isGroup:!1};c.name=a;c.isSingle=!1;c.isBullet=!1;c.sections=[];if(void 0!=a&&(a=a.toUpperCase(),0<=a.indexOf("SINGLE")&&(c.isSingle=!0,c.name=""),0<=a.indexOf("GROUP")&&(c.isGroup=!0,c.name="",c.name=""),0<=a.indexOf("BULLET")&&(c.isBullet=!0,c.name=""),0<=a.indexOf("SECTIONS"))){var b,d;b=a.indexOf("SECTIONS");d=a.indexOf(":",b);0<d&&(b=d,d=a.indexOf("-",
b),a=0<=d?a.substring(b+1,d):a.substring(b+1,a.length),c.sections=a.split(",",100));c.name=""}return c};g.global=function(c){c.setFont("8.5pt Arial");c.setResizeableFont(!1);var a=c.getMainScale().getTickmarks();a.getMajor().setStyle(f.gauge.TickmarkStyle.None);a.getMedium().setVisible(!1);c=c.getDefaultAttributes();c.setSectionThickness(.05);c.setSectionPosition(.8)};g.radial=function(c,a){g.global(c);var b=g.getStyleInfo(a);c.getMainScale().setAlignment(f.StringAlignment.Near);c.getBorder().setInsideGap(.05);
var d=c.getDefaultAttributes();d.setSectionThickness(.25);d.setSectionPosition(.25);if(null!=b.name){c.setStyle(b.name);if("progress"==b.name){d=c.getMainScale();c.getBorder().setTemplate("reliefRadialDashBorder");var h=c.getMainIndicator();d.getBar().setVisible(!1);h.setTemplate(e.reliefRadialFiller)}"repeater"==b.name&&(d=c.getMainScale(),d.getCap().setVisible(!1),d.getTickmarks().getMajor().setStyle(f.gauge.TickmarkStyle.None),d.getTickmarks().getMedium().setStyle(f.gauge.TickmarkStyle.None),b=
d.getBar(),b.setThickness(1),b.setPosition(0),c.getDefaultAttributes().setRepeaterSize(1),c.getDefaultAttributes().setRepeaterPosition(.9),b=new f.gauge.Repeater,b.setPaintOff(!0),c.setMainIndicator(b))}};g.linear=function(c,a){g.global(c);var b=c.getMainScale();b.setThickness(.6);b.setPosition(0);b.setAllowHalves(!1);var d=b.getBar();d.setVisible(!0);d.setThickness(.25);d.setTemplate(e.reliefLinearBar);d=b.getMainIndicator();d.setSize(.25);d.setPosition(.375);var h=b.getMainIndicator(),d=g.getStyleInfo(a);
d.isGroup&&(c.getBorder().setTemplate('<T><T.R><Th K="borderGap">6</Th></T.R><C/></T>'),c.getDashboardBorder().setTemplate("<T/>"));d.isBullet&&(b.setThickness(.9),b.setPosition(0),b.getBar().setVisible(!1),h.setSize(.25),h.setPosition(.375),h.setTitle("Current"),h=new f.gauge.Marker,h.setSize(.4),h.setPosition(.5),h.setTitle("Target"),h.setTemplate("MarkerThinRectangle"),b.getIndicators().add(h),c.getDefaultAttributes().setSectionThickness(.5),c.getDefaultAttributes().setSectionPosition(.25));if(0<
d.sections.length){for(var h=0,k,l=0;l<d.sections.length;l++)k=d.sections[l],b=new f.gauge.ScaleSection,b.setFrom(h),b.setTo(k),c.getMainScale().getSections().add(b),h=k;c.getMainScale().setMax(k)}};g.vert=function(c,a){g.linear(c,a);c.getDefaultAttributes().setRepeaterPosition(.5);c.getDefaultAttributes().setRepeaterSize(.31);if("repeater"==g.getStyleInfo(a).name){var b=new f.gauge.Repeater;b.setPaintOff(!0);c.setMainIndicator(b)}};g.horz=function(c,a){g.linear(c,a);c.getMainScale().getTickmarks().getMajor().setLabelGap(.8);
c.getDefaultAttributes().setRepeaterPosition(.475);c.getDefaultAttributes().setRepeaterSize(.3);if("repeater"==g.getStyleInfo(a).name){var b=new f.gauge.Repeater;b.setPaintOff(!0);c.setMainIndicator(b)}};g.map=function(c,a){c.setShowAdditionalLayers(!1);var b=new f.maps.MapLayer;b.setPath("@main");var d=b.getShadow();d.setXOffset(3);d.setYOffset(3);d.setColor("#4C444444");d.setBlur(2);b.setSpacing(8);b.setTemplate('<T xmlns:x="a" xmlns:sys="b"><T.R><cc K="clrConverter"/><s K="numPasses">3</s><T K="template0"><T.R><cc K="clrConverter"/><s K="xDelta">1</s><s K="yDelta">1</s></T.R><P Reuse="true" D="{B G}"><P.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*0.7}}"/></P.F></P></T><T K="template1"><T.R><cc K="clrConverter"/><s K="xDelta">-1</s><s K="yDelta">-1</s></T.R><P Reuse="true" D="{B G}"><P.F><SolidBrush C="{B FillColor,Converter={S clrConverter},ConverterParameter=#*1.25}}"/></P.F></P></T></T.R><P Reuse="true" F="{B F}" D="{B G}"/></T>');
c.getLayers().add(b);c.setBackColor("#00000000")};g.heatmap=function(c,a){var b=c.getGradientStops();b.getItem(0).setColor("#008000");b.getItem(1).setColor("#250E8D")};g.equalizer=function(c,a){var b=new f.equalizer.EqualizerItem;b.setColor("#800040");b.setCount(2);c.getTopItems().add(b);b=new f.equalizer.EqualizerItem;b.setColor("#CCCB0A");b.setCount(1);c.getTopItems().add(b);c.setOffColor("#33666666")};g.trend=function(a,e){var b=a.getIndicator();b.setStyle(f.gauge.IndicatorStyle.ThickDiagonal);
b.setHeightRatio(.35);b="";if(void 0!==e){var d=e[0];void 0!==d&&(b=d[0])}void 0!=b&&(0<=b.toUpperCase().indexOf("SINGLE")&&(a.getDelta().setVisible(!1),a.getPercentChange().setVisible(!1),a.getIndicator().setVisible(!1)),0<=b.toUpperCase().indexOf("GROUP")&&a.getBorder().setTemplate("<T/>"))};g.chart=function(a,e){var b="";if(void 0!==e){var d=e[0];void 0!==d&&(b=d[0])}void 0!=b&&(b=b.toUpperCase(),"GROUP"==b&&a.getBorder().setTemplate("<T/>"));b=a.getAxisY().getGrids();b.getMajor().setVisible(!1);
b.getMajor().setTickMark(f.TickMark.None);b.getMinor().setVisible(!1);b.getMinor().setTickMark(f.TickMark.None);b=a.getAxisY2().getGrids();b.getMajor().setVisible(!1);b.getMajor().setTickMark(f.TickMark.None);b.getMinor().setVisible(!1);b.getMinor().setTickMark(f.TickMark.None);a.getAxisY().getLine().setWidth(1);a.getAxisX().getLine().setWidth(1);a.getPlotAreaMargin().setTop(10);b=a.getAllSeries();b.setMarkerStyle(f.MarkerStyle.Filled);b.setMarkerSize(4);b.setMarkerWidth(1);a.setPlotAreaTemplate('<T><T.R><cc K="clrConverter"/></T.R><C><B F="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.7}" S="{N}" CR="2"/><B F="{N}" ST="2" S="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*0.4}" StartCorner="3" Segments="2" CR="2"/><B F="{N}" ST="2" S="{Binding Class=Border.fill, Converter={S clrConverter},ConverterParameter=B;#*1.3}" StartCorner="1" Segments="2" CR="2"/></C></T>')}})();