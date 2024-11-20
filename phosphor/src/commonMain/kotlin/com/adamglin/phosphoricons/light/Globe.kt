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

public val LightGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(209.57f, 90.0f)
                lineTo(169.19f, 90.0f)
                arcToRelative(132.58f, 132.58f, 0.0f, false, false, -25.73f, -50.67f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 209.57f, 90.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, -3.83f, 26.0f)
                lineTo(171.81f, 154.0f)
                arcToRelative(155.43f, 155.43f, 0.0f, false, false, 0.0f, -52.0f)
                horizontalLineToRelative(42.36f)
                arcTo(89.7f, 89.7f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(128.0f, 215.83f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -15.19f, -19.45f)
                arcTo(124.24f, 124.24f, 0.0f, false, true, 99.35f, 166.0f)
                horizontalLineToRelative(57.3f)
                arcToRelative(124.24f, 124.24f, 0.0f, false, true, -13.46f, 30.38f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 128.0f, 215.83f)
                close()
                moveTo(96.45f, 154.0f)
                arcToRelative(139.18f, 139.18f, 0.0f, false, true, 0.0f, -52.0f)
                horizontalLineToRelative(63.1f)
                arcToRelative(139.18f, 139.18f, 0.0f, false, true, 0.0f, 52.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, 3.83f, -26.0f)
                lineTo(84.19f, 102.0f)
                arcToRelative(155.43f, 155.43f, 0.0f, false, false, 0.0f, 52.0f)
                lineTo(41.83f, 154.0f)
                arcTo(89.7f, 89.7f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(128.0f, 40.17f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, 15.19f, 19.45f)
                arcTo(124.24f, 124.24f, 0.0f, false, true, 156.65f, 90.0f)
                lineTo(99.35f, 90.0f)
                arcToRelative(124.24f, 124.24f, 0.0f, false, true, 13.46f, -30.38f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 128.0f, 40.17f)
                close()
                moveTo(112.54f, 39.33f)
                arcTo(132.58f, 132.58f, 0.0f, false, false, 86.81f, 90.0f)
                lineTo(46.43f, 90.0f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 112.54f, 39.33f)
                close()
                moveTo(46.43f, 166.0f)
                lineTo(86.81f, 166.0f)
                arcToRelative(132.58f, 132.58f, 0.0f, false, false, 25.73f, 50.67f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 46.43f, 166.0f)
                close()
                moveTo(143.43f, 216.67f)
                arcTo(132.58f, 132.58f, 0.0f, false, false, 169.19f, 166.0f)
                horizontalLineToRelative(40.38f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 143.46f, 216.67f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
