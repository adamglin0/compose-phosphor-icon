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

public val ThinGroup.Needle: ImageVector
    get() {
        if (_needle != null) {
            return _needle!!
        }
        _needle = Builder(name = "Needle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.83f, 69.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-16.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(16.0f, -16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 186.83f, 69.17f)
                close()
                moveTo(220.0f, 72.0f)
                arcToRelative(35.76f, 35.76f, 0.0f, false, true, -10.54f, 25.46f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.16f, 1.11f)
                curveToRelative(-21.65f, 3.72f, -52.74f, 21.46f, -89.91f, 51.33f)
                curveToRelative(-28.34f, 22.77f, -50.34f, 44.71f, -50.56f, 44.93f)
                lineToRelative(-0.24f, 0.22f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.42f, -5.88f)
                horizontalLineToRelative(0.0f)
                curveTo(37.39f, 213.0f, 59.33f, 191.0f, 82.1f, 162.61f)
                curveTo(112.0f, 125.44f, 129.71f, 94.35f, 133.43f, 72.7f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, 1.11f, -2.16f)
                lineToRelative(24.0f, -24.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 220.0f, 72.0f)
                close()
                moveTo(212.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -47.8f, -19.8f)
                lineTo(141.08f, 75.32f)
                curveToRelative(-5.33f, 28.0f, -29.48f, 63.42f, -52.51f, 92.11f)
                curveToRelative(28.69f, -23.0f, 64.16f, -47.18f, 92.11f, -52.52f)
                lineTo(203.8f, 91.8f)
                arcTo(27.81f, 27.81f, 0.0f, false, false, 212.0f, 72.0f)
                close()
            }
        }
        .build()
        return _needle!!
    }

private var _needle: ImageVector? = null
