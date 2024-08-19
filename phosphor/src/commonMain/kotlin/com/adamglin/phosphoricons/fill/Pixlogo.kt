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

public val FillGroup.Pixlogo: ImageVector
    get() {
        if (_pixlogo != null) {
            return _pixlogo!!
        }
        _pixlogo = Builder(name = "Pixlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.34f, 139.28f)
                lineToRelative(-19.56f, 19.55f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 213.0f, 160.0f)
                lineTo(171.32f, 160.0f)
                lineToRelative(-32.0f, -32.0f)
                lineToRelative(32.0f, -32.0f)
                lineTo(213.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineToRelative(19.56f, 19.55f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 235.34f, 139.28f)
                close()
                moveTo(67.05f, 80.0f)
                lineTo(88.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                lineTo(128.0f, 116.68f)
                lineToRelative(34.35f, -34.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 80.0f)
                lineTo(189.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -6.83f)
                lineToRelative(-52.5f, -52.51f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.56f, 0.0f)
                lineTo(64.22f, 73.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 67.05f, 80.0f)
                close()
                moveTo(189.0f, 176.0f)
                lineTo(168.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, -2.34f)
                lineTo(128.0f, 139.31f)
                lineTo(93.65f, 173.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 176.0f)
                horizontalLineToRelative(-21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f)
                lineToRelative(52.5f, 52.51f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 0.0f)
                lineToRelative(52.5f, -52.51f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 189.0f, 176.0f)
                close()
                moveTo(116.74f, 128.0f)
                lineTo(84.74f, 96.0f)
                lineTo(43.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.82f, 1.17f)
                lineTo(20.66f, 116.72f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.56f)
                lineToRelative(19.56f, 19.55f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 43.0f, 160.0f)
                lineTo(84.68f, 160.0f)
                close()
            }
        }
        .build()
        return _pixlogo!!
    }

private var _pixlogo: ImageVector? = null
