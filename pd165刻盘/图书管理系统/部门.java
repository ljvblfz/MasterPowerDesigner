/***********************************************************************
 * Module:  部门.java
 * Author:  Administrator
 * Purpose: Defines the Class 部门
 ***********************************************************************/

import java.util.*;

/** @pdOid c0fd5013-cc93-491b-b4cf-631146cb0520 */
public class 部门 {
   /** @pdOid eced6bb8-9cb3-4994-b30d-b948b1e6e790 */
   public java.lang.String 部门编号;
   /** @pdOid c06fe6b4-fbf0-4c31-9fd6-32433de9db0a */
   public java.lang.String 部门名称;
   /** @pdOid 395e9912-d940-4eed-bdf7-722b73de0cf6 */
   public java.lang.String 办公地点;
   /** @pdOid ec588e51-d689-4861-b70a-50541f4078da */
   public java.lang.String 部门电话;
   
   /** @pdRoleInfo migr=no name=教师 assc=部门教师 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<教师> 教师;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<教师> get教师() {
      if (教师 == null)
         教师 = new java.util.HashSet<教师>();
      return 教师;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator教师() {
      if (教师 == null)
         教师 = new java.util.HashSet<教师>();
      return 教师.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new教师 */
   public void set教师(java.util.Collection<教师> new教师) {
      removeAll教师();
      for (java.util.Iterator iter = new教师.iterator(); iter.hasNext();)
         add教师((教师)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new教师 */
   public void add教师(教师 new教师) {
      if (new教师 == null)
         return;
      if (this.教师 == null)
         this.教师 = new java.util.HashSet<教师>();
      if (!this.教师.contains(new教师))
      {
         this.教师.add(new教师);
         new教师.set部门(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old教师 */
   public void remove教师(教师 old教师) {
      if (old教师 == null)
         return;
      if (this.教师 != null)
         if (this.教师.contains(old教师))
         {
            this.教师.remove(old教师);
            old教师.set部门((部门)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll教师() {
      if (教师 != null)
      {
         教师 old教师;
         for (java.util.Iterator iter = getIterator教师(); iter.hasNext();)
         {
            old教师 = (教师)iter.next();
            iter.remove();
            old教师.set部门((部门)null);
         }
      }
   }

}