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

public val LightGroup.Tote: ImageVector
    get() {
        if (_tote != null) {
            return _tote!!
        }
        _tote = Builder(name = "Tote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.47f, 70.73f)
                arcTo(14.09f, 14.09f, 0.0f, false, false, 223.92f, 66.0f)
                horizontalLineTo(174.0f)
                verticalLineTo(64.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(32.08f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 15.64f)
                lineToRelative(14.25f, 120.0f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, 14.0f, 12.36f)
                horizontalLineTo(209.67f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, false, 14.0f, -12.36f)
                lineToRelative(14.25f, -120.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 234.47f, 70.73f)
                close()
                moveTo(94.0f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(94.0f)
                close()
                moveTo(211.73f, 200.23f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.06f, 1.77f)
                horizontalLineTo(46.33f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.06f, -1.77f)
                lineTo(30.0f, 80.23f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 0.49f, -1.53f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.58f, -0.7f)
                horizontalLineTo(82.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(78.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(78.0f)
                horizontalLineToRelative(49.92f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, 1.58f, 0.7f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 0.49f, 1.53f)
                close()
            }
        }
        .build()
        return _tote!!
    }

private var _tote: ImageVector? = null
