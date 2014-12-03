<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--
<div ng-init="friends = [
  {name:'John', age:25, gender:'boy'},
  {name:'Jessie', age:30, gender:'girl'},
  {name:'Johanna', age:28, gender:'girl'},
  {name:'Joy', age:15, gender:'girl'},
  {name:'Mary', age:28, gender:'girl'},
  {name:'Peter', age:95, gender:'boy'},
  {name:'Sebastian', age:50, gender:'boy'},
  {name:'Erika', age:27, gender:'girl'},
  {name:'Patrick', age:40, gender:'boy'},
  {name:'Samantha', age:60, gender:'girl'}
]">
  I have {{friends.length}} friends. They are:
  <input type="search" ng-model="q" placeholder="filter friends..." />
  <ul class="example-animate-container">
    <li class="animate-repeat" ng-repeat="friend in friends | filter:q as results">
      [{{$index + 1}}] {{friend.name}} who is {{friend.age}} years old.
    </li>
    <li class="animate-repeat" ng-if="results.length == 0">
      <strong>No results found...</strong>
    </li>
  </ul>
</div>
-->
<div class="panel-group" id="accordion">
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Collapsible Left Menu 1</a></h4>
		</div>
		<div id="collapse1" class="panel-collapse collapse in">
			<div class="panel-body">
				<div class="btn-group-vertical">
					<button type="button" class="btn btn-default">Left SubMenu 1-1</button>
					<button type="button" class="btn btn-default">Left SubMenu 1-2</button>
					<button type="button" class="btn btn-default">Left SubMenu 1-3</button>
				</div>
			</div>
		</div>
	</div>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Collapsible Left Menu 2</a></h4>
		</div>
		<div id="collapse2" class="panel-collapse collapse">
			<div class="panel-body">
				<div class="btn-group-vertical">
					<button type="button" class="btn btn-default">Left SubMenu 2-1</button>
					<button type="button" class="btn btn-default">Left SubMenu 2-2</button>
					<button type="button" class="btn btn-default">Left SubMenu 2-3</button>
				</div>
			</div>
		</div>
	</div>
	<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title"><a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Collapsible Left Menu 3</a></h4>
		</div>
		<div id="collapse3" class="panel-collapse collapse">
			<div class="panel-body">
				<div class="btn-group-vertical">
					<button type="button" class="btn btn-default">Left SubMenu 3-1</button>
					<button type="button" class="btn btn-default">Left SubMenu 3-2</button>
					<button type="button" class="btn btn-default">Left SubMenu 3-3</button>
				</div>
			</div>
		</div>
	</div>
</div>
