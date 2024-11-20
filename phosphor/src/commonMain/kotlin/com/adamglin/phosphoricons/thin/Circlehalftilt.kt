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

public val ThinGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.71f, 57.29f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f)
                close()
                moveTo(188.0f, 197.72f)
                arcToRelative(91.35f, 91.35f, 0.0f, false, true, -24.0f, 15.0f)
                verticalLineToRelative(-115.0f)
                lineToRelative(24.0f, -24.0f)
                close()
                moveTo(100.0f, 161.66f)
                lineTo(124.0f, 137.66f)
                lineTo(124.0f, 219.9f)
                arcToRelative(91.91f, 91.91f, 0.0f, false, true, -24.0f, -4.24f)
                close()
                moveTo(92.0f, 212.66f)
                arcToRelative(91.69f, 91.69f, 0.0f, false, true, -26.15f, -16.89f)
                lineTo(92.0f, 169.66f)
                close()
                moveTo(132.0f, 129.66f)
                lineTo(156.0f, 105.66f)
                verticalLineToRelative(110.0f)
                arcToRelative(91.76f, 91.76f, 0.0f, false, true, -24.0f, 4.24f)
                close()
                moveTo(36.0f, 128.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 190.16f, 60.19f)
                lineToRelative(-130.0f, 130.0f)
                arcTo(91.34f, 91.34f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(196.0f, 190.0f)
                lineTo(196.0f, 66.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 196.0f, 190.0f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
