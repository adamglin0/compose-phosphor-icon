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

public val BoldGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.49f, 175.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(203.0f, 196.0f)
                horizontalLineToRelative(-2.09f)
                arcToRelative(76.17f, 76.17f, 0.0f, false, true, -61.85f, -31.83f)
                lineTo(97.38f, 105.78f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 55.06f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(55.06f, 60.0f)
                arcToRelative(76.17f, 76.17f, 0.0f, false, true, 61.85f, 31.83f)
                lineToRelative(41.71f, 58.39f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 200.94f, 172.0f)
                lineTo(203.0f, 172.0f)
                lineToRelative(-3.52f, -3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(144.87f, 102.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.93f, -1.13f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 200.94f, 84.0f)
                lineTo(203.0f, 84.0f)
                lineToRelative(-3.52f, 3.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(203.0f, 60.0f)
                horizontalLineToRelative(-2.09f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -57.2f, 26.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.87f, 102.89f)
                close()
                moveTo(111.13f, 153.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.93f, 1.13f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 55.06f, 172.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(55.06f, 196.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 57.2f, -26.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 111.13f, 153.11f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
