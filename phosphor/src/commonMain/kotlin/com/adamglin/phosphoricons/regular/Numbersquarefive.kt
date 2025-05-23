package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.NumberSquareFive: ImageVector
    get() {
        if (_numberSquareFive != null) {
            return _numberSquareFive!!
        }
        _numberSquareFive = Builder(name = "NumberSquareFive", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                lineTo(208.0f, 208.0f)
                close()
                moveTo(118.78f, 88.0f)
                lineToRelative(-4.19f, 25.14f)
                arcTo(38.8f, 38.8f, 0.0f, false, true, 124.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                arcToRelative(35.54f, 35.54f, 0.0f, false, true, -25.71f, -10.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.42f, -11.2f)
                arcTo(19.73f, 19.73f, 0.0f, false, false, 124.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                arcToRelative(19.73f, 19.73f, 0.0f, false, false, -14.29f, 5.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.6f, -6.92f)
                lineToRelative(8.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 72.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _numberSquareFive!!
    }

private var _numberSquareFive: ImageVector? = null
