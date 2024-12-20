package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(94.81f, 192.0f)
                lineTo(65.36f, 214.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.81f, -4.51f)
                lineTo(40.19f, 154.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.66f, -6.86f)
                lineToRelative(30.31f, -36.33f)
                curveTo(71.0f, 134.25f, 76.7f, 161.43f, 94.81f, 192.0f)
                close()
                moveTo(214.15f, 147.24f)
                lineTo(183.84f, 110.91f)
                curveToRelative(1.21f, 23.34f, -4.54f, 50.52f, -22.65f, 81.09f)
                lineToRelative(29.45f, 22.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.81f, -4.51f)
                lineToRelative(12.36f, -55.63f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 214.15f, 147.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 224.0f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 112.0f)
                close()
                moveTo(223.62f, 155.83f)
                lineTo(211.26f, 211.46f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -25.51f, 9.11f)
                lineTo(158.51f, 200.0f)
                horizontalLineToRelative(-61.0f)
                lineTo(70.25f, 220.57f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -25.51f, -9.11f)
                lineTo(32.38f, 155.83f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, true, 3.32f, -13.71f)
                lineToRelative(28.56f, -34.26f)
                arcToRelative(123.07f, 123.07f, 0.0f, false, true, 8.57f, -36.67f)
                curveToRelative(12.9f, -32.34f, 36.0f, -52.63f, 45.37f, -59.85f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.6f, 0.0f)
                curveToRelative(9.34f, 7.22f, 32.47f, 27.51f, 45.37f, 59.85f)
                arcToRelative(123.07f, 123.07f, 0.0f, false, true, 8.57f, 36.67f)
                lineToRelative(28.56f, 34.26f)
                arcTo(16.09f, 16.09f, 0.0f, false, true, 223.62f, 155.83f)
                close()
                moveTo(99.43f, 184.0f)
                horizontalLineToRelative(57.14f)
                curveToRelative(21.12f, -37.54f, 25.07f, -73.48f, 11.74f, -106.88f)
                curveTo(156.55f, 47.64f, 134.49f, 29.0f, 128.0f, 24.0f)
                curveToRelative(-6.51f, 5.0f, -28.57f, 23.64f, -40.33f, 53.12f)
                curveTo(74.36f, 110.52f, 78.31f, 146.46f, 99.43f, 184.0f)
                close()
                moveTo(84.43f, 189.85f)
                quadTo(68.28f, 160.5f, 64.83f, 132.16f)
                lineTo(48.0f, 152.36f)
                lineTo(60.36f, 208.0f)
                lineToRelative(0.18f, -0.13f)
                close()
                moveTo(208.0f, 152.36f)
                lineToRelative(-16.83f, -20.2f)
                quadToRelative(-3.42f, 28.28f, -19.56f, 57.69f)
                lineToRelative(23.85f, 18.0f)
                lineToRelative(0.18f, 0.13f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
