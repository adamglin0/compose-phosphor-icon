package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Rocket-launch`: ImageVector
    get() {
        if (`_rocket-launch` != null) {
            return `_rocket-launch`!!
        }
        `_rocket-launch` = Builder(name = "Rocket-launch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.85f, 47.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.0f, -15.0f)
                curveToRelative(-12.58f, -0.75f, -44.73f, 0.4f, -71.41f, 27.07f)
                lineTo(132.69f, 64.0f)
                lineTo(74.36f, 64.0f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 63.0f, 68.68f)
                lineTo(28.7f, 103.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.07f, 27.16f)
                lineToRelative(38.47f, 5.37f)
                lineToRelative(44.21f, 44.21f)
                lineToRelative(5.37f, 38.49f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 10.78f, 12.92f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, 5.1f, 0.83f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 153.0f, 227.3f)
                lineTo(187.32f, 193.0f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 192.0f, 181.64f)
                lineTo(192.0f, 123.31f)
                lineToRelative(4.77f, -4.77f)
                curveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f)
                close()
                moveTo(74.36f, 80.0f)
                horizontalLineToRelative(42.33f)
                lineTo(77.16f, 119.52f)
                lineTo(40.0f, 114.34f)
                close()
                moveTo(148.77f, 70.55f)
                arcToRelative(76.65f, 76.65f, 0.0f, false, true, 59.11f, -22.47f)
                arcToRelative(76.46f, 76.46f, 0.0f, false, true, -22.42f, 59.16f)
                lineTo(128.0f, 164.68f)
                lineTo(91.32f, 128.0f)
                close()
                moveTo(176.0f, 181.64f)
                lineTo(141.67f, 216.0f)
                lineToRelative(-5.19f, -37.17f)
                lineTo(176.0f, 139.31f)
                close()
                moveTo(101.84f, 191.14f)
                curveTo(97.34f, 201.0f, 82.29f, 224.0f, 40.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -42.29f, 23.0f, -57.34f, 32.86f, -61.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.64f, 14.56f)
                curveToRelative(-6.43f, 2.93f, -20.62f, 12.36f, -23.12f, 38.91f)
                curveToRelative(26.55f, -2.5f, 36.0f, -16.69f, 38.91f, -23.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.56f, 6.64f)
                close()
            }
        }
        .build()
        return `_rocket-launch`!!
    }

private var `_rocket-launch`: ImageVector? = null
