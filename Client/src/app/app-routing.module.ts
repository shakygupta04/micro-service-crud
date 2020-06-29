import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddUserComponent } from './add-user/add-user.component';
import {NavigateComponent} from './navigate/navigate.component';
import { ViewUserComponent } from './view-user/view-user.component';
import { DeleteComponent } from './delete/delete.component';
import { UpdatebalComponent } from './updatebal/updatebal.component';



const routes: Routes = [
  {path: '',component: NavigateComponent},
    {path: 'adduser',component: AddUserComponent},
    {path:'viewuser',component: ViewUserComponent },
    {path:'deleteuser',component:DeleteComponent},
    {path:'updatebal',component:UpdatebalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
