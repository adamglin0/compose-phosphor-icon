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

public val FillGroup.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(112.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(40.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(216.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 16.0f)
                close()
                moveTo(155.43f, 130.06f)
                lineToRelative(-24.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.86f, 0.0f)
                lineToRelative(-24.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.12f)
                lineToRelative(24.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.86f, 0.0f)
                lineToRelative(24.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.43f, 130.06f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
