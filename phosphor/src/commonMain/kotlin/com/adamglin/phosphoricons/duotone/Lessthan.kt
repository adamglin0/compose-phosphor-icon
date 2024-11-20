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

public val DuotoneGroup.LessThan: ImageVector
    get() {
        if (_lessThan != null) {
            return _lessThan!!
        }
        _lessThan = Builder(name = "LessThan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 56.0f)
                verticalLineTo(200.0f)
                lineTo(48.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.23f, 203.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.66f, 3.81f)
                lineToRelative(-152.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -14.46f)
                lineToRelative(152.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.85f, 14.46f)
                lineTo(66.69f, 128.0f)
                lineToRelative(136.73f, 64.77f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 207.23f, 203.42f)
                close()
            }
        }
        .build()
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
