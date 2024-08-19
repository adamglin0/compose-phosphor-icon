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

public val FillGroup.Arrowsin: ImageVector
    get() {
        if (_arrowsin != null) {
            return _arrowsin!!
        }
        _arrowsin = Builder(name = "Arrowsin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 104.0f)
                lineTo(144.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineTo(172.0f, 72.69f)
                lineToRelative(30.34f, -30.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(183.31f, 84.0f)
                lineToRelative(14.35f, 14.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 112.0f)
                lineTo(152.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 104.0f)
                close()
                moveTo(104.0f, 144.0f)
                lineTo(64.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(72.69f, 172.0f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(84.0f, 183.31f)
                lineToRelative(14.34f, 14.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 192.0f)
                lineTo(112.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 144.0f)
                close()
                moveTo(107.06f, 56.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(84.0f, 72.69f)
                lineTo(53.66f, 42.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 53.66f)
                lineTo(72.69f, 84.0f)
                lineTo(58.34f, 98.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 112.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 107.06f, 56.61f)
                close()
                moveTo(183.31f, 172.0f)
                lineToRelative(14.35f, -14.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 144.0f)
                lineTo(152.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineTo(172.0f, 183.31f)
                lineToRelative(30.34f, 30.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
            }
        }
        .build()
        return _arrowsin!!
    }

private var _arrowsin: ImageVector? = null
