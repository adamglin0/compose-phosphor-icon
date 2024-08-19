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

public val LightGroup.Arrowsincardinal: ImageVector
    get() {
        if (_arrowsincardinal != null) {
            return _arrowsincardinal!!
        }
        _arrowsincardinal = Builder(name = "Arrowsincardinal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.76f, 68.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f)
                lineTo(122.0f, 81.51f)
                lineTo(122.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(134.0f, 81.51f)
                lineToRelative(21.76f, -21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                close()
                moveTo(132.24f, 155.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.48f)
                lineTo(122.0f, 174.49f)
                lineTo(122.0f, 232.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 174.49f)
                lineToRelative(21.76f, 21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                close()
                moveTo(232.0f, 122.0f)
                lineTo(174.49f, 122.0f)
                lineToRelative(21.75f, -21.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 8.48f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(174.49f, 134.0f)
                lineTo(232.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(100.24f, 123.76f)
                lineTo(68.24f, 91.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(81.51f, 122.0f)
                lineTo(24.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(81.51f, 134.0f)
                lineTo(59.76f, 155.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(32.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 100.24f, 123.76f)
                close()
            }
        }
        .build()
        return _arrowsincardinal!!
    }

private var _arrowsincardinal: ImageVector? = null
