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

public val RegularGroup.Stool: ImageVector
    get() {
        if (_stool != null) {
            return _stool!!
        }
        _stool = Builder(name = "Stool", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 64.0f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                verticalLineTo(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 80.0f)
                horizontalLineToRelative(6.64f)
                lineTo(56.1f, 222.75f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.65f, 9.15f)
                arcTo(7.82f, 7.82f, 0.0f, false, false, 64.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.89f, -6.75f)
                lineTo(79.68f, 176.0f)
                horizontalLineToRelative(96.64f)
                lineToRelative(7.78f, 49.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 232.0f)
                arcToRelative(7.82f, 7.82f, 0.0f, false, false, 1.26f, -0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.65f, -9.15f)
                lineTo(177.36f, 80.0f)
                horizontalLineTo(184.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 64.0f)
                close()
                moveTo(72.0f, 40.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(72.0f)
                close()
                moveTo(173.79f, 160.0f)
                horizontalLineTo(82.21f)
                lineTo(94.84f, 80.0f)
                horizontalLineToRelative(66.32f)
                close()
            }
        }
        .build()
        return _stool!!
    }

private var _stool: ImageVector? = null
