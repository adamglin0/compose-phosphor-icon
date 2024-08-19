package com.adamglin.phosphoricons.fill

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
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Cranetower: ImageVector
    get() {
        if (_cranetower != null) {
            return _cranetower!!
        }
        _cranetower = Builder(name = "Cranetower", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(127.73f, 208.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(24.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 16.0f, 215.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 224.0f)
                horizontalLineTo(128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 127.73f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.73f, 80.0f)
                horizontalLineTo(108.94f)
                lineTo(87.16f, 36.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(80.0f)
                horizontalLineTo(24.27f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 16.0f, 87.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 96.0f)
                horizontalLineTo(40.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(88.0f)
                horizontalLineTo(192.0f)
                verticalLineToRelative(-7.73f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, 8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f)
                arcTo(8.17f, 8.17f, 0.0f, false, false, 239.73f, 80.0f)
                close()
                moveTo(56.0f, 80.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(75.06f)
                lineToRelative(16.0f, 32.0f)
                close()
            }
        }
        .build()
        return _cranetower!!
    }

private var _cranetower: ImageVector? = null
