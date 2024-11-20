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

public val LightGroup.Windmill: ImageVector
    get() {
        if (_windmill != null) {
            return _windmill!!
        }
        _windmill = Builder(name = "Windmill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 226.0f)
                lineTo(181.2f, 226.0f)
                lineToRelative(-7.13f, -49.95f)
                lineToRelative(6.82f, 4.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.18f, -4.95f)
                lineToRelative(12.0f, -20.34f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -5.0f, -19.18f)
                lineTo(170.36f, 114.0f)
                lineToRelative(41.7f, -70.86f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -5.0f, -19.17f)
                lineTo(186.77f, 12.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.18f, 5.0f)
                lineTo(146.0f, 53.65f)
                lineTo(75.11f, 11.94f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.18f, 5.0f)
                lineToRelative(-12.0f, 20.34f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.0f, 19.17f)
                lineTo(85.64f, 78.0f)
                lineToRelative(-41.7f, 70.85f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.0f, 19.18f)
                lineToRelative(20.33f, 12.0f)
                arcTo(13.92f, 13.92f, 0.0f, false, false, 76.32f, 182.0f)
                arcToRelative(13.74f, 13.74f, 0.0f, false, false, 3.53f, -0.46f)
                curveToRelative(0.46f, -0.12f, 0.91f, -0.26f, 1.36f, -0.42f)
                lineTo(74.8f, 226.0f)
                lineTo(32.0f, 226.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(224.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(201.94f, 147.16f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.22f, 1.51f)
                lineToRelative(-12.0f, 20.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.75f, 0.71f)
                lineTo(116.12f, 128.0f)
                lineToRelative(14.0f, -23.8f)
                lineTo(201.0f, 145.93f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 201.94f, 147.16f)
                close()
                moveTo(177.93f, 23.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.23f, -0.92f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.51f, 0.21f)
                lineToRelative(20.34f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.71f, 2.76f)
                lineTo(160.0f, 107.88f)
                lineToRelative(-23.81f, -14.0f)
                close()
                moveTo(54.06f, 44.85f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.22f, -1.52f)
                lineTo(66.27f, 23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 69.0f, 22.28f)
                lineTo(139.88f, 64.0f)
                lineToRelative(-14.0f, 23.8f)
                lineTo(55.0f, 46.07f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.06f, 44.85f)
                close()
                moveTo(78.07f, 169.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.74f, 0.71f)
                lineTo(55.0f, 157.73f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.71f, -2.75f)
                lineTo(96.0f, 84.12f)
                lineToRelative(23.81f, 14.0f)
                close()
                moveTo(96.07f, 162.12f)
                lineTo(110.07f, 138.35f)
                lineTo(160.87f, 168.25f)
                lineTo(169.08f, 226.0f)
                lineTo(86.92f, 226.0f)
                close()
            }
        }
        .build()
        return _windmill!!
    }

private var _windmill: ImageVector? = null
