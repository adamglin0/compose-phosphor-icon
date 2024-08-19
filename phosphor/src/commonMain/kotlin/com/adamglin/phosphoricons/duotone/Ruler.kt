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

public val DuotoneGroup.Ruler: ImageVector
    get() {
        if (_ruler != null) {
            return _ruler!!
        }
        _ruler = Builder(name = "Ruler", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(229.66f, 90.34f)
                lineTo(90.34f, 229.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(26.34f, 177.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(165.66f, 26.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f)
                lineTo(229.66f, 79.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 90.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.32f, 73.37f)
                lineTo(182.63f, 20.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(20.68f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(52.69f, 52.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(235.32f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.32f, 73.37f)
                close()
                moveTo(84.68f, 224.0f)
                lineTo(32.0f, 171.31f)
                lineToRelative(32.0f, -32.0f)
                lineToRelative(26.34f, 26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(75.31f, 128.0f)
                lineTo(96.0f, 107.31f)
                lineToRelative(26.34f, 26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(107.31f, 96.0f)
                lineTo(128.0f, 75.31f)
                lineToRelative(26.34f, 26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                lineTo(139.31f, 64.0f)
                lineToRelative(32.0f, -32.0f)
                lineTo(224.0f, 84.69f)
                close()
            }
        }
        .build()
        return _ruler!!
    }

private var _ruler: ImageVector? = null
