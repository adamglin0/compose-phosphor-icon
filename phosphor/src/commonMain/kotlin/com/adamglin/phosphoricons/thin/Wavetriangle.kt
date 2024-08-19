package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Wavetriangle: ImageVector
    get() {
        if (_wavetriangle != null) {
            return _wavetriangle!!
        }
        _wavetriangle = Builder(name = "Wavetriangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.24f, 130.34f)
                lineToRelative(-52.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.48f, 0.0f)
                lineTo(76.0f, 62.83f)
                lineTo(27.24f, 130.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.48f, -4.68f)
                lineToRelative(52.0f, -72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.48f, 0.0f)
                lineTo(180.0f, 193.17f)
                lineToRelative(48.76f, -67.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.48f, 4.68f)
                close()
            }
        }
        .build()
        return _wavetriangle!!
    }

private var _wavetriangle: ImageVector? = null
