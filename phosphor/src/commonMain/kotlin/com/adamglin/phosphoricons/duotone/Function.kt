package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Function: ImageVector
    get() {
        if (_function != null) {
            return _function!!
        }
        _function = Builder(name = "Function", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(170.71f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -23.62f, 19.71f)
                lineTo(137.59f, 120.0f)
                horizontalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(134.68f)
                lineToRelative(-10.0f, 55.16f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 85.29f, 224.0f)
                horizontalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(85.29f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.62f, -19.71f)
                lineToRelative(9.5f, -52.29f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(49.32f)
                lineToRelative(10.0f, -55.16f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 170.71f, 32.0f)
                horizontalLineTo(200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 40.0f)
                close()
            }
        }
        .build()
        return _function!!
    }

private var _function: ImageVector? = null
