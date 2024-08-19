package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`User-list-thin`: ImageVector
    get() {
        if (`_user-list-thin` != null) {
            return `_user-list-thin`!!
        }
        `_user-list-thin` = Builder(name = "User-list-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(160.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 80.0f)
                close()
                moveTo(248.0f, 124.0f)
                lineTo(160.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(248.0f, 172.0f)
                lineTo(184.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(147.87f, 191.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.87f, 4.87f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.0f, 0.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, -3.0f)
                curveToRelative(-6.71f, -26.08f, -32.0f, -45.0f, -60.13f, -45.0f)
                reflectiveCurveToRelative(-53.41f, 18.92f, -60.13f, 45.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.74f, -2.0f)
                curveToRelative(5.92f, -23.0f, 24.57f, -41.14f, 47.52f, -48.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 40.7f, 0.0f)
                curveTo(123.3f, 149.86f, 142.0f, 168.0f, 147.87f, 191.0f)
                close()
                moveTo(80.0f, 140.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 80.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_user-list-thin`!!
    }

private var `_user-list-thin`: ImageVector? = null
