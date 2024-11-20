package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.1f, 51.71f)
                curveTo(226.09f, 45.27f, 218.64f, 42.0f, 209.0f, 42.0f)
                curveToRelative(-16.33f, 0.0f, -37.41f, 11.06f, -56.4f, 29.59f)
                arcTo(132.0f, 132.0f, 0.0f, false, false, 134.0f, 93.94f)
                lineTo(134.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(122.0f, 93.94f)
                arcToRelative(132.0f, 132.0f, 0.0f, false, false, -18.54f, -22.35f)
                curveTo(84.49f, 53.06f, 63.4f, 42.0f, 47.07f, 42.0f)
                curveToRelative(-9.69f, 0.0f, -17.14f, 3.27f, -22.15f, 9.71f)
                curveToRelative(-5.53f, 7.11f, -7.71f, 17.69f, -6.66f, 32.34f)
                curveToRelative(0.91f, 12.73f, 4.12f, 26.53f, 6.81f, 37.13f)
                curveToRelative(6.28f, 24.74f, 20.77f, 33.0f, 31.78f, 35.68f)
                arcTo(42.0f, 42.0f, 0.0f, true, false, 128.0f, 201.62f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 71.16f, -44.76f)
                curveToRelative(11.0f, -2.63f, 25.5f, -10.94f, 31.78f, -35.68f)
                curveTo(237.55f, 95.21f, 242.72f, 66.65f, 231.1f, 51.71f)
                close()
                moveTo(92.0f, 210.0f)
                arcToRelative(30.12f, 30.12f, 0.0f, false, true, -3.34f, -60.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 87.35f, 138.0f)
                arcToRelative(41.71f, 41.71f, 0.0f, false, false, -20.28f, 8.0f)
                curveToRelative(-9.0f, 0.31f, -24.12f, -3.16f, -30.37f, -27.76f)
                curveToRelative(-3.25f, -12.81f, -11.89f, -46.83f, -2.31f, -59.15f)
                curveTo(37.05f, 55.66f, 41.2f, 54.0f, 47.07f, 54.0f)
                curveToRelative(12.88f, 0.0f, 31.72f, 10.28f, 48.0f, 26.18f)
                curveTo(111.69f, 96.39f, 122.0f, 114.59f, 122.0f, 127.67f)
                lineTo(122.0f, 180.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 92.0f, 210.0f)
                close()
                moveTo(219.31f, 118.23f)
                curveTo(213.07f, 142.83f, 198.0f, 146.29f, 189.0f, 146.0f)
                arcToRelative(41.62f, 41.62f, 0.0f, false, false, -20.28f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 167.36f, 150.0f)
                arcTo(30.11f, 30.11f, 0.0f, true, true, 134.0f, 180.0f)
                lineTo(134.0f, 127.67f)
                curveToRelative(0.0f, -13.08f, 10.32f, -31.28f, 26.93f, -47.49f)
                curveTo(177.23f, 64.28f, 196.07f, 54.0f, 209.0f, 54.0f)
                curveToRelative(5.87f, 0.0f, 10.0f, 1.66f, 12.68f, 5.08f)
                curveTo(231.21f, 71.4f, 222.57f, 105.42f, 219.32f, 118.23f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
