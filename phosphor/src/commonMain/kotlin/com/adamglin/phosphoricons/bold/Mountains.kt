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

public val BoldGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 160.0f, 80.0f)
                close()
                moveTo(160.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 40.0f)
                close()
                moveTo(254.32f, 193.88f)
                lineTo(199.76f, 101.8f)
                arcTo(19.85f, 19.85f, 0.0f, false, false, 182.55f, 92.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, -17.2f, 9.8f)
                lineToRelative(-18.7f, 31.55f)
                lineToRelative(-37.42f, -63.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.46f, 0.0f)
                lineTo(1.66f, 193.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 212.0f)
                lineTo(244.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.32f, -18.12f)
                close()
                moveTo(92.0f, 87.87f)
                lineTo(108.57f, 116.0f)
                lineTo(75.43f, 116.0f)
                close()
                moveTo(33.0f, 188.0f)
                lineToRelative(28.28f, -48.0f)
                horizontalLineToRelative(61.44f)
                lineTo(151.0f, 188.0f)
                close()
                moveTo(178.86f, 188.0f)
                lineTo(160.56f, 157.0f)
                lineToRelative(22.0f, -37.1f)
                lineTo(222.94f, 188.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
