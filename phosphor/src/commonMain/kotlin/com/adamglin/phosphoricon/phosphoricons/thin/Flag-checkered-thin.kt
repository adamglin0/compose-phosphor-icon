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

public val ThinGroup.`Flag-checkered-thin`: ImageVector
    get() {
        if (`_flag-checkered-thin` != null) {
            return `_flag-checkered-thin`!!
        }
        `_flag-checkered-thin` = Builder(name = "Flag-checkered-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.66f, 52.44f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.28f, 0.61f)
                curveToRelative(-30.0f, 26.0f, -56.0f, 13.08f, -83.61f, -0.56f)
                curveToRelative(-28.7f, -14.2f, -58.38f, -28.88f, -92.39f, 0.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.38f, 3.0f)
                lineTo(44.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 177.87f)
                curveToRelative(29.41f, -24.39f, 55.08f, -11.69f, 82.23f, 1.74f)
                curveToRelative(28.7f, 14.19f, 58.38f, 28.88f, 92.39f, -0.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.38f, -3.0f)
                verticalLineToRelative(-120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 225.66f, 52.44f)
                close()
                moveTo(220.0f, 64.32f)
                lineTo(220.0f, 114.2f)
                curveToRelative(-16.91f, 14.0f, -32.58f, 15.79f, -48.0f, 12.2f)
                lineTo(172.0f, 74.67f)
                curveTo(187.24f, 77.9f, 203.09f, 76.37f, 220.0f, 64.32f)
                close()
                moveTo(164.0f, 72.55f)
                verticalLineToRelative(51.54f)
                curveToRelative(-8.7f, -3.0f, -17.39f, -7.25f, -26.23f, -11.62f)
                curveToRelative(-9.76f, -4.84f, -19.64f, -9.72f, -29.77f, -12.91f)
                lineTo(108.0f, 48.0f)
                curveToRelative(8.7f, 3.0f, 17.39f, 7.25f, 26.23f, 11.62f)
                curveTo(144.0f, 64.49f, 153.87f, 69.37f, 164.0f, 72.55f)
                close()
                moveTo(100.0f, 45.73f)
                lineTo(100.0f, 97.44f)
                curveToRelative(-15.24f, -3.23f, -31.09f, -1.69f, -48.0f, 10.37f)
                lineTo(52.0f, 57.93f)
                curveTo(68.91f, 43.9f, 84.58f, 42.15f, 100.0f, 45.73f)
                close()
                moveTo(52.0f, 167.78f)
                lineTo(52.0f, 117.9f)
                curveToRelative(16.91f, -14.0f, 32.58f, -15.79f, 48.0f, -12.2f)
                verticalLineToRelative(51.72f)
                arcTo(64.48f, 64.48f, 0.0f, false, false, 86.64f, 156.0f)
                curveTo(75.52f, 156.0f, 64.0f, 159.2f, 52.0f, 167.78f)
                close()
                moveTo(108.0f, 159.55f)
                lineTo(108.0f, 108.0f)
                curveToRelative(8.71f, 3.0f, 17.39f, 7.25f, 26.23f, 11.62f)
                curveToRelative(9.76f, 4.83f, 19.64f, 9.71f, 29.77f, 12.89f)
                verticalLineToRelative(51.54f)
                curveToRelative(-8.71f, -3.0f, -17.39f, -7.25f, -26.23f, -11.62f)
                curveTo(128.0f, 167.61f, 118.13f, 162.73f, 108.0f, 159.55f)
                close()
                moveTo(172.0f, 186.37f)
                lineTo(172.0f, 134.65f)
                arcToRelative(64.48f, 64.48f, 0.0f, false, false, 13.36f, 1.47f)
                curveToRelative(11.12f, 0.0f, 22.61f, -3.27f, 34.64f, -11.85f)
                verticalLineToRelative(49.9f)
                curveTo(203.09f, 188.19f, 187.42f, 190.0f, 172.0f, 186.37f)
                close()
            }
        }
        .build()
        return `_flag-checkered-thin`!!
    }

private var `_flag-checkered-thin`: ImageVector? = null
