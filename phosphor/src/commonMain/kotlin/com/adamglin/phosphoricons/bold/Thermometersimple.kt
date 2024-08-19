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

public val BoldGroup.Thermometersimple: ImageVector
    get() {
        if (_thermometersimple != null) {
            return _thermometersimple!!
        }
        _thermometersimple = Builder(name = "Thermometersimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 150.69f)
                lineTo(180.0f, 56.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 76.0f, 56.0f)
                verticalLineToRelative(94.69f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 104.0f, 0.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -30.91f, -65.39f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.91f, -7.83f)
                lineTo(100.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(98.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.77f, 7.68f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 228.0f)
                close()
                moveTo(152.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.78f)
                lineTo(116.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(75.22f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 188.0f)
                close()
            }
        }
        .build()
        return _thermometersimple!!
    }

private var _thermometersimple: ImageVector? = null
