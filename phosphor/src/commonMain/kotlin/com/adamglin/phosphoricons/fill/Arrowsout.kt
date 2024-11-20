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

public val FillGroup.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) {
            return _arrowsOut!!
        }
        _arrowsOut = Builder(name = "ArrowsOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.66f, 146.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineTo(83.31f, 184.0f)
                lineToRelative(18.35f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 216.0f)
                lineTo(48.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(72.0f, 172.69f)
                lineToRelative(26.34f, -26.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 109.66f, 146.34f)
                close()
                moveTo(83.31f, 72.0f)
                lineToRelative(18.35f, -18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineTo(72.0f, 83.31f)
                lineToRelative(26.34f, 26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(208.0f, 40.0f)
                lineTo(160.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(172.69f, 72.0f)
                lineTo(146.34f, 98.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(184.0f, 83.31f)
                lineToRelative(18.34f, 18.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 96.0f)
                lineTo(216.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(211.06f, 152.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(184.0f, 172.69f)
                lineToRelative(-26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(172.69f, 184.0f)
                lineToRelative(-18.35f, 18.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 216.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 211.06f, 152.61f)
                close()
            }
        }
        .build()
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
