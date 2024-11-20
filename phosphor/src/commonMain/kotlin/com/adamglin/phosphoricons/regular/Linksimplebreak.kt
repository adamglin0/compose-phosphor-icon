package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) {
            return _linkSimpleBreak!!
        }
        _linkSimpleBreak = Builder(name = "LinkSimpleBreak", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 80.0f)
                arcToRelative(55.67f, 55.67f, 0.0f, false, true, -16.4f, 39.6f)
                lineToRelative(-30.07f, 30.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineToRelative(30.07f, -30.06f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -56.57f, -56.56f)
                lineTo(117.66f, 81.77f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineTo(136.4f, 40.4f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
                moveTo(138.34f, 174.22f)
                lineTo(108.28f, 204.28f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -56.56f, -56.57f)
                lineToRelative(30.05f, -30.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f)
                lineTo(40.4f, 136.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 79.2f, 79.2f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.31f)
                close()
            }
        }
        .build()
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
