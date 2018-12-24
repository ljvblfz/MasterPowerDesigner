/***********************************************************************
 * Module:  读者类别.java
 * Author:  Administrator
 * Purpose: Defines the Class 读者类别
 ***********************************************************************/

import java.util.*;

/** @pdOid 169f9df5-5228-491c-9d1a-67678cf2f162 */
public class 读者类别 {
   /** @pdOid 53db5cfe-dd8d-444f-ba6b-55455c97d166 */
   public double 读者类别编号;
   /** @pdOid 058ecbf8-69d1-4db1-a88e-53da65b639eb */
   public java.lang.String 读者类别名称;
   /** @pdOid 2de15eb9-dfd6-4f24-a726-580f8153e7a8 */
   public double 借书数量限额;
   /** @pdOid 25a5e287-ff0e-4e0c-b9f2-217e8adb0079 */
   public double 借书期限;
   /** @pdOid 3388932f-931f-44f1-8987-0672896f1c27 */
   public double 续借次数;
   
   /** @pdRoleInfo migr=no name=读者 assc=读者8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<读者> 读者;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<读者> get读者() {
      if (读者 == null)
         读者 = new java.util.HashSet<读者>();
      return 读者;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator读者() {
      if (读者 == null)
         读者 = new java.util.HashSet<读者>();
      return 读者.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new读者 */
   public void set读者(java.util.Collection<读者> new读者) {
      removeAll读者();
      for (java.util.Iterator iter = new读者.iterator(); iter.hasNext();)
         add读者((读者)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new读者 */
   public void add读者(读者 new读者) {
      if (new读者 == null)
         return;
      if (this.读者 == null)
         this.读者 = new java.util.HashSet<读者>();
      if (!this.读者.contains(new读者))
      {
         this.读者.add(new读者);
         new读者.set读者类别(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old读者 */
   public void remove读者(读者 old读者) {
      if (old读者 == null)
         return;
      if (this.读者 != null)
         if (this.读者.contains(old读者))
         {
            this.读者.remove(old读者);
            old读者.set读者类别((读者类别)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll读者() {
      if (读者 != null)
      {
         读者 old读者;
         for (java.util.Iterator iter = getIterator读者(); iter.hasNext();)
         {
            old读者 = (读者)iter.next();
            iter.remove();
            old读者.set读者类别((读者类别)null);
         }
      }
   }

}