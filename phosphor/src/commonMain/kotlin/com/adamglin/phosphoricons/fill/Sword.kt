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

public val FillGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 32.0f)
                lineTo(152.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.34f, 3.12f)
                lineToRelative(-64.0f, 83.21f)
                lineTo(72.0f, 108.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.64f, 0.0f)
                lineToRelative(-8.69f, 8.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(22.0f, 22.0f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.63f)
                lineToRelative(8.69f, 8.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                lineToRelative(22.0f, 22.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.64f, 0.0f)
                lineToRelative(8.69f, -8.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                lineToRelative(-9.64f, -9.64f)
                lineToRelative(83.21f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 104.0f)
                lineTo(224.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 32.0f)
                close()
                moveTo(208.0f, 100.06f)
                lineTo(126.26f, 162.94f)
                lineTo(115.32f, 152.0f)
                lineToRelative(50.34f, -50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.31f)
                lineTo(104.0f, 140.68f)
                lineTo(93.07f, 129.74f)
                lineTo(155.94f, 48.0f)
                lineTo(208.0f, 48.0f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
