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

public val BoldGroup.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = Builder(name = "PencilLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.15f, 70.54f)
                lineTo(185.46f, 25.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineTo(33.86f, 149.17f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 163.31f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(125.0f, 204.0f)
                lineTo(230.15f, 98.83f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 230.15f, 70.54f)
                close()
                moveTo(136.0f, 81.0f)
                lineToRelative(11.0f, 11.0f)
                lineTo(76.0f, 163.0f)
                lineTo(65.0f, 152.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 173.0f)
                lineToRelative(15.52f, 15.51f)
                horizontalLineToRelative(0.0f)
                lineTo(83.0f, 204.0f)
                close()
                moveTo(104.0f, 191.0f)
                lineTo(93.0f, 180.0f)
                lineToRelative(71.0f, -71.0f)
                lineToRelative(11.0f, 11.0f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(18.34f, -18.34f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
