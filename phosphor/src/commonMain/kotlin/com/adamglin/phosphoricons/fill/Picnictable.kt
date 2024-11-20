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

public val FillGroup.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) {
            return _picnicTable!!
        }
        _picnicTable = Builder(name = "PicnicTable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.85f, 96.0f)
                lineToRelative(14.54f, 32.0f)
                lineTo(94.61f, 128.0f)
                lineToRelative(14.54f, -32.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(208.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(179.0f, 128.0f)
                lineTo(164.42f, 96.0f)
                lineTo(176.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(91.58f, 96.0f)
                lineTo(77.0f, 128.0f)
                lineTo(56.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(69.76f, 144.0f)
                lineToRelative(-13.0f, 28.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.56f, 6.62f)
                lineToRelative(16.0f, -35.31f)
                horizontalLineToRelative(81.34f)
                lineToRelative(16.05f, 35.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.56f, -6.62f)
                lineToRelative(-13.0f, -28.69f)
                lineTo(200.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 136.0f)
                close()
            }
        }
        .build()
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
