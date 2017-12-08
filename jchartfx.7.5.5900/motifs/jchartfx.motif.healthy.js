(function(){var c,e;"undefined"!==typeof window?(c=window.sfx,e=window.cfx):(c=require("./jchartfx.system.js"),e=c.cfx);e.motif="healthy";var f=c["gauge.templates"];if(void 0!=f){f.healthyDashBorder='<T><T.R><s K="plotMargin">targetChart</s></T.R><B F="{B F}" S="{B S}" M="2"><g M="1"><g.RD><RD H="Auto" MinHeight="32"/><RD H="*"/></g.RD><TextBlock M="21,8,21,8" Text="{B Title}" VerticalAlignment="Center" HorizontalAlignment="Left" Foreground="{Binding Class=DashboardTitle.fill}" FontFamily="{Binding Class=DashboardTitle.font-family}" FontSize="11" FontWeight="Normal"/><C g.R="1" N="targetChart" M="4,4,4,10"/></g></B></T>';
f.healthyRadialDashBorder="<T/>";f.healthyRadialIndicator="NeedleRegularDrop";f.healthyRadialSection='<T><C M="0"><P D="{B G}" F="{B F}"/><P D="{B GeometryInside}" S="{B S}"/></C></T>';f.healthyRadialCap='<T><E F="#E9E9E9"/><E><E.F><R><G C="#00FFFFFF" O="0"/><G C="#00FFFFFF" O="0.7"/><G C="#88FFFFFF" O="0.9"/><G C="#66AAAAAA" O="1"/></R></E.F></E></T>';f.healthyRadialGlare="<T/>";f.healthyLinearDashBorder="<T/>";f.healthyLinearGlare="<T/>";f.healthyLinearFiller="LinearFillerSimple";f.healthyLinearMarker=
'<T><T.R><s K="ratio">0.2</s></T.R><B F="{B F}" CP="1" S="{B S}" StartCorner="1" Segments="1"/></T>';f.healthyLinearBar='<T><B F="{B F}" S="{B S}"/></T>';f.healthyLinearBarRound='<T><T.R><s K="clipBarRound">1</s></T.R><B F="{B F}" S="{B S}" CP="1"/></T>';f.healthyFillerVertical='<T><B F="{B F}" CP="1" S="{B S}" StartCorner="1" Segments="1"/></T>';f.healthyFillerHorizontal='<T><B F="{B F}" CP="1" S="{B S}" StartCorner="2" Segments="1"/></T>';f.healthyRadialBar='<T><T.R><s K="clipBar">1</s></T.R><P D="{B GeometryRound}" F="{B F}" S="{B S}"/></T>';
f.healthyRadialFillerRound='<T><C><P D="{B GeometryRound}" F="{B F}"/><P D="{B GeometryInside}" S="{B S}"/></C></T>';f.healthyLinearSection='<T><T.R><T K="firstSection"><P D="{B GeometryRoundStart}" F="{B F}" S="{B S}"/></T><T K="middleSection"><P D="{B G}" F="{B F}" S="{B S}"/></T><T K="lastSection"><P D="{B GeometryRoundEnd}" F="{B F}" S="{B S}"/></T></T.R><P D="{B GeometryRound}" F="{B F}" S="{B S}"/></T>';f.healthyRadialSection='<T><T.R><T K="firstSection"><P D="{B GeometryRoundStart}" F="{B F}" S="{B S}"/></T><T K="middleSection"><P D="{B G}" F="{B F}" S="{B S}"/></T><T K="lastSection"><P D="{B GeometryRoundEnd}" F="{B F}" S="{B S}"/></T></T.R><P D="{B GeometryRound}" F="{B F}" S="{B S}"/></T>';
f.healthyRepeaterRadial='<T><T.R><s K="ratio">0.075</s></T.R><B F="{B F}" CP="1" S="{B S}" StartCorner="2" Segments="1"/></T>';f.healthyRepeaterVertical='<T><T.R><s K="ratio">0.075</s></T.R><B F="{B F}" CP="1" S="{B S}" StartCorner="3" Segments="1"/></T>';f.healthyRepeaterHorizontal='<T><T.R><s K="ratio">0.075</s></T.R><B F="{B F}" CP="1" S="{B S}" StartCorner="1" Segments="1"/></T>';f.healthyMarkerVertical='<T><T.R><s K="ratio">0.2</s></T.R><B F="{B F}" CP="1" S="{B S}" StartCorner="1" Segments="1"/></T>';
f.healthyMarkerHorizontal=f.healthyMarkerVertical;f.healthyTrendIndicator='<T xmlns:x="a" xmlns:sys="b"><T.R><cc K="clrConverter"/><T K="fillTemplate"><T.R><cc K="clrConverter"/></T.R><C><P C.Top="1.5" D="{B G}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.75}"/></P.S></P><P D="{B G}" F="{B F}" S="{B S}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"/></C></T><T K="backTemplate"><T.R><cc K="clrConverter"/></T.R><C><P C.Top="1.5" D="{B G}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"><P.S><SolidBrush C="{B FillColor, Converter={S clrConverter},ConverterParameter=#*0.75}"/></P.S></P><P D="{B G}" F="{B F}" S="{B S}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"/></C></T><T K="strokeBackTemplate"><C><P D="{B G}" S="{B S}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"/></C></T><T K="fillBackTemplate"><C><P D="{B G}" F="{B F}" S="{B S}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"/></C></T></T.R><C><P C.Top="1.5" D="{B G}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"><P.S><SolidBrush C="{B StrokeColor, Converter={S clrConverter},ConverterParameter=#*0.75}"/></P.S></P><P D="{B G}" S="{B S}" ST="{B ST}" SSC="Round" SEC="Round" SJ="Round"/></C></T>';
f.TipBorderDefault='<T xmlns:x="a"><T.R><mc K="multConverter"/></T.R><C Padding="12"><B S="{B S}" ST="3" CR="45" CP="1" C.Top="2" Segments="7" StartCorner="2"></B><B S="{B S}" ST="2" F="{B F}" CP="1" CR="45" Padding="4" Segments="7" StartCorner="2"><DockPanel N="container" M="10,10,10,6" Orientation="Vertical"><TextBlock Text="{B Title}" FontSize="{B FontSize" V="{B TitleVisible}" HorizontalAlignment="Right" FontWeight="Bold" M="3,0,3,0"/><B H="1" S="{B Foreground}" ST="1" M="0,0,0,4" V="{B TitleVisible}"/></DockPanel></B></C></T>';
f.healthyPictoGraph='<T><T.R><s K="ratio">0.36226</s><s K="vertSpacingHive">-0.6</s><s K="horzSpacingHive">0.4</s></T.R><V VW="18" VH="49.688"><g><P S="{B S}" F="{B F}" Reuse="true" D="M5.5,0.5B5.5,0.5,8,8,0,360M18.458,15.348c-0.321-3.438-2.626-5.16-5.427-5.16H5.969c-2.801,0-5.105,1.723-5.427,5.161C0.517,15.458,0.5,15.57,0.5,15.688v14c0,0.828,0.672,1.5,1.5,1.5s1.5-0.672,1.5-1.5v-10.5h1v10v19c0,1.104,0.896,2,2,2s2-0.896,2-2v-17h2v17c0,1.104,0.896,2,2,2s2-0.896,2-2v-19v-10h1v10.5c0,0.828,0.672,1.5,1.5,1.5s1.5-0.672,1.5-1.5v-14C18.5,15.57,18.483,15.458,18.458,15.348z" ></P></g></V></T>';
var m=new e.gauge.Palette;m.setColors(["#CCCCCC","#FFFFFF","#808080","#F0F0F0","#999999","#999999","#F47528","#B7581E","#0000FF","#FF0000","#828282","#E9E9E9",null,null,"#ED3B6B","#B22D51",null,"#FDD25F","#BE9E48",null,"#A8D350","#7E9F3C",null,"#BBBBBB","#BBBBBB","#48494D","#48494D","#808080","#8A8B8F","#ED3B6B","#FDD25F","#A8D350","#999999","#ffffff","#999999","#444444","#BBBBBB","#999999","#A8D350","#FDD25F","#F47528","#ED3B6B","#4EC2C2","#7E9F3C","#BE9E48","#B7581E","#B22D51","#3B9292"]);e.gauge.Palette.setDefaultPalette(m)}c=
c["vector.templates"];void 0!=c&&(c["BorderEffect2.fill"]="0,#E9E9E9",c["DashboardTitle.fill"]="0,#48494D",c["DashboardTitle.font-family"]="1,Arial",c["AxisY_Text.fill"]="0,#8A8B8F",c.healthyBorder='<T><T.R><s K="plotMargin">targetChart</s><Th K="externalMargin">16</Th><Th K="internalRectMargin">0</Th><Th K="uiMargin">18,21,0,0</Th><T K="internalRect"><B CR="6" F="{B F}" S="{B S}" CP="0.5"/></T><T K="internal"><Line S="{B S}" X1="{B X1}" X2="{B X2}" Y1="{B Y1}" Y2="{B Y2}"/></T></T.R><B F="{B F}" S="{B S}" M="2"><g M="1"><g.RD><RD H="Auto" MinHeight="32"/><RD H="*"/></g.RD><DockPanel Orientation="Horizontal"><r V="{B UIVisible}" W="{B UISize}" M="0,0,4,0" H="1" F="{N}" S="{N}"/><TextBlock M="21,18,21,8" Text="{B Title}" FontFamily="{Binding Class=DashboardTitle.font-family}" FontSize="11" FontWeight="Normal" VerticalAlignment="Center" HorizontalAlignment="Left" Foreground="{Binding Class=DashboardTitle.fill}"/></DockPanel><C g.R="1" N="targetChart" M="20,0,0,0"/></g></B></T>',
c.healthyBar='<T><T.R><T K="cfxLastStack"><B F="{B F}" S="{B S}" CR="200,200,0,0" CP="1"/></T><T K="cfxFirstStack"><B F="{B F}" S="{B S}"/></T></T.R><B F="{B F}" S="{B S}" CR="200,200,0,0" CP="1"/></T>',c.healthyGantt='<T><T.R><T K="cfxLastStack"><B F="{B F}" S="{B S}" CR="0,200,200,0" CP="1"/></T><T K="cfxFirstStack"><B F="{B F}" S="{B S}"/></T></T.R><B F="{B F}" S="{B S}" CR="0,200,200,0" CP="1"/></T>',c.healthyEqualizer='<T><B F="{B F}" CR="10" CP="0.75"/></T>',c.healthyArea="AreaBasic",c.healthyHighLow=
'<T><T.R><D K="cfxDefStrokeThickness">3</D><T K="lineTemplate"><C><Pl P="{B P}" S="{B S}" ST="{B ST}"/></C></T></T.R><Po P="{B P}" F="{B F}"/></T>',c.healthyHighLowBaseline='<T><T.R><D K="cfxDefStrokeThickness">1</D><T K="baselineTemplate"></T><T K="lineTemplate"><C><Pl P="{B P}" S="{B S}" ST="{B ST}"/></C></T></T.R><Po P="{B P}" F="{B F}"/></T>',c.healthyLine="LineBasic",c.healthyCurveArea="CurveAreaBasic",c.healthyCurve="CurveBasic",c.healthyPie='<T><C><P D="{B G}" F="{B F}"/><P D="{B G}" S="{Binding Class=BorderEffect2.fill}" ST="3"/></C></T>',
c.healthyDoughnut=c.healthyPie,c.healthyBubble="BubbleBasic",c.healthyTreeMap='<T><B M="1" F="{B F}" S="{N}" CR="8"/><B M="1" F="#88FFFFFF" S="{N}" CR="8"/><B M="5" F="{B F}" S="{N}"/></T>',c.healthyFunnel='<T><C><Po P="{B P}" F="{B F}"/><Po P="{B P}" S="{Binding Class=BorderEffect2.fill}" ST="3"/></C></T>',c.healthyPyramid=c.healthyFunnel,c.healthySparklineLine=c.healthyLine,c.healthySparklineBar=c.healthyBar,c.healthySparklineArea=c.healthyArea,c.healthyBullet='<T><T.R><T K="templateLine"><C><B C.Left="{B X1}" C.Top="{B Y1}" W="3" H="{B H}" CP="1" ><B.F><SolidBrush C="{B FC}"/></B.F></B></C></T></T.R><B F="{B F}" S="{B S}" CR="0,200,200,0" CP="1"/></T>',
c.TipBorderDefault='<T xmlns:x="a"><T.R><mc K="multConverter"/></T.R><C Padding="12"><B S="{B ItemFillS}" ST="3" CR="45" CP="1" C.Top="2" Segments="7" StartCorner="2"></B><B S="{B ItemFillS}" ST="2" F="{B F}" CP="1" CR="45" Padding="4" Segments="7" StartCorner="2"><DockPanel N="container" M="10,10,10,6" Orientation="Vertical"><TextBlock Text="{B Title}" FontSize="{B FontSize" V="{B TitleVisible}" HorizontalAlignment="Right" FontWeight="Bold" M="3,0,3,0"/><B H="1" S="{B Foreground}" ST="1" M="0,0,0,4" V="{B TitleVisible}"/></DockPanel></B></C></T>',
c.healthyPictoGraph='<T><T.R><s K="ratio">0.36226</s><s K="vertSpacingHive">-0.6</s><s K="horzSpacingHive">0.4</s></T.R><V VW="18" VH="49.688"><g><P S="{B S}" F="{B F}" Reuse="true" D="M5.5,0.5B5.5,0.5,8,8,0,360M18.458,15.348c-0.321-3.438-2.626-5.16-5.427-5.16H5.969c-2.801,0-5.105,1.723-5.427,5.161C0.517,15.458,0.5,15.57,0.5,15.688v14c0,0.828,0.672,1.5,1.5,1.5s1.5-0.672,1.5-1.5v-10.5h1v10v19c0,1.104,0.896,2,2,2s2-0.896,2-2v-17h2v17c0,1.104,0.896,2,2,2s2-0.896,2-2v-19v-10h1v10.5c0,0.828,0.672,1.5,1.5,1.5s1.5-0.672,1.5-1.5v-14C18.5,15.57,18.483,15.458,18.458,15.348z" ></P></g></V></T>',
c=new e.Palette,c.setColors("#A8D350 #FDD25F #F47528 #ED3B6B #4EC2C2 #3399FE #909090 #FF4488 #FFBD21 #A9DFDF #FFA4C7 #54C1C6 #D04500 #F99803 #78C817 #1365D7 #3F4F1E #5F4F24 #5B2C0F #591628 #1D4949 #13395F #363636 #601933 #60470C #3F5454 #603D4B #1F484A #FF7300 #FFFD05 #C8FF26 #1FA8FF #FFFFFF #F0F0F0 #00000000 #CCCCCC #BBBBBB #F3F3F3 #54C1C6 #C5E8E8 #8A8B8F #8A8B8F #00000000 #48494D #00000000 #A8A8A8 #00000000 #ffffff #8A8B8F #F3F3F3 #8A8B8F #E7E7E7 #8A8B8F #E7E7E7 #ffffff #999999 #ffffff #999999 #8A8B8F #BBBBBB #999999".split(" ")),
e.Chart.setDefaultPalette(c));var k=function(){};e.motifs.healthy=k;k.getStyleInfo=function(a){var c="";void 0!==a&&(a=a[0],void 0!==a&&(c=a[0]));a={isGroup:!1};a.name=c;a.isSingle=!1;a.isBullet=!1;a.sections=[];if(void 0!=c&&(c=c.toUpperCase(),0<=c.indexOf("SINGLE")&&(a.isSingle=!0,a.name=""),0<=c.indexOf("GROUP")&&(a.isGroup=!0,a.name="",a.name=""),0<=c.indexOf("BULLET")&&(a.isBullet=!0,a.name=""),0<=c.indexOf("SECTIONS"))){var b,d;b=c.indexOf("SECTIONS");d=c.indexOf(":",b);0<d&&(b=d,d=c.indexOf("-",
b),c=0<=d?c.substring(b+1,d):c.substring(b+1,c.length),a.sections=c.split(",",100));a.name=""}return a};k.global=function(a){a.setFont("12pt Arial")};k.radial=function(a,c){k.global(a);var b=k.getStyleInfo(c);null!=b.name&&a.setStyle(b.name);var d=a.getMainScale(),g=a.getMainIndicator();g.setUseSectionColor(!0);if("progress"==b.name){d.setThickness(1.3);d.setPosition(-.1);var h=d.getBar();h.setVisible(!0);h.setTemplate(f.healthyRadialBar);h.setThickness(.25);d.setStartAngle(130);d.setSweepAngle(280);
d=new e.gauge.Filler;d.setTemplate(f.healthyRadialFillerRound);d.setPosition(.17);d.setSize(.21);a.setMainIndicator(d);d=a.getDefaultAttributes();d.setSectionPosition(.18);d.setSectionThickness(.05)}else d.setThickness(.7),d.setPosition(0),h=d.getBar(),h.setVisible(!0),h.setTemplate(f.healthyRadialBar),h.setThickness(.6),h.setPosition(.35),d.getCap().setSize(.13),d.setStartAngle(180),d.setSweepAngle(180),g.setSize(.5),g.setPosition(.75),g=d.getTickmarks(),h=g.getMajor(),h.setWidth(.01),h.setSize(.05),
h.setPosition(-.05),d.setAlignment(e.StringAlignment.Near),h.setStyle(e.gauge.TickmarkStyle.None),g.getMedium().setVisible(!1),d=a.getDefaultAttributes(),d.setSectionPosition(.4),d.setSectionThickness(.5);a.getDefaultAttributes().setRepeaterSize(.4);a.getDefaultAttributes().setRepeaterPosition(.385);"repeater"==b.name&&(b=a.getMainScale(),b.getCap().setVisible(!1),b.getTickmarks().getMajor().setStyle(e.gauge.TickmarkStyle.None),b.getTickmarks().getMedium().setStyle(e.gauge.TickmarkStyle.None),h=b.getBar(),
h.setVisible(!0),b=new e.gauge.Repeater,b.setPaintOff(!0),a.setMainIndicator(b))};k.linear=function(a,c){k.global(a);var b=a.getMainScale(),d=b.getBar();d.setVisible(!0);b.setThickness(.75);b.setAlignment(e.StringAlignment.Near);var g=b.getTickmarks(),h=g.getMajor();h.setSize(.1);h.setStyle(e.gauge.TickmarkStyle.Line);h.setWidth(.025);h.setPosition(.75);g.getMedium().setVisible(!1);d.setThickness(.5);d.setPosition(.25);g=a.getMainIndicator();g.setSize(.4);g.setPosition(.3);a.setFont("9pt 'Fira Sans', Arial");
d.setTemplate(f.healthyLinearBarRound);b.setAllowHalves(!1);a.getDefaultAttributes().setRepeaterPosition(.5);d=k.getStyleInfo(c);d.isGroup&&(a.getBorder().setTemplate("<T/>"),a.getDashboardBorder().setTemplate("<T/>"));d.isBullet&&(b.setThickness(.9),b.setPosition(0),g.setSize(.25),g.setPosition(.375),g.setTitle("Current"),g=new e.gauge.Marker,g.setSize(.4),g.setPosition(.5),g.setTitle("Target"),g.setTemplate(f.healthyLinearMarker),b.getIndicators().add(g),a.getDefaultAttributes().setSectionThickness(.5),
a.getDefaultAttributes().setSectionPosition(.25));if(0<d.sections.length){for(var g=0,l,h=0;h<d.sections.length;h++)l=d.sections[h],b=new e.gauge.ScaleSection,b.setFrom(g),b.setTo(l),a.getMainScale().getSections().add(b),g=l;a.getMainScale().setMax(l)}};k.vert=function(a,c){k.linear(a,c);if("repeater"==k.getStyleInfo(c).name){var b=new e.gauge.Repeater;b.setPaintOff(!0);a.setMainIndicator(b)}};k.horz=function(a,c){k.linear(a,c);var b=k.getStyleInfo(c),b=k.getStyleInfo(c);b.isBullet||a.getMainScale().setThickness(.5);
"repeater"==b.name&&(b=new e.gauge.Repeater,b.setPaintOff(!0),a.setMainIndicator(b))};k.chart=function(a,c){var b="";if(void 0!==c){var d=c[0];void 0!==d&&(b=d[0])}a.getAllSeries().setMarkerSize(1);void 0!=b&&(b=b.toUpperCase(),"GROUP"==b&&a.getBorder().setTemplate("<T/>"));b=a.getAxisY().getGrids();b.getMajor().setTickMark(e.TickMark.None);b.getMinor().setTickMark(e.TickMark.None);b=a.getAxisY2().getGrids();b.getMajor().setTickMark(e.TickMark.None);b.getMinor().setTickMark(e.TickMark.None);b=a.getAxisX().getGrids();
b.getMinor().setTickMark(e.TickMark.None);b.getMajor().setTickMark(e.TickMark.Outside);a.getAllSeries().setMarkerStyle(e.MarkerStyle.Filled);a.getAllSeries().getBorder().setUseForLines(!1);a.getAxisX().getGrids().getMajor().setTickMark(e.TickMark.Outside);a.getAllSeries().getLine().setWidth(2);a.setFont("9pt 'Fira Sans', Arial")};k.map=function(a,c){a.setShowAdditionalLayers(!1);var b=new e.maps.MapLayer;b.setPath("@main");b.setTemplate('<T xmlns:x="a" xmlns:sys="b"><T.R><mc K="multConverter"/></T.R><C><P Reuse="true" F="{B F}" D="{B G}"/><P D="{B G}" S="{Binding Class=BorderEffect2.fill}" ST="{B StrokeThickness, Converter={S multConverter},ConverterParameter=1.5}"/></C></T>');
a.getLayers().add(b);a.setContextDataTemplate('<T xmlns:x="a" xmlns:sys="b"><T.R><T K="preTemplate"><T.R><mc K="multConverter"/></T.R><P D="{B G}" S="{Binding Class=BorderEffect2.fill}" ST="{B StrokeThickness, Converter={S multConverter},ConverterParameter=4}"/></T></T.R></T>')};k.heatmap=function(a,c){var b=a.getGradientStops();b.getItem(0).setColor("#A8D350");b.getItem(1).setColor("#FDD25F")};k.equalizer=function(a,c){var b=new e.equalizer.EqualizerItem;b.setColor("#FDD25F");b.setCount(2);a.getTopItems().add(b);
b=new e.equalizer.EqualizerItem;b.setColor("#F47528");b.setCount(1);a.getTopItems().add(b);a.setOffColor("#33BBBBBB")};k.trend=function(a,c){a.getSecondaryValues().setAlphaForeground(1);a.getDelta().setVisible(!1);a.getSecondaryValues().setSeparatorWidth(0);var b=a.getIndicator();b.setStyle(e.gauge.IndicatorStyle.ArrowVerticalPointer);b.setPosition(e.gauge.IndicatorPosition.Primary);b.setRoundPen(!0);b="";if(void 0!==c){var d=c[0];void 0!==d&&(b=d[0])}void 0!=b&&(0<=b.toUpperCase().indexOf("SINGLE")&&
(a.getDelta().setVisible(!1),a.getPercentChange().setVisible(!1),a.getIndicator().setVisible(!1)),0<=b.toUpperCase().indexOf("GROUP")&&a.getBorder().setTemplate("<T/>"))};k.border=function(a,c){};e.ToolTipAttributes.prototype.setLineMode=function(){var a=new e.ToolTipLineAttributes;a.getLine().setStyle(0);a.setBorderTemplate('<T xmlns:x="a"><T.R><mc K="multConverter"/><Th K="padding">2</Th></T.R><C Padding="{B Padding}"><B C.Left="-1" C.Top="0" F="{Binding Class=Border.fill}" A="0.9" S="{N}"><DockPanel N="container" Orientation="Vertical" M="2,2,2,2"><TextBlock Text="{B Title}" FontSize="{B FontSize, Converter={S multConverter},ConverterParameter=0.8}" V="{B TitleVisible}" HorizontalAlignment="Left" FontWeight="Normal" Foreground="{Binding Class=DashboardTitle.fill}" VerticalAlignment="Center" M="10,3,3,3"/><B H="1" S="{Binding Class=AxisY_Line.stroke}" ST="1" M="10,0,10,4" V="{B TitleVisible}"/></DockPanel></B></C></T>');
a.getLine().setWidth(1);a.setY(1);0==this.getTriggerMode()&&this.setTriggerMode(1);this.setMode(a)}})();