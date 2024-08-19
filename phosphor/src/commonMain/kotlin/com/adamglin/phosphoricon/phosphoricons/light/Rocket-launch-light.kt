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

public val LightGroup.`Rocket-launch-light`: ImageVector
    get() {
        if (`_rocket-launch-light` != null) {
            return `_rocket-launch-light`!!
        }
        `_rocket-launch-light` = Builder(name = "Rocket-launch-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.86f, 47.24f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.11f, -13.1f)
                curveToRelative(-12.31f, -0.73f, -43.77f, 0.39f, -69.88f, 26.5f)
                lineTo(133.52f, 66.0f)
                lineTo(74.35f, 66.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -9.89f, 4.1f)
                lineTo(30.11f, 104.44f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.94f, 23.76f)
                lineToRelative(39.13f, 5.46f)
                lineToRelative(45.16f, 45.16f)
                lineTo(127.8f, 218.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 23.76f, 7.92f)
                lineToRelative(34.35f, -34.35f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, 4.1f, -9.89f)
                lineTo(190.01f, 122.48f)
                lineToRelative(5.35f, -5.35f)
                horizontalLineToRelative(0.0f)
                curveTo(221.46f, 91.0f, 222.59f, 59.56f, 221.86f, 47.24f)
                close()
                moveTo(38.11f, 115.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.49f, -2.0f)
                lineTo(72.94f, 78.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 74.35f, 78.0f)
                horizontalLineToRelative(47.17f)
                lineTo(77.87f, 121.64f)
                lineToRelative(-38.14f, -5.32f)
                arcTo(1.93f, 1.93f, 0.0f, false, true, 38.11f, 115.0f)
                close()
                moveTo(178.0f, 181.65f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.59f, 1.41f)
                lineTo(143.08f, 217.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.4f, -1.11f)
                lineToRelative(-5.32f, -38.16f)
                lineTo(178.0f, 134.48f)
                close()
                moveTo(186.87f, 108.65f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 167.51f)
                lineTo(88.49f, 128.0f)
                lineToRelative(58.87f, -58.88f)
                arcToRelative(78.47f, 78.47f, 0.0f, false, true, 60.69f, -23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 209.88f, 48.0f)
                arcTo(78.47f, 78.47f, 0.0f, false, true, 186.88f, 108.64f)
                close()
                moveTo(100.0f, 190.31f)
                curveTo(95.68f, 199.84f, 81.13f, 222.0f, 40.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                curveToRelative(0.0f, -41.13f, 22.16f, -55.68f, 31.69f, -60.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.0f, 10.92f)
                curveToRelative(-7.0f, 3.17f, -22.53f, 13.52f, -24.47f, 42.91f)
                curveToRelative(29.39f, -1.94f, 39.74f, -17.52f, 42.91f, -24.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.92f, 5.0f)
                close()
            }
        }
        .build()
        return `_rocket-launch-light`!!
    }

private var `_rocket-launch-light`: ImageVector? = null
