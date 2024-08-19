package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f)
                close()
                moveTo(220.0f, 104.0f)
                arcToRelative(91.51f, 91.51f, 0.0f, false, true, -35.17f, 72.35f)
                arcTo(12.26f, 12.26f, 0.0f, false, false, 180.0f, 186.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.7f, -9.51f)
                arcTo(91.57f, 91.57f, 0.0f, false, true, 36.0f, 104.52f)
                curveTo(35.73f, 54.69f, 76.0f, 13.2f, 125.79f, 12.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 220.0f, 104.0f)
                close()
                moveTo(196.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -69.65f, -68.0f)
                curveTo(89.56f, 36.88f, 59.8f, 67.55f, 60.0f, 104.38f)
                arcToRelative(67.71f, 67.71f, 0.0f, false, false, 26.1f, 53.19f)
                arcTo(35.87f, 35.87f, 0.0f, false, true, 100.0f, 184.0f)
                horizontalLineToRelative(56.1f)
                arcTo(36.13f, 36.13f, 0.0f, false, true, 170.0f, 157.49f)
                arcTo(67.68f, 67.68f, 0.0f, false, false, 196.0f, 104.0f)
                close()
                moveTo(175.93f, 98.68f)
                arcToRelative(48.5f, 48.5f, 0.0f, false, false, -31.91f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.0f, 22.62f)
                arcToRelative(24.31f, 24.31f, 0.0f, false, true, 16.09f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.86f, -2.64f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
