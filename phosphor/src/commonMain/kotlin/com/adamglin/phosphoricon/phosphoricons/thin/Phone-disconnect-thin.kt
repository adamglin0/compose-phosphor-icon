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

public val ThinGroup.`Phone-disconnect-thin`: ImageVector
    get() {
        if (`_phone-disconnect-thin` != null) {
            return `_phone-disconnect-thin`!!
        }
        `_phone-disconnect-thin` = Builder(name = "Phone-disconnect-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.79f, 93.0f)
                curveTo(174.15f, 38.34f, 81.85f, 38.34f, 27.21f, 93.0f)
                curveTo(8.69f, 111.5f, 6.9f, 138.81f, 22.85f, 159.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.83f, 3.77f)
                lineToRelative(49.0f, -17.39f)
                lineToRelative(0.15f, -0.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.31f, -8.79f)
                lineToRelative(5.9f, -29.51f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 2.51f, -3.0f)
                arcToRelative(80.59f, 80.59f, 0.0f, false, true, 52.5f, -0.12f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.52f, 2.94f)
                lineTo(162.81f, 137.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.29f, 8.69f)
                lineToRelative(0.15f, 0.06f)
                lineToRelative(49.07f, 17.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.83f, -3.77f)
                curveTo(249.1f, 138.81f, 247.31f, 111.5f, 228.79f, 93.0f)
                close()
                moveTo(226.79f, 154.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.61f, 1.21f)
                lineToRelative(-0.15f, -0.06f)
                lineTo(173.0f, 138.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.37f, -2.87f)
                lineToRelative(-6.21f, -29.75f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.75f, -8.87f)
                arcToRelative(88.63f, 88.63f, 0.0f, false, false, -57.74f, 0.14f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.72f, 9.0f)
                lineToRelative(-5.9f, 29.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 83.0f, 138.26f)
                lineToRelative(-49.0f, 17.38f)
                lineToRelative(-0.15f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.61f, -1.21f)
                curveToRelative(-13.42f, -17.3f, -11.9f, -40.26f, 3.69f, -55.85f)
                curveTo(58.65f, 72.85f, 93.33f, 60.0f, 128.0f, 60.0f)
                reflectiveCurveToRelative(69.35f, 12.89f, 95.13f, 38.68f)
                curveTo(238.71f, 114.23f, 240.24f, 137.19f, 226.82f, 154.49f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_phone-disconnect-thin`!!
    }

private var `_phone-disconnect-thin`: ImageVector? = null
