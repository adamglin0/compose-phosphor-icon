package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.NumberSquareThree: ImageVector
    get() {
        if (_numberSquareThree != null) {
            return _numberSquareThree!!
        }
        _numberSquareThree = Builder(name = "NumberSquareThree", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(124.0f, 184.0f)
                arcToRelative(35.71f, 35.71f, 0.0f, false, true, -25.71f, -10.81f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 109.71f, 162.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 124.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.55f, -12.59f)
                lineTo(136.63f, 88.0f)
                horizontalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.55f, 12.59f)
                lineToRelative(-21.0f, 30.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 124.0f, 184.0f)
                close()
            }
        }
        .build()
        return _numberSquareThree!!
    }

private var _numberSquareThree: ImageVector? = null
