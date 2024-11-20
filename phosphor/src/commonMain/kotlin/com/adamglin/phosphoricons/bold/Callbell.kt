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

public val BoldGroup.CallBell: ImageVector
    get() {
        if (_callBell != null) {
            return _callBell!!
        }
        _callBell = Builder(name = "CallBell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 180.0f)
                horizontalLineTo(232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.09f)
                arcTo(100.16f, 100.16f, 0.0f, false, false, 140.0f, 60.72f)
                verticalLineTo(44.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(60.72f)
                arcTo(100.16f, 100.16f, 0.0f, false, false, 28.09f, 156.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(128.0f, 84.0f)
                arcToRelative(76.09f, 76.09f, 0.0f, false, true, 75.89f, 72.0f)
                horizontalLineTo(52.11f)
                arcTo(76.09f, 76.09f, 0.0f, false, true, 128.0f, 84.0f)
                close()
                moveTo(244.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(232.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 208.0f)
                close()
            }
        }
        .build()
        return _callBell!!
    }

private var _callBell: ImageVector? = null
