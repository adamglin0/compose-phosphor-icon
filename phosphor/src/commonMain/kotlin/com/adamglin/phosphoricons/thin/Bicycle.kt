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

public val ThinGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 116.0f)
                arcToRelative(43.66f, 43.66f, 0.0f, false, false, -18.62f, 4.15f)
                lineTo(159.0f, 68.0f)
                horizontalLineToRelative(33.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(152.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.46f, 6.0f)
                lineTo(163.7f, 92.0f)
                lineTo(97.0f, 92.0f)
                lineTo(79.46f, 62.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 76.0f, 60.0f)
                lineTo(48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(73.7f, 68.0f)
                lineTo(89.89f, 95.76f)
                lineTo(70.57f, 122.25f)
                arcTo(44.21f, 44.21f, 0.0f, true, false, 77.0f, 127.0f)
                lineTo(94.29f, 103.3f)
                lineTo(128.54f, 162.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.46f, 2.0f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, false, 2.0f, -0.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.44f, -5.48f)
                lineToRelative(-33.83f, -58.0f)
                horizontalLineToRelative(66.74f)
                lineToRelative(14.11f, 24.19f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 208.0f, 116.0f)
                close()
                moveTo(84.0f, 160.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -18.16f, -31.25f)
                lineTo(44.77f, 157.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.46f, 4.72f)
                lineToRelative(21.07f, -28.9f)
                arcTo(35.92f, 35.92f, 0.0f, false, true, 84.0f, 160.0f)
                close()
                moveTo(208.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -21.47f, -64.88f)
                lineToRelative(18.0f, 30.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.46f, 2.0f)
                arcToRelative(4.11f, 4.11f, 0.0f, false, false, 2.0f, -0.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.44f, -5.48f)
                lineToRelative(-18.0f, -30.89f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 208.0f, 196.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
