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

public val FillGroup.Highlighter: ImageVector
    get() {
        if (_highlighter != null) {
            return _highlighter!!
        }
        _highlighter = Builder(name = "Highlighter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.66f, 106.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(192.0f, 156.69f)
                lineTo(107.31f, 72.0f)
                lineToRelative(50.35f, -50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.32f, -11.32f)
                lineTo(96.0f, 60.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 93.18f, 79.5f)
                lineTo(72.0f, 100.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f)
                lineTo(76.69f, 128.0f)
                lineTo(18.34f, 186.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, 13.25f)
                lineToRelative(72.0f, 24.0f)
                arcTo(7.88f, 7.88f, 0.0f, false, false, 96.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineTo(136.0f, 187.31f)
                lineToRelative(4.69f, 4.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineToRelative(21.18f, -21.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 203.31f, 168.0f)
                lineToRelative(50.35f, -50.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 253.66f, 106.34f)
                close()
                moveTo(152.0f, 180.69f)
                lineTo(83.31f, 112.0f)
                lineTo(104.0f, 91.31f)
                lineTo(172.69f, 160.0f)
                close()
            }
        }
        .build()
        return _highlighter!!
    }

private var _highlighter: ImageVector? = null
