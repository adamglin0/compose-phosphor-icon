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

public val BoldGroup.BowlFood: ImageVector
    get() {
        if (_bowlFood != null) {
            return _bowlFood!!
        }
        _bowlFood = Builder(name = "BowlFood", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 100.0f)
                horizontalLineToRelative(-4.78f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, -182.44f, 0.0f)
                lineTo(32.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(108.38f, 108.38f, 0.0f, false, false, 56.0f, 94.68f)
                lineTo(76.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-1.32f)
                arcTo(108.38f, 108.38f, 0.0f, false, false, 236.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 100.0f)
                close()
                moveTo(170.29f, 60.06f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 127.19f, 100.0f)
                lineTo(106.0f, 100.0f)
                arcToRelative(68.27f, 68.27f, 0.0f, false, true, 62.0f, -40.0f)
                curveTo(168.76f, 60.0f, 169.52f, 60.0f, 170.29f, 60.06f)
                close()
                moveTo(187.51f, 79.14f)
                arcTo(67.66f, 67.66f, 0.0f, false, true, 194.92f, 100.0f)
                lineTo(156.13f, 100.0f)
                arcTo(67.91f, 67.91f, 0.0f, false, true, 187.51f, 79.14f)
                close()
                moveTo(128.0f, 44.0f)
                curveToRelative(0.83f, 0.0f, 1.65f, 0.0f, 2.48f, 0.06f)
                arcTo(92.3f, 92.3f, 0.0f, false, false, 80.37f, 100.0f)
                lineTo(61.08f, 100.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(163.0f, 188.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, 10.91f)
                lineTo(156.0f, 204.0f)
                lineTo(100.0f, 204.0f)
                verticalLineToRelative(-4.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, -10.91f)
                arcTo(84.32f, 84.32f, 0.0f, false, true, 44.87f, 124.0f)
                lineTo(211.13f, 124.0f)
                arcTo(84.32f, 84.32f, 0.0f, false, true, 163.0f, 188.39f)
                close()
            }
        }
        .build()
        return _bowlFood!!
    }

private var _bowlFood: ImageVector? = null
