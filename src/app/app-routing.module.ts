import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegisterComponent } from './user/register/register.component';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { AddUserComponent } from './add-user/add-user.component';
import { LoginComponent } from './login/login.component';
import { UpdateUserComponent } from './user/update-user/update-user.component';
import { PipesComponent } from './pipes/pipes/pipes.component';
import { AdminComponent } from './admin/admin.component';
import { ImportComponent } from './import/import.component';
import { AddnewcompanyComponent } from './addnewcompany/addnewcompany.component';


const routes: Routes = [
  {path:'register',component:RegisterComponent},
  {path:'users',component: UsersComponent},
  {path:'add-user',component: AddUserComponent},
  {path:'login',component: LoginComponent},
  {path:'update-user',component:UpdateUserComponent},
  {path:'admin',component:AdminComponent},
  {path:'import',component:ImportComponent},
  {path:'addnewcompany',component:AddnewcompanyComponent},
  // {path:'pipes',component:PipesComponent},

  {path:'**',component: HomeComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
