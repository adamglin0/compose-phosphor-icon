package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 172.0f)
                horizontalLineTo(57.32f)
                curveToRelative(4.0f, -7.83f, 8.18f, -16.11f, 12.21f, -24.56f)
                curveToRelative(15.14f, 3.55f, 34.13f, -8.06f, 56.54f, -34.59f)
                curveToRelative(3.67f, 12.5f, 12.53f, 34.83f, 29.08f, 35.15f)
                horizontalLineToRelative(0.35f)
                curveToRelative(8.71f, 0.0f, 17.64f, -6.25f, 27.16f, -19.06f)
                curveTo(187.17f, 137.14f, 199.31f, 148.0f, 232.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                curveToRelative(-42.88f, 0.0f, -44.0f, -19.24f, -44.0f, -20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.35f, -2.18f)
                curveTo(168.74f, 136.1f, 160.42f, 140.0f, 155.48f, 140.0f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-13.0f, -0.25f, -21.29f, -26.52f, -23.38f, -36.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.0f, -1.69f)
                curveToRelative(-20.94f, 26.27f, -39.06f, 39.55f, -51.8f, 38.2f)
                curveTo(97.31f, 87.5f, 105.19f, 53.16f, 96.49f, 37.77f)
                curveTo(94.0f, 33.31f, 88.7f, 28.0f, 77.91f, 28.0f)
                curveTo(64.09f, 28.0f, 52.54f, 42.41f, 47.0f, 66.54f)
                arcTo(122.7f, 122.7f, 0.0f, false, false, 45.46f, 113.0f)
                curveToRelative(2.64f, 15.29f, 8.39f, 26.05f, 16.69f, 31.35f)
                curveToRelative(-4.58f, 9.6f, -9.3f, 19.0f, -13.84f, 27.68f)
                horizontalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(44.1f)
                curveToRelative(-12.87f, 24.17f, -23.37f, 41.68f, -23.53f, 41.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.37f, 5.49f)
                arcTo(3.93f, 3.93f, 0.0f, false, false, 24.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.43f, -1.94f)
                curveToRelative(0.16f, -0.27f, 11.85f, -19.75f, 25.72f, -46.06f)
                horizontalLineTo(232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(53.34f, 111.61f)
                arcToRelative(114.81f, 114.81f, 0.0f, false, true, 1.49f, -43.29f)
                curveTo(58.4f, 52.7f, 66.34f, 36.0f, 77.91f, 36.0f)
                curveToRelative(7.52f, 0.0f, 10.23f, 3.26f, 11.61f, 5.7f)
                curveTo(99.0f, 58.4f, 79.92f, 106.0f, 65.6f, 137.0f)
                curveTo(59.76f, 132.69f, 55.46f, 123.83f, 53.34f, 111.61f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
