package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`User-list-light`: ImageVector
    get() {
        if (`_user-list-light` != null) {
            return `_user-list-light`!!
        }
        `_user-list-light` = Builder(name = "User-list-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(160.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 154.0f, 80.0f)
                close()
                moveTo(248.0f, 122.0f)
                lineTo(160.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(248.0f, 170.0f)
                lineTo(184.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(149.81f, 190.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.62f, 3.0f)
                curveTo(131.7f, 168.29f, 107.23f, 150.0f, 80.0f, 150.0f)
                reflectiveCurveToRelative(-51.7f, 18.29f, -58.19f, 43.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.62f, -3.0f)
                curveToRelative(5.74f, -22.28f, 23.0f, -40.07f, 44.67f, -48.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, true, 50.28f, 0.0f)
                curveTo(126.79f, 150.43f, 144.08f, 168.22f, 149.81f, 190.5f)
                close()
                moveTo(80.0f, 138.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 80.0f, 138.0f)
                close()
            }
        }
        .build()
        return `_user-list-light`!!
    }

private var `_user-list-light`: ImageVector? = null
