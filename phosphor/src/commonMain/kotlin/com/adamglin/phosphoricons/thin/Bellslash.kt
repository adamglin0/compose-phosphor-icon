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

public val ThinGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(63.8f, 63.32f)
                arcTo(75.52f, 75.52f, 0.0f, false, false, 52.0f, 104.0f)
                curveToRelative(0.0f, 36.13f, -8.58f, 64.0f, -14.36f, 73.95f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 196.0f)
                lineTo(92.23f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 71.54f, 0.0f)
                horizontalLineToRelative(20.64f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.71f, -24.0f)
                horizontalLineToRelative(55.42f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(48.0f, 188.0f)
                arcToRelative(3.89f, 3.89f, 0.0f, false, true, -3.43f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.0f)
                curveTo(52.0f, 169.17f, 60.0f, 139.32f, 60.0f, 104.0f)
                arcToRelative(67.58f, 67.58f, 0.0f, false, true, 9.4f, -34.51f)
                lineTo(177.14f, 188.0f)
                close()
                moveTo(212.55f, 175.52f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -1.46f, 0.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.72f, -2.54f)
                curveTo(200.24f, 155.17f, 196.0f, 129.28f, 196.0f, 104.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 94.46f, 44.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.0f, -6.95f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 204.0f, 104.0f)
                curveToRelative(0.0f, 36.05f, 8.26f, 59.89f, 10.79f, 66.34f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 212.53f, 175.52f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
