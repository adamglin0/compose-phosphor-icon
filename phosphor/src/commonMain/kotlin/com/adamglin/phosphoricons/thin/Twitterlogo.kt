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

public val ThinGroup.Twitterlogo: ImageVector
    get() {
        if (_twitterlogo != null) {
            return _twitterlogo!!
        }
        _twitterlogo = Builder(name = "Twitterlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.7f, 70.47f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 68.0f)
                lineTo(207.2f, 68.0f)
                arcToRelative(44.57f, 44.57f, 0.0f, false, false, -39.15f, -24.0f)
                arcToRelative(42.76f, 42.76f, 0.0f, false, false, -30.88f, 12.55f)
                arcTo(43.85f, 43.85f, 0.0f, false, false, 124.0f, 88.0f)
                lineTo(124.0f, 99.16f)
                curveToRelative(-43.65f, -9.39f, -80.0f, -45.6f, -80.39f, -46.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.19f, -0.95f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, 3.41f)
                curveToRelative(-4.2f, 46.62f, 9.27f, 77.71f, 21.31f, 95.59f)
                arcTo(103.68f, 103.68f, 0.0f, false, false, 82.35f, 177.0f)
                curveToRelative(-15.68f, 20.49f, -43.46f, 31.13f, -43.75f, 31.24f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.93f, 6.0f)
                curveToRelative(0.27f, 0.4f, 2.79f, 4.0f, 9.54f, 7.36f)
                curveTo(54.73f, 225.84f, 66.1f, 228.0f, 80.0f, 228.0f)
                curveToRelative(69.09f, 0.0f, 126.73f, -53.56f, 131.89f, -122.23f)
                lineToRelative(30.94f, -30.94f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.7f, 70.47f)
                close()
                moveTo(205.17f, 101.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.16f, 2.58f)
                curveTo(199.85f, 168.94f, 145.38f, 220.0f, 80.0f, 220.0f)
                curveToRelative(-17.85f, 0.0f, -27.63f, -3.89f, -32.5f, -6.87f)
                curveToRelative(10.37f, -4.82f, 31.45f, -16.34f, 43.83f, -34.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.56f, -3.12f)
                arcTo(3.93f, 3.93f, 0.0f, false, false, 90.0f, 172.55f)
                curveToRelative(-0.13f, -0.08f, -13.39f, -8.0f, -25.52f, -26.15f)
                curveTo(54.0f, 130.71f, 42.39f, 104.11f, 44.19f, 64.65f)
                curveToRelative(13.17f, 11.62f, 45.48f, 37.0f, 83.15f, 43.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.66f, -4.0f)
                lineTo(132.0f, 88.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 10.79f, -25.76f)
                arcTo(35.0f, 35.0f, 0.0f, false, true, 168.0f, 52.0f)
                curveToRelative(14.2f, 0.18f, 27.49f, 8.86f, 33.06f, 21.61f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 204.67f, 76.0f)
                horizontalLineToRelative(25.67f)
                close()
            }
        }
        .build()
        return _twitterlogo!!
    }

private var _twitterlogo: ImageVector? = null
