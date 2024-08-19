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

public val LightGroup.Twitterlogo: ImageVector
    get() {
        if (_twitterlogo != null) {
            return _twitterlogo!!
        }
        _twitterlogo = Builder(name = "Twitterlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.54f, 69.71f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 66.0f)
                horizontalLineTo(208.4f)
                arcToRelative(46.6f, 46.6f, 0.0f, false, false, -40.33f, -24.0f)
                arcToRelative(44.93f, 44.93f, 0.0f, false, false, -32.31f, 13.12f)
                arcTo(45.92f, 45.92f, 0.0f, false, false, 122.0f, 88.0f)
                verticalLineToRelative(8.66f)
                curveToRelative(-42.0f, -10.0f, -76.6f, -44.52f, -77.0f, -44.88f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 34.8f, 55.46f)
                curveToRelative(-4.25f, 47.22f, 9.42f, 78.75f, 21.64f, 96.89f)
                arcToRelative(107.71f, 107.71f, 0.0f, false, false, 23.07f, 25.0f)
                curveToRelative(-15.49f, 19.0f, -41.34f, 28.89f, -41.62f, 29.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.88f, 9.0f)
                curveTo(36.0f, 216.83f, 45.78f, 230.0f, 80.0f, 230.0f)
                curveToRelative(69.88f, 0.0f, 128.23f, -54.0f, 133.82f, -123.34f)
                lineToRelative(30.42f, -30.41f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 245.54f, 69.71f)
                close()
                moveTo(203.76f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.75f, 3.86f)
                curveTo(197.93f, 167.76f, 144.33f, 218.0f, 80.0f, 218.0f)
                curveToRelative(-14.0f, 0.0f, -22.76f, -2.41f, -28.06f, -4.8f)
                curveToRelative(11.3f, -5.68f, 29.72f, -16.88f, 41.05f, -33.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.85f, -4.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 91.0f, 170.82f)
                curveToRelative(-0.13f, -0.08f, -13.13f, -7.86f, -25.0f, -25.72f)
                curveTo(52.0f, 124.0f, 45.31f, 98.43f, 46.0f, 68.88f)
                curveToRelative(14.88f, 12.6f, 45.57f, 35.09f, 81.0f, 41.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.0f, -5.92f)
                verticalLineTo(88.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 10.19f, -24.34f)
                arcTo(33.05f, 33.05f, 0.0f, false, true, 167.93f, 54.0f)
                curveToRelative(13.43f, 0.17f, 26.0f, 8.37f, 31.24f, 20.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.5f, 3.6f)
                horizontalLineToRelative(20.84f)
                close()
            }
        }
        .build()
        return _twitterlogo!!
    }

private var _twitterlogo: ImageVector? = null
