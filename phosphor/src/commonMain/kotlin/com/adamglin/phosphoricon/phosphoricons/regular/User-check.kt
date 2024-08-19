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

public val RegularGroup.`User-check`: ImageVector
    get() {
        if (`_user-check` != null) {
            return `_user-check`!!
        }
        `_user-check` = Builder(name = "User-check", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 157.68f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -71.9f, 0.0f)
                curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.25f, 10.3f)
                curveTo(50.25f, 181.19f, 77.91f, 168.0f, 108.0f, 168.0f)
                reflectiveCurveToRelative(57.75f, 13.19f, 77.87f, 37.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.25f, -10.3f)
                curveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f)
                close()
                moveTo(56.0f, 100.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 56.0f, 100.0f)
                close()
                moveTo(253.66f, 133.66f)
                lineTo(221.66f, 165.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(216.0f, 148.69f)
                lineToRelative(26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return `_user-check`!!
    }

private var `_user-check`: ImageVector? = null
