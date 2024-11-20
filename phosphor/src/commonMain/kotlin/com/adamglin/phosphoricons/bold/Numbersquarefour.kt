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

public val BoldGroup.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) {
            return _numberSquareFour!!
        }
        _numberSquareFour = Builder(name = "NumberSquareFour", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
                moveTo(88.0f, 164.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(156.0f, 164.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(156.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.47f, -7.37f)
                lineToRelative(-56.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 164.0f)
                close()
                moveTo(132.0f, 115.0f)
                verticalLineToRelative(25.0f)
                lineTo(112.54f, 140.0f)
                close()
            }
        }
        .build()
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
