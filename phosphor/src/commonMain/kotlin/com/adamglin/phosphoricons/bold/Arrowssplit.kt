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

public val BoldGroup.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) {
            return _arrowsSplit!!
        }
        _arrowsSplit = Builder(name = "ArrowsSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 192.49f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(180.0f, 187.0f)
                verticalLineTo(141.0f)
                lineTo(128.0f, 89.0f)
                lineTo(76.0f, 141.0f)
                verticalLineTo(187.0f)
                lineToRelative(11.51f, -11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineTo(52.0f, 187.0f)
                verticalLineTo(136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, -8.49f)
                lineTo(116.0f, 67.0f)
                verticalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(67.0f)
                lineToRelative(60.49f, 60.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 136.0f)
                verticalLineToRelative(51.0f)
                lineToRelative(11.51f, -11.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
