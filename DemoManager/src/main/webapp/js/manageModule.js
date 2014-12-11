'use strict';

var commonModule = angular.module('DOMManageModule', [ 'ngCookies', 'DOMCommonModule','DOMMemberModule','DOMCareerModule' ])
.factory('httpInterceptor', ['$q', '$cookies', function($q, $cookies) {
	return {
		'request' : function(config) {
			// do something on success
			config.headers[$('meta[name=_csrf_header]').attr('content')] = $('meta[name=_csrf]').attr('content');
			return config;
		}
	};
}])
.config(['$httpProvider', function($httpProvider){
	$httpProvider.interceptors.push('httpInterceptor');
}])
.directive('getLength', function() {
	return {
		template : 'Name: Address: test'
	};
});


/*
 * .config(function(injectables) { // provider-injector // This is an example of
 * config block. // You can have as many of these as you want. // You can only
 * inject Providers (not instances) // into config blocks.
 * }).run(function(injectables) { // instance-injector // This is an example of
 * a run block. // You can have as many of these as you want. // You can only
 * inject instances (not Providers) // into run blocks })
 */
/*
 * angular.module('myModule', []). value('a', 123). factory('a', function() {
 * return 123; }). directive('directiveName', ...). filter('filterName', ...); //
 * is same as
 * 
 * angular.module('myModule', []). config(function($provide, $compileProvider,
 * $filterProvider) { $provide.value('a', 123); $provide.factory('a', function() {
 * return 123; }); $compileProvider.directive('directiveName', ...);
 * $filterProvider.register('filterName', ...); });
 */
