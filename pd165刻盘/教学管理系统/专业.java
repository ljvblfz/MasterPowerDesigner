/***********************************************************************
 * Module:  专业.java
 * Author:  coco
 * Purpose: Defines the Class 专业
 ***********************************************************************/

import java.util.*;

/** @pdOid 57a05f3d-9946-41aa-ba19-6caa816ebf83 */
public class 专业 {
   /** @pdOid 4b748c9f-d05f-4ea7-9783-1be6f8006e1b */
   public java.lang.String 专业代号;
   /** @pdOid 1d0e909e-0d48-483f-a064-e90be0f0f7a6 */
   public java.lang.String 专业名称;
   
   /** @pdRoleInfo migr=no name=班级 assc=专业班级 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<班级> 班级;
   /** @pdRoleInfo migr=no name=开课计划 assc=专业开课计划 mult=0..1 */
   public 开课计划 开课计划;
   /** @pdRoleInfo migr=no name=系部 assc=系部专业 mult=1..1 side=A */
   public 系部 系部;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<班级> get班级() {
      if (班级 == null)
         班级 = new java.util.HashSet<班级>();
      return 班级;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator班级() {
      if (班级 == null)
         班级 = new java.util.HashSet<班级>();
      return 班级.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new班级 */
   public void set班级(java.util.Collection<班级> new班级) {
      removeAll班级();
      for (java.util.Iterator iter = new班级.iterator(); iter.hasNext();)
         add班级((班级)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new班级 */
   public void add班级(班级 new班级) {
      if (new班级 == null)
         return;
      if (this.班级 == null)
         this.班级 = new java.util.HashSet<班级>();
      if (!this.班级.contains(new班级))
      {
         this.班级.add(new班级);
         new班级.set专业(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old班级 */
   public void remove班级(班级 old班级) {
      if (old班级 == null)
         return;
      if (this.班级 != null)
         if (this.班级.contains(old班级))
         {
            this.班级.remove(old班级);
            old班级.set专业((专业)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll班级() {
      if (班级 != null)
      {
         班级 old班级;
         for (java.util.Iterator iter = getIterator班级(); iter.hasNext();)
         {
            old班级 = (班级)iter.next();
            iter.remove();
            old班级.set专业((专业)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 系部 get系部() {
      return 系部;
   }
   
   /** @pdGenerated default parent setter
     * @param new系部 */
   public void set系部(系部 new系部) {
      if (this.系部 == null || !this.系部.equals(new系部))
      {
         if (this.系部 != null)
         {
            系部 old系部 = this.系部;
            this.系部 = null;
            old系部.remove专业(this);
         }
         if (new系部 != null)
         {
            this.系部 = new系部;
            this.系部.add专业(this);
         }
      }
   }

}