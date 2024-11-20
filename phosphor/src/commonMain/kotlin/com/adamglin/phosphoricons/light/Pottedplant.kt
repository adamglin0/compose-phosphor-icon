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

public val LightGroup.PottedPlant: ImageVector
    get() {
        if (_pottedPlant != null) {
            return _pottedPlant!!
        }
        _pottedPlant = Builder(name = "PottedPlant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.24f, 140.24f)
                horizontalLineToRelative(0.0f)
                lineToRelative(21.09f, -21.09f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, 26.49f, 6.79f)
                arcTo(47.55f, 47.55f, 0.0f, false, false, 196.67f, 119.0f)
                curveToRelative(23.07f, -14.0f, 35.42f, -46.53f, 33.0f, -87.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, -5.64f)
                curveToRelative(-40.56f, -2.38f, -73.12f, 10.0f, -87.09f, 33.0f)
                curveToRelative(-9.22f, 15.22f, -9.2f, 33.71f, -0.14f, 51.35f)
                lineTo(120.0f, 127.51f)
                lineToRelative(-14.64f, -14.63f)
                curveToRelative(6.32f, -13.0f, 6.15f, -26.6f, -0.67f, -37.86f)
                curveTo(94.21f, 57.72f, 70.0f, 48.44f, 39.85f, 50.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, 5.64f)
                curveTo(32.44f, 86.0f, 41.72f, 110.2f, 59.0f, 120.69f)
                arcTo(36.23f, 36.23f, 0.0f, false, false, 78.0f, 126.0f)
                arcToRelative(43.4f, 43.4f, 0.0f, false, false, 18.93f, -4.6f)
                lineTo(111.51f, 136.0f)
                lineToRelative(-10.0f, 10.0f)
                lineTo(56.0f, 146.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(67.18f, 158.0f)
                lineToRelative(13.57f, 61.0f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, 13.67f, 11.0f)
                horizontalLineToRelative(67.17f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, 13.66f, -11.0f)
                lineToRelative(13.57f, -61.0f)
                lineTo(200.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(118.48f, 146.0f)
                lineToRelative(5.76f, -5.76f)
                close()
                moveTo(147.24f, 65.54f)
                curveToRelative(11.0f, -18.22f, 37.24f, -28.33f, 70.72f, -27.5f)
                curveToRelative(0.83f, 33.47f, -9.28f, 59.68f, -27.5f, 70.72f)
                curveToRelative(-12.3f, 7.44f, -27.09f, 6.92f, -41.79f, -1.43f)
                curveTo(140.31f, 92.63f, 139.79f, 77.84f, 147.24f, 65.54f)
                close()
                moveTo(93.58f, 109.54f)
                curveToRelative(-10.0f, 5.56f, -20.0f, 5.87f, -28.34f, 0.84f)
                curveTo(52.78f, 102.87f, 45.75f, 85.0f, 46.0f, 62.0f)
                curveToRelative(23.0f, -0.29f, 40.88f, 6.78f, 48.42f, 19.24f)
                curveTo(99.45f, 89.54f, 99.14f, 99.56f, 93.58f, 109.58f)
                close()
                moveTo(176.52f, 158.0f)
                lineToRelative(-13.0f, 58.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.95f, 1.57f)
                lineTo(94.42f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.57f)
                lineTo(79.48f, 158.0f)
                close()
            }
        }
        .build()
        return _pottedPlant!!
    }

private var _pottedPlant: ImageVector? = null
