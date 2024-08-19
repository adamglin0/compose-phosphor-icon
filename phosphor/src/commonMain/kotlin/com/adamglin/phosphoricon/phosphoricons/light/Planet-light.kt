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

public val LightGroup.`Planet-light`: ImageVector
    get() {
        if (`_planet-light` != null) {
            return `_planet-light`!!
        }
        `_planet-light` = Builder(name = "Planet-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.39f, 61.68f)
                curveToRelative(-7.24f, -12.48f, -27.0f, -15.0f, -57.24f, -7.49f)
                arcTo(93.92f, 93.92f, 0.0f, false, false, 34.05f, 128.0f)
                arcToRelative(94.5f, 94.5f, 0.0f, false, false, 0.9f, 13.0f)
                curveToRelative(-21.86f, 22.38f, -29.56f, 40.78f, -22.29f, 53.32f)
                curveToRelative(4.5f, 7.76f, 14.0f, 11.69f, 27.86f, 11.69f)
                arcToRelative(116.38f, 116.38f, 0.0f, false, false, 25.0f, -3.16f)
                curveToRelative(1.45f, -0.32f, 2.92f, -0.68f, 4.41f, -1.0f)
                arcToRelative(93.95f, 93.95f, 0.0f, false, false, 151.19f, -86.89f)
                curveToRelative(12.65f, -13.0f, 21.11f, -25.32f, 23.86f, -35.6f)
                curveTo(246.76f, 72.53f, 246.24f, 66.59f, 243.39f, 61.68f)
                close()
                moveTo(128.0f, 46.0f)
                arcToRelative(82.12f, 82.12f, 0.0f, false, true, 80.19f, 64.94f)
                curveToRelative(-16.0f, 15.3f, -38.14f, 31.67f, -63.3f, 46.12f)
                curveTo(117.49f, 172.82f, 92.79f, 183.0f, 72.85f, 188.6f)
                arcTo(82.0f, 82.0f, 0.0f, false, true, 128.0f, 46.0f)
                close()
                moveTo(23.0f, 188.3f)
                curveToRelative(-3.52f, -6.07f, 2.31f, -18.56f, 15.0f, -33.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, false, 21.07f, 36.62f)
                curveTo(39.42f, 195.74f, 26.39f, 194.08f, 23.0f, 188.3f)
                close()
                moveTo(128.0f, 210.0f)
                arcToRelative(81.41f, 81.41f, 0.0f, false, true, -43.35f, -12.45f)
                curveToRelative(20.68f, -6.71f, 43.56f, -17.06f, 66.22f, -30.08f)
                curveToRelative(22.83f, -13.12f, 43.13f, -27.67f, 59.05f, -41.91f)
                curveToRelative(0.0f, 0.81f, 0.06f, 1.62f, 0.06f, 2.44f)
                arcTo(82.08f, 82.08f, 0.0f, false, true, 128.0f, 210.0f)
                close()
                moveTo(233.35f, 76.21f)
                curveToRelative(-1.88f, 7.0f, -7.28f, 15.49f, -15.36f, 24.61f)
                arcToRelative(93.92f, 93.92f, 0.0f, false, false, -21.1f, -36.7f)
                curveToRelative(15.82f, -3.05f, 32.0f, -3.49f, 36.12f, 3.58f)
                curveTo(234.2f, 69.75f, 234.31f, 72.62f, 233.35f, 76.21f)
                close()
            }
        }
        .build()
        return `_planet-light`!!
    }

private var `_planet-light`: ImageVector? = null
