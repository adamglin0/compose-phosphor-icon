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

public val ThinGroup.HighHeel: ImageVector
    get() {
        if (_highHeel != null) {
            return _highHeel!!
        }
        _highHeel = Builder(name = "HighHeel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.09f, 160.09f)
                lineTo(178.0f, 148.35f)
                lineTo(66.83f, 37.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 63.91f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.86f, 1.3f)
                curveTo(39.74f, 60.6f, 28.0f, 90.0f, 28.0f, 120.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(84.0f, 136.36f)
                arcToRelative(116.73f, 116.73f, 0.0f, false, true, 55.59f, 60.23f)
                arcTo(11.93f, 11.93f, 0.0f, false, false, 150.72f, 204.0f)
                lineTo(240.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-4.73f)
                arcTo(27.74f, 27.74f, 0.0f, false, false, 230.09f, 160.09f)
                close()
                moveTo(76.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 124.08f)
                arcToRelative(114.9f, 114.9f, 0.0f, false, true, 40.0f, 8.62f)
                close()
                moveTo(244.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(150.72f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.71f, -2.42f)
                arcToRelative(124.36f, 124.36f, 0.0f, false, false, -44.87f, -55.76f)
                arcToRelative(123.1f, 123.1f, 0.0f, false, false, -66.07f, -21.75f)
                curveToRelative(0.93f, -25.33f, 10.8f, -50.0f, 28.11f, -70.23f)
                lineToRelative(109.0f, 109.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 1.07f)
                lineToRelative(53.22f, 12.0f)
                arcTo(19.79f, 19.79f, 0.0f, false, true, 244.0f, 187.31f)
                close()
            }
        }
        .build()
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
