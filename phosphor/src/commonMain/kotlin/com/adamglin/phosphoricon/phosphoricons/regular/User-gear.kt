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

public val RegularGroup.`User-gear`: ImageVector
    get() {
        if (`_user-gear` != null) {
            return `_user-gear`!!
        }
        `_user-gear` = Builder(name = "User-gear", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 157.68f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -71.9f, 0.0f)
                curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.24f, 10.3f)
                curveTo(50.25f, 181.19f, 77.91f, 168.0f, 108.0f, 168.0f)
                reflectiveCurveToRelative(57.75f, 13.19f, 77.87f, 37.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.26f, -10.3f)
                curveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f)
                close()
                moveTo(56.0f, 100.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 56.0f, 100.0f)
                close()
                moveTo(252.25f, 143.07f)
                lineTo(247.59f, 140.38f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, -8.76f)
                lineToRelative(4.66f, -2.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -13.86f)
                lineToRelative(-4.67f, 2.7f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, -7.58f, -4.39f)
                lineTo(232.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(5.38f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, -7.58f, 4.39f)
                lineToRelative(-4.67f, -2.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 13.86f)
                lineToRelative(4.66f, 2.69f)
                arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, 8.76f)
                lineToRelative(-4.66f, 2.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 13.86f)
                lineToRelative(4.67f, -2.7f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.58f, 4.39f)
                lineTo(216.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-5.38f)
                arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.58f, -4.39f)
                lineToRelative(4.67f, 2.7f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, 1.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -14.93f)
                close()
                moveTo(216.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 136.0f)
                close()
            }
        }
        .build()
        return `_user-gear`!!
    }

private var `_user-gear`: ImageVector? = null
