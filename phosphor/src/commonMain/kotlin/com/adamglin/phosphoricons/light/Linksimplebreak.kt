package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.LinkSimpleBreak: ImageVector
    get() {
        if (_linkSimpleBreak != null) {
            return _linkSimpleBreak!!
        }
        _linkSimpleBreak = Builder(name = "LinkSimpleBreak", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.2f, 118.18f)
                lineToRelative(-30.07f, 30.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f)
                lineToRelative(30.08f, -30.07f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -59.41f, -59.41f)
                lineTo(116.24f, 80.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.49f)
                lineToRelative(30.07f, -30.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, 76.38f, 76.38f)
                close()
                moveTo(139.76f, 175.64f)
                lineTo(109.69f, 205.72f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -59.41f, -59.41f)
                lineToRelative(30.06f, -30.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                lineToRelative(-30.0f, 30.07f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 76.38f, 76.39f)
                lineToRelative(30.07f, -30.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, -8.49f)
                close()
            }
        }
        .build()
        return _linkSimpleBreak!!
    }

private var _linkSimpleBreak: ImageVector? = null
