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

public val LightGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 66.0f)
                lineTo(206.0f, 66.0f)
                lineTo(206.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(56.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(50.0f, 66.0f)
                lineTo(24.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 80.0f)
                lineTo(10.0f, 96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(5.14f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 122.0f, 189.75f)
                lineTo(122.0f, 218.0f)
                lineTo(96.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(134.0f, 218.0f)
                lineTo(134.0f, 189.75f)
                curveToRelative(32.44f, -2.52f, 59.43f, -25.3f, 68.62f, -55.75f)
                lineTo(208.0f, 134.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(246.0f, 80.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 66.0f)
                close()
                moveTo(48.0f, 122.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 22.0f, 96.0f)
                lineTo(22.0f, 80.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(50.0f, 78.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(80.87f, 80.87f, 0.0f, false, false, 0.65f, 10.0f)
                close()
                moveTo(194.0f, 111.1f)
                curveToRelative(0.0f, 36.62f, -29.38f, 66.63f, -65.5f, 66.9f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 62.0f, 112.0f)
                lineTo(62.0f, 54.0f)
                lineTo(194.0f, 54.0f)
                close()
                moveTo(234.0f, 96.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                horizontalLineToRelative(-2.77f)
                arcToRelative(78.45f, 78.45f, 0.0f, false, false, 0.77f, -10.9f)
                lineTo(206.0f, 78.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
