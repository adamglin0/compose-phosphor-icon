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

public val BoldGroup.GreaterThanOrEqual: ImageVector
    get() {
        if (_greaterThanOrEqual != null) {
            return _greaterThanOrEqual!!
        }
        _greaterThanOrEqual = Builder(name = "GreaterThanOrEqual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.85f, 148.74f)
                lineTo(173.29f, 104.0f)
                lineTo(51.85f, 59.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.3f, -22.52f)
                lineToRelative(152.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 22.52f)
                lineToRelative(-152.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -8.3f, -22.52f)
                close()
                moveTo(208.0f, 188.0f)
                horizontalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _greaterThanOrEqual!!
    }

private var _greaterThanOrEqual: ImageVector? = null
