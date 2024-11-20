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

public val BoldGroup.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) {
            return _hourglassSimple!!
        }
        _hourglassSimple = Builder(name = "HourglassSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 193.68f)
                lineTo(145.35f, 128.0f)
                lineTo(214.0f, 62.32f)
                lineToRelative(0.18f, -0.18f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 28.0f)
                horizontalLineTo(56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 41.87f, 62.14f)
                lineToRelative(0.18f, 0.18f)
                lineTo(110.65f, 128.0f)
                lineToRelative(-68.6f, 65.68f)
                lineToRelative(-0.18f, 0.18f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 228.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.14f, -34.14f)
                close()
                moveTo(190.0f, 52.0f)
                lineToRelative(-62.0f, 59.39f)
                lineTo(66.0f, 52.0f)
                close()
                moveTo(66.0f, 204.0f)
                lineToRelative(62.0f, -59.39f)
                lineTo(190.0f, 204.0f)
                close()
            }
        }
        .build()
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null
