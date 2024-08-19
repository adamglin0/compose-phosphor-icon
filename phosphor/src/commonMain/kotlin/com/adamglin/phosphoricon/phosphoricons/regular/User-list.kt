package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`User-list`: ImageVector
    get() {
        if (`_user-list` != null) {
            return `_user-list`!!
        }
        `_user-list` = Builder(name = "User-list", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(160.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 80.0f)
                close()
                moveTo(248.0f, 120.0f)
                lineTo(160.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 168.0f)
                lineTo(184.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(151.75f, 190.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.76f, 9.74f)
                arcToRelative(7.55f, 7.55f, 0.0f, false, true, -2.0f, 0.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.75f, -6.0f)
                curveToRelative(-6.16f, -23.94f, -30.34f, -42.0f, -56.25f, -42.0f)
                reflectiveCurveToRelative(-50.09f, 18.05f, -56.25f, 42.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.5f, -4.0f)
                curveToRelative(5.59f, -21.71f, 21.84f, -39.29f, 42.46f, -48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 58.58f, 0.0f)
                curveTo(129.91f, 150.71f, 146.16f, 168.29f, 151.75f, 190.0f)
                close()
                moveTo(80.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 80.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_user-list`!!
    }

private var `_user-list`: ImageVector? = null
