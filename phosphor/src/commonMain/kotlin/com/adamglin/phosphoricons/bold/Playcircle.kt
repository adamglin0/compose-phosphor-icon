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

public val BoldGroup.Playcircle: ImageVector
    get() {
        if (_playcircle != null) {
            return _playcircle!!
        }
        _playcircle = Builder(name = "Playcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.17f, 9.87f)
                lineToRelative(-52.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 164.0f)
                lineTo(100.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.83f, -9.87f)
                lineToRelative(52.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 128.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(212.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -84.0f, 84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 212.0f, 128.0f)
                close()
            }
        }
        .build()
        return _playcircle!!
    }

private var _playcircle: ImageVector? = null
