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

public val LightGroup.GlobeX: ImageVector
    get() {
        if (_globeX != null) {
            return _globeX!!
        }
        _globeX = Builder(name = "GlobeX", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 0.0f, 204.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.76f, -10.67f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.1f, -0.07f, -9.6f, -7.84f, -18.95f, -22.95f)
                arcTo(124.0f, 124.0f, 0.0f, false, true, 99.35f, 166.0f)
                lineTo(128.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(96.45f, 154.0f)
                arcToRelative(139.18f, 139.18f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(63.1f)
                arcTo(137.47f, 137.47f, 0.0f, false, true, 162.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(152.91f, 152.91f, 0.0f, false, false, -2.19f, -26.0f)
                horizontalLineToRelative(42.36f)
                arcTo(89.7f, 89.7f, 0.0f, false, true, 218.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(112.54f, 39.33f)
                arcTo(132.58f, 132.58f, 0.0f, false, false, 86.81f, 90.0f)
                lineTo(46.43f, 90.0f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 112.54f, 39.33f)
                close()
                moveTo(112.54f, 216.67f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 46.43f, 166.0f)
                lineTo(86.81f, 166.0f)
                arcTo(132.58f, 132.58f, 0.0f, false, false, 112.54f, 216.67f)
                close()
                moveTo(84.19f, 154.0f)
                lineTo(41.83f, 154.0f)
                arcToRelative(90.17f, 90.17f, 0.0f, false, true, 0.0f, -52.0f)
                lineTo(84.19f, 102.0f)
                arcToRelative(155.43f, 155.43f, 0.0f, false, false, 0.0f, 52.0f)
                close()
                moveTo(99.35f, 90.0f)
                arcToRelative(124.0f, 124.0f, 0.0f, false, true, 13.46f, -30.37f)
                arcTo(109.19f, 109.19f, 0.0f, false, true, 128.0f, 40.18f)
                arcToRelative(109.19f, 109.19f, 0.0f, false, true, 15.19f, 19.45f)
                arcTo(124.0f, 124.0f, 0.0f, false, true, 156.65f, 90.0f)
                close()
                moveTo(169.19f, 90.0f)
                arcToRelative(132.58f, 132.58f, 0.0f, false, false, -25.73f, -50.67f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 209.57f, 90.0f)
                close()
                moveTo(220.24f, 172.24f)
                lineTo(200.49f, 192.0f)
                lineToRelative(19.75f, 19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(192.0f, 200.49f)
                lineToRelative(-19.76f, 19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineTo(183.51f, 192.0f)
                lineToRelative(-19.75f, -19.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(192.0f, 183.51f)
                lineToRelative(19.76f, -19.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _globeX!!
    }

private var _globeX: ImageVector? = null
