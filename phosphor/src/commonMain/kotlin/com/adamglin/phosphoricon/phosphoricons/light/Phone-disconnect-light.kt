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

public val LightGroup.`Phone-disconnect-light`: ImageVector
    get() {
        if (`_phone-disconnect-light` != null) {
            return `_phone-disconnect-light`!!
        }
        `_phone-disconnect-light` = Builder(name = "Phone-disconnect-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.19f, 91.55f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-55.39f, -55.4f, -149.0f, -55.4f, -204.38f, 0.0f)
                curveTo(6.56f, 110.82f, 4.7f, 139.22f, 21.29f, 160.61f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 37.39f, 165.0f)
                lineToRelative(49.0f, -17.38f)
                lineToRelative(0.22f, -0.09f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 8.53f, -10.25f)
                lineToRelative(5.9f, -29.52f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.21f, -1.47f)
                arcToRelative(78.53f, 78.53f, 0.0f, false, true, 51.18f, -0.11f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, 1.22f, 1.45f)
                lineToRelative(6.21f, 29.75f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.5f, 10.14f)
                lineToRelative(0.23f, 0.08f)
                lineToRelative(49.0f, 17.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.1f, -4.42f)
                curveTo(251.3f, 139.22f, 249.44f, 110.82f, 230.19f, 91.55f)
                close()
                moveTo(225.19f, 153.26f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.29f, 0.58f)
                lineToRelative(-0.22f, -0.09f)
                lineToRelative(-49.0f, -17.38f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 172.6f, 135.0f)
                lineToRelative(-6.22f, -29.74f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.06f, -10.35f)
                arcToRelative(90.53f, 90.53f, 0.0f, false, false, -59.0f, 0.13f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.0f, 10.45f)
                lineTo(83.37f, 135.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.15f, 1.44f)
                lineTo(33.28f, 153.75f)
                lineToRelative(-0.22f, 0.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.29f, -0.58f)
                curveToRelative(-13.0f, -16.74f, -11.56f, -38.12f, 3.53f, -53.22f)
                curveToRelative(25.39f, -25.4f, 59.55f, -38.1f, 93.7f, -38.1f)
                reflectiveCurveToRelative(68.31f, 12.7f, 93.7f, 38.1f)
                curveTo(236.79f, 115.14f, 238.21f, 136.52f, 225.23f, 153.26f)
                close()
                moveTo(222.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 194.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_phone-disconnect-light`!!
    }

private var `_phone-disconnect-light`: ImageVector? = null
