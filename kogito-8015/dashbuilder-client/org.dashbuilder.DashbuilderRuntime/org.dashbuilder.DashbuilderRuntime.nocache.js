function org_dashbuilder_DashbuilderRuntime(){var $wnd_0=window,$doc_0=document;function isHostedMode(){var e=$wnd_0.location.search;return-1!=e.indexOf("gwt.codesvr.org.dashbuilder.DashbuilderRuntime=")||-1!=e.indexOf("gwt.codesvr=")}function sendStats(e,t){$wnd_0.__gwtStatsEvent&&$wnd_0.__gwtStatsEvent({moduleName:"org.dashbuilder.DashbuilderRuntime",sessionId:$wnd_0.__gwtStatsSessionId,subSystem:"startup",evtGroup:e,millis:(new Date).getTime(),type:t})}sendStats("bootstrap","begin"),org_dashbuilder_DashbuilderRuntime.__sendStats=sendStats,org_dashbuilder_DashbuilderRuntime.__moduleName="org.dashbuilder.DashbuilderRuntime",org_dashbuilder_DashbuilderRuntime.__errFn=null,org_dashbuilder_DashbuilderRuntime.__moduleBase="DUMMY",org_dashbuilder_DashbuilderRuntime.__softPermutationId=0,org_dashbuilder_DashbuilderRuntime.__computePropValue=null,org_dashbuilder_DashbuilderRuntime.__getPropMap=null,org_dashbuilder_DashbuilderRuntime.__installRunAsyncCode=function(){},org_dashbuilder_DashbuilderRuntime.__gwtStartLoadingFragment=function(){return null},org_dashbuilder_DashbuilderRuntime.__gwt_isKnownPropertyValue=function(){return!1},org_dashbuilder_DashbuilderRuntime.__gwt_getMetaProperty=function(){return null};var __propertyErrorFunction=null,activeModules=$wnd_0.__gwt_activeModules=$wnd_0.__gwt_activeModules||{},frameDoc;function getInstallLocationDoc(){return setupInstallLocation(),frameDoc}function setupInstallLocation(){if(!frameDoc){var e=$doc_0.createElement("iframe");e.id="org.dashbuilder.DashbuilderRuntime",e.style.cssText="position:absolute; width:0; height:0; border:none; left: -1000px; top: -1000px;",e.tabIndex=-1,$doc_0.body.appendChild(e),(frameDoc=e.contentWindow.document).open();var t="CSS1Compat"==document.compatMode?"<!doctype html>":"";frameDoc.write(t+"<html><head></head><body></body></html>"),frameDoc.close()}}function installScript(e){sendStats("moduleStartup","moduleRequested"),function(e){function t(){return void 0===$doc_0.readyState?void 0!==$doc_0.body&&null!=$doc_0.body:/loaded|complete/.test($doc_0.readyState)}var r=t();if(r)e();else{$doc_0.addEventListener&&$doc_0.addEventListener("readystatechange",o,!1);var n=setInterval((function(){o()}),10)}function o(){if(!r){if(!t())return;r=!0,e(),$doc_0.removeEventListener&&$doc_0.removeEventListener("readystatechange",o,!1),n&&clearInterval(n)}}}((function(){var t,r,n,o;t=e,n=(r=getInstallLocationDoc()).body,(o=r.createElement("script")).language="javascript",o.src=t,org_dashbuilder_DashbuilderRuntime.__errFn&&(o.onerror=function(){org_dashbuilder_DashbuilderRuntime.__errFn("org_dashbuilder_DashbuilderRuntime",new Error("Failed to load "+t))}),n.appendChild(o),sendStats("moduleStartup","scriptTagAdded")}))}function processMetas(){for(var metaProps={},propertyErrorFunc,onLoadErrorFunc,metas=$doc_0.getElementsByTagName("meta"),i=0,n=metas.length;i<n;++i){var meta=metas[i],name_1=meta.getAttribute("name"),content_0;if(name_1){if(name_1=name_1.replace("org.dashbuilder.DashbuilderRuntime::",""),name_1.indexOf("::")>=0)continue;if("gwt:property"==name_1){if(content_0=meta.getAttribute("content"),content_0){var value_1,eq=content_0.indexOf("=");eq>=0?(name_1=content_0.substring(0,eq),value_1=content_0.substring(eq+1)):(name_1=content_0,value_1=""),metaProps[name_1]=value_1}}else if("gwt:onPropertyErrorFn"==name_1){if(content_0=meta.getAttribute("content"),content_0)try{propertyErrorFunc=eval(content_0)}catch(e){alert('Bad handler "'+content_0+'" for "gwt:onPropertyErrorFn"')}}else if("gwt:onLoadErrorFn"==name_1&&(content_0=meta.getAttribute("content"),content_0))try{onLoadErrorFunc=eval(content_0)}catch(e){alert('Bad handler "'+content_0+'" for "gwt:onLoadErrorFn"')}}}__gwt_getMetaProperty=function(e){var t=metaProps[e];return null==t?null:t},__propertyErrorFunction=propertyErrorFunc,org_dashbuilder_DashbuilderRuntime.__errFn=onLoadErrorFunc}function computeScriptBase(){function e(e){var t=e.lastIndexOf("#");-1==t&&(t=e.length);var r=e.indexOf("?");-1==r&&(r=e.length);var n=e.lastIndexOf("/",Math.min(r,t));return n>=0?e.substring(0,n+1):""}var t,r,n,o=null!=(t=__gwt_getMetaProperty("baseUrl"))?t:"";return""==o&&(o=function(){for(var t=$doc_0.getElementsByTagName("script"),r=0;r<t.length;++r)if(-1!=t[r].src.indexOf("org.dashbuilder.DashbuilderRuntime.nocache.js"))return e(t[r].src);return""}()),""==o&&(o=(r=$doc_0.getElementsByTagName("base")).length>0?r[r.length-1].href:""),""==o&&(n=$doc_0.location).href==n.protocol+"//"+n.host+n.pathname+n.search+n.hash&&(o=e($doc_0.location.href)),function(t){if(t.match(/^\w+:\/\//));else{var r=$doc_0.createElement("img");r.src=t+"clear.cache.gif",t=e(r.src)}return t}(o)}function computeUrlForResource(e){return e.match(/^\//)||e.match(/^[a-zA-Z]+:\/\//)?e:org_dashbuilder_DashbuilderRuntime.__moduleBase+e}function getCompiledCodeFilename(){var e=[],t=0;function r(t,r){for(var n=e,o=0,a=t.length-1;o<a;++o)n=n[t[o]]||(n[t[o]]=[]);n[t[a]]=r}var n,o=[],a=[];function d(e){var t=a[e](),r=o[e];if(t in r)return t;var n=[];for(var d in r)n[r[d]]=d;throw __propertyErrorFunction&&__propertyErrorFunction(e,n,t),null}if(a["user.agent"]=function(){var e=navigator.userAgent.toLowerCase(),t=$doc_0.documentMode;return-1!=e.indexOf("webkit")?"safari":-1!=e.indexOf("msie")&&t>=10&&t<11?"ie10":-1!=e.indexOf("msie")&&t>=9&&t<11?"ie9":-1!=e.indexOf("msie")&&t>=8&&t<11?"ie8":-1!=e.indexOf("gecko")||t>=11?"gecko1_8":""},o["user.agent"]={gecko1_8:0,ie10:1,ie8:2,ie9:3,safari:4},__gwt_isKnownPropertyValue=function(e,t){return t in o[e]},org_dashbuilder_DashbuilderRuntime.__getPropMap=function(){var e={};for(var t in o)o.hasOwnProperty(t)&&(e[t]=d(t));return e},org_dashbuilder_DashbuilderRuntime.__computePropValue=d,$wnd_0.__gwt_activeModules["org.dashbuilder.DashbuilderRuntime"].bindings=org_dashbuilder_DashbuilderRuntime.__getPropMap,sendStats("bootstrap","selectingPermutation"),isHostedMode())return computeUrlForResource("org.dashbuilder.DashbuilderRuntime.devmode.js");try{r(["safari"],"3F44E3F54C570C251A1BD29F110EAC8B"),r(["gecko1_8"],"653DEE76ECEA3183D4B9FCA4C0C3AE5F");var i=(n=e[d("user.agent")]).indexOf(":");-1!=i&&(t=parseInt(n.substring(i+1),10),n=n.substring(0,i))}catch(e){}return org_dashbuilder_DashbuilderRuntime.__softPermutationId=t,computeUrlForResource(n+".cache.js")}function loadExternalStylesheets(){function e(e){if(!__gwt_stylesLoaded[e]){var t=$doc_0.createElement("link");t.setAttribute("rel","stylesheet"),t.setAttribute("href",computeUrlForResource(e)),$doc_0.getElementsByTagName("head")[0].appendChild(t),__gwt_stylesLoaded[e]=!0}}$wnd_0.__gwt_stylesLoaded||($wnd_0.__gwt_stylesLoaded={}),sendStats("loadExternalRefs","begin"),e("jquery-ui/jquery-ui.min.css"),e("bootstrap-daterangepicker/daterangepicker.css"),e("bootstrap-select/css/bootstrap-select.min.css"),e("uberfire-patternfly.css"),e("css/patternfly.min.css"),e("css/patternfly-additions.min.css"),e("css/bootstrap-datepicker3-1.6.4.min.cache.css"),e("css/bootstrap-switch-3.3.2.min.cache.css"),e("css/positioned-tabs-1.0.0.min.cache.css"),e("css/bootstrap-datetimepicker-2.4.4.min.cache.css"),e("css/bootstrap-slider-9.2.0.min.cache.css"),sendStats("loadExternalRefs","end")}activeModules["org.dashbuilder.DashbuilderRuntime"]={moduleName:"org.dashbuilder.DashbuilderRuntime"},org_dashbuilder_DashbuilderRuntime.__moduleStartupDone=function(e){var t=activeModules["org.dashbuilder.DashbuilderRuntime"].bindings;activeModules["org.dashbuilder.DashbuilderRuntime"].bindings=function(){for(var r=t?t():{},n=e[org_dashbuilder_DashbuilderRuntime.__softPermutationId],o=0;o<n.length;o++){var a=n[o];r[a[0]]=a[1]}return r}},org_dashbuilder_DashbuilderRuntime.__startLoadingFragment=function(e){return computeUrlForResource(e)},org_dashbuilder_DashbuilderRuntime.__installRunAsyncCode=function(e){var t=getInstallLocationDoc(),r=t.body,n=t.createElement("script");n.language="javascript",n.text=e,r.appendChild(n)},processMetas(),org_dashbuilder_DashbuilderRuntime.__moduleBase=computeScriptBase(),activeModules["org.dashbuilder.DashbuilderRuntime"].moduleBase=org_dashbuilder_DashbuilderRuntime.__moduleBase;var filename_0=getCompiledCodeFilename();if($wnd_0){var devModePermitted=!("http:"!=$wnd_0.location.protocol&&"file:"!=$wnd_0.location.protocol);function supportsSessionStorage(){var e="_gwt_dummy_";try{return $wnd_0.sessionStorage.setItem(e,e),$wnd_0.sessionStorage.removeItem(e),!0}catch(e){return!1}}if($wnd_0.__gwt_activeModules["org.dashbuilder.DashbuilderRuntime"].canRedirect=devModePermitted,devModePermitted&&supportsSessionStorage()){var devModeKey="__gwtDevModeHook:org.dashbuilder.DashbuilderRuntime",devModeUrl=$wnd_0.sessionStorage[devModeKey];if(/^http:\/\/(localhost|127\.0\.0\.1)(:\d+)?\/.*$/.test(devModeUrl)||(devModeUrl&&window.console&&console.log&&console.log("Ignoring non-whitelisted Dev Mode URL: "+devModeUrl),devModeUrl=""),devModeUrl&&!$wnd_0[devModeKey]){$wnd_0[devModeKey]=!0,$wnd_0[devModeKey+":moduleBase"]=computeScriptBase();var devModeScript=$doc_0.createElement("script");devModeScript.src=devModeUrl;var head=$doc_0.getElementsByTagName("head")[0];return head.insertBefore(devModeScript,head.firstElementChild||head.children[0]),!1}}}return loadExternalStylesheets(),sendStats("bootstrap","end"),installScript(filename_0),!0}org_dashbuilder_DashbuilderRuntime.succeeded=org_dashbuilder_DashbuilderRuntime();