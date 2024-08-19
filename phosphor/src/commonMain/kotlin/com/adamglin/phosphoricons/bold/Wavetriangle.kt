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

public val BoldGroup.Wavetriangle: ImageVector
    get() {
        if (_wavetriangle != null) {
            return _wavetriangle!!
        }
        _wavetriangle = Builder(name = "Wavetriangle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.73f, 135.0f)
                lineToRelative(-52.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.46f, 0.0f)
                lineTo(76.0f, 76.5f)
                lineTo(33.73f, 135.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 14.27f, 121.0f)
                lineToRelative(52.0f, -72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.46f, 0.0f)
                lineTo(180.0f, 179.5f)
                lineTo(222.27f, 121.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 241.73f, 135.0f)
                close()
            }
        }
        .build()
        return _wavetriangle!!
    }

private var _wavetriangle: ImageVector? = null
