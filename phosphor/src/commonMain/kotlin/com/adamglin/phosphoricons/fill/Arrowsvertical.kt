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

public val FillGroup.ArrowsVertical: ImageVector
    get() {
        if (_arrowsVertical != null) {
            return _arrowsVertical!!
        }
        _arrowsVertical = Builder(name = "ArrowsVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(167.39f, 196.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.73f, 8.72f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 192.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 64.0f)
                horizontalLineTo(136.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 167.39f, 196.94f)
                close()
            }
        }
        .build()
        return _arrowsVertical!!
    }

private var _arrowsVertical: ImageVector? = null
