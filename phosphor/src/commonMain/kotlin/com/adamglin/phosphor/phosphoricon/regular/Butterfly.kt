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

public val RegularGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.7f, 50.48f)
                curveTo(229.0f, 45.7f, 221.84f, 40.0f, 209.0f, 40.0f)
                curveToRelative(-16.85f, 0.0f, -38.46f, 11.28f, -57.81f, 30.16f)
                arcTo(140.07f, 140.07f, 0.0f, false, false, 136.0f, 87.53f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(87.53f)
                arcToRelative(140.07f, 140.07f, 0.0f, false, false, -15.15f, -17.37f)
                curveTo(85.49f, 51.28f, 63.88f, 40.0f, 47.0f, 40.0f)
                curveTo(34.16f, 40.0f, 27.0f, 45.7f, 23.3f, 50.48f)
                curveToRelative(-6.82f, 8.77f, -12.18f, 24.08f, -0.21f, 71.2f)
                curveToRelative(6.05f, 23.83f, 19.51f, 33.0f, 30.63f, 36.42f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 205.27f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 74.28f, -47.17f)
                curveToRelative(11.12f, -3.4f, 24.57f, -12.59f, 30.63f, -36.42f)
                curveTo(239.63f, 95.24f, 244.85f, 66.1f, 232.7f, 50.48f)
                close()
                moveTo(92.0f, 208.0f)
                arcTo(28.12f, 28.12f, 0.0f, false, true, 88.86f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -1.76f, -15.9f)
                arcTo(43.64f, 43.64f, 0.0f, false, false, 66.36f, 144.0f)
                curveToRelative(-8.43f, 0.09f, -22.0f, -3.57f, -27.76f, -26.26f)
                curveTo(35.72f, 106.39f, 27.0f, 71.86f, 35.94f, 60.3f)
                curveTo(37.37f, 58.46f, 40.09f, 56.0f, 47.0f, 56.0f)
                curveToRelative(27.27f, 0.0f, 73.0f, 44.88f, 73.0f, 71.67f)
                verticalLineTo(180.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 92.0f, 208.0f)
                close()
                moveTo(217.4f, 117.74f)
                curveToRelative(-5.77f, 22.69f, -19.33f, 26.34f, -27.77f, 26.26f)
                arcToRelative(43.6f, 43.6f, 0.0f, false, false, -20.74f, -7.95f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -1.76f, 15.9f)
                arcTo(28.11f, 28.11f, 0.0f, true, true, 136.0f, 180.0f)
                verticalLineTo(127.67f)
                curveTo(136.0f, 100.88f, 181.69f, 56.0f, 209.0f, 56.0f)
                curveToRelative(6.95f, 0.0f, 9.66f, 2.46f, 11.1f, 4.3f)
                curveTo(229.05f, 71.86f, 220.28f, 106.39f, 217.4f, 117.74f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
