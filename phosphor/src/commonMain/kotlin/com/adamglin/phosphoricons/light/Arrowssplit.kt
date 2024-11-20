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

public val LightGroup.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) {
            return _arrowsSplit!!
        }
        _arrowsSplit = Builder(name = "ArrowsSplit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.24f, 188.24f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(186.0f, 201.51f)
                verticalLineToRelative(-63.0f)
                lineToRelative(-58.0f, -58.0f)
                lineToRelative(-58.0f, 58.0f)
                verticalLineToRelative(63.0f)
                lineToRelative(21.76f, -21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(58.0f, 201.51f)
                verticalLineTo(136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.76f, -4.24f)
                lineTo(122.0f, 69.51f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(69.51f)
                lineToRelative(62.24f, 62.25f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 198.0f, 136.0f)
                verticalLineToRelative(65.51f)
                lineToRelative(21.76f, -21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                close()
            }
        }
        .build()
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
